package listasencadeada;

public class Merge {
    private Node merge;

    public Merge() {
        this.merge = null;
    }
    public Node getMerge() {
        return this.merge;
    }

    public void mergeLista(Node merge1, Node merge2) {
        if (merge1 == null) {
            this.merge = merge2;
            return;
        }
        if (merge2 == null) {
            this.merge = merge1;
            return;
        }

        Node mergeFinal;
        if (merge1.getInformacao() <= merge2.getInformacao()) {
            mergeFinal = merge1;
            merge1 = merge1.getProximo();
        } else {
            mergeFinal = merge2;
            merge2 = merge2.getProximo();
        }

        Node listaFinal = mergeFinal;
        while (merge1 != null && merge2 != null) {
            if (merge1.getInformacao() <= merge2.getInformacao()) {
                listaFinal.setProximo(merge1);
                merge1 = merge1.getProximo();
            } else {
                listaFinal.setProximo(merge2);
                merge2 = merge2.getProximo();
            }
            listaFinal = listaFinal.getProximo();
        }

        if (merge1 != null) {
            listaFinal.setProximo(merge1);
        } else if (merge2 != null) {
            listaFinal.setProximo(merge2);
        }
        this.merge = mergeFinal;
    }
    public void insere(int informacao) {
        Node no = new Node();
        no.setInformacao(informacao);
        if (vazia()) {
            this.merge = no;
        } else {
            Node atual = this.merge;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(no);
        }
    }

    public void imprime() {
        Node atual = this.merge;
        while (atual != null) {
            System.out.print(atual.getInformacao() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("Null");
    }

    public boolean vazia() {
        return this.merge == null;
    }

    public static void main(String[] args) {
        Merge lista = new Merge();
        Merge lista1 = new Merge();
        Merge lista2 = new Merge();

        int[] itens = {3, 5, 7, 9};
        for (int item : itens) {
            lista1.insere(item);
        }

        int[] itens2 = {2, 8, 9, 12};
        for (int item : itens2) {
            lista2.insere(item);
        }

        System.out.print("Lista 1: ");
        lista1.imprime();
        System.out.print("Lista 2: ");
        lista2.imprime();

        lista.mergeLista(lista1.getMerge(), lista2.getMerge());

        System.out.println("Lista Final:");
        lista.imprime();
    }
}