
-- 模式的定义与删除
-- 语法：create + database + 模式名 

create database hello;			-- 创建数据库(模式)
select * from sysdatabases;		-- 查询所有数据库
drop database hello;			-- 删除数据库（模式）


-- 基本表的定义、删除与修改
-- 语法：create + table + 表名 + （ 列名 + 数据类型 + [列级完整性约束条件] + ... +[,表级完整性约束条件]）

create table fool(foolname varchar(10));		-- 创建表

select * from sysobjects where xtype='U';	
-- 查询当前数据库的所有表名
-- xtype='U':表示所有用户表，xtype='S':表示所有系统表。

alter table fool add rmb int;		-- 修改表结构，添加rmb列
sp_columns fool;					-- 查看表结构

drop table fool;					-- 删除表

