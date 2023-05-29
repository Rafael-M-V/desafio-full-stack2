package com.example.gerenciador.relacao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "relacoes")
@Entity(name = "relacoes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Relacao {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String idempresa;
    private String idfornecedor;

    public Relacao(RelacaoRequestDTO data) {
        this.idempresa = data.idempresa();
        this.idfornecedor = data.idfornecedor();
    }
}
