--para hacer comentario
/*
para hacer otro comentario
*/

--fCompara: funcion que comparando dos numeros imprima se o primeiro numero e maior, menor ou igual que o segundo
/*
select fCompara(3,4)
	primero menor que el segundo
*/


CREATE or replace FUNCTION fCompara(n1 integer, n2 integer)
	RETURNS varchar
	LANGUAGE PLPGSQL
   AS
$$
DECLARE
x varchar;
BEGIN
  if n1=n2 then 
  	x='los nº son iguales';
  	else 
	  if n1>n2 then
	    x = n1 || '>' || n2;
  	    else
  	    --para usar los numeros y cadena de texto, hacer como en java pero cambiando el + por ||
  	      x = n1 || '<' || n2;
	  end if;
  end if;
 RETURN x;
END;
$$;

--funcion fequxog para contar el numero de jugadores que tiene

CREATE or replace FUNCTION fequxog(nombre varchar)
	RETURNS integer
	LANGUAGE PLPGSQL
   AS
$$
DECLARE
--variable declaration
e varchar;
BEGIN
 --logic
 select count(*) into e from xogador where codequ=nombre; 
 RETURN e;
END;
$$;

--funcion fMastresx que pasando codigo de equipo diga si tiene 3 jugadores, mas de 3 o menos de tres
CREATE or replace FUNCTION fMastresx(nome varchar)
	RETURNS varchar
	LANGUAGE PLPGSQL
   AS
$$
DECLARE
--variable declaration
e integer;
f varchar;
BEGIN
 --logic
 select count(*) into e from xogador where codequ=nome; 
 if e=3 then
   f = nome || ' ten 3 jugadores';
   else
     if e<3 then
       f = nome || ' ten menos de 3 jugadores';
     else
       f = nome || ' ten mas de 3 jugadores' ;
     end if;
 end if;
 
 RETURN f;
END;
$$;
/*igual co anterior pero engadindo excepción para cando non exista o nome do equipo
Dando el nombre del equipo si tiene mas de 3...
*/
CREATE or replace FUNCTION fMastresz(nome varchar)
	RETURNS varchar
	LANGUAGE PLPGSQL
   AS
$$
DECLARE
--variable declaration
e integer;
f varchar;
code varchar;
BEGIN
 --logic
/*esto sería mejor por que aqui si no existe el equipo mostrata que no existe, en vez de menos de 3 jugadores*/
/*
STRICT es para que vaya a la excepcion, por si no existe ese nombre de equipo
*/
 select codequ into STRICT code from equipo where nomequ=nome;
/* si no pones el strict y quieres que salga que no existe el equipo:
 if not found then
  f = nome || ' no existe';
  return f;
 end if;*/
 select count(*) into e from xogador where codequ=code;

/*esta 
 e = (select count(*) from xogador where codequ in(select codequ from equipo where nomequ='cuspedrinos')
);*/
 if e=3 then
   f = nome || ' ten 3 jugadores';
   else
     if e=0 then
       f = nome || ' ten 0 jugadores';
       else
         if e<3 then
           f = nome || ' ten menos de 3 jugadores';
         else
           f = nome || ' ten mas de 3 jugadores' ;
         end if;
     end if;
 end if;
/*
if e=3 then
   f = nome || ' ten 3 jugadores';
elseif e=0 then
   f = nome || ' ten 0 jugadores';
elseif e>3 then
   f = nome || ' ten mas de 3 jugadores';
else
   f = nome || ' ten menos de 3 jugadores';
end if;
*/
 
 RETURN f;
 
exception
  when no_data_found then
 f = nome || ' no existe';
 return f;

END;
$$;





CREATE or replace FUNCTION fsalxog(minimo integer, maximo integer)
	RETURNS integer  
	LANGUAGE PLPGSQL
    AS
$$  
DECLARE
 --variable declaration
d integer;
BEGIN
 --logic
 select count(*) into d from xogador where salario>=minimo and salario<=maximo;

 
 RETURN d;
END;
$$;
 --funcion fsalairoxogador que devolte o salario dun xogador pasandolle o codigo. Se non existe que imprima 'codogo non corresponde a ningun xogador'
 CREATE or replace FUNCTION fsalxog(codigo varchar)
	RETURNS varchar  
	LANGUAGE PLPGSQL
    AS
$$  
DECLARE
 --variable declaration
d varchar;
BEGIN
 --logic
 select salario into STRICT d from xogador where codx = codigo;
 
 RETURN d;
 exception 
  when no_data_found then
  d = codigo || ' ese codigo non corresponde a ningun xogador';
  RETURN d;
END;
$$;

--psalarioxogador, procedemento que imprima o salario dun xogador se sabemos o seu codigo

CREATE or replace procedure p1_salarioxogador(codigo varchar)
	LANGUAGE PLPGSQL
	AS
$$
DECLARE
  s integer;
BEGIN
  select salario into STRICT s from xogador where codx=codigo;
  raise notice 'o salario do xogador de codigo % é de %',codigo,s;

exception
  when no_data_found then
  raise notice 'xogador inexistente';
END;
$$;
--call p2_nomesalarioxogador
--procedimiento que imprima o nome e o salario dun xogador se samebos o seu codigo
CREATE or replace procedure p2_nomesalarioxogador(codigo varchar)
	LANGUAGE PLPGSQL
	AS
$$
DECLARE
  n varchar;
  s integer;
BEGIN/*
  select salario into STRICT s from xogador where codx=codigo;
  select nomx into STRICT n from xogador where codx=codigo;*/
  select nomx,salario into STRICT n,s from xogador where codx=codigo;
  raise notice 'o salario de % de codigo % é de %',n,codigo,s;

exception
  when no_data_found then
  raise notice 'xogador inexistente';
END;
$$

  


