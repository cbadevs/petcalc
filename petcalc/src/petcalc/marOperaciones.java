package petcalc;

import java.util.Random;

public class marOperaciones {
	private int _x;
	private int _y;
	private int _z;
	private int _oculto;
	private String _operador;
	
	public int setOculto() {
		return _oculto;
	}

	public int generar_valores(int rango) {
		int valor = 0;
		Random rnd = new Random();
		valor = rnd.nextInt(rango);
		return valor;
	}

	public void Iniciar(int nivel) {
		int[] rango = { 10, 100, 1000, 10000 };
		_x = generar_valores(rango[nivel]);
		_y = generar_valores(rango[nivel]);
	}

	public void Suma() {
		_z = _x + _y;
		_operador = "+";
	}
	
	public void Rest() {
		_z = _x - _y;
		_operador = "-";
	}
	
	public void Milt() {
		_z = _x * _y;
		_operador = "*";
	}
	
	public void Divi() {
		_z = _x / _y;
		_operador = "/";
	}

	public String Mostrar() {
		int ocultar = generar_valores(3);
		String texto = "";
		switch (ocultar) {
		case 0:
			texto = "*" + _operador + _y + " = " + _z;
			_oculto = _x;
			break;
		case 1:
			texto = _x  + _operador + "*" + " = " + _z;
			_oculto = _y;
			break;
		case 2:
			texto = _x + _operador + _y + " = " + "*";
			_oculto = _z;
			break;
		}

		return texto;
	}

}
