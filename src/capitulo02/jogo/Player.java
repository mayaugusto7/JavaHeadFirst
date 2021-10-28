package capitulo02.jogo;

public class Player {

    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
    }
}
