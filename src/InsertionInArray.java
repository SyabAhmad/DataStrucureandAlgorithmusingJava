public class InsertionInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Before Operation");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + ",  ");
        }
        System.out.println();

        System.out.println("Insertion at specific Location/index");
        int index= 2;
        int value = 99;
        for(int i = 0; i < array.length;i++)
        {
            if(index == i){
                array[i] = value;
            }
        }
        System.out.println();
        System.out.println("New array after adding at specific Location/index");
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.println();




        System.out.println("Insertion at End");
        System.out.println("First we will create a new array");
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length;i++)
        {
            newArray[i] = array[i];
            newArray[i + 1] = 22;
        }
        array = newArray;
        System.out.println("New array after adding at End");
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.println();





        System.out.println("Insertion at head");
        int[] newArray1 = new int[array.length+1];
        int value1 = 2003;
        newArray1[0] = value1;
        for (int i = 0; i < array.length;i++)
        {
            newArray1[i+1] = array[i];
        }
        array = newArray1;
        System.out.println("after insertion at head");
        for (int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
