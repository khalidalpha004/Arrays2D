package Arrays2D;

public class largestColumnSum {
    public static int LargestSum(int mat[][]) {
    	int m=mat.length;
    	int n=mat[0].length;
    	int sum=0;
    	int sum1=Integer.MIN_VALUE;
    	for(int j=0;j<n;j++) {
    		
    		sum=0;
    		for(int i=0;i<m;i++) {
    			sum=sum+mat[i][j];
    		}
    		if(sum>sum1) {
    			sum1=sum;
    		}
    	}
    	
    	return sum1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,9,7},{1,2,9},{1,1,0 }};
	       int res=LargestSum(arr);
	       System.out.println(res);
	}

}
