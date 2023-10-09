package one.digitalinnovation.labpadroesdeprojeto.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import one.digitalinnovation.labpadroesdeprojeto.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

    @GetMapping("/{estado}/{cidade}/{logradouro}/json")
    Iterable<Endereco> consultarCepsComCidade(@PathVariable("estado") String estado, @PathVariable("cidade") String cidade, @PathVariable("logradouro") String logradouro);

}
