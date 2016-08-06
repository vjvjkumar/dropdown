package Pack2;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotationsVJ {
	
	@Before
	public void OpenBrower(){
		System.out.println("Execute openbrowser before");
	}
	
	@After
	public void CloseBrowser(){
		System.out.println("Execute closebrowser after");
	}
	
	@Test
	public void test1(){
		System.out.println("Execute Junit test1");
	}
	
	@Ignore
	public void test2(){
		System.out.println("execute Junit test2");
	}
	
	@Test
	public void test3(){
		System.out.println("Execute Junit test3");
	}
	
	@Test
	public void test4(){
		System.out.println("Execute Junit test4");
	}
}



