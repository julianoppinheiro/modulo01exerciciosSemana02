package Aplicacao;

import Entidades.Produto;

public class CarrinhoCompra extends Produto {
    public void Acessar() {
        CarrinhoCompra carrinho = new CarrinhoCompra();
        carrinho.Acessar(); // Acessando o método protected da superclasse Produto
    }
}