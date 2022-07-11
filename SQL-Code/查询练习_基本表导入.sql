create database S_T;
use S_T;

create table Student(Sno char(9) primary key,Sname char(20) unique,Sex char(2),Sage smallint,Sdep char(20));
create table Course(Cno char(9) primary key,Cname char(20),Cpno char(9),Ccredit int);
create table SC(Sno char(9),Cno char(9),Grade smallint,Primary key(Sno,Cno),);

insert into Student values
('201215121','李明','男',20,'CS'),
('201215122','刘晨','女',19,'CS'),
('201215123','王敏','女',18,'MA'),
('201215125','张立','男',19,'IS');

insert into Course values
('1','数据库','5',4),
('2','数学',null,2),
('3','信息系统','1',4),
('4','操作系统','6',5),
('5','数据结构','7',4),
('6','数据处理',null,2),
('7','PASCAL语言','6',4);

insert into SC values
('201215121','1',92),
('201215121','2',85),
('201215121','3',88),
('201215122','2',90),
('201215122','3',80);

select*from SC;
select*from Student;
select*from Course;