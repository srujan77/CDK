create table person(personid number(3) primary key, personname varchar(20),city varchar(15), state varchar(15) ,bdate date, aadhar number unique,pan varchar(15) unique);

insert into person values(1,'pikachu','hyd','Ap',Date '1999-06-07',1378278,'pjj12hg12');
insert into person values(2,'sunio','Knr','Tel',Date '1997-12-19',2378221,'fjj14ag15');
insert into person values(3,'gian','scr','Tel',Date '1994-03-09',1378438,'ajf12sd19');
insert into person values(4,'nobita','jgtl','Tel',Date '1998-11-39',4325878,'eer25bg20');
insert into person values(5,'ash','Kur','Ap',Date '1992-09-07',73782123,'bjn13dd56');
insert into person values(6,'brock','hyd','Ap',Date '2000-07-10',2378988,'afj32og23');
insert into person values(7,'may','med','Ap',Date '1999-12-15',3378225,'fdd21gh89');
insert into person values(8,'ditto','hyd','Ap',Date '1989-12-31',6375478,'adj23hj20');
insert into person values(9,'doraemon','scr','Tel',Date '1990-11-11',2138278,'asd14hf88');

update person  set personname='suzuka',city='kur',state='Ap',Bdate=Date '2000-11-23',aadhar=64456123,pan='Fa123gf78' where personid=2;

update person set state='Ts' where city='hyd';

delete from person where city='hyd';
