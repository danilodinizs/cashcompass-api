package dev.danilodinizs.cashcompass_api.infrastructure.mapper;

import dev.danilodinizs.cashcompass_api.core.entities.Transacao;
import dev.danilodinizs.cashcompass_api.infrastructure.dtos.TransacaoRequestDTO;
import dev.danilodinizs.cashcompass_api.infrastructure.persistence.TransacaoEntity;
import org.springframework.stereotype.Component;

@Component
public class TransacaoMapper {

    public TransacaoRequestDTO domainToDto(Transacao transacao) {
        return new TransacaoRequestDTO(
                transacao.id(),
                transacao.descricao(),
                transacao.categoria(),
                transacao.data(),
                transacao.valor(),
                transacao.tipoTransacao(),
                transacao.parcela(),
                transacao.nomeDevedor()
        );
    }

    public Transacao dtoToDomain(TransacaoRequestDTO transacaoDTO) {
        return new Transacao(
                transacaoDTO.id(),
                transacaoDTO.descricao(),
                transacaoDTO.categoria(),
                transacaoDTO.data(),
                transacaoDTO.valor(),
                transacaoDTO.tipoTransacao(),
                transacaoDTO.parcela(),
                transacaoDTO.nomeDevedor()
        );
    }

    public TransacaoEntity domainToEntity(Transacao transacao) {
        return new TransacaoEntity(
                transacao.id(),
                transacao.descricao(),
                transacao.categoria(),
                transacao.data(),
                transacao.valor(),
                transacao.tipoTransacao(),
                transacao.parcela(),
                transacao.nomeDevedor()
        );
    }

    public Transacao entityToDomain(TransacaoEntity transacaoEntity) {
        return new Transacao(
                transacaoEntity.getId(),
                transacaoEntity.getDescricao(),
                transacaoEntity.getCategoria(),
                transacaoEntity.getData(),
                transacaoEntity.getValor(),
                transacaoEntity.getTipoTransacao(),
                transacaoEntity.getParcela(),
                transacaoEntity.getNomeDevedor()
        );
    }

    public TransacaoEntity dtoToEntity(TransacaoRequestDTO transacaoRequestDTO) {
        return new TransacaoEntity(
                transacaoRequestDTO.id(),
                transacaoRequestDTO.descricao(),
                transacaoRequestDTO.categoria(),
                transacaoRequestDTO.data(),
                transacaoRequestDTO.valor(),
                transacaoRequestDTO.tipoTransacao(),
                transacaoRequestDTO.parcela(),
                transacaoRequestDTO.nomeDevedor()
        );
    }
}
