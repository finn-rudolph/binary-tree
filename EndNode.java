package BinaryTree;

public class EndNode extends TreeElement {
    TreeElement left, right;

    public EndNode() {
        left = right = this;
    }

    public Data getData() {
        return null;
    }

    public void setLeft(TreeElement x) {
        left = x;
    }

    public void setRight(TreeElement x) {
        right = x;
    }

    public TreeElement insert(Data x) {
        Node u = new Node(x, this);
        return u;
    }

    public TreeElement erase(Data x) {
        return this;
    }

    public Data findData(String key) {
        return null;
    }

    public TreeElement minimum() {
        return null;
    }

    public TreeElement maximum() {
        return null;
    }

    public void printPreorder() {
    }

    public void printInorder() {
    }

    public void printPostorder() {
    }
}
