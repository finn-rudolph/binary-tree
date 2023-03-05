package BinaryTree;

public class Number implements Data {

    String key;
    long n;

    public Number(long n) {
        this.n = n;
        key = Long.toString(n);
    }

    public String getKey() {
        return key;
    }

    public boolean keyLess(String key) {
        return Integer.parseInt(this.key) < Integer.parseInt(key);
    }

    public boolean keyEqual(String key) {
        return Integer.parseInt(this.key) == Integer.parseInt(key);
    }

    public boolean less(Data d) {
        return Integer.parseInt(this.key) < Integer.parseInt(d.getKey());
    }

    public boolean equal(Data d) {
        return Integer.parseInt(this.key) == Integer.parseInt(d.getKey());
    }
}
