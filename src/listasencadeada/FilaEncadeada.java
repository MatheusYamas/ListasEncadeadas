package listasencadeada;

public class FilaEncadeada {
    private Node inicio;
    private Node fim;

    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean vazia() {
        return this.inicio == null;
    }

    public void insere(int informacao) {
        Node novoNo = new Node();
        novoNo.setInformacao(informacao);
        novoNo.setProximo(null);

        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Erro: Fila está vazia.");
            return -1;
        }

        int valorRemovido = inicio.getInformacao();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        return valorRemovido;
    }

    public int frente() {
        if (vazia()) {
            System.out.println("Erro: Fila está vazia.");
            return -1;
        }
        return inicio.getInformacao();
    }

    public void imprime() {
        Node atual = this.inicio;
        System.out.print("Fila -> ");
        while (atual != null) {
            System.out.print(atual.getInformacao() + " | ");
            atual = atual.getProximo();
        }
        System.out.println("Fim");
    }
}
