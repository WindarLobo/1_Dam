(:Where:)
for $x in //libro
where $x/precio <30 and $x/autor='Moliere'
return <titulos>{data($x/titulo)}</titulos>