
//creating a generic class
public class Gen<T> {
	T ob;
	Gen(T ob)
	{
		this.ob= ob; //creating object of T type which is nothing but the type which we write
	}
	public void show() {
		System.out.println("The type of ob:"+ob.getClass().getName());
	}
	public T getob() {
		return ob;
	}
}

