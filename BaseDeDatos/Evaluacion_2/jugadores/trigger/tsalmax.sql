/*
trigger tsalmax que deniegue la inserción del jugador que cobre más que el salario mas alto de su equipo
select max(salario) from xogador where codequ='e5';
insert into xogador values('x20','ana','e1',3000,0,null);
*/
DROP FUNCTION tsalmax() CASCADE;
CREATE FUNCTION tsalmax()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
  maximo integer;
BEGIN
 select max(salario) into maximo from xogador where codequ=new.codequ;
 if maximo<new.salario then
     raise exception 'para el equipo % el salario no puede ser mayor que %',new.codequ,maximo;
     else 
     	raise notice 'xogador añadido';
 end if;
 return new;
END;
$$;

CREATE TRIGGER tsalmaxt before INSERT ON xogador for each row EXECUTE PROCEDURE tsalmax();
