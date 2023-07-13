package br.com.commerce.loja.produto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoProduto(
        @NotNull
        Long id,
         String descricao,
         String marca,
         String quantidade,
         String preco) {
}
