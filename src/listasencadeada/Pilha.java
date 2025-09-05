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
        Pilha pilha = new Pilha();
        int [] itens = {1, 5, 3,9, 0};
        System.out.println("Digite os itens da lista (digite '0' para parar):");
        for (int item : itens){
            if (item == 0){
                break;
            }
            pilha.insere(item);
        }
        System.out.println("Pilha com lista Encadeada:");
        pilha.imprime();
        pilha.remove();
        pilha.imprime();
    }
}
