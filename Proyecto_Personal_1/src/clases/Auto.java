package clases;

public class Auto extends Arraylist {
	
	private String marca;
	private String modelo;
	private String matricula;
	private int km;

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km=km;
	}
	@Override 
	public String toString() {
		StringBuilder sb =new StringBuilder();
		sb.append("\nMatricula: ");
		sb.append(matricula);
		sb.append("\nMarca: ");
		sb.append(marca);
		sb.append("\nModelo: ");
		sb.append(modelo);
		sb.append("\nkm: ");
		sb.append(km);
		return sb.toString();
	}

}
