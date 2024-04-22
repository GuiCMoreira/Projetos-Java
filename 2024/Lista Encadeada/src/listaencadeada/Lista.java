package listaencadeada;

public class Lista<G> {
  private Node<G> inicio;

  public Lista() {
    inicio = null;
  }

  public void insert(G info) {
    if (inicio == null) {
      inicio = new Node<G>(info);
    } else {
      Node<G> atual = inicio;
      while (atual.getProximo() != null) {
        atual = atual.getProximo();
      }
      atual = new Node<G>(info);
    }
  }

}
