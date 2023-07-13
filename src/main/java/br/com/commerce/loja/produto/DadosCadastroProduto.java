package br.com.commerce.loja.produto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroProduto(
        @NotBlank
        String descricao,
        @NotBlank
        String marca,
        @NotBlank
        String quantidade,
        @NotBlank
        String preco) {
}
