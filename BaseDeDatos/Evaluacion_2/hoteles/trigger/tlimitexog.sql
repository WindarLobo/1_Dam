/*3) trigger tlimitexog que no permita que en un mismo partido jueguen más de dos jugadores, 
en caso contrario que la inserción sea aceptada*/

DROP FUNCTION tlimitexog() CASCADE;
CREATE FUNCTION tlimitexog()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
contaH integer; 
contaV varchar;
BEGIN

select count(*) into contaH from xoga where codpa=new.codpa;
 if contaH>=2 then
 raise exception 'rechazada insercion ';	
 
    else
	  raise notice ' aceptada incersion';
 
  	 
  end if;

  return new;
END;
$$;
CREATE TRIGGER tlimitexogg before INSERT ON xoga for each row EXECUTE PROCEDURE tlimitexog();


/*
insert into xoga values ('p11','pa1','brancas')
select count(codp) from xoga
group by codp
having count(codp)>1  asi se ve el limite la cantida de todo
*/