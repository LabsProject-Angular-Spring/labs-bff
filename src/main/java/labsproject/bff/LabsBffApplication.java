package labsproject.bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabsBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabsBffApplication.class, args);
	}

}
