package dev.danilodinizs.cashcompass_api.infrastructure.presentation;

import dev.danilodinizs.cashcompass_api.core.entities.Transacao;
import dev.danilodinizs.cashcompass_api.core.services.TransacaoService;
import dev.danilodinizs.cashcompass_api.infrastructure.dtos.TransacaoRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transacoes")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) { this.transacaoService = transacaoService; }

    @PostMapping("/salvar")
    public ResponseEntity<Transacao> criarTransacao(@RequestBody TransacaoRequestDTO dto) {
        transacaoService.adicionarTransacoes(dto);
        return ResponseEntity.ok().build();
    }
}
