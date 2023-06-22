import java.util.Scanner;

public class CO1P2{
	
	public static void displayMatrix(int x[][], int rows, int columns){
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void insertMatrix(int x[][], int rows, int columns){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.print(":-");
				x[i][j] = sc.nextInt();
			}
		}
	}
	public static void addMatrix(int x[][], int y[][], int rows, int columns){
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				x[i][j] = x[i][j] + y[i][j];
			}
		}
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int rows,cols;
		System.out.print("Enter the No. of rows:");
		rows = sc.nextInt();
		System.out.print("Enter the No. of columns:");
		cols = sc.nextInt();
		int mat1[][] = new int[rows][cols];
		int mat2[][] = new int[rows][cols];
		System.out.println("Enter the Elements in Matrix 1:");
		insertMatrix(mat1, rows, cols);
		System.out.println("Enter the Elements in Matrix 2:");
		insertMatrix(mat2, rows, cols);
		System.out.println("Elements in Matrix 1:");
		displayMatrix(mat1, rows, cols);
		System.out.println("Elements in Matrix 2:");
		displayMatrix(mat2, rows, cols);
		addMatrix(mat1, mat2, rows, cols);
		System.out.println("Sum of Matrix:-");
		displayMatrix(mat1, rows, cols);
	}
}