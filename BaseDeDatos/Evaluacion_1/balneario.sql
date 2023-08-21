--1)
SELECT NOMB FROM BALNEARIOS WHERE COSTED > '45';

--2) 
SELECT nomp FROM PACIENTES WHERE CODP in
(select codp from poboacions where nomp ='brea' )

--3)
select tipo from augas where coda 
in(select coda from indicadas where codz in
   (select codz from zonas_corporais where nomz ='ril'))

--4)
 
 select codp, count(*) from pacientes group by codp
 
 --5)

 select tipo,count(*) from augas 
  inner join compon on augas.coda = compon.coda
  group by tipo
  
  
 --6)
  
 
 select distinct medicos.codme 
 from medicos 
 inner join asignan on medicos.codme=asignan.codme
 inner join prescriben on medicos.codme=prescriben.codme
 inner join cronicos on asignan.nif=cronicos.nif
 inner join agudos on prescriben.nif=agudos.nif
 
 --7) 
 select nif,pacientes.nomp, poboacions.nomp 
 from pacientes 
  left join poboacions on pacientes.codp=poboacions.codp 
  
  --8)
  select nomb from balnearios 
  inner join prescriben on balnearios.codb=prescriben.codb
  inner join agudos on prescriben.nif=agudos.nif
  where agudos.nif='3615' and prescriben.dea < '2020/07/08' 
  and prescriben.dsa >'2020/07/08'
  
  
--9) ??
select pacientes.nif from pacientes 
inner join cronicos on pacientes.nif = cronicos.nif 
inner join agudos on  pacientes.nif = agudos.nif 

  
 --10)
 select nomp from  poboacions 
 left join balnearios on  poboacions.codp=balnearios.codp 
 where balnearios.codp is null
 
 --11)
 select nomb from balnearios 
 inner join poboacions  on poboacions.nomp=balnearios.nomb
 
 --12)
 select distinct nomp  from pacientes 
 left join medicos on pacientes.nomp=medicos.nomme 
 where medicos.nomme is null

--13) 
select distinct nomp from pacientes 

--14)
select pacientes.nomp from pacientes where nomp like  
'%a%' and nomp like '%o%'  ;

--16)
select distinct nomh  from hoteis
inner join habitacions on hoteis.codh = habitacions.codh
where habitacions.interede ='s'



 