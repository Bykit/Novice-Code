-- 单表查询

select Sno,Sname from Student;		-- 选择指定列查询
select * from Student;				-- 选择所有列查询

-- 选择列使用算术表达式
select Sno,2022-Sage from Student;	

-- <目标列表达式>不仅可以是算术表达式，还可以是字符串常量、函数等
select Sname,'Year of Birth:',2022-Sage,lower(Sdep) from Student;

-- 定义别名
select Sname NAME,'Year of Birth:' BIRTH,2022-Sage BIRTHDAY,lower(Sdep) DEPARTMENT from Student;

-- distinct关键字表示去掉重复行，不写默认为all
select Sno from SC;
select all Sno from SC;
select distinct Sno from SC;

-- where子句，查询满足条件的元组
select Sname from Student where Sdep='CS';

select Sname,Sage from Student where Sage<20;
select distinct Sno from SC where Grade<60;

select Sname,Sdep,Sage from Student where Sage between 20 and 23;
select Sname,Sdep,Sage from Student where Sage not between 20 and 23;
select Sname,Sex from Student where Sdep in ('CS','MA','IS');
select Sname,Sex from Student where Sdep not in ('CS','MA','IS');

-- 下面两句相等
select * from Student where Sno like '201215121';
select * from student where Sno = '201215121';

select Sname,Sno,Sex from student where Sname like '刘%';
select Sname,Sno,Sex from student where Sname like '欧阳%';
select Sname,Sno,Sex from student where Sname like '_阳%';
select Sname,Sno,Sex from student where Sname not like '刘%';

select Cno,Ccredit from Course where Cname like 'DB\_Design'ESCAPE'\';
select * from Course where Cname like 'DB\_%i__'ESCAPE'\';
select Sno,Cno from SC where Grade is null;
select Sno,Cno from SC where Grade is not null;
select Sname from Student where Sdep='CS' and Sage<20;
select Sname,Sex from Student where Sdep='CS' or Sdep = 'MA'or sdep = 'IS';