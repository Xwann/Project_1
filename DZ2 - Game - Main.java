
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		int i = 0;
		int z_ch = 1 + (int)(15*Math.random());
		int vv_ch = 0;
	
		
		JOptionPane.showMessageDialog (null, "��������� ���������� ��������� ����� �� 1 �� 15. �������� ��� � 5 �������.");
		
		while (z_ch != vv_ch && i < 5) {
		i++;
			vv_ch = 0;
			while (vv_ch < 1 || vv_ch > 15) {
				s = JOptionPane.showInputDialog (null, "������� ����� �� 1 �� 15. ������� " + i + ". ");
				vv_ch = Integer.parseInt (s);
				if (vv_ch < 1 || vv_ch > 15) {JOptionPane.showMessageDialog (null, "�������� ���� ����� - �� �� 1 �� 15. ��������� �������.");}
			}
		
			if (z_ch > vv_ch)
			{JOptionPane.showMessageDialog (null, vv_ch + " - �� �� �����. ���������� ����� - ������.");}
			if (z_ch < vv_ch)
			{JOptionPane.showMessageDialog (null, vv_ch + " - �� �� �����. ���������� ����� - ������.");}
			
		}
		
	if (z_ch == vv_ch) {
		JOptionPane.showMessageDialog (null, "�� ������� � " + i + "� �������. ���������� �����: " + z_ch);
	}
	else {
		JOptionPane.showMessageDialog (null, "�� �� �������. ���������� �����: " + z_ch);
	}
		
		
		
		
	}

}
