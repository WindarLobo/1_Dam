
CREATE or replace procedure psulfato2()
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  z record;
  q record;
  y record;
  x varchar;
  cuenta integer;
BEGIN
cuenta=0;
   x = '';

FOR z In select noms,cods from sulfato  LOOP
x=x||E'\n'||'nombre del sulfato:'||z.noms||E'\n';
FOR q In select nomfg from fungicida
 inner join  compon on compon.codfg = fungicida.codfg
 where cods = z.cods  LOOP
 x=x||q.nomfg||E'\n';    
 END loop; 
  END loop; 	
   raise notice '%',x;

end;
$$;

/*

call psulfato2()
 
select cods, noms from sulfato


select nomfg from fungicida
 inner join  compon on compon.codfg = fungicida.codfg
 where cods = 's1'

consulta datos `para buscar 
*/

/*
Otra forma de hacerlo

CREATE or replace procedure psulfato2()
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  z record;
  q record;
  y record;
  x varchar;
 
BEGIN
   x = '';

FOR z In select noms,cods from sulfato  LOOP

x=x||E'\n'||'nombre del sulfato: '||z.noms||E'\n';

FOR q In select  codfg,cods from compon  where cods = z.cods LOOP

select nomfg,codfg into y from fungicida where codfg=q.codfg;

 x=x||y.nomfg||E'\n';   
 
 END loop; 
 
  END loop; 
  
   raise notice '%',x;

end;
$$;
*/