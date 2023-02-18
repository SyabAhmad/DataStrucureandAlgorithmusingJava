
public class ArrayTraversing2D {
    public static void main(String[] args) {
        System.out.println("Traversing 2D Array of Integer Datatype");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}};
        for (int i=0;i<matrix.length;i++){

            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("Traversing 2D Array of String Datatype");
        String[][] matrix2 = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        for (int i=0;i<matrix2.length;i++){
            for (int j=0;j<matrix2[0].length;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
