import java.util.*;

public class Velha {
    public static Scanner input = new Scanner(System.in);
    public static char[][] velha;

    public static void Banner() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║          *JOGO DA VELHA*           ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║ -=> REGRAS                         ║");
        System.out.println("║ -> Vence o jogador que colocar três║");
        System.out.println("║ símbolos iguais na mesma coluna, ou║");
        System.out.println("║ linha, ou diagonal.                ║");
        System.out.println("║ -> Uma jogada por vez!             ║");
        System.out.println("╚════════════════════════════════════╝");

    }

    public static void main(String[] args) {
        velha = new char[3][3];

        InicializaVelha();
        Banner();
        System.out.println();
        ImprimeVelha();
        JogoDaVelha();

    }

    public static void InicializaVelha() {
        for (int l = 0; l < velha.length; l++) {
            for (int c = 0; c < velha.length; c++) {
                velha[l][c] = '_';
            }
            System.out.println();
        }
    }

    public static void ImprimeVelha() {
        System.out.println("Tabuleiro:");
        for (int l = 0; l < velha.length; l++) {
            for (int c = 0; c < velha.length; c++) {
                System.out.print("|" + velha[l][c] + "|");
            }
            System.out.println();
        }

    }

    public static void JogoDaVelha() {
        Random random = new Random();
        char player1 = 'X', player2 = 'O';
        int l, c, jogada = 0, jogada2 = 0;

        System.out.println();
        for (int i = 0; i < 9; i++) {
            do {
                System.out.println("Iniciando a jogada " + (i + 1) + ":");

                System.out.print("-> Digite a linha que deseja jogar: ");
                l = input.nextInt() - 1;

                System.out.print("-> Digite a coluna que deseja jogar: ");
                c = input.nextInt() - 1;

                if (l < 3 && c < 3 && l >= 0 && c >= 0) {
                    if (velha[l][c] == '_' && velha[l][c] != 'O') {
                        jogada = 1;
                    }
                }
                if (jogada != 1) {
                    System.out.println("Sua jogada não foi válida! Jogue novamente.");
                }

            } while (jogada == 0);
            velha[l][c] = player1;
            ImprimeVelha();

            System.out.println("\nJogada do Computador:");
            do {
                l = random.nextInt(1, 3);
                c = random.nextInt(1, 3);
                if (velha[(l - 1)][(c - 1)] == 'X') {
                    jogada2 = 1;
                }
            } while (jogada2 == 0);
            velha[l][c] = player2;
            ImprimeVelha();

            jogada = 0;
            jogada2 = 0;
        }

    }
}