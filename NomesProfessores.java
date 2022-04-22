package NomesProfessores;

  /*/ Crie um programa em java que tenha uma lista com os nomes dos
 professores do curso de Análise da UCSAL, contemplando as seguintes
 operações:
a) Adicionar
b) Remover
c) Verificar tamanho
d) Verificar se está vazia, retornando true
e) Apagar lista, deletando todos os registros
f) Listar os registros da lista.
/*/

public class NomesProfessores {

private Integer senha;
private String nome;
private String email;

	
public NomesProfessores(Integer id, String nome, String email) {
	super();
	this.senha = senha;
	this.nome = nome;
	this.email = email;
}

	
public Integer getId() {
	return senha;
}
public void setId(Integer id) {
	this.senha = senha;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}






















