public class Node<E> {
  private final E value;
  private int height;
  private Node<E> left;
  private Node<E> right;
  private Node<E> parent;

  public Node(E value) {
    this.value = value;
    this.height = 1;
  }

  public E getValue() {
    return this.value;
  } 

  public void setLeft(Node<E> node) {
    this.left = node;
  }

  public void setRight(Node<E> node) {
    this.right = node;
  }

  public void setParent(Node<E> node) {
    this.parent = node;
  }

  public void setHeight(int value) {
    this.height = value;
  }

  public Node<E> getLeft() {
    return this.left;
  }

  public Node<E> getRight() {
    return this.right;
  }

  public Node<E> getParent() {
    return this.parent;
  }

  public int getHeight() {
    return this.height;
  }
}