/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.agendacontatos.model;

import java.util.ArrayList;

/**
 *
 * @author matheus291107
 */
public class Agenda {
    private Integer id;
    private String descricao;
    private ArrayList<Contato> ListaContatos = new ArrayList<>();

    public Intefer getId() {
        return id;
    }

    public void setId(Intefer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList getListaContatos() {
        return ListaContatos;
    }

    public void setListaContatos(ArrayList ListaContatos) {
        this.ListaContatos = ListaContatos;
    }

    
}
