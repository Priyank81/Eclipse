//testing generics
public class Test {
	public static void main(String[] args) {
		Gen<String> g1= new Gen<String>("Durga");
		g1.show();
		System.out.println(g1.getob());
		
		Gen<Integer> g2= new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getob());
		
		Gen<Double> g3= new Gen<Double>(4.44);
		g3.show();
		System.out.println(g3.getob());
		
	}
}
