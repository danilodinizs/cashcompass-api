package dev.danilodinizs.cashcompass_api.infrastructure.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import dev.danilodinizs.cashcompass_api.core.enums.TipoTransacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record TransacaoRequestDTO(UUID id,
                                  String descricao,
                                  String categoria,

                                  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy'T'HH:mm")
                                  @JsonSerialize(using = LocalDateTimeSerializer.class)
                                  LocalDateTime data,
                                  BigDecimal valor,
                                  TipoTransacao tipoTransacao,
                                  String parcela,
                                  String nomeDevedor)
{
    public TransacaoRequestDTO {
    if (data == null) {
        data = LocalDateTime.now();
        }
    }
}
