import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;
//    private int numOfHits = 0;
    public void setLocationCells(ArrayList<String> locs) {

        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
