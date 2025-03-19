package dev.danilodinizs.cashcompass_api.infrastructure.persistence;

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

    public TransacaoEntity(UUID id, String descricao, String categoria, LocalDateTime data, BigDecimal valor, TipoTransacao tipoTransacao, String parcela, String nomeDevedor) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.parcela = parcela;
        this.nomeDevedor = nomeDevedor;
    }

    public UUID getId() {
        return id;
    }

    public @NotNull String getDescricao() {
        return descricao;
    }

    public @NotNull LocalDateTime getData() {
        return data;
    }

    public String getCategoria() {
        return categoria;
    }

    public @NotNull BigDecimal getValor() {
        return valor;
    }

    public @NotNull TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public String getParcela() {
        return parcela;
    }

    public @NotNull String getNomeDevedor() {
        return nomeDevedor;
    }
}
