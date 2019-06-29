package projeto;

import java.util.Random;

public class Carrospromocionais extends Carro implements SorteioPromocional {

	@Override
	public boolean sorteio() {
		boolean vaiquede= false;
		Random kiko = new Random();
		int x = kiko.nextInt(50);
		System.out.println(x);
		if(x==10) {
			vaiquede=true;
		}
		if(vaiquede) {
			this.setValor(this.getValor()-this.getValor()*0.20);
		}
		return vaiquede;
	}

	@Override
	public void ipva() {
		this.setValor(this.getValor()+this.getValor()*0.003);
		
	}

}
