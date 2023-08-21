(:Devuelve dos valores:)
for $x in doc("boletin36")//libro
return <titulo-autor> {$x/titulo/text()," ", $x/autor/text()} </titulo-autor>