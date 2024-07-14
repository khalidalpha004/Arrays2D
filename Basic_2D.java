package Arrays2D;

public class Basic_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2d[][]=new int[3][4];
		System.out.println( arr2d[1][2]);
		arr2d[1][2]=10;
		System.out.println(arr2d[1][2]);
//		for(int i=0;i<4;i++)
//	    {
//	        arr2d[i][0]=2;
//	    }
//	    System.out.print(arr2d[3][0]);
		
		System.out.println(arr2d);
		System.out.println(arr2d[0]);
		System.out.println(arr2d[1]);
		System.out.println(arr2d[2]);
		System.out.println(arr2d.length);
		System.out.println(arr2d[0].length);

	}

}
