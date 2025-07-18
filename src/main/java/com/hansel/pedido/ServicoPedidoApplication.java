package com.hansel.pedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServicoPedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoPedidoApplication.class, args);
	}

}
