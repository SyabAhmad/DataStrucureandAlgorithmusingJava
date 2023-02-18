public class BinarySearch {
    public static void main(String[]args)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int i=-0;i<arr.length;i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int head = arr[0];
        int end = arr[arr.length-1];

        int key = 1;
        while(head<=end)
        {
            int mid = head + (end-head)/2;
            if (arr[head] == key)
            {
                System.out.println(head);
                break;
            }else if(arr[mid] == key)
            {
                head = mid + 1;
                System.out.println(mid);
                break;
            }else
            {
                head = mid - 1;
                System.out.println(end);
                break;
            }
        }
        System.out.println(head);
        //System.out.println(mid);
        System.out.println(end);
    }
}
