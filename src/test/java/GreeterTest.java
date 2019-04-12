import hello.Greeter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreeterTest {
	
	@Test
  public void sayTest() {
	Greeter greeter = new Greeter();
	String real = greeter.sayHello();
	String expected = "Hello super new world!";
    assertEquals(expected, real);

  }
}
