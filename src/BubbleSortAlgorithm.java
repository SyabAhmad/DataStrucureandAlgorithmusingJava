import java.sql.Array;

public class BubbleSortAlgorithm {
    public static void main(String[]args)
    {
        System.out.println("Bubble Sort Algorithm (increase order)");
        ////bubble sort algorithm
        int[] array = {5,4,3,6,3,6,7};
        //int[] newArray = new int[array.length];
        for (int i =0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ ", ");
        }
        System.out.println();

        System.out.println("Bubble Sort Algorithm (decrease order)");
        int[] array1 = {5,4,3,6,3,6,7};
        //int[] newArray = new int[array.length];
        for (int i =0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if (array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ ", ");
        }

    }
}
