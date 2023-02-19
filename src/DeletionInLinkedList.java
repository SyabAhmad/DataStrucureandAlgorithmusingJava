public class DeletionInLinkedList {
    public static void main(String[]args)
    {
        int[] data = {1,2,3,4,5,6,7};
        int[] indexed = {1,2,3,4,5,6,-1};
        int[] newData = new int[data.length -1];
        int current;
        for(current = 0; current < data.length-1; current++)
        {
            System.out.println(data[current]);
        }
    }
}
