/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Oct 17, 2021
 */
package week8.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Andrew Pierce - ajpierce1
 */
@Entity
public class Animal {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String species;
	private int numberOfLegs;

	/**
	 * 
	 */
	public Animal(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
		// TODO Auto-generated constructor stub
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String species, int numberOfLegs) {
		super();
		this.name = name;
		this.species = species;
		this.numberOfLegs = numberOfLegs;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @return the numberOfLegs
	 */
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @param numberOfLegs the numberOfLegs to set
	 */
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", species=" + species + ", numberOfLegs=" + numberOfLegs + "]";
	}

	

}
