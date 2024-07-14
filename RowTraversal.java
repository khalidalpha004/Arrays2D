package Arrays2D;

public class RowTraversal {
    public static int[] rowTraversal(int arr2d[][]) {
    	int m=arr2d.length;
    	int n=arr2d[0].length;
    	int k=0;
    	int res[]=new int[m*n];
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			res[k]=arr2d[i][j];
    			k++;
    		}
    		
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][]= {{1,2,3},{1,2,4}};
       int res[]=rowTraversal(arr);
       for(int i=0;i<res.length;i++)
       System.out.print(res[i] + " ");
	}

}
