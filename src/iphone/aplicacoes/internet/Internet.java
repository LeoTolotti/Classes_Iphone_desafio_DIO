package iphone.aplicacoes.internet;

import iphone.aplicacoes.utilidade.LeitorDeDados;

public class Internet {
    public static void acessoInternet() {
        System.out.println("Internet!");
        String opcao;
        boolean res = true;
        while (res) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Exibir Pagina");
            System.out.println("2 - Atualizar Pagina");
            System.out.println("3 - Adicionar nova aba");
            System.out.println("4 - Sair");  
            opcao = LeitorDeDados.lerDado();
            switch (opcao) {
                case "1":
                    System.out.println("Exibindo pagina");
                    break;
                case "2":
                   System.out.println("Atualizando pagina");
                    break;
                case "3":
                    System.out.println("Adicionando nova Aba"); 
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
