import java.util.Stack;

public class StackDataStructure {
    public static void main(String[]args) {

        ///I don't know if this is right solution or not
        Stack<String> data = new Stack<String>() {
        };
        data.push("Apple");
        data.push("Orange");
        data.push("Banana");
        data.push("Cherry");
        System.out.print(data + ", ");
        System.out.println();
        /////  insertion at end
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] newArray = new int[array.length +1];
        int targetedValue = 12;
        for(int i = 0; i < newArray.length;i++)
        {
            if (i == newArray.length-1)
            {
                newArray[i] = targetedValue;
            }else {
                newArray[i] = array[i];
            }
        }
        array = newArray;
        for (int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + ", ");

        }
        System.out.println();

        //// deletion at end
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] newArray1 = new int[array1.length -1];
        for(int i = 0; i < newArray1.length;i++)
        {
            newArray1[i] = array1[i];
        }
        array1 = newArray1;
        for (int i = 0; i < array1.length;i++)
        {
            System.out.print(array1[i] + ", ");

        }
    }
}
