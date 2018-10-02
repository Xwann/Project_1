
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		//Boolean b;
		Warrior player_1 = new Warrior ();
		Warrior player_2 = new Warrior ();
		Weapon weapon_1 = new Weapon ();
		
		// JOptionPane.showMessageDialog (null, "������� ������ ������ 1.");
		
		s = JOptionPane.showInputDialog (null, "������� �������� ������", "���������");
		weapon_1.name = s;
		s = JOptionPane.showInputDialog (null, "������� �������� ������: " + weapon_1.name + ".", 50);
		weapon_1.damage = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog (null, "������� ��� ������ 1.", "�����");
		player_1.name = s;
		s = JOptionPane.showInputDialog (null, "������� ���������� ������ ��� ������ �� ����� " + player_1.name + ". ������������� �� 50 �� 200.", 100);
		player_1.lives = Integer.parseInt(s);
		s = JOptionPane.showInputDialog (null, "������� ����������� ���� ��������� ������  �� ����� " + player_1.name + ".", 15);
		player_1.damage = Integer.parseInt(s);
		String[] options = {"��", "���"};
		s = (String)JOptionPane.showInputDialog (null, "������� �� "+ player_1.name + "?", "??", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		if (s == "��") {player_1.weapon = true;}
		else {player_1.weapon = false;}
		
		s = JOptionPane.showInputDialog (null, "������� ��� ������ 2.", "������");
		player_2.name = s;
		s = JOptionPane.showInputDialog (null, "������� ���������� ������ ������ �� ����� " + player_2.name + ". ������������� �� 50 �� 200.", 100);
		player_2.lives = Integer.parseInt(s);
		s = JOptionPane.showInputDialog (null, "������� ����������� ���� ��������� ������ �� ����� " + player_2.name + ".", 15);
		player_2.damage = Integer.parseInt(s);
		//String[] options = {"��", "���"};
		s = (String)JOptionPane.showInputDialog (null, "������� �� "+ player_2.name + "?", "??", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		if (s == "��") {player_2.weapon = true;}
		else {player_2.weapon = false;}
		
		System.out.println("� �������� ��������: "+ player_1.name + " � " + player_2.name +".");
	
		System.out.println("���������� ������ �������. ");
		System.out.println(player_1.name + ": " + player_1.lives + ". ");
		System.out.println(player_2.name + ": " + player_2.lives + ". ");
		System.out.println();
		
		Integer n = 1 + (int) (2*Math.random());
		
		System.out.print ("������ �������: ");
		if (n==1) {
		System.out.println (player_1.name + ".");
		}
		if (n==2) {
		System.out.println (player_2.name + ".");	
		}
		System.out.println ();	
		
		while (player_1.lives>0 && player_2.lives>0) {
			if (n==1) {
				System.out.println ("������� " + player_1.name + ".");	
				player_2.lives = player_2.lives - player_1.damage;
				if (player_1.weapon) {player_2.lives = player_2.lives - weapon_1.damage;}	
			}
			if (n==2) {
				System.out.println ("������� " + player_2.name + ".");
				player_1.lives = player_1.lives - player_2.damage;
				if (player_2.weapon) {player_1.lives = player_1.lives - weapon_1.damage;}	
			}
			if (player_1.lives>0) {System.out.println(" ���������� ������ ������ " + player_1.name + ": " + player_1.lives + ". ");}
			if (player_2.lives>0) {System.out.println(" ���������� ������ ������ " + player_2.name + ": " + player_2.lives + ". ");}
			
			if (n==1) {n=2;} else n=1;
			
		}
		
		if (player_1.lives<0) {System.out.println(" " + player_1.name + " ������."); }
		if (player_2.lives<0) {System.out.println(" " + player_2.name + " ������."); }
		
		System.out.println ();
		
		if (player_1.lives>0) {System.out.println(player_1.name + " �������!"); }
		if (player_2.lives>0) {System.out.println(player_2.name + " �������!"); }
		
	}

}
