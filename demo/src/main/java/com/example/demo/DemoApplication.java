package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	//Crear un usuario // POST

	//Usuario tiene numero de documento, nombre, edad, y lista con numero de documentos de amigos

	//Poder buscarlo por dni

	//Devolver todos los usuarios que tengan tal edad

	//Agregar amigos para un usuario, tabla de relaciones

	//Buscar todos los amigos de un numero de documento

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
