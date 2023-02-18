public class LinearSearch {
    public static void main(String[]args)
    {
        try{
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            System.out.println("Linear Search Algorithm");
            int key = 7;
            int indexOfKey = 0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] == key)
                {
                    indexOfKey = arr[i];
                }
            }
            System.out.println("index if Key: " + indexOfKey);
        }catch (Exception e)
        {
            e.printStackTrace();

        }


    }
}
