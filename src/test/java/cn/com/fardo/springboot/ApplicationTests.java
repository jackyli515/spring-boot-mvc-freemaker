/**
 * 
 */
package cn.com.fardo.springboot;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.fardo.springboot.service.UserService;

/**
 * @author lmq
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {
	@Autowired
	private UserService userService;
	@Before
	public void setUp(){
		userService.deleteAllUsers();
	}
	@Test
	public void test() throws Exception{
		userService.create("a", 1);
		userService.create("b", 2);
		userService.create("c", 3);
		userService.create("d", 4);
		userService.create("e", 5);
		
		Assert.assertEquals(5, userService.getUsersCount().intValue());
		
		userService.deleteByName("a");
		userService.deleteByName("e");
		
		Assert.assertEquals(3, userService.getUsersCount().intValue());
	}
}
