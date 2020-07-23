package netgloo.test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import junit.framework.Assert;
import netgloo.controllers.UserController;
import netgloo.models.User;

@RunWith(MockitoJUnitRunner.class)
public class BackendTestImp{

	@Mock
	public static User user1;
	
	@InjectMocks
	public UserController controller;
	
	@BeforeAll
    public static void init() {
		user1 = new User("test@test.com", "test");
	}
	
	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void create() {

        String u = controller.create(user1.getEmail(), user1.getName());
        assertEquals("User succesfully saved!", u);
    }
}
