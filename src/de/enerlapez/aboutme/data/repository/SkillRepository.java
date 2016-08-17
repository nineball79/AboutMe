package de.enerlapez.aboutme.data.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.enerlapez.aboutme.data.pojo.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Serializable> {
	List<Skill> findByName(String name);
}
