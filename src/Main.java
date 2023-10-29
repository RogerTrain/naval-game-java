public class Main {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);
        boolean isAlive = true;
        System.out.println("YOU GOT 6 CHANCES TO TRY");

        while (isAlive && numOfGuesses<6) {
            int guess = helper.getUserInput("enter a number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if (numOfGuesses == 6 && result.equals("miss")){
                System.out.println("You Lose");
            }
            if (numOfGuesses == 6 && result.equals("hit")){
                System.out.println("Almost");
            }

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("YOU WIN");
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
