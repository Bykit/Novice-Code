
-- ģʽ�Ķ�����ɾ��
-- �﷨��create + database + ģʽ�� 

create database hello;			-- �������ݿ�(ģʽ)
select * from sysdatabases;		-- ��ѯ�������ݿ�
drop database hello;			-- ɾ�����ݿ⣨ģʽ��


-- ������Ķ��塢ɾ�����޸�
-- �﷨��create + table + ���� + �� ���� + �������� + [�м�������Լ������] + ... +[,��������Լ������]��

create table fool(foolname varchar(10));		-- ������

select * from sysobjects where xtype='U';	
-- ��ѯ��ǰ���ݿ�����б���
-- xtype='U':��ʾ�����û���xtype='S':��ʾ����ϵͳ��

alter table fool add rmb int;		-- �޸ı�ṹ�����rmb��
sp_columns fool;					-- �鿴��ṹ

drop table fool;					-- ɾ����

