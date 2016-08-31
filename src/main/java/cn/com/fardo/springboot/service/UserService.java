/**
 * 
 */
package cn.com.fardo.springboot.service;

/**
 * @author lmq
 *
 */
public interface UserService {
	
	void create(String name,Integer age);
	
	void deleteByName(String name);
	
	Integer getUsersCount();
	
	void deleteAllUsers();
}
