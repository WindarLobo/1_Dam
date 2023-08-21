(:Lista titulo:)
for $x in doc("boletin36")//libro
return <eti>{$x/titulo/text()}</eti>