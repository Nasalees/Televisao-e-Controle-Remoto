package br.com.nathalia.exercicio_01;

public abstract class Televisao {
	private int canal;
	private int volume;
	

	public final void funcoesDoControle() {
		
	}
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int canais) {
		this.canal = canais;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//Métodos Abstratos
	
	public abstract void consultarVolume();
	public abstract void consultarCanal();
	public abstract void diminuiCanal(int canal);
	public abstract void aumentaCanal(int canal);
	public abstract void diminuiVolume(int volume);
	public abstract void aumentaVolume(int volume);
}
