(:Ejemplo sin etiqueta:)
for $x in doc("boletin36")//libro
return $x/titulo/text()
