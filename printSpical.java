package Arrays2D;

public class printSpical {
    public static void PrintSpirical(int mat[][]) {
    	int m=mat.length;
    	int n=mat[0].length;
    	int startCol=0;
    	int startRow=0;
    	int total=m*n;
    	int count=0;
    	while(count<=total) {
    		for(int i=startCol;count<total && i<n; i++) {
    			System.out.print(mat[startRow][i] +" ");
    			count++;
    		}
    		startRow++;
    		
    		
    		for(int i=startRow;count<total && i<m; i++) {
    			System.out.print(mat[i][n-1] +" ");
    			count++;
    		}
//    		upperRow++;
    		n--;
    		
    		for(int i=n-1;count<total && i>=startCol; i--) {
    			System.out.print(mat[m-1][i] +" ");
    			count++;
    		}
    		m--;
//    		
    		for(int i=m-1;count<total && i>=startRow; i--) {
    			System.out.print(mat[i][startCol] +" ");
    			count++;
    		}
    		startCol++;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,9,7,1},{1,2,9,8},{1,1,0,3},{1,2,3,4}};
		PrintSpirical(arr);
	}

}
