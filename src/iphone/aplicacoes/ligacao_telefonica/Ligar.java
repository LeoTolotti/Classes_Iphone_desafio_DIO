package iphone.aplicacoes.ligacao_telefonica;

import iphone.aplicacoes.utilidade.LeitorDeDados;

public class Ligar {
    public static void realizarTelefonema() {
        System.out.println("Telefone!");
        String opcao;
        boolean res = true;
        while (res) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Atender");
            System.out.println("2 - Ligar");
            System.out.println("3 - Correio de Voz");
            System.out.println("4 - Sair");  
            opcao = LeitorDeDados.lerDado();
            switch (opcao) {
                case "1":
                    System.out.println("Atendento");
                    break;
                case "2":
                   System.out.println("Ligando");
                    break;
                case "3":
                    System.out.println("Correio de Voz"); 
                    break;                
                case "4":
                    System.out.println("Saindo");
                    res = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
        }
            
        }
    }
}
