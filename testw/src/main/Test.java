package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class Test {

	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
		
		System.out.println("Success...");
	}
	
	
	@After
	public void myTestAfter(){
		System.out.println("After");
	}
	
	
	@Before
	public void myTestBefore(){
		System.out.println("Before");
	}


}
