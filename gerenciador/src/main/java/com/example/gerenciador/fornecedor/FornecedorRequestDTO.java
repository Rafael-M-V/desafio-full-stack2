package com.example.gerenciador.fornecedor;

public record FornecedorRequestDTO(Boolean isPerson, String cnpjCpf, String nome, String email,
                                   String cep, String rg, String dataNasc) {
}
