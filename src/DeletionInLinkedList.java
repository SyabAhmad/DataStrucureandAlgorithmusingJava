public class DeletionInLinkedList {
    public static void main(String[]args)
    {
        int[] data = {1,2,3,4,5,6,7};
        int[] indexed = {1,2,3,4,5,6,-1};
        int[] newData = new int[data.length -1];
        int current;
        for(current = 0; current < data.length-1; current++)
        {
            System.out.print(data[current]+ ", ");
        }
        //// deletion at beginning
        System.out.println();
        int[] data1 = {1,2,3,4,5,6,7};
        int[] indexed1 = {1,2,3,4,5,6,-1};
        int[] newData1 = new int[data1.length -1];
        int current1 = 1;
        while(current1 != -1)
        {
            System.out.print(data1[current1] + ", ");
            current1 = indexed1[current1];
        }
        System.out.println();
    }
}
