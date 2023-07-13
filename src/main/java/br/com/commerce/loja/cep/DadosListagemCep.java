package br.com.commerce.loja.cep;

public record DadosListagemCep(Long id,String cep,String logradouro, String bairro, String cidade, String uf, String numero, String complemento) {
    public DadosListagemCep(Cep cep){
        this(cep.getId(), cep.getCep(),cep.getLogradouro(), cep.getBairro(), cep.getCidade(), cep.getUf(), cep.getNumero(),cep.getComplemento());
    }
}
