package com.example.gerenciador.fornecedor;

import com.example.gerenciador.fornecedor.Fornecedor;

public record FornecedorResponseDTO(String cnpjCpf, String nome, String email,
                                   String cep, String rg, String dataNasc) {
    public FornecedorResponseDTO(Fornecedor fornecedor) {
        this(fornecedor.getCnpjCpf(),
                fornecedor.getNome(),
                fornecedor.getEmail(),
                fornecedor.getCep(),
                fornecedor.getRg(),
                fornecedor.getDataNasc());
    }
}
