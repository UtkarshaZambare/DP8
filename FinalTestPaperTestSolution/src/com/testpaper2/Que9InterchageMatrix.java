/*Java Program to Interchange  bottom two Rows & left two Columns in the given Matrix.[1M]
Given Matrix:
1 2 3
4 5 6
7 8 9
Matrix after interchanging row 2 and 3
1 2  3
7 8 9
4 5 6
Matrix after interchanging columns 1 and 2
2 1 3
8 7 9
5 4 6
*/



package com.testpaper2;

public class Que9InterchageMatrix {
	
	public static void printMatrix(int [][]matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			
			System.out.println();
		}
		
	}
   public static void exchangeAnyTwoRows(int[][]matrix,int K,int L) {
	   int[]temp=matrix[K-1];
	   matrix[K-1]=matrix[L-1];
	   matrix[L-1]=temp;
	   printMatrix(matrix);
	   System.out.println("----------------------------------");
   }
   
   public static void exchangeColumn(int[][]matrix,int K1,int L1) {
	   for(int i=0;i<matrix.length; i++) {
	   int temp=matrix[i][K1-1];
	   matrix[i][K1-1]=matrix[i][L1-1];
	   matrix[i][L1-1]=temp;
	   }
	   printMatrix(matrix);
   }
	public static void main(String[] args) {
	int K=2,L=3;
	int K1=1,L1=2;
	int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
	exchangeAnyTwoRows(mat, K, L);
	exchangeColumn(mat, K1, L1);

	}

}
