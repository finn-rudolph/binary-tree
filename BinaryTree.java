package BinaryTree;

public class BinaryTree {
    TreeElement root;
    EndNode nil;

    public BinaryTree() {
        nil = new EndNode();
        root = nil;
    }

    public void insert(Data x) {
        root = root.insert(x);
    }

    public void erase(Data x) {
        root = root.erase(x);
    }

    public Data findData(String key) {
        return root.findData(key);
    }

    public void printPreorder() {
        root.printPreorder();
    }

    public void printInorder() {
        root.printInorder();
    }

    public void printPostorder() {
        root.printPostorder();
    }
}
