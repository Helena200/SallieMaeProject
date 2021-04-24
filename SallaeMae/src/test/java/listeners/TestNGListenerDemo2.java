package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo2 {
	@Test
	public void Test4() {
		System.out.println("I am inside Test 4");
	}
	@Test
	public void Test5() {
		System.out.println("I am inside Test 5");
	

}
	@Test
	public void Test6() {
		System.out.println("I am inside Test 6");
		throw new SkipException("This test is skipped");
	}
}

