create database kokila_batch;
use kokila_batch;
create table info (Id int,Name varchar(25),Phone bigint,
course varchar(25),fees int,Join_date date,end_date date);
rename table info to detail;
describe detail;
alter table detail add column duration int;
alter table detail modify column course varchar(30);
alter table detail rename column Id to id;
alter table detail drop column duration;

insert into detail values(1,"Jana",9095589221,"Java",14900,"2026-09-02","2026-11-21");
insert into detail values(2,"Mano",9443545845,"Java",14900,"2026-09-02","2026-11-21"),
(3,"Sasi",7010752575,"Python",16900,"2026-09-01","2026-11-01"),
(5,"Jana",9876543210,"CCNA",13900,"2026-10-05","2026-12-30"),
(9,"Mega",8825888832,"Data science",18900,"2026-05-10","2026-11-6");

select * from detail;
set sql_safe_updates=0;
update detail  set course="Python Fullstack" , fees=36900 where name="Sasi";
delete from detail where name="Mega";
select * from detail where course="Java";
select name,course,fees from detail;
delete from detail where name="jana" limit 1;

truncate table detail;
drop table detail;
drop database kokiempla_batch;

use afternoon;
select * from emp;

update emp set salary=salary+3000 where name="kokila";
select * from emp where salary <=100000;
select * from emp where salary >100000;
select * from emp where salary =200000;
select 5&3;
select * from emp where salary > 100000 and salary<200000;
select * from emp where name like "M%";
select * from emp where name like "%kumar";
select * from emp where name like "%a";
select * from emp where name like "_o%";

select * from emp where dept in("Fullstack developer","Technical Trainer","HR","Manager");
select * from emp where salary between 50000 and 150000;

select dept,count(*) from emp  group by dept;
select dept,sum(salary) from emp group by dept;
select dept,avg(salary) from emp group by dept;
select dept,max(salary) from emp group by dept;
select dept,min(salary) from emp group by dept;

select * from emp order by name;
select * from emp order by name desc;

select now();
select date(now());
select time(now());

select date_format(now(),"%Y-%m-%d") as columnn ;
select extract(day from join_date ) from emp;
select extract(month from join_date) from emp;
select extract(year from join_date) from emp;
select datediff(curdate(),'2023-01-18') as date;
select date_add(curdate(),interval 85 day) as day;

select length("hello");
select name,length(name) from emp group by name;

select upper(name) from emp;
select lower(name) from emp;

select concat(name,"    ",dept) from emp;
select char_length(name) from emp;
select locate("a",name)from emp;
select cast( char(65) as char);
select left(name,3) from emp;

-- joins
-- left table
create table employee(e_id int primary key auto_increment,
Name varchar(25) not null,salary int not null);

insert into employee values(1,"Mahesh",50000);
insert into employee values(2,"Kabilan",50000),
(3,"Logesh",75000),(4,"Praveen",80000),(5,"Bala",100000),
(6,"Aarthi",75000),(7,"Kokila",20000);

select * from employee;

-- right table
create table dept(dept_id int,dept_name varchar(25),
e_id int, foreign key(e_id)
 references employee(e_id));
insert into dept values(101,"Java developer",1),
(103,"Fullstack developer",3),(106,"Technical Trainer",6),
(107,"Backend developer",5);
select * from dept;
select * from employee;

-- inner join
select employee.name,employee.salary,dept.dept_id
from employee
inner join dept on employee.e_id=dept.e_id;

-- left join
select employee.name,employee.salary,dept.dept_id
from employee
left join dept on employee.e_id=dept.e_id;

-- right join
select employee.name,employee.salary,dept.dept_id
from employee
right join dept on employee.e_id=dept.e_id;

-- cross join
select employee.name,dept.dept_id
from employee
cross join dept on employee.e_id;

-- full join
select employee.name,employee.salary,dept.dept_id
from employee
full join dept on employee.e_id=dept.e_id;

select employee.name,employee.salary,dept.dept_id
from employee
left join dept on employee.e_id=dept.e_id
union
select employee.name,employee.salary,dept.dept_id
from employee
right join dept on employee.e_id=dept.e_id;
