/**
 * 
 */
package cn.com.fardo.springboot.domain;



import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lmq
 *
 */
public class UserRepositoryTest extends BaseRepositoryTest {
	@Autowired
	private UserRepository userRepository;
	public void setUp(){
		userRepository.deleteAll();
	}
	@Test
	public void test() throws Exception{
		//创建 10 条记录
		userRepository.save(new User("AAA",10));
		userRepository.save(new User("BBB",20));
		userRepository.save(new User("CCC",30));
		userRepository.save(new User("DDD",40));
		userRepository.save(new User("EEE",50));
		userRepository.save(new User("FFF",60));
		userRepository.save(new User("GGG",70));
		userRepository.save(new User("HHH",80));
		userRepository.save(new User("III",90));
		userRepository.save(new User("JJJ",100));
		
		Assert.assertEquals(10, userRepository.findAll().size());
		
	}
}
