(:Con for y lef:)
for $x at $i in//libro
return <libro>{data($x/titulo)}</libro>
(:let $x := //libro
return <libro>{data($x/titulo)}</libro>:)