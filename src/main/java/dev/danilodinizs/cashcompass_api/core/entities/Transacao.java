package dev.danilodinizs.cashcompass_api.core.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record Transacao(UUID id,
                        String descricao,
                        String categoria,
                        LocalDateTime data,
                        BigDecimal valor,
                        TipoTransacao tipoTransacao,
                        String parcela,
                        String nomeDevedor) {
}
