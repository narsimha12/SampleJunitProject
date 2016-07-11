import junit.framework.TestCase;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertTrue;
public class Sample extends TestCase{
	protected int value1, value2;
	   // assigning the values
	   protected void setUp(){
	      value1=3;
	      value2=3;
	   }


	   public void testAdd(){
	      double result= value1 + value2;
	      System.out.println("result: "+result);
	      assertTrue(result == 6);
	   }

}
