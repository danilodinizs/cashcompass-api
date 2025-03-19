package dev.danilodinizs.cashcompass_api.infrastructure.presentation;

import dev.danilodinizs.cashcompass_api.core.enums.TipoTransacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_transacao")
public class TransacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private String descricao;

    private String categoria;

    @NotNull
    private LocalDateTime data;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private TipoTransacao tipoTransacao;

    private String parcela;

    @NotNull
    private String nomeDevedor;
}
