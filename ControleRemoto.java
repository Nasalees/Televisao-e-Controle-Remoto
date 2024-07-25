package br.com.nathalia.exercicio_01;

import java.util.Scanner;

public class ControleRemoto extends Televisao{
	Scanner sc = new Scanner(System.in);
	
	public void aumentaVolume(int volume) {
		 if(volume > 0 && volume <= 1) {
			volume += getVolume();
			setVolume(volume);
			System.out.println("Novo volume " + volume);
		}else {
			System.out.println("Aumente o volume de 1 em 1.");
		}
	}
	
	public void diminuiVolume(int volume) {
		if(getVolume() == 0 && volume <= 0) {
			System.out.println("Não é possível fazer essa ação! O canal so pode ser mudade de 1 em 1 ");
		}else if(volume > 0 && volume <= 1){
			volume = getVolume() - volume;
			setVolume(volume);
			System.out.println("Novo volume " + volume);
		}else {
			System.out.println("Não é possível fazer essa ação! O canal so pode ser mudade de 1 em 1 ");
		}
	}
	
	public void aumentaCanal(int canal) {
		if(getCanal() == 0 && canal <= 0) {
			System.out.println("Não é possível fazer essa ação! O canal so pode ser mudade de 1 em 1 ");
		}else if(canal > 0 && canal <= 1) {
			canal += getCanal();	
			setCanal(canal);
			System.out.println("O novo canal é " +  canal);
		}
	}
	
	public void diminuiCanal(int canal) {
		if(getCanal() == 0 && canal <=0) {
			System.out.println("Não é possível fazer essa ação! O canal so pode ser mudade de 1 em 1 ");
		}else if(canal > 0 && canal <= 1) {
			canal = getCanal()- canal;
			System.out.println("O novo canal é " + canal);
		}
	}
	
	public void consultarCanal() {
		System.out.println(getCanal());
	}
	public void consultarVolume() {
		System.out.println(getVolume());
	}
}
