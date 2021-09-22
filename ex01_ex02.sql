create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert into tb_categoria (descricao, ativo) values ("Bovino",true);
insert into tb_categoria (descricao, ativo) values ("Suino",true);
insert into tb_categoria (descricao, ativo) values ("Aves",true);
insert into tb_categoria (descricao, ativo) values ("pertence feijoada",true);
insert into tb_categoria (descricao, ativo) values ("imbutidos",true);
insert into tb_categoria (descricao, ativo) values ("soja",true);
insert into tb_categoria (descricao, ativo) values ("outros",true);

select * from tb_categoria;

create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
preco decimal(6,2) not null,
qtproduto int not null,
dtvalidade date,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("ASA",40.00,30, "2021-11-07", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Picanha",20.00,30, "2021-11-08", 1);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("coxa de frango",20.00,30, "2021-11-07", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Bacon",30.00,30, "2021-11-09", 1);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("hamburguer",60.00,30, "2021-09-07", 5);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Cupim",20.00,30, "2021-11-10", 1);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Peito de frango",25.00,30, "2021-11-09", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Orelha de porco",20.00,30, "2021-11-07", 4);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("Salame",18.00,30, "2021-11-21", 5);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("medalhao",50.00,30, "2021-11-15", 3);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("mocoto",20.00,30, "2021-10-05", 2);
insert into tb_produtos (nome, preco, qtProduto, dtvalidade, categoria_id) values ("chuleta",20.00,30, "2021-10-07", 1);
insert into tb_produtos (nome, preco, qtProduto) values ("acendedor de churrasqueira",20.00,30);
insert into tb_produtos (nome, preco, qtProduto) values ("soprador de churrasqueira",35.00,30);

select * from tb_produtos;
Select * from tb_produtos ORDER BY nome; 
Select * from tb_produtos ORDER BY nome DESC;
select * from tb_produtos where preco > 20 and tb_produtos_id = 2;
select * from tb_produtos where preco > 20 or tb_produtos_id = 2;
select * from tb_produtos WHERE nome LIKE "%ha";
select * from tb_produtos WHERE NOT categoria_id = 3;
select * from tb_produtos WHERE preco IN (20, 30, 40) order by preco, nome;
Select COUNT(*) from tb_produtos;
Select  sum(preco) from tb_produtos;
select avg(preco) from tb_produtos; 
select format(avg(preco),2) as media from tb_produtos;
Select MIN(preco) from tb_produtos;
Select * from tb_produtos WHERE preco = (select MIN(preco) from tb_produtos);
Select * from tb_produtos where length(nome) = 3;

select tb_produtos.nome, tb_produtos.preco, tb_produtos.qtproduto, tb_categoria.descricao 
from tb_produtos INNER JOIN tb_categoria 
 on tb_categoria.ID = tb_produtos.categoria_id;
 
 -- -------------------------------------------------------------------------
 -- PIZZARIA
 
 create database bd_pizzaria_legal ;
 use bd_pizzaria_legal;
 

 create table tb_categoria(
 id bigint auto_increment,
 descricao varchar (50) not null,
 ativo boolean not null,
 
 primary key (id)
 );
 
 insert into tb_categoria (descricao, ativo ) values 
 ("Salgada", true),
 ("Doce", true),
 ("Meio_a_meio", true);
 
 select * from tb_categoria;
 

 create table tb_pizza(
 id bigint auto_increment,
 Sabor varchar (55) not null,
 categoria_id bigint,
 primary key (id),
 foreign key (categoria_id) references tb_categoria(id)
 );
 
 insert into tb_pizza(sabor, categoria_id) values
  ("Frango", 1), ("Brigadeiro", 2 ), ("Pretigio", 2), 
 ("Calabresa", 1), ("Nutella", 2), ("Atum", 1),("BrigadQueijo", 3);
  
 
 select * from tb_pizza;
 
 create table tb_produtos(
 id bigint,
 preco decimal (7,2) not null,
 qtdPizza int,
 pizza_id bigint,
 primary key (id),
 foreign key (pizza_id) references tb_pizza(id)
 
 );
 
insert into tb_produtos (id, preco, qtdPizza, pizza_id) values
 
  (2, 62.99, 2, 2),
   (3, 54.99, 2, 3),
    (4, 70.00, 3, 1),
     (5, 35.99, 1, 2),
      (6, 28.99, 1, 3);
 
 
 select * from tb_produtos;
 select * from tb_produtos where preco > 45.00;
 select * from tb_produtos where preco between 29.00 and 60.00;
 select * from tb_pizza where sabor like "%c%";
 
 -- Faça um um select com Inner join entre tabela categoria e pizza.
select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.categoria_id;

 -- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
-- os produtos que são pizza doce).

select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.categoria_id
where tb_categoria.descricao = "doce";


 
 
 
 
 
 -- ============================================================
 -- JOGO
 
 create database db_game_online;
 use db_game_online;
 
 create table tb_classe(
 id bigint auto_increment,
 nome varchar(255),
 skill varchar(150),
 hp_base int,
 arma varchar(255),
 primary key(id)
 
 );
 
 insert into tb_classe(nome, skill, hp_base, arma) values 
 ("Feiticeiro", "Feitiço", 1500, "Cajado"),
 ("Arqueiro", "Ranged", 50, "Arco e Flecha"),
 ("Bruxa", "Magia", 1200, "Varinha"),
 ("Cavaleiro", "Melee", 4000, "Espada e escudo"),
 ("Curandeiro", "Ressurreição", 1600, "Grimorio");
 
 create table tb_personagens(
 id bigint auto_increment,
 nome varchar(255),
 nivel int,
 ataque int,
 defesa int,
 classe_id bigint,
 primary key (id),
 foreign key (classe_id) references tb_classe(id)
 );
 
 insert into tb_personagens (nome, nivel, ataque, defesa, classe_id) values
 ("Légulas", 8001, 5000, 5000, 2),
 ("FugiroKaminhaMoto",12, 2000, 5, 2),
 ("Jose", 8, 2000, 1000, 4),
 ("Gandalf", 10000, 12000, 3000, 1),
 ("Galadriel", 15000, 20000, 10000, 3),
 ("Yssac", 4, 5000, 4500, 1),
 ("Sus", 50000, 1000, 6000, 5);
 
 select * from tb_personagens;
 select * from tb_personagens where ataque < 2000;
 
 select * from tb_personagens where defesa between 1000 and 20000;
 
 select * from tb_personagens where nome like "%c%";
 

 
 select * from tb_personagens inner join tb_classe
 on tb_classe.id = tb_personagens.classe_id
 where tb_classe.id = 2;
 
 
 

 
 
 

