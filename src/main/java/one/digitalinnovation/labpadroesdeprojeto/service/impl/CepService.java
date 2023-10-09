package one.digitalinnovation.labpadroesdeprojeto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.labpadroesdeprojeto.model.Endereco;
import one.digitalinnovation.labpadroesdeprojeto.service.ViaCepService;

@Service
public class CepService {

    @Autowired
    private ViaCepService viaCepService;

    public Endereco consultarEnderecoComCep(String cep) {
        return viaCepService.consultarCep(cep);
    }

    public Iterable<Endereco> consultarCepsComEnd(String estado, String cidade, String logradouro) {
        return viaCepService.consultarCepsComCidade(estado, cidade, logradouro);
    }
    
}
