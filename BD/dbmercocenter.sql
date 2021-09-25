-- criação do banco de dados projeto integrador 01
create database dbmercocenter;

use dbmercocenter;

-- criação da tabela de usuários
create table tbusuarios(
	coduser int primary key,
    nomeuser varchar(50) not null,
    login varchar(15) not null unique,
    senha varchar(16) not null
);

-- descrição da tabela tbusuarios
describe tbusuarios;

-- inserção de dados na tabela dbusuarios (CRUD)
-- Create
insert into tbusuarios(coduser, nomeuser, login, senha)
values(1, 'Guylherme Sales', 'guylherme52', '123456789');

insert into tbusuarios(coduser, nomeuser, login, senha)
values(2, 'José Ulisses', 'joseulisses', '123456789');

-- exibição dos dados da tabela tbusuarios (CRUD)
-- read -> select
select * from tbusuarios;

insert into tbusuarios(coduser, nomeuser, login, senha)
values(3, 'Administrador', 'admin', 'admin123');

-- criação da tabela de entrada de produtos
create table tbentradaprodutos(
	codproduto int primary key,
    nome varchar(30) not null,
    descricao varchar(50) not null,
    marca varchar(20) not null,
    coduser int not null,
    dataentrada timestamp default current_timestamp,
    foreign key(coduser) references tbusuarios(coduser)
);

describe tbentradaprodutos;

