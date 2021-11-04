package capitulo05;

class SimpleDotCom {

    private int[] locationsCells;
    private int numberOfHits;

    public void setLocationCells(int[] locations) {
        this.locationsCells = locations;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);

        String result = "miss";

        for (int cell : locationsCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHits++;
                break;
            }
        }

        if (numberOfHits == locationsCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }
}
