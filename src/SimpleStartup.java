import java.util.ArrayList;
import java.util.List;

class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;
    private List<String> resultList = new ArrayList<>();
    
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";


        if (resultList.contains(String.valueOf(guess))) {
            System.out.println("miss");
            return "miss"; // Return "miss" for repeated guess
        } else {
            resultList.add(String.valueOf(guess));
        }

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
