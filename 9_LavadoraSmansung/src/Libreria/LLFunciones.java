
package Libreria;

public class LLFunciones {

	private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 1, SecadoCompleto = 0;

	public LLFunciones(int Kilos, int TipoDeRopa) {

		this.kilos = Kilos;
		this.TipoDeRopa = TipoDeRopa;

	}

	private void Llenado() {
		if (kilos <= 12) {
			llenadoCompleto = 1;
			System.out.println("llenando...");
			System.out.println("Llenado completo...");
		} else {
			System.out.println("La carga de ropa es muy pesada, reduce la carga");
		}
	}

	private void Lavado() {
		Llenado();
		if (llenadoCompleto == 1) {
			if (TipoDeRopa == 1) {
				System.out.println("Ropa Blanca / Lavado suave");
				System.out.println("Lavando...");
				LavadoCompleto = 1;
			} else if (TipoDeRopa == 2) {
				System.out.println("Ropa de color / lavado intenso");
				System.out.println("Lavando....");
				LavadoCompleto = 1;
			} else {
				System.out.println("El tipo de ropa no esta disponible");
				System.out.println("Se lavara como ropa de color / Lavado intenso");
				LavadoCompleto = 1;
			}
		}

	}
	private void Secado() {
		Lavado();
		if (LavadoCompleto==1) {
			System.out.println("Secando...");
			SecadoCompleto = 1;
		}
	}

	public void CicloFinalizado() {
         Secado();
         if (SecadoCompleto ==1) {
			System.out.println("Tu ropa esta Lista...");
		}
	}
	//Setter y Getter

	public int getTipoDeRopa() {
		return TipoDeRopa;
	}

	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	public int getLlenadoCompleto() {
		return llenadoCompleto;
	}

	public void setLlenadoCompleto(int llenadoCompleto) {
		this.llenadoCompleto = llenadoCompleto;
	}

	public int getLavadoCompleto() {
		return LavadoCompleto;
	}

	public void setLavadoCompleto(int lavadoCompleto) {
		LavadoCompleto = lavadoCompleto;
	}

	public int getSecadoCompleto() {
		return SecadoCompleto;
	}

	public void setSecadoCompleto(int secadoCompleto) {
		SecadoCompleto = secadoCompleto;
	}

	public void setTipoDeRopa(int tipoDeRopa) {
		TipoDeRopa = tipoDeRopa;
	}
	
	
	
}
