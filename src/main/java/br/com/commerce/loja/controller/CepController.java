package br.com.commerce.loja.controller;


import br.com.commerce.loja.cep.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Function;

@RestController
@RequestMapping("cep")
public class CepController {
    @Autowired
    private CepRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroCep dados){

        repository.save(new Cep(dados));
    }
    @GetMapping
    public Page<DadosListagemCep> listar(@PageableDefault(size = 10, sort = {"cep"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemCep::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoCep dados){
        var cep = repository.getReferenceById(dados.id());
        cep.atualizarInformacoes(dados);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void  excluir(@PathVariable Long id){
       var cep = repository.getReferenceById(id);
       cep.excluir();
    }
}
