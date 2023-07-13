package br.com.commerce.loja.produto;

import br.com.commerce.loja.cep.DadosListagemCep;

public record DadosListagemProduto(Long id,String descricao, String marca, String quantidade, String preco) {

    public DadosListagemProduto(Produto produto){
        this(produto.getId(),produto.getDescricao(), produto.getMarca(),produto.getQuantidade(),produto.getPreco());
    }
}
