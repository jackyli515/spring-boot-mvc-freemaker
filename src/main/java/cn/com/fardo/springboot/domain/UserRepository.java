/**
 * 
 */
package cn.com.fardo.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author lmq
 *
 */
public interface UserRepository extends JpaRepository<User,Long> {
	/**
	 * 
	 * @param name
	 * @return
	 */
	User findByName(String name);
	/**
	 * 
	 * @param name
	 * @param age
	 * @return
	 */
	User findByNameAndAge(String name,Integer age);
	/**
	 * 
	 * @param name
	 * @return
	 */
	@Query("from User u where u.name=:name")
	User findUser(@Param("name") String name);
}
