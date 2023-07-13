package br.com.commerce.loja.controller;

import br.com.commerce.loja.produto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        repository.save(new Produto(dados));

    }
    @GetMapping
    public Page<DadosListagemProduto> listar(@PageableDefault(size = 10, sort = {"descricao"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemProduto::new);

    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoProduto dados) {
        var produto = repository.getReferenceById(dados.id());
        produto.atualizarInformacoes(dados);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var produto = repository.getReferenceById(id);
        produto.excluir();
    }
}
