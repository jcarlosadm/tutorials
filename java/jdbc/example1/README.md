Código de exemplo retirado da apostila da Caelum: https://www.caelum.com.br/apostila-java-web/bancos-de-dados-e-jdbc/

Para usar com **mysql**, na classe *ConnectionFactory*, basta comentar:

```java
Class.forName("org.sqlite.JDBC");
return DriverManager.getConnection("jdbc:sqlite:test.db");
``` 

e descomentar:

```java
return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
```

Faça o contrário para usar com **sqlite**.

De qualquer modo, deverá existir um banco de dados chamado *fj21* (**mysql**) ou *test.db* (**sqlite**).

O comando **mysql** para criar o banco *fj21* é:

```sql
create table contatos (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  email VARCHAR(255),
  endereco VARCHAR(255),
  dataNascimento DATE,
  primary key (id)
);
```

Para criar o banco *test.db* a ser usado com **sqlite**, rode no terminal (*linux*):

```bash
sqlite3 test.db
```

E depois:

```sql
create table contatos (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nome VARCHAR(255),
  email VARCHAR(255),
  endereco VARCHAR(255),
  dataNascimento DATE
);
```

Exemplo testado no eclipse. Os arquivos *jar* desta pasta devem estar no *classpath* do projeto.