
public class Matrix01 {
	
	//square matrix
	public static boolean findSquarMatrixOrNot(int[][] a) {
		
		int rows = a.length;
		int columns = a[0].length;
		if(rows == columns) {
			return true;
		}
		return false;
	}
	
	
	//check if unit matrix
	public static boolean isUnitMatrix(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	//check if identity matrix
	public static boolean isIdentity(int[][] a) {
		for(int i = 0; i < a[1].length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(i==j && a[i][j] != 1) {
					return false;
				}
				if(i!=j && a[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		//identity matrix
		int[][] m6 = { {1,0,0},{0,1,0},{0,0,1} };
		System.out.println(isIdentity(m6));
		
		//unit matrix
		int[][] m4 = { {1,1,1},{1,1,1} };
		int[][] m5 = { {1,2,1},{1,1,1} };
		//System.out.println(isUnitMatrix(m4));
		
		//square matrix
		int[][] m1 = new int[2][2];
		int[][] m2 = {{2,2},{3,4}};
		int[][] m3 = new int[2][];
		//System.out.println(findSquarMatrixOrNot(m1));
		//System.out.println(findSquarMatrixOrNot(m2));
		//System.out.println(findSquarMatrixOrNot(m3));
		
		
		
		/*
		int[][] arr = new int[4][5];

		for(int i = 0; i < arr.length; i++) {
			System.out.println("i:" + i + "  " + arr[i]);
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println("i:" + i + "j:" + j  + " " + arr[i][j]);
			}
		}
		
		System.out.println("------------------------------");
		
		int[][] arr2 = new int[2][2];
		
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[1][0] = 30;
		arr2[1][1] = 40;
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		*/
		
		
		
		
		//DO LIKE THIS
		int[][] arr = { {1,0,0},{0,1,0},{0,0,1} };
		
		
		int[][] arr1 = new int[2][1];
		arr1[0] = {2};		//YOU CAN NOT DO THIS, THIS IS NOT ALLOWD
		
		
		
		
		//OR YOU CAN DO LIKE THIS
		int[][] arr2 = new int[3][3];
		
		arr2[0][0] = 2;
		arr2[0][1] = 3;
		arr2[0][2] = 4;
		
		arr2[1][0] = 5;
		arr2[1][1] = 2; ///so on and so forth
		
		
		
		
		
		
		
	}

}
