package iphone;

import iphone.aplicacoes.internet.Internet;
import iphone.aplicacoes.ligacao_telefonica.Ligar;
import iphone.aplicacoes.tocar_musica.TocarMusica;
import iphone.aplicacoes.utilidade.LeitorDeDados;

public class Iphone {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao novo Iphone!");
        String res;
        String opcao;
        do {
            System.out.println("Pressione Enter para desbloquear!");
            res = LeitorDeDados.lerDado();
        } while (!res.isEmpty());
        while (true) {
            System.out.println("Sistema desbloqueado!"); 
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Acesso a Internet");
            System.out.println("2 - Telefone");
            System.out.println("3 - Player Musica");
            System.out.println("4 - Bloquear");  
            opcao = LeitorDeDados.lerDado();
            switch (opcao) {
                case "1":
                    Internet.acessoInternet();
                    break;
                case "2":
                   Ligar.realizarTelefonema();
                    break;
                case "3":
                    TocarMusica.playerMusica();
                    break;                
                case "4":
                    System.out.println("Iphone bloqueado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
        }
            
        }
    }}
    
    
