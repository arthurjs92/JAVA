import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//criar lista
		//ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Aluno> alunos = new ArrayList<>();
		//popular a lista
		for(int i=0;i<5;i++) {
			/*String nome = sc.nextLine();
			Double nota = sc.nextDouble();
			Aluno temp = new Aluno(nome, nota);
			alunos.add(temp);*/
			alunos.add(new Aluno(sc.nextLine(), sc.nextDouble()));
			sc.nextLine();
		}
		double media = calcularMedia(alunos);
		System.out.println(media);
	}
	
	public static double calcularMedia(ArrayList<Aluno> alunos) {
		double soma=0;
		/*for (Aluno aluno : alunos) {
			soma+=aluno.getNota();
		}*/
		for (Iterator iterator = alunos.iterator(); iterator.hasNext();) {
			Aluno aluno = (Aluno) iterator.next();
			soma+=aluno.getNota();
		}
		/*for(int i=0;i<alunos.size();i++) {
			soma+=alunos.get(i).getNota();
		}*/
		String texto[] = {"Bruno","José"};
		/*for(String nome : texto) {
			System.out.println(nome + ", ");
		}*/
		return soma/alunos.size();		
	}

}
