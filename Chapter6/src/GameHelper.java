import java.util.*;

public class GameHelper {
    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;
    static final int HORIZONTAL_INCREMENT = 1;
    static final int VERTICAL_INCREMENT = GRID_LENGTH;

    private final int[] grid = new int[GRID_SIZE];
    private final Random random = new Random();
    private int startupCount = 0;
    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    public ArrayList<String> placeStartup(int startupSize) {
        int[] startupCoords = new int[startupSize]; // current candidate co-ordinates
        int attempts = 0; // current attempts counter
        boolean success = false; // flag = found a good location?

        startupCount++; // nth Startup to place
        int increment = getIncrement (); // alternate vert & horiz alignment
        while (!success & attempts++ < MAX_ATTEMPTS) {
            int location = random.nextInt (GRID_SIZE); // get random starting point

            for (int i = 0; i < startupCoords.length; i++) { // create array of proposed coords
                startupCoords[i] = location; // put current location in array
                location += increment; // calculate the next location
            }
            // system.out.println("Trying: " + Arrays.toString(startupCoords) );
            if (startupFits(startupCoords, increment)) { // startup fits on the grid?
                success = coordsAvailable(startupCoords) ; // ...and locations aren't taken?
            }
        }
        savePositionToGrid(startupCoords);
        ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
        return alphaCells;
    }

    private boolean startupFits(int[] startupCoords, int increment) {
        int finalLocation = startupCoords[startupCoords.length - 1];
        if (increment == HORIZONTAL_INCREMENT) {
            // check end is on same row as start
            return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex (finalLocation);
        } else {
            return finalLocation < GRID_SIZE; // check end isn't off the bottom
        }
    } //end startupFits


}
