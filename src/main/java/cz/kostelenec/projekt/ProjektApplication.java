package cz.kostelenec.projekt;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjektApplication {
	private static final Logger logger = LogManager.getLogger(ProjektApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ProjektApplication.class, args);
		logger.info("Spusteno");

	}

}
