package com.example.gerenciador.empresa;

public record EmpresaResponseDTO(String id, String cnpj, String nome, String cep) {
    public EmpresaResponseDTO(Empresa empresa) {
        this(empresa.getId(), empresa.getCnpj(), empresa.getNome(), empresa.getCep());
    }
}
