package de.enerlapez.aboutme.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ RepositoryConfig.class })
public class AppConfig {
	private static Logger LOG = LoggerFactory.getLogger(AppConfig.class);

}
