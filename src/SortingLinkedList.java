import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingLinkedList {
    public static void main(String[]args)
    {
        // as i have tried a bit but as java have there built in List, they made sorting easy
        LinkedList<Integer> data = new LinkedList<>();
        data.add(5);
        data.add(4);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(9);
        data.add(8);
        data.add(7);
        data.add(6);
        System.out.println(data.toString());
        Collections.sort(data);
        System.out.println(data.toString());

    }
}















//public class SortingLinkedList {
//    public static void main(String[]args)
//    {
//        int[] data = {2,3,1,4,7,5,9,8,6,};
//        int[] indexes = {1,2,3,4,5,6,7,8,-1,};
//        int currentValue = 0;
//
//        while(currentValue != -1){
//            if ( data[currentValue] < data[0] )
//            {
//                int temp = data[currentValue];
//                data[currentValue] = data[currentValue+1];
//                data[currentValue+1] = temp;
//            }
//            currentValue = indexes[currentValue];
//        }
//        while(currentValue != -1){
//            System.out.println(data[currentValue]);
//            currentValue = indexes[currentValue];
//        }
//    }
//}
