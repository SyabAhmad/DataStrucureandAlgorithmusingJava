public class TransposeOfMatrix {
    public static void main(String[]args)
    {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] transpose = new int[data[0].length][data.length];
        for(int i=0; i<data.length; i++)
        {
            for(int j=0; j<data[0].length; j++)
            {
                transpose[j][i] = data[i][j];
            }
        }
        data = transpose;
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
