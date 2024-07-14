package Arrays2D;

public class sumOfEachRow {
    public static void sumEachrow(int arr[][]) {
    	int m=arr.length;
    	int sum=0;
    	for(int i=0;i<m ;i++) {
    		int n=arr[i].length;
    		for(int j=0;j<n;j++) {
    			sum=sum+arr[i][j];
    		}
    		System.out.print(sum+" ");
    		sum=0;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{1,4}};
		sumEachrow(arr);
	}

}
