package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

	private float num1;
	private float num2;
	
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public float sumar() {
		return num1+num2;
	}
	
	public float restar() {
		return num1-num2;
	}
	
	public float multiplicar() {
		return num1*num2;
	}
	
	public float dividir() {
		float result=0;
		if (num2 == 0) {
			System.out.println("ERROR, No se puede dividir entre 0");
		}
		else {
			result=num1/num2;
		}

		return result;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	

}
