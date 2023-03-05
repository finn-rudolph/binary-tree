package BinaryTree;

public class Node extends TreeElement {
    TreeElement left, right;
    Data d;

    public Node(Data d, TreeElement nil) {
        left = right = nil;
        this.d = d;
    }

    public Data getData() {
        return d;
    }

    public void setLeft(TreeElement x) {
        left = x;
    }

    public void setRight(TreeElement x) {
        right = x;
    }

    public TreeElement insert(Data x) {
        if (d.less(x))
            right = right.insert(x);
        else
            left = left.insert(x);
        return this;
    }

    public TreeElement erase(Data x) {
        if (d.equal(x)) {
            TreeElement replacement = right.minimum();
            if (replacement == null) {
                return left;
            } else {
                right = right.erase(replacement.getData());
                replacement.setRight(right);
                replacement.setLeft(left);
                return replacement;
            }
        } else if (d.less(x))
            right = right.erase(x);
        else
            left = left.erase(x);
        return this;
    }

    public Data findData(String key) {
        if (d.keyEqual(key))
            return d;
        if (d.keyLess(key))
            return right.findData(key);
        else
            return left.findData(key);
    }

    public TreeElement minimum() {
        TreeElement x = left.minimum();
        return x == null ? this : x;
    }

    public TreeElement maximum() {
        TreeElement x = right.maximum();
        return x == null ? this : x;
    }

    public void printPreorder() {
        System.out.println(d.getKey());
        left.printPreorder();
        right.printPreorder();
    }

    public void printInorder() {
        left.printInorder();
        System.out.println(d.getKey());
        right.printInorder();
    }

    public void printPostorder() {
        left.printPostorder();
        right.printPostorder();
        System.out.println(d.getKey());
    }
}
