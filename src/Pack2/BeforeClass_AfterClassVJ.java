package Pack2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BeforeClass_AfterClassVJ {
	@BeforeClass
	public static void beforeclass(){
		System.out.println("Executing Before Class");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("Executing after class");
	}
	
	@Before
	public void OpenBrowser(){
		System.out.println("Executing openbrowser before ");
	}
	
	@After
	public void CloseBrowser(){
		System.out.println("Executing Closebrowser after");
	}
	
	@Test
	public void test1(){
		System.out.println("Executing Junit test1");
	}
	
	@Ignore
	public void test2(){
		System.out.println("Executing Junit test2");
	}

	@Test
	public void test3(){
		System.out.println("Executing Junit test3");
	}
}


