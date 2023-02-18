public class SearchinLinkedList {
    public static void main(String[]args)
    {
        int[] data = {1,2,3,4,5,6,7};
        int[] pointer = {1,2,3,4,5,6,-1};
        int current = 0;
        int keyToFind = 4;
        int indexOfKey = 0;
        while(current != -1)
        {
            if ((data[current] == keyToFind))
            {
                System.out.print(data[current] + ", ");
                indexOfKey = current;
            }
            current = pointer[current];
        }
        System.out.println();
        System.out.println("index of key = " + indexOfKey);
    }
}
