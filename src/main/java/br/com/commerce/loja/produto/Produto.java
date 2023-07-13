package br.com.commerce.loja.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String marca;
    private String quantidade;
    private String preco;

    private Boolean ativo;

    public Produto(DadosCadastroProduto dados) {
        this.ativo = true;
        this.descricao = dados.descricao();
        this.marca = dados.marca();
        this.quantidade = dados.quantidade();
        this.preco = dados.preco();
    }

    public void atualizarInformacoes(DadosAtualizacaoProduto dados) {
        if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }
        if(dados.marca() != null){
            this.marca = dados.marca();
        }
        if(dados.quantidade() != null){
            this.quantidade = dados.quantidade();
        }
        if(dados.preco() != null){
            this.preco = dados.preco();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
