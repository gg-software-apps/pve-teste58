package br.com.teste.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.dto.ConsultarDTO;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ConsultarController {

	@GetMapping("/")
	public ResponseEntity<ConsultarDTO> index() throws IOException {

		ConsultarDTO oTesteResponse = new ConsultarDTO();
		oTesteResponse.setData("Hello Word");
		return ResponseEntity.ok(oTesteResponse);
	}

}