package Arrays2D;

public class MatrixTranspose {
    public static int[][] Transpose(int mat[][]){
    	int m=mat.length;
    	int n=mat[0].length;
    	int transpose [][]=new int[n][m];
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			transpose[i][j]=mat[j][i];
    		}
    	}
    	return transpose;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,9,7,1},{1,2,9,8},{1,1,0,3},{1,2,3,4}};
		int res[][]=Transpose(arr);
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}

}
