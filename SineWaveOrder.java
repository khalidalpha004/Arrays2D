package Arrays2D;

public class SineWaveOrder {
    public static void SineWavePrint(int mat[][]) {
    	int m=mat.length;
    	int n=mat[0].length;
    		for(int j=0;j<n;j++ ) {
    			if(j%2==0) {
    				for(int i=0;i<m;i++) {
    					System.out.print(mat[i][j] +" ");
    				}
    			}else {
    				for(int i=m-1;i>=0;i--) {
    					System.out.print(mat[i][j] +" ");
    				}
    			}
    		}
    	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,9,7,1},{1,2,9,8},{1,1,0,3},{1,2,3,4}};
		SineWavePrint(arr);

	}

}
