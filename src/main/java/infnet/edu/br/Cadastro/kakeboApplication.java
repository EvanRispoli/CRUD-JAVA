package infnet.edu.br.Cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class kakeboApplication {

	public static void main(String[] args) {
		SpringApplication.run(kakeboApplication.class, args);
	}

}
