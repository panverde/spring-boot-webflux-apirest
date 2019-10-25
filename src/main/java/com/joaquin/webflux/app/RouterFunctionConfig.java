package com.joaquin.webflux.app;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.joaquin.webflux.app.handler.ProductoHandler;

@Configuration
public class RouterFunctionConfig {

	@Bean
	public RouterFunction<ServerResponse> routes(ProductoHandler handler){
		
		return route(GET("/api/v2/productos").or(GET("/api/v3/productos")),handler::listar);
		
	}
	

}