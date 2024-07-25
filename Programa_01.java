package br.com.nathalia.exercicio_01;

import java.util.Scanner;

public class Programa_01 {
	
	public static void main(String[] args) {
		ControleRemoto controleRemoto = new ControleRemoto();
		opcoesControle(controleRemoto);
	}
	
	public static void opcoesControle( ControleRemoto controleRemoto) {
		 Scanner sc = new Scanner(System.in);
		 int opcoes;
		 int volume;
		 int canal;
		 
		 do {
			 System.out.println("=====OPÇÕES DO CONTROLE=====");
				System.out.println("1.AUMENTAR VOLUME");
				System.out.println("2.DIMINUIR VOLUME");
				System.out.println("3.AUMENTAR O CANAL");
				System.out.println("4.DIMINUIR O CANAL");
				System.out.println("5.CONSULTAR CANAL");
				System.out.println("6.CONSULTAR VOLUME");
				System.out.println("7.SAIR");
				opcoes = sc.nextInt();
				
				switch(opcoes) {
				case 1:
					System.out.println("Volume atual: " + controleRemoto.getVolume() + "\nDeseja aumentar para quanto? ");
					volume = sc.nextInt();
					controleRemoto.aumentaVolume(volume);
					break;
				case 2:
					System.out.println("Volume atual: " + controleRemoto.getVolume() + "\nDeseja dimunir para quanto? ");
					volume = sc.nextInt();
					controleRemoto.diminuiVolume(volume);
					break;
				case 3:
					System.out.println("Canal atual: " +  controleRemoto.getCanal() + "\nDeseja aumentar o canal para quanto? ");
					canal = sc.nextInt();
					controleRemoto.aumentaCanal(canal);
					break;
				case 4:
					System.out.println("Canal atual: " +  controleRemoto.getCanal() + "\nDeseja dimuniur o canal para quanto? ");
					canal = sc.nextInt();
					controleRemoto.diminuiCanal(canal);
					break;
				case 5:
					controleRemoto.consultarCanal();
					break;
				case 6:
					controleRemoto.consultarVolume();
					break;
				}
				
				
		 }while(opcoes != 7);
			
		}
	}
