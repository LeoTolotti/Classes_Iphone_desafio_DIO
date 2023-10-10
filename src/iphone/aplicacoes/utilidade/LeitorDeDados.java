package iphone.aplicacoes.utilidade;

import java.util.Scanner;

public class LeitorDeDados {
    private static Scanner scanner;
	static {
		scanner = new Scanner(System.in);
	}
    public static String lerDado() {
		
		String texto = scanner.nextLine();
		
		return texto;
	}
}
