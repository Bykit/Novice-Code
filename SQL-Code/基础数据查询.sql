-- �����ѯ

select Sno,Sname from Student;		-- ѡ��ָ���в�ѯ
select * from Student;				-- ѡ�������в�ѯ

-- ѡ����ʹ���������ʽ
select Sno,2022-Sage from Student;	

-- <Ŀ���б��ʽ>�����������������ʽ�����������ַ���������������
select Sname,'Year of Birth:',2022-Sage,lower(Sdep) from Student;

-- �������
select Sname NAME,'Year of Birth:' BIRTH,2022-Sage BIRTHDAY,lower(Sdep) DEPARTMENT from Student;

-- distinct�ؼ��ֱ�ʾȥ���ظ��У���дĬ��Ϊall
select Sno from SC;
select all Sno from SC;
select distinct Sno from SC;

-- where�Ӿ䣬��ѯ����������Ԫ��
select Sname from Student where Sdep='CS';

select Sname,Sage from Student where Sage<20;
select distinct Sno from SC where Grade<60;

select Sname,Sdep,Sage from Student where Sage between 20 and 23;
select Sname,Sdep,Sage from Student where Sage not between 20 and 23;
select Sname,Sex from Student where Sdep in ('CS','MA','IS');
select Sname,Sex from Student where Sdep not in ('CS','MA','IS');

-- �����������
select * from Student where Sno like '201215121';
select * from student where Sno = '201215121';

select Sname,Sno,Sex from student where Sname like '��%';
select Sname,Sno,Sex from student where Sname like 'ŷ��%';
select Sname,Sno,Sex from student where Sname like '_��%';
select Sname,Sno,Sex from student where Sname not like '��%';

select Cno,Ccredit from Course where Cname like 'DB\_Design'ESCAPE'\';
select * from Course where Cname like 'DB\_%i__'ESCAPE'\';
select Sno,Cno from SC where Grade is null;
select Sno,Cno from SC where Grade is not null;
select Sname from Student where Sdep='CS' and Sage<20;
select Sname,Sex from Student where Sdep='CS' or Sdep = 'MA'or sdep = 'IS';