package bhagirath;
import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter number of rows and columns: ");
	        int rows = scanner.nextInt();
	        int cols = scanner.nextInt();
	        
	        int[][] matrix = new int[rows][cols];
	        
	        System.out.println("Enter elements for the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        int[][] transposed = new int[cols][rows];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transposed[j][i] = matrix[i][j];
	            }
	        }
	        
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);
	        
	        System.out.println("Transposed Matrix:");
	        printMatrix(transposed);
	        
	        scanner.close();
	    }

	    private static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	}

}
