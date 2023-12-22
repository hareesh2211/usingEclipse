package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisationpgm {

	@Parameters("a")
	@Test
	public void test(String B)
	{ 
		System.out.println(B);
	}
    @Parameters({"a","u"})
    @Test
    public void test2(String C,int D)
    {
    	System.out.println(C);
    	System.out.println(D);
    }
}
