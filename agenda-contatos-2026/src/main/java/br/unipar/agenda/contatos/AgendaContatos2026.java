/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.agenda.contatos;

import br.unipar.agendacontatos.model.Pais;

/**
 *
 * @author matheus291107
 */
public class AgendaContatos2026 {

    public static void main(String[] args) {
        Pais pais = new Pais();
        pais.setId(1);
        pais.setNome("Brasil");
        
        Estado estado = new Estado();
        estado.setId(1);
        estado.setNome("PR");
        estado.setCdIbge("212321312");
        estado.setPais(pais);
        
        Cidade cidade = new Cidade();
        cidade.setId(1);
        cidade.setNome("Toledo");
        cidade.setCdIbge("2312312");
        cidade.setEstado(estado);
        
        Endereco endereco = new Endereco();
        endereco.setBairro
    }
}
