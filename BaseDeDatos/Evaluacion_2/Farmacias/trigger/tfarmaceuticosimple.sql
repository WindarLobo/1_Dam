/*
que impida que nunha mesma farmacia traballe mais dun farmaceutico
 */
 
 DROP FUNCTION tfarmaceuticossimple() CASCADE;
CREATE FUNCTION tfarmaceuticossimple()
    RETURNS TRIGGER
    LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
fila record;
cuenta integer;
con integer;
x integer;
BEGIN
cuenta = 0;
select count(*) into x from propios where dnip=new.dnip;
if x!=0 then
    raise notice 'propio añadido';
    else
for fila in select *  from traballan where codf=new.codf loop
    
    select count(*) into con from farmaceuticos where dnip =fila.dnip;

        if con >=1 then
        cuenta=cuenta+1;
        end if;


end loop;

if cuenta >=1 then

raise exception 'ya hay un farmaceutico';
else
raise notice 'si';

end if;
end if;

  return new;
END;
$$;
CREATE TRIGGER tfarmaceuticossimplet before INSERT ON traballan for each row EXECUTE PROCEDURE tfarmaceuticossimple();