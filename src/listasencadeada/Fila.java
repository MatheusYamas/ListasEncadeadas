package listasencadeada;

import java.util.Scanner;

public class Fila {
    private Node Fila;
    public Fila(){
        this.Fila = null;
    }
// Rever o insere
    public void insere (int informacao){
        Node no = new Node();
        no.setInformacao(informacao);
        if(vazia()){
            Fila=no;
        }
        else{
            Node atual =Fila;
            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            System.out.println("Nó atual no endereço" + atual);
        }
    }

    public Node remove(){
        if(vazia()){
            return null;
        }
        Node no = Fila;
        Fila = Fila.getProximo();
        return no;
    }

    public void imprime(){
        Node atual = Fila;
        while (atual != null) {
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Null");
    }

    public boolean vazia(){
        return Fila == null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();
        int [] itens = {1, 5, 3,9, 0};
        System.out.println("Digite os itens da lista (digite '0' para parar):");
        for (int item : itens){
            if (item == 0){
                break;
            }
            fila.insere(item);
        }
        System.out.println("Fila com Lista Encadeada:");
        System.out.println("Fila com Lista Encadeada:");
        fila.imprime();
        fila.remove();
        fila.imprime();
    }
}
