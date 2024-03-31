package model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ProfessorTitular extends Professor {
	
	private int anosInstituicao;
	private double salario;

	public ProfessorTitular() {
		super();
	}

	public int getAnosInstituicao() {
		return anosInstituicao;
	}

	public void setAnosInstituicao(int anosInstituicao) {
		this.anosInstituicao = anosInstituicao;
	}

	public double getSalario() {
		DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        
        return Double.parseDouble(df.format(salario));
		
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void calcSalario() {
		int anosReceber = (int) anosInstituicao / 5;
		salario *= (1 + (anosReceber * 0.05));
		
	}
	

}
