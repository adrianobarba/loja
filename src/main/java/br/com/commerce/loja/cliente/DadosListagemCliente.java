package br.com.commerce.loja.cliente;

public record DadosListagemCliente(Long id, String nome, String email, String logradouro, String bairro, String cep,
                                   String cidade, String uf, String numero, String complemento) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(),cliente.getEmail(),cliente.getLogradouro(), cliente.getBairro(),
                cliente.getCep(), cliente.getCidade(), cliente.getUf(), cliente.getNumero(),cliente.getComplemento());
    }
}
