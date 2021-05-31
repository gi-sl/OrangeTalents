package com.frota.gestao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.frota.gestao.calendario.DiaDaSemana;
import com.frota.gestao.model.Veiculo;
import com.frota.gestao.repository.VeiculoRepository;


@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public List<Veiculo> listar() {
		return veiculoRepository.findAll();
				
	}
	
		
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo adicionar(@RequestBody Veiculo veiculo) {
		
		/* captura o ultimo digito do ano */
		String ano = veiculo.getAno().toString();
		char n_ultimo = ano.charAt(ano.length() - 1);
		String ultimo = String.valueOf(n_ultimo);
		String diaRodizio = "";
		
		/* retorna o dia de rodizio de acordo com o final da placa*/
		if (ultimo.equals("1") || ultimo.equals("2") ) {
				veiculo.setRodizio("Segunda Feira");
				diaRodizio = "segunda-feira";
		}
		if (ultimo.equals("3") || ultimo.equals("4") ) {
			veiculo.setRodizio("Terça Feira");
			diaRodizio = "terça-feira";
		}
		if (ultimo.equals("5") || ultimo.equals("6") ) {
			veiculo.setRodizio("Quarta Feira");
			diaRodizio = "quarta-feira";
		}
		if (ultimo.equals("7") || ultimo.equals("8") ) {
			veiculo.setRodizio("Quinta Feira");
			diaRodizio = "quinta-feira";
		}
		if (ultimo.equals("9") || ultimo.equals("0") ) {
			veiculo.setRodizio("Sexta Feira");
			diaRodizio = "sexta-feira";
		}	
		
		/* retorna se o rodizio está ativo para o veiculo*/
		
		String diaSemana = DiaDaSemana.diaSemana(); 
				
		if (diaRodizio.equals(diaSemana)) {
			veiculo.setRodizioAtivo(true);
		}
		
		else {
			veiculo.setRodizioAtivo(false);
		}		
		
		
		/*retornar o valor do veiculo de acordo com a FIPE*/
		veiculo.setValor(30000.00);
		
		
		
		
		
		return veiculoRepository.save(veiculo);
		
	}

}
