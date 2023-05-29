package com.example.gerenciador.fornecedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="fornecedores")
@Entity(name="fornecedores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="cnpjCpf")
public class Fornecedor {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Boolean isPerson;
    private String cnpjCpf;
    private String nome;
    private String email;
    private String cep;
    private String rg;
    private String dataNasc;

    public Fornecedor(FornecedorRequestDTO data) {
        this.isPerson = data.isPerson();
        this.cnpjCpf = data.cnpjCpf();
        this.nome = data.nome();
        this.email = data.email();
        this.cep = data.cep();
        this.rg = data.rg();
        this.dataNasc = data.dataNasc();
    }
}
