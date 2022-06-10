/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix.transposta;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class MatrixTransposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Gerar uma matriz C transposta a matriz A.
        
	Scanner pergunta = new Scanner(System.in);
        
	int n = 5;
                  int s = 2;
	int[][] matriz = new int[n][n];
	int[][] matrizT = new int[n][n];
	System.out.println("Matriz M[3][3]\n");

	for (int linha = 0; linha < s; linha++) {
		for (int coluna = 0; coluna < n; coluna++) {
			System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
			matriz[linha][coluna] = pergunta.nextInt();
		}
	}

	System.out.println("\nA Matriz original ficou: \n");
	for (int linha = 0; linha < s; linha++) {
		for (int coluna = 0; coluna < n; coluna++) {
			System.out.printf("\tM[%d][%d]: ", linha + 1, coluna + 1);
			System.out.printf("%d \t", matriz[linha][coluna]);
		}
		System.out.println();
	}
	for (int linha = 0; linha < n; linha++) {
		for (int coluna = 0; coluna < n; coluna++) {
			matrizT[linha][coluna] = matriz[coluna][linha];
		}
	}
	System.out.println("\n Matriz transposta: \n");
	for (int linha = 0; linha < n; linha++) {
		for (int coluna = 0; coluna < s; coluna++) {
			System.out.printf("\tM[%d][%d]: ", linha + 1, coluna + 1);
			System.out.printf("%d \t", matrizT[linha][coluna]);
		}
		System.out.println();
	}
}
        
        
        
    }
    

