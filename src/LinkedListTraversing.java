public class LinkedListTraversing {
    public static void main(String[]args)
    {
        int[] data = {1,2,3,4,5,6,7};
        int[] pointer = {1,2,3,4,5,6,-1};
        int current = 0;
        while(current != -1)
        {
            System.out.print(data[current] + ", ");
            current = pointer[current];
        }
        System.out.println();

    }
}
