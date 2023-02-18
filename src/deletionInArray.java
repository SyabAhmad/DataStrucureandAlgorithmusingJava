public class deletionInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("at specific location");
        int[] newArray = new int[array.length -1];
        int index1 = 3;
        for (int i = 0; i < index1; i++) {
            newArray[i] = array[i];
        }
        for(int i=index1+1;i<array.length;i++)
        {
            newArray[i-1] = array[i];
        }
        array = newArray;

        System.out.println("After Operations");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + ",  ");
        }
        System.out.println();


        ///// at head of the array
        System.out.println("At head of the array");
        int[] array1 = {1,2,3,4,5,6,7};
        int head = array1[0];

        int[] newArray1 = new int[array1.length -1];

        for(int i=head;i<array1.length;i++)
        {
            newArray1[i-1] = array1[i];
        }
        System.out.println();
        array1 = newArray1;
        for (int i=0;i<array1.length;i++)
        {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();


        ///// at tail of the array
        System.out.println("at enf of the array");
        int[] array2 = {1,2,3,4,5,6,7};

        int[] newArray2 = new int[array2.length-1];

        for(int i=0;i< newArray2.length;i++)
        {
            newArray2[i] = array2[i];
        }
        array2 = newArray2;

        for(int i =0;i<array2.length;i++){
            System.out.print(array2[i] + ", ");
        }

    }
}
