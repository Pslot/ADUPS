package com.Udaps.UDAPS.Bank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Name;


@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The ADUPS Bank App",
				description = "Backend Rest APIs for ADUPS Bank",
				version = "v2.0",
				contact = @Contact(
						name = "Ps PsLot",
						email = "pslot2000@gmail.com",
						url = "https://github.com/Pslot/ADUPS.git"

				),
				license = @License(
						name = "UDAPS Bank",
						url = "https://github.com/Pslot/ADUPS.git"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "The UDAPS Bank App Documentation",
				url = "https://github.com/Pslot/ADUPS.git"

		)

)
public class UdapsBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdapsBankApplication.class, args);
	}

}
