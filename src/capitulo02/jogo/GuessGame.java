package capitulo02.jogo;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um numero entre 0 e 9...");

        while (true) {
            System.out.println("O número a adivinhar é " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("O jogador um forneceu o palpite " + guessP1);

            guessP2 = p2.number;
            System.out.println("O jogador dois forneceu o palpite " + guessP2);

            guessP3 = p3.number;
            System.out.println("O jogador três forneceu o palpite " + guessP3);

            if (guessP1 == targetNumber) {
                p1isRight = true;
            }

            if (guessP2 == targetNumber) {
                p2isRight = true;
            }

            if (guessP3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("Temos um vencedor!");
                System.out.println("O jogador um acertou? " + p1isRight);
                System.out.println("O jogador dois acertou? " + p2isRight);
                System.out.println("O jogador três acertou? " + p3isRight);
                System.out.println("Fim do Jogo.");
                break;
            } else {
                System.out.println("Os jogadores terão que tentar novamente.");
            }
        }
    }
}
