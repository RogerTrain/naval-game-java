public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();
        int[] locations = new int[3];
        locations [0] = (int) Math.random();

        dot.setLocationCells(locations);
        int userGuess = 2;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}