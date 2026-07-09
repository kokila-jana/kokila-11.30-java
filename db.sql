create database Morning;
use Morning;
create table info(id int,Name varchar(20),age int,
course varchar(25));
describe info;
insert into info value(12,"Jana",55,"Fullstack");
insert into info values(13,"Mano",50,"AI Developer"),
(78,"Sasi",33,"Java"),(96,"Priya",29,"Python"),
(122,"Mega",31,"CCNA"),(45,"Mahi",29,"DataScience");
select * from info;

set sql_safe_updates=0;
update info set course="Python Fullstack" where id=96;
delete from info where name="Jana";
alter table info drop column age;
alter table info add column fees float;
truncate table info;
drop table info;

create table info(name varchar(20),Course varchar(25),
Phone varchar(10));
insert into info values("kokila","Java","9442207972");
select * from info;
