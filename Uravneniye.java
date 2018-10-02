import javax.swing.JOptionPane;

public class Uravneniye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a, b, c, D;
		Double x1, x2, pr1, pr2;
		String s;
		
		
System.out.println ("Решим квадратное уравнение.");

JOptionPane.showMessageDialog(null,"Решим квадратное уравнение. Далее введите его коэффициенты.");

 s = JOptionPane.showInputDialog ("Введите коэфициент a (целое число)", 1); 
 a = Integer.parseInt (s);
 
 s = JOptionPane.showInputDialog ("Введите коэфициент b (целое число)", 1); 
 b = Integer.parseInt (s);
 
 s = JOptionPane.showInputDialog ("Введите коэфициент c (целое число)", -1); 
 c = Integer.parseInt (s);
 
 D = b*b - 4*a*c;
 
 
 System.out.print ("Решаем уравнение: ");
 
 if (a == 0) {}
 else if (a == 1) {System.out.print ("x^2 ");}
 else {System.out.print (a + "(x^2) ");}
	 
 if (b == 0) {}
 else if (b == 1 && a == 0) {System.out.print ("x ");}
 else if (b == 1) {System.out.print ("+ x ");}
 else if (b == -1) {System.out.print ("- x ");}
 else if (b < 0) {System.out.print ("- " + -b + "x ");}
 else {System.out.print ("+ " + b + "x ");}
 
 if (c == 0) {}
 else if (c<0) {System.out.print ("- "+ -c + " ");}
 else if (b == 0 && a == 0) {System.out.print (c + " ");}
 else {System.out.print ("+ " + c);}
 
	 System.out.println (" = 0" );
	 // System.out.println ("Решаем уравнение: " + a + "*x^2 + " + b + "*x + " + c + " = 0" );
	 
 if (a == 0) {System.out.println ("Коэффициэнт а = 0. Уравнение не являеся квадратным!");}
 // else if (b == 0) {System.out.println ("Коэффициэнт b = 0. Уравнение не решается через дискриминант.");}
 else { 
 System.out.println ("Дискриминант: D = " + D);
 
 if (D > 0) {
	 System.out.println ("Дискриминант D > 0, поэтому уравнение имеет 2 корня:");
	 x1 = (-b + Math.sqrt(D))/(2*a);
	 x2 = (-b - Math.sqrt(D))/(2*a);
	 System.out.println ("x1 = " + x1);
	 System.out.println ("x2 = " + x2); 
	 
	 pr1 = a*x1*x1 + b*x1 + c;
	 pr2 = a*x2*x2 + b*x2 + c;
	 if (pr1 == 0 && pr2 == 0) { System.out.println ("Проверка: 0 = 0. Верно");}
	 else  { System.out.println ("Результат при x1: " + pr1 + ". Результат при x2: " + pr2 + ". Кажется, мы где-то ошиблись в решении( Хотя возможно ошибка только в точности вычислений. ");}
	}
 else if (D == 0) {
	 System.out.println ("Дискриминант равен 0, поэтому уравнение имеет 1 корень (корни совпадают):");
	 x1 = (-b + Math.sqrt(D))/(2*a); x2 = x1;
	 System.out.println ("x = " + x1);
	 pr1 = a*x1*x1 + b*x1 + c;
	 if (pr1 == 0) { System.out.println ("Проверка: 0 = 0. Верно");}
	 else  { System.out.println ("Результат проверки: " + pr1 + ". Кажется, мы где-то ошиблись в решении( Хотя возможно ошибка только в точности вычислений. ");}
 }
 
 else {
	 System.out.println ("Дискриминант D < 0, поэтому уравнение вещественных корней не имеет.");	 
 }

 }
 }

}