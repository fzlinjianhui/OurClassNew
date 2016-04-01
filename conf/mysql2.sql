--drop  table newinfo;
--delete from newinfo;
select * from class_user where type=1 and id=000001 and studentNum='2411921600';
select * from newinfo
alter table class_user add (firstTimeLogin bigint);
create table class_user (
	id varchar(50) not null,
	sex varchar(5) ,
	name varchar(20),
	studentNum varchar(50) not null,
	password varchar(50) not null,
	type varchar(5) not null,
	loginTimes bigint not null,
	belongClass varchar(50) not null,
	dept varchar(20),
	specialty varchar(20),
	belongSchool varchar(50) not null,
	firstTimeLogin bigint,
	lastTimeLogin bigint
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
commit;
insert into class_user values(
	'000001','男','林剑辉','241192160','66cc7c8771858dd1acdbd3655aa39335','1','0','1','jsjgcx','wlgc','ygxy',0,0
)
update class_user set loginTimes=0 where id='000001'

create table newinfo(
	id int primary key auto_increment,
	type varchar(20),
	title varchar(50),
	content text,
	time bigint,
	ineffect varchar(10),
	userid varchar(50),
	author varchar(30),
	res1 varchar(50),
	res2 varchar(50)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into newinfo values(0,'1','testTitle','testContent',0,1,'000001','林剑辉','','')
insert into newinfo (title,content) values('testtitle','testcontent')



