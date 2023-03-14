import java.util.Random;
public class SimpleStartupOwnGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        Random random = new Random();
        int startCell = random.nextInt(4);
        int[] cellSet = new int[]{startCell, startCell + 1, startCell + 2};
        SimpleStartup startup = new SimpleStartup();
        startup.setLocationCells(cellSet);

    }

}
