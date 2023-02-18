public class ArrayTraversing {
    public static void main(String []args){
        System.out.println("Array Traversing for Integer Data type: ");
        int[] arr = {1,2,3,4,5,6,7,8,9,10,}; //// this is in Integer array
        for (int i = 0; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Array Traversing for String Data Type: ");
        String[] fruits = {"apple", "banana", "grapes", "oranges", "mango"};
        for (int i = 0;i<fruits.length;i++)
        {
            System.out.println(fruits[i]);
        }
    }
}
