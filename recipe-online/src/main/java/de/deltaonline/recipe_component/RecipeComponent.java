package de.deltaonline.recipe_component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecipeComponent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String number;
	String name;
	
		
	protected RecipeComponent() {}


	public RecipeComponent(String number, String name) {
		this.number = number;
		this.name = name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
