
CREATE or replace procedure pfungo(nombre varchar)
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  q record;
  x varchar;
  fila  record;
  cuenta integer;
BEGIN
cuenta=0;
 x = E'\n';
 select clibro, titulo  into STRICT   fila  from libro where titulo=nombre;
   
      raise notice '%',x ;
end;
$$;


/*
fungo
call  pfungo('zosmo')
*/
