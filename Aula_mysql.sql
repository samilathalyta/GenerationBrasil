create database rh_empresa;
use rh_empresa;
-- 5 dados / codigo, nome, idade, cargo, , salario,

create table tb_funcionario(
codigo bigint auto_increment,
nome varchar (200) not null,
idade int,
cargo varchar (100) not null,
salario decimal (6,2) not null,
primary key (codigo)
);

insert into tb_funcionario ( nome, idade, cargo, salario) 
values ( "Thalyta", 23, "Dev Java", 4.500);
insert into tb_funcionario ( nome, idade, cargo, salario) 
values ( "Samila", 21, "Atendente", 1.500);
insert into tb_funcionario ( nome, idade, cargo, salario) 
values ( "Ciclano", 30, "Adm banco de dados", 6.500);
insert into tb_funcionario ( nome, idade, cargo, salario) 
values ( "Fulano", 18, "Gerente", 2.500);
insert into tb_funcionario ( nome, idade, cargo, salario) 
values ( "Zezinho", 18, "Dev estagiário", 1.000);

select * from tb_funcionario;
 delete from tb_funcionario where codigo = 2;
 
 alter table tb_funcionario modify salario decimal(10,2);
 update tb_funcionario set salario = 4.500 where codigo = 1;
  update tb_funcionario set salario = 6.500 where codigo = 3;
   update tb_funcionario set salario = 1.500 where codigo = 4;
    update tb_funcionario set salario = 1.1000 where codigo = 5;

select * from tb_funcionario where salario > 2.00;
select * from tb_funcionario where salario < 2.00;

update tb_funcionario set nome = "zezé" where codigo = 5;

-- -------------------------------------------------------------------------------
create database db_ecomerce;
use db_ecomerce;

create table tb_produto(
id bigint auto_increment,
nome varchar(100) not null,
marca varchar (50) not null,
preco decimal (10,2) not null,
primary key (id)

);


insert into tb_produto (id, nome, marca, preco) values (1, "Tablet", "LG", 450.00);
insert into tb_produto (nome, marca, preco) values ("Secador", "Taiff", 350.00);
insert into tb_produto (nome, marca, preco) values ("Celular", "Apple", 3200.00);
insert into tb_produto (nome, marca, preco) values ("Caixa de som", "JBL", 450.00);
insert into tb_produto (nome, marca, preco) values ( "Tablet", "samsung", 1500.00);
insert into tb_produto (nome, marca, preco) values ("Headfone", "Gammer", 250.00);
insert into tb_produto (nome, marca, preco) values ("Notbook", "Dell", 3500.00);
insert into tb_produto (nome, marca, preco) values ("Mouse", "Acer", 150.00);

select * from tb_produto;
select* from tb_produto where preco > 500.00;
select * from tb_produto where preco < 500.00;

update tb_produto set marca = "Gama" where id = 2;

-- -------------------------------------------------------------------
create database db_escola;
use db_escola;

create table tb_estudante (
matricula bigint auto_increment,
nome varchar(50) not null,
escola varchar(50) not null,
curso varchar (70) not null,
nota decimal (4,2) not null,
tuno varchar (20) not null,

primary key(matricula)
);


insert into tb_estudante(nome, escola, curso, nota, tuno) values
("Zé", "E.E Elvis presley","Java", 9.5, "manhã"),
("Paulinha", "E.E Hebe Camargo","Adiministração", 5.5, "noite"),
("Jão", "E.E Didi","Contabilidade", 2.5, "tarde"),
 ("Joana", "E.E Martelo de Assis","Tecnologia", 6.0, "manhã");

select * from tb_estudante;
select* from tb_estudante where nota > 7;
select * from tb_estudante where nota < 7;



