package com.example.gerenciador.controller;

import com.example.gerenciador.relacao.RelacaoRequestDTO;
import com.example.gerenciador.relacao.Relacao;
import com.example.gerenciador.relacao.RelacaoResponseDTO;
import com.example.gerenciador.relacao.RelacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relacao")
public class RelacaoController {
    @Autowired
    private RelacaoRepository repository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveRelacao(@RequestBody RelacaoRequestDTO data) {
        Relacao relacaoData = new Relacao(data);
        repository.save(relacaoData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<RelacaoResponseDTO> getAll() {
        List<RelacaoResponseDTO> relacaoList = repository.findAll().stream().map(RelacaoResponseDTO::new).toList();
        return relacaoList;
    }
}
