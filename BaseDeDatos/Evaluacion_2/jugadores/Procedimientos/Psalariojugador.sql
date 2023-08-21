create or replace procedure p1_salarioxogador(codigo varchar)
language PLPGSQL
AS
$$
DECLARE
s integer;

d varchar;

begin


select nomx,salario into STRICT d,s from xogador where codx=codigo;

raise notice 'o salario e o nome do xogador de codigo % é %,%',codigo,s,d;

exception
when no_data_found then
raise notice 'xogador inexistente';

end;
$$
;
