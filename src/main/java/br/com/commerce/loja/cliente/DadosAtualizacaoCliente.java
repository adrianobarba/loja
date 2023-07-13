package br.com.commerce.loja.cliente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String email,
         String logradouro,
         String bairro,
         String cep,
         String cidade,
         String uf,
         String numero,
         String complemento) {
}
