/* Exemplo de uso de banco de dados com structs e ponteiros */

#include <iostream>
#include <string>
using namespace std;

// struct de informação da classe
// deverá vir antes de Aluno (uma vez que Aluno pega informações de classes)
struct classes
{
	int id; // o id tem de ser único

	// dados adicionais da classe (não precisam ser únicos)
	int code;
	int max_alunos;
};

// struct de informação do aluno
struct Aluno{
	classes *classe; // ponteiro para a classe do aluno
	string nome; // nome do aluno
};

// imprime nome do aluno mais informações da sua classe
// recebe:	Aluno alunos[] 	: array de alunos
//			int n 			: número de alunos
void printClasses(Aluno alunos[],int n){

	for(int i = 0; i<n;i++){
		cout<<alunos[i].nome<<endl;
		cout<<"id: "<<alunos[i].classe->id<<". code: "<<alunos[i].classe->code<<". max alunos:"<<alunos[i].classe->max_alunos<<endl;
	}
}

// configura a classe de um aluno
// recebe: 	Aluno &aluno 		: recebe o endereço de um aluno passado (basta passar a variável normalmente, que aqui pega o endereço)
//			classes classes_[] 	: array de classes
//			int n 				: número de classes
// 			int id 				: id da classe do aluno
void confClass(Aluno &aluno,classes classes_[],int n,int id){
	for(int i = 0; i<n;i++){
		if(classes_[i].id == id){
			aluno.classe = &(classes_[i]);
		}
	}
}

int main()
{
	// declara array classes_
	classes classes_[4];

	// preenche array classes_
	for(int i = 0; i < 4 ; i++){
		classes_[i].id = i+1;
		classes_[i].code = 10+i*2;
		classes_[i].max_alunos = 30 - i*3;
	}

	// declara array alunos
	Aluno alunos[4];

	// preenche array alunos
	alunos[0].nome = "joao";
	confClass(alunos[0],classes_,4,3);
	alunos[1].nome = "marcelo";
	confClass(alunos[1],classes_,4,4);
	alunos[2].nome = "maria";
	confClass(alunos[2],classes_,4,3);
	alunos[3].nome = "eliv";
	confClass(alunos[3],classes_,4,1);

	// imprime o nome de cada aluno com as informações de sua classe
	printClasses(alunos,4);

	return 0;
}