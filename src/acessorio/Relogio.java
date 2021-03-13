package acessorio;

public class Relogio {
	
//Atributos
	
	private String tipo;
	private String cor;
	private String formato;
	private String tamanho;
	private String material;
	private String marca;
	private String genero;
	private boolean despertador;
	private boolean cronometro;
	private boolean resistenciaAgua;
	
//Métodos de Acesso
	
	public String getTipo() {
		return tipo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public String getMaterial() {
		return material;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public boolean getDespertador() {
		return despertador;
	}
	
	public boolean getCronometro() {
		return cronometro;
	}
	
	public boolean getResistenciaAgua() {
		return resistenciaAgua;
	}
	
	public void setDespertador(boolean despertador) {
		this.despertador = despertador;
	}
	
	public void setCronometro(boolean cronometro) {
		this.cronometro = cronometro;
	}
	
	public void setResistenciaAgua(boolean resistenciaAgua) {
		this.resistenciaAgua = resistenciaAgua;
	}
	
//Método Construtor
	
	public Relogio(String tipo, String cor, String formato, String tamanho, String material, String marca, String genero) {
		this.tipo = tipo;
		this.cor = cor;
		this.formato = formato;
		this.tamanho = tamanho;
		this.material = material;
		this.marca = marca;
		this.genero = genero;
	}

//Métodos de Classes
	
	public void baterPonteiros() {
		System.out.println("Tic tac, Tic tac");
	}
	
	public void mostrarHora() {
		System.out.println("Mostra a hora");
	}
	
	public boolean despertar(boolean despertador) {
		if(despertador) {
			System.out.println("Desperta");
		}
		else {
			System.out.println("Não desperta");
		}
		return despertador;
	}
	
	public boolean cronometrar(boolean cronometro) {
		if(cronometro) {
			System.out.println("Cronometra");
		}
		else {
			System.out.println("Não cronometra");
		}
		return cronometro;
	}
	
	public boolean resistirAgua(boolean resistenciaAgua) {
		if(resistenciaAgua) {
			System.out.println("Resiste a água");
		}
		else {
			System.out.println("Não resiste a água");
		}
		return resistenciaAgua;
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Relogio rel1 = new Relogio("Analógico", "Prata", "Redondo", "Grande", "Aço", "Champion", "Masculino");
		System.out.println("RELÓGIO 1:");
		rel1.resistirAgua(true);
		System.out.println(rel1.getTipo() + "\n" + rel1.getCor() + "\n" + rel1.getFormato() + "\n" + rel1.getTamanho() + "\n" + rel1.getMaterial() + "\n" + rel1.getMarca() + "\n" + rel1.getGenero() + "\n");
	
		Relogio rel2 = new Relogio("Digital", "Rosa", "Quadrado", "Pequeno", "Silicone", "Samsung", "Feminino");
		System.out.println("RELÓGIO 2:");
		rel2.cronometrar(true);
		rel2.despertar(true);
		rel2.resistirAgua(true);
		System.out.println(rel2.getTipo() + "\n" + rel2.getCor() + "\n" + rel2.getFormato() + "\n" + rel2.getTamanho() + "\n" + rel2.getMaterial() + "\n" + rel2.getMarca() + "\n" + rel2.getGenero() + "\n");
		
		Relogio rel3 = new Relogio("Digital", "Preto", "Quadrado", "Grande", "Borracha", "Casio", "Masculino");
		System.out.println("RELÓGIO 3:");
		rel3.cronometrar(true);
		rel3.despertar(true);
		rel3.resistirAgua(false);
		System.out.println(rel3.getTipo() + "\n" + rel3.getCor() + "\n" + rel3.getFormato() + "\n" + rel3.getTamanho() + "\n" + rel3.getMaterial() + "\n" + rel3.getMarca() + "\n" + rel3.getGenero() + "\n");
		
		Relogio rel4 = new Relogio("Analógico", "Dourado", "Redondo", "Médio", "Couro", "Chilli Beans", "Feminino");
		System.out.println("RELÓGIO 4:");
		rel4.resistirAgua(false);		
		System.out.println(rel4.getTipo() + "\n" + rel4.getCor() + "\n" + rel4.getFormato() + "\n" + rel4.getTamanho() + "\n" + rel4.getMaterial() + "\n" + rel4.getMarca() + "\n" + rel4.getGenero() + "\n");
	}

}
