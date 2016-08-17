package de.enerlapez.aboutme.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("de.enerlapez.aboutme.data.repository")
@EnableTransactionManagement
public class RepositoryConfig {
	private static Logger LOG = LoggerFactory.getLogger(RepositoryConfig.class);

	private static String PERSISTENCE_NAME_SKILL = "aboutme/db/skill.odb";

	@Autowired
	Environment env;

	@Bean(name = "entityManagerFactory")
	public EntityManagerFactory entityManagerFactory() {
		LOG.info("---> entityManagerFactory");
		return Persistence.createEntityManagerFactory(PERSISTENCE_NAME_SKILL);
	}

	@Bean(name = "transactionManager")
	public JpaTransactionManager transactionManager() {
		LOG.info("---> transactionManager");
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory());
		return txManager;
	}
}
