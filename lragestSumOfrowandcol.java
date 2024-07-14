package Arrays2D;

public class lragestSumOfrowandcol {
    public static void LargetsSum(int mat[][]) {
    	int m=mat.length;
    	int n=mat[0].length;
    	int rowsum=-1;
    	int sum=0;
    	int colsum=-1;
    	int rowIndex=0;
    	int colIndex=0;
    	for(int i=0;i<m;i++) {
    		sum=0;
    		for(int j=0;j<n;j++) {
    			sum+=mat[i][j];
    			
    		}
    		if(rowsum<sum) {
    			rowsum=sum;
    			rowIndex=i;
    		}
    	}
    	for(int j=0;j<n;j++) {
    		sum=0;
    		for(int i=0;i<m;i++) {
    			sum+=mat[i][j];
    			
    		}
    		if(colsum<sum) {
    			colsum=sum;
    			colIndex=j;
    		}
    	}
    	if(rowsum>=colsum) {
    		System.out.print("row " +rowIndex+" " +rowsum);
    	}else {
    		System.out.print("column " +colIndex+" " +colsum);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,4,6},{9,2,9},{2,4,6}};
		LargetsSum(arr);
//	       int res[][]=diagonalElements(arr);
	}

}
