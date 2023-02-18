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
        System.out.println("Insertion at head");

    }
}
