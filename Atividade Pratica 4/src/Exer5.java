
import java.util.Scanner;

public class Exer5 {

    public static int somarLinha(int[][] matriz, int linha, int coluna){
        if(coluna == matriz[linha].length){
            return 0;
        }
        return matriz[linha][coluna] + somarLinha(matriz, linha, coluna +1);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [][] matriz = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
        };

        System.err.println("Informe a linha para ser somada:");
        int linha = entrada.nextInt();

        int resultado = somarLinha(matriz, linha, 0);
        System.out.println("Soma é igual a: " + resultado);
        entrada.close();
    }
}
