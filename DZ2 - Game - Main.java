
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		int i = 0;
		int z_ch = 1 + (int)(15*Math.random());
		int vv_ch = 0;
	
		
		JOptionPane.showMessageDialog (null, "Программа определила случайное число от 1 до 15. Угадайте его с 5 попыток.");
		
		while (z_ch != vv_ch && i < 5) {
		i++;
			vv_ch = 0;
			while (vv_ch < 1 || vv_ch > 15) {
				s = JOptionPane.showInputDialog (null, "Введите число от 1 до 15. Попытка " + i + ". ");
				vv_ch = Integer.parseInt (s);
				if (vv_ch < 1 || vv_ch > 15) {JOptionPane.showMessageDialog (null, "Введённое вами число - не от 1 до 15. Повторите попытку.");}
			}
		
			if (z_ch > vv_ch)
			{JOptionPane.showMessageDialog (null, vv_ch + " - не то число. Загаданное число - больше.");}
			if (z_ch < vv_ch)
			{JOptionPane.showMessageDialog (null, vv_ch + " - не то число. Загаданное число - меньше.");}
			
		}
		
	if (z_ch == vv_ch) {
		JOptionPane.showMessageDialog (null, "Вы угадали с " + i + "й попытки. Загаданное число: " + z_ch);
	}
	else {
		JOptionPane.showMessageDialog (null, "Вы не угадали. Загаданное число: " + z_ch);
	}
		
		
		
		
	}

}
