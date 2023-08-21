(:if libros español:)
for $x in //libro
return if($x/@leng="español")
then <español>{data($x/titulo)} </español>
else()