/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.supermercado.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus291107
 */
public class Pedido {
    private List<ItemPedido> itens;
    private String formaPagamento; 
    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
       
        if (item.getQuantidade() <= item.getProduto().getQuantidadeEstoque()) {
            itens.add(item);
           
            int novoEstoque = item.getProduto().getQuantidadeEstoque() - item.getQuantidade();
            item.getProduto().setQuantidadeEstoque(novoEstoque);
        } else {
            System.out.println("Estoque insuficiente para o produto: " + item.getProduto().getNome());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void imprimirResumo() {
        System.out.println("--- Resumo do Pedido ---");
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto().getNome() + " x" + item.getQuantidade() + 
                               " = R$ " + item.calcularSubtotal());
        }
        System.out.println("Total: R$ " + calcularTotal());
        System.out.println("Forma de Pagamento: " + formaPagamento);
    }
}