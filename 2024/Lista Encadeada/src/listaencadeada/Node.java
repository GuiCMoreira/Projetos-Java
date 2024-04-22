package listaencadeada;

public class Node<P> {
  private P info;
  private Node<P> proximo;

  public Node(P info) {
    this.info = info;
  }

  // getters e setters
  public P getInfo() {
    return info;
  }

  public void setInfo(P info) {
    this.info = info;
  }

  public Node<P> getProximo() {
    return proximo;
  }

  public void setProximo(Node proximo) {
    this.proximo = proximo;
  }

}
