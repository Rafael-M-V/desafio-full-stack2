package com.example.gerenciador.controller;

import com.example.gerenciador.fornecedor.Fornecedor;
import com.example.gerenciador.fornecedor.FornecedorRepository;
import com.example.gerenciador.fornecedor.FornecedorResponseDTO;
import com.example.gerenciador.fornecedor.FornecedorRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorRepository repository;

    private boolean isValid(FornecedorRequestDTO data) {
        if(data.nome().length() == 0 || data.email().length() == 0 || data.cep().length() == 0)
            return false;
        if(!data.isPerson()) {
            if(data.cnpjCpf().length() != 14)
                return false;
            if(data.rg() != null)
                return false;
            if(data.dataNasc() != null)
                return false;
        }
        else {
            if(data.cnpjCpf().length() != 11)
                return false;
            if(data.rg().length() != 9)
                return false;
        }
        return true;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFornecedor(@RequestBody FornecedorRequestDTO data) {
        Fornecedor fornecedorData = new Fornecedor(data);
        if(this.isValid(data))
            repository.save(fornecedorData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FornecedorResponseDTO> getAll() {
        List<FornecedorResponseDTO> fornecedorList = repository.findAll().stream().map(FornecedorResponseDTO::new).toList();
        return fornecedorList;
    }
}
