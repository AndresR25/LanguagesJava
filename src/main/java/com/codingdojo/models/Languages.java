package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="languajes")
public class Languages {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 1)
    private String name;
	
	@Size(min = 1)
    private String creator;
	
	@Size(min = 1)
    private String version;
	
	public Languages(){ }
	
	public Languages(Long id, @Size(min = 1) String name, @Size(min = 1) String creator,
		@Size(min = 1) String version) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
	
	 
	 
	   

}
