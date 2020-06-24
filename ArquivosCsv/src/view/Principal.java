package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.Arquivos;
import controller.Interface;

public class Principal {

	public static void main(String[] args) {

		Interface arqCont = new Arquivos();
		String path = "C:\\TEMP\\Teste";
		String name = "relatorio.txt";
		int opc = 0;
		
		do {
		
		 opc = Integer.parseInt(JOptionPane.showInputDialog(
				"[1] alterar arquivo 'relatório.txt' no diretório 'Teste'\n" + "[2] leitura do arquivo 'relatório'\n"
						+ "[3] abrir arquivo 'relatório'\n" + "[4] criar 'relatorio.csv'\n" + "[5] sair")); 

			switch (opc) {

			case 1:
				try {
					arqCont.creatFile(path, name); // String nome = "teste";
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try {
					arqCont.readFile(path, name); // String nome = "teste.txt"; ou csv
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			case 3:
				try {
					arqCont.openFile(path, name); // String nome = "teste.txt"; ou csv
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			case 4:
				try {
					arqCont.creatCsv(arqCont.readFile(path, name)); // String nome = "teste";
				} catch (IOException e) {
					e.printStackTrace();
				}
				break; 

			case 5:
				System.out.println("Você escolheu a opção de sair, até mais ver :)");
				break;

			default:
				System.out.println("Escolha uma opção de 1 a 5");
				break;
			}
		}
		while(opc!= 5);
	}
}