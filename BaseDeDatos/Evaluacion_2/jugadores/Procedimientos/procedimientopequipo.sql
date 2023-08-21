
/*
E'\t' tabulador
E'\n' retorno
r=r|| concanenar 
procedimientiento 
call pequipo()
*/

create or replace procedure pequipo() 
language PLPGSQL
AS
$$
DECLARE
fila record;
filax record;
r varchar;
c integer;
a integer;
begin
r=E'\n';
FOR fila IN select * from equipo LOOP 
r=r||fila.codequ||' , '||fila.nomequ||E'\n';
c=0;
a =0;

     
     

  FOR filax IN select * from xogador where codequ=fila.codequ LOOP 
    r=r||E'\t'|| filax.codx||' , '||filax.nomx;
    a=a+1;
  if filax.salario is not null then
  r=r||' , '||filax.salario||E'\n';
  c=c+filax.salario;
  
  else
  r=r ||', Sin salrio'||E'\n';
  end if;
   END loop;
   if a=0 then
   r=r||'Equipo sin jugadores '||E' \n ';
   else
   r=r||'total salario es ='||c||E' \n ';
   r=r||'total de jugadores ='||a||E' \n ';
   end if;
   
END loop;
raise notice '%',r;
end;
$$
;
