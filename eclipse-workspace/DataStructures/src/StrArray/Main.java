package StrArray;

public class Main{
	public static void main (String[] args) {
		
		StrMain s = new StrMain(5);
		
		//Str n = new Str("Lal", 20);
		s.add(new Str("Lal",20));
		s.add(new Str("Lat",10));
		s.add(new Str("jaal",30));
		s.add(new Str("paal",50));
		s.add(new Str("Latt",5));
		s.add(new Str("Lacal",10));

		s.display();
		System.out.println(s.entries);

		s.remove(2);
		System.out.println("     ");
		System.out.println(s.entries);
		s.display();	
		System.out.println(s.entries);
	
	}
	}