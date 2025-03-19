package dev.danilodinizs.cashcompass_api.infrastructure.dtos;

import dev.danilodinizs.cashcompass_api.core.enums.TipoTransacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record TransacaoRequestDTO(UUID id,
                                  String descricao,
                                  String categoria,
                                  LocalDateTime data,
                                  BigDecimal valor,
                                  TipoTransacao tipoTransacao,
                                  String parcela,
                                  String nomeDevedor) {
}
