
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array1 = new int [5][8];
		int max1 = 0, min1 = 100;
		
		for (int i=0; i < array1.length; i++) {
			for (int j=0; j<8; j++) /*Вопрос: если для i писали array1.length, то что можно для j?*/ {
				array1 [i][j] = (int) (199*Math.random()) - 99;
			}
		}
		
		for (int i=0; i < array1.length; i++) {
			for (int j=0; j<8; j++) {
				//System.out.print ("("+ i + ", "+ j+ ")");
				if (array1[i][j]>=0) {System.out.print (" ");}
				if (array1[i][j]>-10 && array1[i][j]<10) {System.out.print (" ");}
				System.out.print (array1[i][j] + "  ");			
			}
			System.out.println (" ");
			}
		for (int i=0; i < array1.length; i++) {
			for (int j=0; j<8; j++) {
				if (array1[i][j] > max1) {max1=array1[i][j];}
				if (array1[i][j] < min1) {min1=array1[i][j];}
			}
		}
		System.out.println ("Значение максимального элемента массива: " + max1);
		System.out.println ("Значение минимального элемента массива: " + min1);
	}
}
