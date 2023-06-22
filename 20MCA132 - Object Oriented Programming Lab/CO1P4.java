import java.util.Scanner;
public class CO1P4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int rows, cols;
		System.out.print("Enter the number of Rows:");
		rows = sc.nextInt();
		System.out.print("Enter the number of Columns:");
		cols = sc.nextInt();
		int mat1[][] = new int[rows][cols];
		int mat2[][] = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Transpose of the given matrix:-");
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				mat2[j][i] = mat1[i][j];
			}
		}
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				if(mat1[i][j] != mat2[i][j]){
					System.out.println("The matrix is not transpose");
					break;
				}
			}	
		}
	}
}