package com.example.gerenciador.controller;

import com.example.gerenciador.empresa.Empresa;
import com.example.gerenciador.empresa.EmpresaRepository;
import com.example.gerenciador.empresa.EmpresaResponseDTO;
import com.example.gerenciador.empresa.EmpresaRequestDTO;
import com.example.gerenciador.fornecedor.FornecedorRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaRepository repository;
    private boolean isValid(EmpresaRequestDTO data) {
        if(data.cnpj() == null || data.nome() == null || data.cep() == null)
            return false;
        if(data.cnpj().length() != 14 || data.cep().length() != 8)
            return false;
        return true;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveEmpresa(@RequestBody EmpresaRequestDTO data) {
        Empresa empresaData = new Empresa(data);
        if(this.isValid(data))
            repository.save(empresaData);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<EmpresaResponseDTO> getAll() {
        List<EmpresaResponseDTO> empresaList = repository.findAll().stream().map(EmpresaResponseDTO::new).toList();
        return empresaList;
    }
}
