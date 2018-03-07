package programs;

import org.eclipse.jetty.client.RedirectProtocolHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

interface Tester1
{
	void disp();
}
interface Tester2
{
	void disp();
}
public class DemoB implements Tester1, Tester2 {

	
	public void disp() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Tester2 tst = new DemoB();
		tst.disp();
	}
  
  }
