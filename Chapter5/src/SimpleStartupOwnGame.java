import java.util.Random;
import java.util.Scanner;
public class SimpleStartupOwnGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        Random random = new Random();
        int startCell = random.nextInt(4);
        int[] cellSet = new int[]{startCell, startCell + 1, startCell + 2};
        SimpleStartup startup = new SimpleStartup();
        startup.setLocationCells(cellSet);
        String status = "";
        while(!status.equals("kill")) {
            Scanner input = new Scanner(System.in);
            System.out.print("What is your shot (0-6)?");
            int shot = input.nextInt();
            numOfGuesses++;
            status = startup.checkYourself(shot);
        }
        System.out.println("You used " + numOfGuesses + " shots to sink the startup.");

    }

}
