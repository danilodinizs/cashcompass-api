package dev.danilodinizs.cashcompass_api.infrastructure.presentation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransacaoRepository extends JpaRepository<TransacaoEntity, UUID> {
}
