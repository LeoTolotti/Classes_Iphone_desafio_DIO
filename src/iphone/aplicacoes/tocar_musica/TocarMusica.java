package iphone.aplicacoes.tocar_musica;

import iphone.aplicacoes.utilidade.LeitorDeDados;

public class TocarMusica {
    public static void playerMusica() {
        System.out.println("Player Musica!");
        String opcao;
        boolean res = true;
        while (res) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Play");
            System.out.println("2 - Pause");
            System.out.println("3 - Selecionar Musica");
            System.out.println("4 - Sair");  
            opcao = LeitorDeDados.lerDado();
            switch (opcao) {
                case "1":
                    System.out.println("Play");
                    break;
                case "2":
                   System.out.println("Pause");
                    break;
                case "3":
                    System.out.println("Selecionando musica"); 
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
