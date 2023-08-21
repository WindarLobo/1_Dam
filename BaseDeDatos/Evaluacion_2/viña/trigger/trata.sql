DROP  FUNCTION Ttrata() CASCADE;
CREATE FUNCTION Ttrata()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
contaH varchar;
contaV varchar;
BEGIN

select viticultor.nompv into contaV from vinhedo
inner join viticultor on  vinhedo.codpv= viticultor.codpv
where codv=new.codv;
select nomeop from operario  into contaH where  dniop=new.dniop;
 if contaV=contaH then
 raise exception 'rechazada insercion, o operario se llama igual que el propietario del viñero al tratar';	
 
    else
	  raise notice ' aceptada incersion';
 
  	 
  end if;



  return new;
END;
$$;
CREATE TRIGGER Ttratpa before INSERT ON tratado for each row EXECUTE PROCEDURE Ttrata();
