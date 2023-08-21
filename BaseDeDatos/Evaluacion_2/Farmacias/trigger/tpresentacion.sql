--insert into stock values(1,1,5,1);
--rechazada

--insert into stock values(7,9,3,1);
--Rechazada
-- insert into stock values(1,2,5,1);
--Aceptada

/*tpresentation (ejercicio variante 4: trigger tmaxtock) (difícil)
Impedir que se pueda dar de alta en el stock de una farmacia un     medicamento del que ya existan más de tres unidades en stock (independientemente de su presentación) si, además, esa farmacia está ubicada en una nueva ciudad donde exista al menos una otra farmacia.

*/

DROP FUNCTION tpresentacion() CASCADE;
CREATE FUNCTION tpresentacion()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
sumaTotal integer;
cuentaCiudad integer;
codigoCiudad integer;
BEGIN
 select sum(cantidads) into sumaTotal from stock where codf=new.codf and codm=new.codm;
 select codc into codigoCiudad from farmacias where codf=new.codf;
 select count (codf) into cuentaCiudad from farmacias where codc=codigoCiudad;

 if  sumaTotal>3 and cuentaCiudad >1 then
     raise exception 'rechazada insecion y hay mas de una farmacia en esta ciudad';
     
     elsif sumaTotal>3  then
      raise notice ' insecion registrada hay mas de tres unidad de ese medicamento en stock y solo esa  farmacia en esta ciudad';
      else
 raise notice ' insecion registrada ,no  hay mas de tres unidad de ese medicamento en stock farmacia ';
    
  end if;
    return new;
END;
$$;
CREATE TRIGGER tpresentaciont before INSERT ON stock  for each row EXECUTE PROCEDURE tpresentacion();
