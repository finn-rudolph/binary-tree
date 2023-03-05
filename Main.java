package BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String msg = new String();
        Scanner s = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        while (msg.compareTo("quit") != 0) {
            msg = s.next();

            if (msg.compareTo("insert") == 0) {
                long x = s.nextLong();
                tree.insert(new Number(x));
            } else if (msg.compareTo("erase") == 0) {
                long x = s.nextLong();
                tree.erase(new Number(x));
            } else if (msg.compareTo("preorder") == 0) {
                tree.printPreorder();
            } else if (msg.compareTo("inorder") == 0) {
                tree.printInorder();
            } else if (msg.compareTo("postorder") == 0) {
                tree.printPostorder();
            } else if (msg.compareTo("quit") != 0)
                System.out.println("Ungültiger Befehl.");
        }

        s.close();
    }
}
