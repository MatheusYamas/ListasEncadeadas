package listasencadeada;

import java.util.Scanner;

public class Pilha {
    private Node Pilha;
    public Pilha(){
        this.Pilha = null;
    }

    public void insere(int informacao){
        Node no = new Node();
        no.setInformacao(informacao);
        if(vazia()){
            Pilha=no;
        }
        else{
            no.setProximo(Pilha);
            Pilha = no;
            System.out.println("Nó atual no endereço" + no);
        }
    }


    //Imprimindo elementos
    public void imprime(){
        Node atual = Pilha;
        while (atual != null) {
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Null");
    }

    public boolean vazia(){
        return Pilha == null;
    }

    public Node remove(){
        if(vazia()){
            return null;
        }
        Node no = Pilha;
        Pilha = Pilha.getProximo();
        return no;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha();
        System.out.println("Digite os itens da lista (digite '0' para parar):");
        int item;
        while (true) {
            item = scanner.nextInt();
            if (item == 0) {
                break;
            }
            pilha.insere(item);
        }
        System.out.println("Pilha com lista Encadeada:");
        pilha.imprime();
        System.out.println("Se caso queira remover, digite 1:");
        int digito = scanner.nextInt();
        while (digito == 1){
            System.out.println("Se caso queira remover, digite 1:");
            digito = scanner.nextInt();
            pilha.remove();
        }
        pilha.imprime();
    }
}
