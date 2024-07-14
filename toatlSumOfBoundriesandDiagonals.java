package Arrays2D;

public class toatlSumOfBoundriesandDiagonals {
    public static int TotalSum(int mat[][]) {
    	int m=mat.length;
    	int n=mat[0].length;
    	int sum=0;
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			if(i==j || i+j==n-1) {
    				sum+=mat[i][j];
    			}else  {
    				sum+=mat[i][j];
    			}
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{4,5,6,7},{7,8,9,7},{1,2,3,4}};
		int res=TotalSum(arr);
		System.out.println(res);
	}

}
