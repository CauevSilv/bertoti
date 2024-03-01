package com.caue.primeirorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PrimeirorestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirorestApplication.class, args);
	}
}



@RestController
@RequestMapping("/clebinho")
class ControllerDoSpring{
		private List<Carros> carrosList = new ArrayList<>();

		@GetMapping
		Iterable<Carros> getCarros() {
			return carrosList;
		}
		@PostMapping
		Carros postCarros(@RequestBody Carros carro){
			carrosList.add(carro);
			return carro;
		}
		@PutMapping("/{id}")
		ResponseEntity<Carros> putCarro(@PathVariable String id,
										@RequestBody Carros carro) {
			int carrosIndex = -1;

			for (Carros c : carrosList) {
				if (c.getId().equals(id)) {
					carrosIndex = carrosList.indexOf(c);
					carrosList.set(carrosIndex, carro);
				}
			}

			return (carrosIndex == -1) ?
					new ResponseEntity<>(postCarros(carro), HttpStatus.CREATED) :
					new ResponseEntity<>(carro, HttpStatus.OK);
		}
		@DeleteMapping("/{id}")
		void deleteCarro(@PathVariable String id) {
			carrosList.removeIf(c -> c.getId().equals(id));
			}
		}






class Carros {
	private final String id;
	private String modelo;
	private String cor;
	private String marca;

	public Carros(String id, String modelo, String cor, String marca) {
		this.id = id;
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getId() {
		return id;
	}
}


