package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class Principal {

	public static void main(String[] args) {
		ProfessorTitular prof1 = new ProfessorTitular();
		ProfessorHorista prof2 = new ProfessorHorista();
		
		prof1.setAnosInstituicao(15);
		prof1.setIdade(48);
		prof1.setMatricula("P001");
		prof1.setNome("José");
		prof1.setSalario(1500.00);
		prof1.calcSalario();
		
		System.out.println("DADOS DO PROFESSOR 1: \nAnos de casa: " + prof1.getAnosInstituicao() +
						   "\nIdade: " + prof1.getIdade() +
						   "\nMatrícula: " + prof1.getMatricula() +
						   "\nNome: " + prof1.getNome() +
						   "\nSalario: " + prof1.getSalario());
		
		System.out.println("-------------------------------------");
		
		prof2.setHorasAula(160);
		prof2.setIdade(45);
		prof2.setMatricula("H002");
		prof2.setNome("Maria");
		prof2.setValorHoraAula(20);
		
		System.out.println("DADOS DO PROFESSOR 2: \nIdade: " + prof1.getIdade() +
						   "\nMatrícula: " + prof2.getMatricula() +
						   "\nNome: " + prof2.getNome());
		prof2.calcSalario();

	}

}
