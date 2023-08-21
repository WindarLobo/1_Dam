/* insert into klingon values ('p1',null,'pla1');
insert into klingon values('p5',null,'pla1')
insert into klingon values('p2',null,)*/
DROP FUNCTION tkdamp() CASCADE;
CREATE FUNCTION tkdamp()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
contaH integer;
contaV integer;
BEGIN
select count (*) into contaH from humanos where codper=new.codper;
select count (*) into contaV from vulcanos where codper=new.codper;
 if contaH=0  and contaV=0 then
  	 raise notice ' añadido';
    else
  	 raise exception 'no se puede añadir a klingon pq ya existe';
  end if;

  return new;
END;
$$;
CREATE TRIGGER ftkdamp before INSERT ON klingon for each row EXECUTE PROCEDURE tkdamp();

/*insert into humanos values ('p9',null,'Pontevedra')
insert into humanos values ('p5',null,'Pontevedra');
delete from humanos  where codper='p5';
*/
DROP FUNCTION thdamp() CASCADE;
CREATE FUNCTION thdamp()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
contak integer;
contaV integer;
BEGIN
select count (*) into contaK from klingon where codper=new.codper;
select count (*) into contaV from vulcanos where codper=new.codper;
 if contaK=0  and contaV=0 then
  	 raise notice ' añadido';
    else
  	 raise exception 'no se puede añadir a humanos  pq ya existe';
  end if;

  return new;
END;
$$;
CREATE TRIGGER fthdamp before INSERT ON humanos for each row EXECUTE PROCEDURE thdamp();

/*insert into vulcanos values ('p9',null);
insert into vulcanos values ('p5',null)*/

DROP FUNCTION tvdamp() CASCADE;
CREATE FUNCTION tvdamp()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
contaHu integer;
contaK integer;
BEGIN
select count (*) into contaHu from humanos where codper=new.codper;
select count (*) into contaK from klingon where codper=new.codper;
 if contaHu=0  and contaK=0 then
  	 raise notice ' añadido';
    else
  	 raise exception 'no se puede añadir en vulcanos  pq ya existe';
  end if;

  return new;
END;
$$;
CREATE TRIGGER ftvdamp before INSERT ON vulcanos for each row EXECUTE PROCEDURE tvdamp();





