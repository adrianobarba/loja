package br.com.commerce.loja.cep;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCep(
        @NotNull
        Long id,
        String cep,
        String logradouro,
        String bairro,
        String cidade,
        String uf,
        String numero,
        String complemento) {
}
