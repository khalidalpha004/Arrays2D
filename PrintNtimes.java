package Arrays2D;

public class PrintNtimes {
    public static void print(int mat[][]) {
    	int m=mat.length;
    	for(int i=0;i<m;i++) {
    		int count=m-i;
    		int n=mat[i].length;
    		while(count>0) {
    		for(int j=0;j<n;j++) {
    			System.out.print(mat[i][j] +" ");
    		}
    		System.out.println();
    		count--;
    		}
//    		System.out.println();
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{4,5,6,7}};
		print(arr);
	}

}
