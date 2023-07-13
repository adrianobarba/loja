package br.com.commerce.loja.cep;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CepRepository extends JpaRepository<Cep, Long> {
    Page<Cep> findAllByAtivoTrue(Pageable paginacao);
}
