/* 
1) amosar datos de clientes
select * from cliente;


2) amosar nif e email de cliente ordeados por email
select nif, email from cliente order by email;

3) amosar nome e direcion de clientes da xona 'z1'
select nif,nome,telefono from cliente  where codz='z1';

4) amosar nif, nome e telefono dos clientes da zona 'z1' ou que vivan na rua 'r/coruxo'
select nif,nome,telefono from cliente  where codz='z1' or direcion = 'r/coruxo';

5) amosar numero total de clientes 
select count(cliente) from cliente ;

6) amosar nmero total de clientes que non te–an zona asignada
select count(cliente) from cliente where codz is  null;
 count 


7) amosar numero total de clientes que  te–an zona asignada
select count(cliente) from cliente where codz is  not null;



-- -- consultas que utilizen funcions bassicas integradas no SXBD
8) amosar suma de totais de pedidos

select sum (total)from pedido;

9) amosar a media dos totais de todos os pedidos
select  avg(total)from pedido;
select sum (total)/count(*)from pedido;

10) amosar suma dos totais dos pedidos do cliente de codigo de nif '361a';

Select  sum(total) from pedido where nif='361a';

11) amosar media dos totais dos pedidos do cliente cuxo  nif e  '361a';
select  avg(total) from pedido where  nif='361a';

12) amosar a suma dos totais dos pedidos 'p1' e 'p3'
elect sum(total) from pedido  where codp ='p1'  or codp= 'p3';

13) amosar a suma dos totais dos pedidos 'p1' e 'p15'
select sum(total) from pedido  where codp ='p1'  or codp= 'p15';

14) amosar nomes de clientes que teÃ±an conta en gmail
select nome from cliente where email like '%@gmail.com%';


15) amosar nif e nome de clientes que teñan unha letra 'a' como segunda letra do seu nome

select nif,nome from cliente where nome like  '_a%';

16) amosar codigo e nome de productos cuxo prezo supere os 3 euros
select codm, n,nome from produto where prezo > '3';

-- -- consultas sobre mais dunha taboa mediante combinacions internas

21) amosar nif e nome de clientes da zona 'centro'
select nif,nome from cliente where codz IN (select codz from zona  where nomz='centro');

22) amosar nif e nome de clientes da zona centro con correo de hotmail
select nif,nome from cliente where codz IN (select codz from zona  where nomz='centro')and email like '%@hotmail.com%';


23) amosar codigos de pedidos do cliente de email 'anax@hotmail.com'
select codp from pedido where nif in( select nif from cliente where email like 'anax@hotmail.com'); 


24) amosar nomes dos productos da marca 'argal'
select nome from produto where codm in(select codm from  marca where nomm = 'argal');



-- -- consultas sobre mais dunha taboa mediante combinacions externas

    amosar  nif e nome de cliente e nome da zona onde viven:
select nif,nome,nomz from cliente,zona where cliente.codz=zona.codz;

persona q no tiene zona tenga o no tenga zona asignada 
select nif,nome,nomz from cliente left join zona on cliente.codz=zona.codz; 

justo hace lo contrario da prioridad a zona
select nif,nome,nomz from cliente right join zona on cliente.codz=zona.codz;

muestra todos los q tiene zona y lo q no tiene cliente

select nif,nome,nomz from cliente 
full join zona on cliente.codz=zona.codz;

mostrar nomes de los fiambre de marcas 'argal'
select nome from produto where codm in (select codm from  marca where nomm = 'argal') and (codm,n) in (select codm,n from fiambres);

mostrar cuanto pedido cargan  z1 y el numero 2; 
select * from carga where nf='1'and codz = 'z1'and n = 2;
 select count(*) from carga where nf='1'and codz = 'z1'and n = 2;
 amor o nif y nome dos cliente que hicieron pedidos 7/7/2020 y 13/7/2020 ambas  fechas
 
 amosar fechas de pedido con fecha 07/07/2020 y 13/07/2020
 select * from pedido where data>'07/07/2020' and data<'13/07/2020';
 select cliente.nif,nome from pedido,cliente  where cliente.nif = pedido.nif and  data>'07/07/2020' and data<'13/07/2020';
 elimina la repiticiones
 select distinct cliente.nif,nome from pedido,cliente  where cliente.nif = pedido.nif and  data>'07/07/2020' and data<'13/07/2020';



