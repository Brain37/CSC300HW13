import java.util.Random;

public class Driver
{
    public static void main(String[] args)
    {
    	BST tree = new BST();
        String vals = "fcbadef";
        for(int i = 0; i < vals.length(); i++)
        {
            tree.add(vals.charAt(i));
            /*if(tree.isOutOfBalance())
            {
                tree.howAreWeOutOfBalance(vals.charAt(i));
            }
            */
        }
        System.out.println(tree.isOutOfBalance());
        tree.leftLeftRotation('a');
        System.out.println(tree.isOutOfBalance());
        tree.leftLeftRotation('a');
        System.out.println(tree.isOutOfBalance());
        
        //tree.visitPreOrder();
        //tree.visitPostOrder();
        //tree.visitInOrder();
        //tree.visitLevelOrder();
    }
}
