package dev.danilodinizs.cashcompass_api.core.services;

import dev.danilodinizs.cashcompass_api.infrastructure.dtos.TransacaoRequestDTO;
import dev.danilodinizs.cashcompass_api.infrastructure.mapper.TransacaoMapper;
import dev.danilodinizs.cashcompass_api.infrastructure.persistence.TransacaoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransacaoService {

    private static final Logger log = LoggerFactory.getLogger(TransacaoService.class);

    private final TransacaoRepository transacaoRepository;

    private final TransacaoMapper transacaoMapper;

    public TransacaoService(TransacaoRepository transacaoRepository, TransacaoMapper transacaoMapper) {
        this.transacaoRepository = transacaoRepository;
        this.transacaoMapper = transacaoMapper;
    }

    public void adicionarTransacoes(TransacaoRequestDTO dto) {
        log.info("Iniciando o processamento de salvar transações " + dto);
        log.info("Trnasações adicionadas com sucesso.");
        transacaoRepository.save(transacaoMapper.dtoToEntity(dto));
    }

}
