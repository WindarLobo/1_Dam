


25)amosar nome e marca de todos os productos cun prezo maior de 4

chourizo   pozo
xamon	   pozo
chourizo   argal
xamon	   argal
mortadela  argal
sardinha   argal
polvo	   argal
berberecho argal

26)amosar cantos pedidos estan cargados na furgoneta  1 polo repartidor que ten por clave z1,2
 select count(*) from carga where nf='1'and codz = 'z1'and n = 2
	5

27)amosara o nif e nome dos clientes que fixeron pedidos entre o '7/7/2020' e o '13/7/2020'  ambalas duas datas excluidas 
select distinct cliente.nif,nome from pedido,cliente  where cliente.nif = pedido.nif and  data>'07/07/2020' and data<'13/07/2020';


361a	  ana
364d	  borja
362b	  pedro
363c	  carlos
368h	  carlos
366f	  eva
367g	  luis

