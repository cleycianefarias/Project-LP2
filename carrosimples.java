package projeto;

public class carrosimples extends Carro{

	@Override
	public void ipva() {
		this.setValor(this.getValor()+this.getValor()*0.001);
		
	}
	

}
