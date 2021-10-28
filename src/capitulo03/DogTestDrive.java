package capitulo03;

public class DogTestDrive {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = dog1;

        dogs[0].name = "Fred";
        dogs[1].name = "Marge";

        System.out.println("O nome do ultimo cão é ");
        System.out.println(dogs[2].name);

        int x = 0;
        while (x < dogs.length) {
            dogs[x].bark();
            x = x + 1;
        }
    }
}
