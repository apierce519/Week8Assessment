/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Oct 17, 2021
 */
package week8.controller;

import org.springframework.context.annotation.Bean;

import week8.beans.Animal;

/**
 * @author Andrew Pierce - ajpierce1
 */
public class BeanConfiguration {

	/**
	 * 
	 */
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public Animal animal() {
		Animal bean = new Animal("Craig");
		bean.setNumberOfLegs(4);
		bean.setSpecies("panther");
		return bean;
	}

}
