class Main {
  public static void main(String[] args) {
    AVLTree<Integer> tree = new AVLTree<>();
    tree.insert(10);
    System.out.println(tree.getRoot().getValue());
  }
}