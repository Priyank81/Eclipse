package JUnitT;

import org.junit.After; 
import org.junit.Assert; 
import org.junit.Before; 
import org.junit.Test;

public class TestClass{

@Test
public void Test1() {
	System.out.println("Test 1");
	
	long a= 55;
	long b= 45;
	
	long Sum = a+b;
	
	
	//Assert.assertTrue(false);
	//long i=23;
	Assert.assertEquals(100, Sum);
	
	
}


@Test()
public void Test2() {
	System.out.println("Test 2");
	
}


@Before
public void Before_Method() {
	System.out.println("Execute on or before every @Test method");
}



@After

public void After_Method() {
	System.out.println("Execute after every @Test Method");
}

public static void main (String[] args) {
	
	
}

}
