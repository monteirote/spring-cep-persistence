package one.digitalinnovation.labpadroesdeprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesDeProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesDeProjetoApplication.class, args);
	}

}
