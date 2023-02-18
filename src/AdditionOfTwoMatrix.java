public class AdditionOfTwoMatrix {
    public static void main(String[] args)
    {
        System.out.println("Addition of two Matrix (2D)");
        int[][] a = {{1, 2}, {4, 5}};
        int[][] b = {{2, 3}, {5, 6}};
        int[][] c = new int[2][2];

        System.out.println("Before Operation");
        for(int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Before Operation");

        for(int i=0; i<b.length; i++)
        {
            for (int j=0; j<b[0].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("After Operation");


        //System.out.println((a[1][1] + b[0][0]));
        for(int i = 0; i <a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0; i<c.length; i++)
        {
            for (int j=0; j<c[0].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
