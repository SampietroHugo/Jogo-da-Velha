import java.util.*;

public class Velha {
    public static char[][] velha;

    public static Scanner input = new Scanner(System.in);

    public static void Banner() {
        System.out.println("**** Jogo da Velha ****");
    }

    public static void main(String[] args) {
        velha = new char[3][3];
        Banner();
        InicializaVelha();
        ImprimeVelha();
        JogarVelha();
    }

    public static void InicializaVelha() {
        for (int l = 0; l < velha.length; l++) {
            for (int c = 0; c < velha.length; c++) {
                velha[l][c] = '#';
            }
            System.out.println();
        }
    }

    public static void ImprimeVelha() {
        for (int l = 0; l < velha.length; l++) {
            for (int c = 0; c < velha.length; c++) {
                System.out.print(velha[l][c] + " ");
            }
            System.out.println();
        }
    }

    public static void JogarVelha() {
        char player = 0;
        int l = 0, c = 0, cont, validar = 3;
        for (cont = 0; cont < 9; cont++) {
            do {
                validar = 0;
                System.out.println("Jogada " + (cont + 1) + ". Informe símbolo, linha, coluna: ");
                player = input.next().charAt(0);
                l = input.nextInt();
                c = input.nextInt();
                if (l < 3 && c < 3 && l >= 0 && c >= 0) {
                    if (velha[l][c] == '#') {
                        validar = 1;
                        velha[l][c] = player;

                    }
                } else
                    System.out.println("Jogada inválida. Jogue Novamente:");
            } while (validar != 1);
            velha[l][c] = player;
            ImprimeVelha();
            cont = VerificaGanhador(cont);
        }
    }

    public static int VerificaGanhador(int cont) {
        int c = cont;
        if (velha[0][0] == velha[0][1] && velha[0][0] == velha[0][2] && velha[0][0] != '#') {
            System.out.println("Jogador " + velha[0][0] + " venceu!");
            c = 10;
        }
        return c;
    }
}
