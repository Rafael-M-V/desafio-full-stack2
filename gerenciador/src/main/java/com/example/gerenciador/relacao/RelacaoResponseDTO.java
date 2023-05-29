package com.example.gerenciador.relacao;

import com.example.gerenciador.empresa.Empresa;

public record RelacaoResponseDTO(String id, String idempresa, String idfornecedor) {
    public RelacaoResponseDTO(Relacao relacao) {
        this(relacao.getId(), relacao.getIdempresa(), relacao.getIdfornecedor());
    }
}
