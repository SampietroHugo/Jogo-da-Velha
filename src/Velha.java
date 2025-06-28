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
        ImprimeVelha();

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
        System.out.println("\nTabuleiro inicial:");
        for (int l = 0; l < velha.length; l++) {
            for (int c = 0; c < velha.length; c++) {
                System.out.print("|" + velha[l][c] + "|");
            }
            System.out.println();
        }

    }
}