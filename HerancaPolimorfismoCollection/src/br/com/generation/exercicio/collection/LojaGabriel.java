package br.com.generation.exercicio.collection;

public class LojaGabriel extends EstoqueLoja implements IEstoque{
	
	private String placaVideo,processador,teclado,mouse;
	
	
	
	
	public LojaGabriel(int quantidade, String produtos, String placaVideo, String processador, String teclado,
			String mouse) {
		super(quantidade, produtos);
		this.placaVideo = placaVideo;
		this.processador = processador;
		this.teclado = teclado;
		this.mouse = mouse;
	}

	public String getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "Em Setor temos Placa de Vídeo=" + placaVideo + ", Processador=" + processador + ", Teclado=" + teclado
				+ ", Mouse=" + mouse + "";
	}

	@Override
	public void contagem() {
		System.out.println(getQuantidade());
		
	}

	@Override
	public void venda() {
		System.out.println("Parabéns!!! Você comprou");
		
	}
	
	
	
	
	
}
