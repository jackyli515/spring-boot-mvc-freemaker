/**
 * 
 */
package cn.com.fardo.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author lmq
 *
 */
@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable=false)
	private String name;

	@Column(nullable=false)
	private Integer age;
	
	

	/**
	 * 
	 */
	public User() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
