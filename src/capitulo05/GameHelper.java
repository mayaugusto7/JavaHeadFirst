package capitulo05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GameHelper {
    public static void main(String[] args) {
        int numOfGuess = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Insira um número");

            String result = theDotCom.checkYourself(guess);

            numOfGuess++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("Você usou " + numOfGuess + " palpites");
            }
        }
    }

    private String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputLine;
    }
}
