public class Table2DArray {
    public static void main(String[] args)
    {
        System.out.println("Displaying Table Data in 2D Array");
        int[][] data = {{1,2,3,4,},{1,2,3,4,}};
        String[] columnTitle = {"class1", "class2", " class3", "class4"};
        for(int i=0;i<data[0].length;i++)
        {
            System.out.print("\t"+columnTitle[i]);
        }
        String[] rowTitle = {"class1", "class2"};

        System.out.println();
        for(int i=0;i<data.length;i++)
        {
            System.out.print(rowTitle[i]);
            for(int j=0;j<data[0].length;j++)
            {
                System.out.print("     "+data[i][j]+" ");
            }
            System.out.println();
        }


    }
}
