public class InsertioninLinkedlist {
    public static void main(String[]args)
    {
        ///// Not Solved
        int[] data = {1,2,3,4,5,6,7};
        int[] indexed = {1,2,3,4,5,6,-1};
        int[] newData = new int[data.length +1];
        int[] newIndexed = new int[indexed.length +1];
        int current = 0;
        int targetedValue = 90;
        while(current != -1)
        {
            if (current == newData.length-1)
            {
                newData[current] = targetedValue;
            }else {
                newData[current] = data[current];
            }
            current = indexed[current];
        }

        for(current = 0; current < newData.length; current++)
        {
            System.out.println(newData[current] +", ");
        }
    }
}
