package Arrays2D;

public class DiganolElements {
    public static int[][] diagonalElements(int mat[][]){
    	int m=mat.length;
    	int n=mat[0].length;
    	int res[][]=new int[m][n];
    	int k=0;
    	int l=0;
    	if(m==n) {
    		System.out.println("YES");
    	}else {
    		System.out.println("NO");
    	}
    	if(m==n) {
    		for(int i=0;i<m;i++) {
    			for(int j=0;j<n;j++) {
    				if(i==j) {
    					res[k][l]=mat[i][j];
    					k++;
    					l++;
    				}
    			}
    		}
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2},{1,2}};
	       int res[][]=diagonalElements(arr);
	       for(int i=0;i<res.length;i++) {
	    	   for(int j=0;j<res[0].length;j++) {
	    		   if(i==j) {
	    		   System.out.print(res[i][j]+" ");
	    		   
	    	   }
	       }
//	       System.out.println(res);
	}

}
}
