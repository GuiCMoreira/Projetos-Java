package poodb.projetobd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import poodb.projetobd.modelos.Situacao;

@SpringBootApplication
public class ProjetobdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetobdApplication.class, args);
		//Situacao st = Situacao.APROVADO;
		//System.out.println(st); // reprova o valor armazenado
		//System.out.println(st.name()); // retorna o nome Textual.
	}

}
