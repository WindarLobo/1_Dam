(:Order:)
for $x in //libro
order by $x/titulo
(:order by $x/precio :)(:descending es para ordenar los q estan de ultimo al principio:)
return $x/titulo