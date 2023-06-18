package Selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//@BeforeSuite
//@BeforeTest
//@BeforeClass
//@BeforeMethod
//@Test
//@AfterMethod
//@AfterClass
//@AfterTest
//@AfterSuite
public class TestNGAnnotations {
	
	
	@Before  
	public void method1(){
		System.out.println(" First executed as part of  -@BeforeSuite ");
	}
	@Before
	public void method2(){
		System.out.println(" First executed as part of  -@BeforeTest ");
	}
	@BeforeClass
	public static void method3(){
		System.out.println(" First executed as part of  -@BeforeClass ");
	}
	@Before
	public void method4(){
		System.out.println(" First executed as part of  -@BeforeMethod ");
	}
	@Test
	public void method5(){
		System.out.println(" First executed as part of  -@Test ");
	}
	@After
	public void method6(){
		System.out.println(" First executed as part of  -@AfterMethod ");
	}
	@AfterClass
	public static void method7(){
		System.out.println(" First executed as part of  -@AfterClass ");
	}
	@After
	public void method8(){
		System.out.println(" First executed as part of  -@AfterTest ");
	}
	@After
	public void method9(){
		System.out.println(" First executed as part of  -@AfterSuite ");
	}
	
}
