package listasencadeada;

import java.util.Scanner;

public class Merge {
    public static FilaEncadeada mergeFilas(FilaEncadeada filaA, FilaEncadeada filaB) {
        FilaEncadeada filaC = new FilaEncadeada();

        while (!filaA.vazia() && !filaB.vazia()) {
            int elementoA = filaA.frente();
            int elementoB = filaB.frente();
            if (elementoA <= elementoB) {
                filaC.insere(filaA.remove());
            } else {
                filaC.insere(filaB.remove());
            }
        }
        while (!filaA.vazia()) {
            filaC.insere(filaA.remove());
        }
        while (!filaB.vazia()) {
            filaC.insere(filaB.remove());
        }
        return filaC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaEncadeada filaA = new FilaEncadeada();
        System.out.println("Digite os itens da lista A(digite '0' para parar):");
        int itemA;
        while (true) {
            itemA = scanner.nextInt();
            if (itemA == 0) {
                break;
            }
            filaA.insere(itemA);
        }
        filaA.imprime();

        System.out.println("Digite os itens da lista B(digite '0' para parar):");
        FilaEncadeada filaB = new FilaEncadeada();
        int itemB;
        while (true) {
            itemB = scanner.nextInt();
            if (itemB == 0) {
                break;
            }
            filaB.insere(itemB);
        }
        filaB.imprime();
        FilaEncadeada filaC = mergeFilas(filaA, filaB);

        System.out.println("Fila Final:");
        filaC.imprime();
    }
}