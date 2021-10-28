package capitulo04;

class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStartUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    boolean isRockStartUsesIt() {
        return rockStartUsesIt;
    }

    void setRockStartUsesIt(boolean rockStartUsesIt) {
        this.rockStartUsesIt = rockStartUsesIt;
    }
}
