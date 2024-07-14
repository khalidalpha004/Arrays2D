package Arrays2D;

import java.util.Scanner;

public class takeInput {
    public static int[][] arrayInput(){
    	Scanner s=new Scanner(System.in);
    	int m=s.nextInt();
    	int n=s.nextInt();
    	int arr[][]=new int[m][n];
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			arr[i][j]=s.nextInt();
    		}
    	}
    	return arr;
    }
    public static void arrayPrint(int arr[][]) {
    	int m=arr.length;
    	int n=arr[0].length;
    	for(int i=0;i<m;i++) {
       	 for(int j=0;j<n;j++) {
       		 System.out.print(arr[i][j] +" ");
       	 }
       	 System.out.println();
        }
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int res[][]=arrayInput();
		arrayPrint(res);
	}

}
