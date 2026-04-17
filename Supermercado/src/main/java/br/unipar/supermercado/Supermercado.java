/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.supermercado;

import br.unipar.supermercado.model.ItemPedido;
import br.unipar.supermercado.model.Pedido;
import br.unipar.supermercado.model.Produto;

/**
 *
 * @author matheus291107
 */
public class Supermercado {

    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 25.50, 50);
        Produto p2 = new Produto("Feijão", 8.90, 30);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(p1, 10));
        pedido.adicionarItem(new ItemPedido(p2, 3));
        
        pedido.setFormaPagamento("Cartão");

  
        pedido.imprimirResumo();
    }
}
