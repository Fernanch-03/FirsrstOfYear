create database hospital;

use hospital;

 create table hospital(
 id int auto_increment primary key,
 nome varchar(45) not null,
 endereco varchar(100) not null

);

 create table pacientes(
 id int auto_increment primary key,
 hospital int,
 nome varchar(50) not null,
 cpf char(14) not null,
 rg char(20) not null,
 idade int(3) not null,
 senha varchar(45) not null,
 foreign key (hospital) references hospital(id)
 
 );
 
 create table funcionario(
 id int auto_increment primary key,
 hospital int,
 nome varchar(50) not null,
 cpf char(14) not null,
 rg char(20) not null,
 idade int(3) not null,
 senha varchar(45) not null,
 vlHora decimal(5,2) not null,
 foreign key (hospital) references hospital(id)
 
 );
 
 create table prontosocorro(
 id int auto_increment primary key,
 hospital int,
 endereco varchar(100) not null,
 foreign key (hospital) references hospital(id)
 
 );
 
 create table medicos(
 id int auto_increment primary key,
 funcionario int,
 crm varchar(45) not null,
 especialidade varchar(45),
 foreign key (funcionario) references funcionario(id)
 
 );
 
 create table enfermeiro(
 id int auto_increment primary key,
 funcionario int,
 corem varchar(45) not null,
 foreign key (funcionario) references funcionario(id)
 
 );
 
 
/*select * from hospital;

select* from pacientes;

select * from funcionario;*/

/*select * from medicos;*/
 
 

 