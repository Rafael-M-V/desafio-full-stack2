package com.example.gerenciador.empresa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="empresas")
@Entity(name="empresas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="cnpj")
public class Empresa {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String cnpj;
    private String nome;
    private String cep;

    public Empresa(EmpresaRequestDTO data) {
        this.cnpj = data.cnpj();
        this.nome = data.nome();
        this.cep = data.cep();
    }
}
