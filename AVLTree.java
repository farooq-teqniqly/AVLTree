public class AVLTree<E extends Comparable> {
  private Node<E> root;

  public void insert(E value) {
    if (root == null) {
      this.root = new Node<E>(value);
    } else {
      this.insert(value, this.root);
    }
  }

  public Node<E> getRoot() {
    return this.root;
  }

  private void insert(E value, Node<E> node) {
    int compareResult = value.compareTo(node.getValue());

    if (compareResult == 0) {
      throw new IllegalStateException(String.format("The value '%s' already exists.", value.toString()));
    }

    Node<E> newNode = new Node<E>(value);

    if (compareResult > 0) {
      if (node.getRight() == null) {
        node.setRight(newNode);
      } else {
        this.insert(value, node.getRight());  
      }
    } else {
      if (node.getLeft() == null) {
        node.setLeft(newNode);
      } else {
        this.insert(value, node.getLeft());
      }
    }

    newNode.setParent(node);
    node.setHeight(1 + this.getMax(this.getHeight(node.getLeft()), this.getHeight(node.getRight())));
    int balanceFactor = this.getBalanceFactor(node);
  }

  private int getHeight(Node<E> node) {
    return node == null ? 0 : node.getHeight();
  }

  private int getMax(int x, int y) {
    return x > y ? x : y;
  }

  private int getBalanceFactor(Node<E> node) {
    if (node == null) {
      return 0;
    }

    return this.getHeight(node.getLeft()) - this.getHeight(node.getRight());
  }
}