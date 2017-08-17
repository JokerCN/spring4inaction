package tech.tongyu.yyw.chapter5;

import org.junit.Test;
import tech.tongyu.yyw.chapter5.controller.HomeController;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception{
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
}
