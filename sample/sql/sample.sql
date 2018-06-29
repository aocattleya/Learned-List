set names utf8;
set foreign_key_checks = 0;

drop database if exists sample_database;
create database sample_database;
use sample_database;

drop table if exists sample_table;
create table sample_table(
	-- [not null] nullの入力禁止
	-- [primary key] 一意
	-- [auto_increment] 前回入力された値に+1した値を自動で入力されるようにする
	id int not null primary key auto_increment,
	name varchar(255)
);

insert into sample_table(name) values("taro");
insert into sample_table(name) values("jiro");