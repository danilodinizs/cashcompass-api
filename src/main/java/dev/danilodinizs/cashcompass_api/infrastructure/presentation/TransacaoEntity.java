package dev.danilodinizs.cashcompass_api.infrastructure.presentation;

import dev.danilodinizs.cashcompass_api.core.enums.TipoTransacao;
import jakarta.persistence.*;
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

    @NonNull
    private String descricao;

    private String categoria;

    @NonNull
    private LocalDateTime data;

    @NonNull
    private BigDecimal valor;

    @NonNull
    @Enumerated(EnumType.STRING)
    private TipoTransacao tipoTransacao;

    private String parcela;

    @NonNull
    private String nomeDevedor;
}
