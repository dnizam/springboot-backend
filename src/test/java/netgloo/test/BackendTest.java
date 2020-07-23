package netgloo.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.*;

import netgloo.controllers.UserController;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(controllers = UserController.class)
public class BackendTest {
	@Test
	public void contextLoads() {
	}

}
