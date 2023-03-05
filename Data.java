package BinaryTree;

public interface Data {
    public String getKey();

    public boolean keyLess(String key);

    public boolean keyEqual(String key);

    public boolean less(Data d);

    public boolean equal(Data d);
}
