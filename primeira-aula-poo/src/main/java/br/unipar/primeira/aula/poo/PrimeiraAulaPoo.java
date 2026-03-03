/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.primeira.aula.poo;

/**
 *
 * @author matheus291107
 */
public class PrimeiraAulaPoo {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno(); //instaciando um objeto
        aluno.nome = "Arthur Pendragon";
        aluno.ra = "60009872";
        aluno.idade = 32;
        aluno.telefone ="(45) 12345678";
        
        Aluno aluno2 = new Aluno(); //instaciando outro objeto
        aluno2.cpf = "02023020320";
        aluno2.idade = 11;
        aluno2.ra = "43124414";
        aluno2.nome = "Lance Crown";

        System.out.println("Nome do aluno é: " + aluno.nome);
        System.out.println("Nome do aluno é: " + aluno2.nome);
        
        Gato gato = new Gato();
        gato.nome = "Cath Palug";
        gato.idade = 4000;
        gato.raca = "Nascida do Caos";
        gato.cor = "Vermelho";
        
        System.out.println("Nome gato: " + gato.nome);
        System.out.println("Idade gato: " + gato.idade);
        System.out.println("Raca gato: " + gato.raca);

    
        
    }
}
