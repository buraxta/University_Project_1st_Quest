public class Main {

    public static void main(String[] args)
    {
        Btree tree = new Btree();
        int arr[] = {5, 4, 7, 2, 11};
        tree.treeins(arr);
        tree.inorderRec(tree.root);
    }
}