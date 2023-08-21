for $x in //alumno
return if($x/nota>=5)
then <dni-apro>{data($x/@dni)} </dni-apro>
else <nombre-sus>{data($x/nombre)}</nombre-sus>