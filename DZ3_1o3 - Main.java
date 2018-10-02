
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		//Boolean b;
		Warrior player_1 = new Warrior ();
		Warrior player_2 = new Warrior ();
		Weapon weapon_1 = new Weapon ();
		
		// JOptionPane.showMessageDialog (null, "Введите данные игрока 1.");
		
		s = JOptionPane.showInputDialog (null, "Введите название оружия", "Гранатомёт");
		weapon_1.name = s;
		s = JOptionPane.showInputDialog (null, "Введите мощность оружия: " + weapon_1.name + ".", 50);
		weapon_1.damage = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog (null, "Введите имя игрока 1.", "Чужой");
		player_1.name = s;
		s = JOptionPane.showInputDialog (null, "Введите количество жизней для игрока по имени " + player_1.name + ". Рекомендуется от 50 до 200.", 100);
		player_1.lives = Integer.parseInt(s);
		s = JOptionPane.showInputDialog (null, "Введите собственную силу поражения игрока  по имени " + player_1.name + ".", 15);
		player_1.damage = Integer.parseInt(s);
		String[] options = {"Да", "Нет"};
		s = (String)JOptionPane.showInputDialog (null, "Вооружён ли "+ player_1.name + "?", "??", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		if (s == "Да") {player_1.weapon = true;}
		else {player_1.weapon = false;}
		
		s = JOptionPane.showInputDialog (null, "Введите имя игрока 2.", "Хищник");
		player_2.name = s;
		s = JOptionPane.showInputDialog (null, "Введите количество жизней игрока по имени " + player_2.name + ". Рекомендуется от 50 до 200.", 100);
		player_2.lives = Integer.parseInt(s);
		s = JOptionPane.showInputDialog (null, "Введите собственную силу поражения игрока по имени " + player_2.name + ".", 15);
		player_2.damage = Integer.parseInt(s);
		//String[] options = {"Да", "Нет"};
		s = (String)JOptionPane.showInputDialog (null, "Вооружён ли "+ player_2.name + "?", "??", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		if (s == "Да") {player_2.weapon = true;}
		else {player_2.weapon = false;}
		
		System.out.println("В сражение вступают: "+ player_1.name + " и " + player_2.name +".");
	
		System.out.println("Количества жизней игроков. ");
		System.out.println(player_1.name + ": " + player_1.lives + ". ");
		System.out.println(player_2.name + ": " + player_2.lives + ". ");
		System.out.println();
		
		Integer n = 1 + (int) (2*Math.random());
		
		System.out.print ("Первым атакует: ");
		if (n==1) {
		System.out.println (player_1.name + ".");
		}
		if (n==2) {
		System.out.println (player_2.name + ".");	
		}
		System.out.println ();	
		
		while (player_1.lives>0 && player_2.lives>0) {
			if (n==1) {
				System.out.println ("Атакует " + player_1.name + ".");	
				player_2.lives = player_2.lives - player_1.damage;
				if (player_1.weapon) {player_2.lives = player_2.lives - weapon_1.damage;}	
			}
			if (n==2) {
				System.out.println ("Атакует " + player_2.name + ".");
				player_1.lives = player_1.lives - player_2.damage;
				if (player_2.weapon) {player_1.lives = player_1.lives - weapon_1.damage;}	
			}
			if (player_1.lives>0) {System.out.println(" Количество жизней игрока " + player_1.name + ": " + player_1.lives + ". ");}
			if (player_2.lives>0) {System.out.println(" Количество жизней игрока " + player_2.name + ": " + player_2.lives + ". ");}
			
			if (n==1) {n=2;} else n=1;
			
		}
		
		if (player_1.lives<0) {System.out.println(" " + player_1.name + " поражён."); }
		if (player_2.lives<0) {System.out.println(" " + player_2.name + " поражён."); }
		
		System.out.println ();
		
		if (player_1.lives>0) {System.out.println(player_1.name + " победил!"); }
		if (player_2.lives>0) {System.out.println(player_2.name + " победил!"); }
		
	}

}
