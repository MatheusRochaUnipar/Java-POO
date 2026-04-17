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
public class Contato {
    private Integer id;
    private String nome;
    private ArrayList<Telefone> ListaTelefones = new ArrayList<>();
    private ArrayList<Endereco> ListaEndereco = new ArrayList<>();

}
