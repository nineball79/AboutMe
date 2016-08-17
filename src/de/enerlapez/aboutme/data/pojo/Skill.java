package de.enerlapez.aboutme.data.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Skill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6929635808858585417L;

	@Id
	@GeneratedValue
	private Long id;

	private String skillName;

	private String skillDescription;

	public Skill() {

	}

	public String getName() {
		return skillName;
	}

	public void setName(String skillName) {
		this.skillName = skillName;
	}

	public String getDescription() {
		return skillDescription;
	}

	public void setDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", skillName=" + skillName + ", skillDescription=" + skillDescription + "]";
	}
}
