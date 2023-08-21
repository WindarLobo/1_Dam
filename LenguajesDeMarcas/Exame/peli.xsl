<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  
   <html>
  <body>  

     <h2 style="text-shadow: 1px 2px pink;"> 1 ) Lista no ordenada</h2>

   <xsl:for-each select="//pelicula">
<ul> 
<li>
<strong>Titulo: </strong><xsl:value-of select =" titulo"/> <strong> Director:</strong> <xsl:value-of select =" director"/><br/>
</li></ul>
     </xsl:for-each><br/>
     

 
    <h2 style="text-shadow: 1px 2px pink;"> 2 ) Lista ordenada por año</h2>
     <xsl:for-each select="//pelicula">
      <xsl:sort select="año"/>
      <p>
        <strong>Titulo: </strong> <xsl:value-of select="titulo"/><br/>
        <strong>Año: </strong><xsl:value-of select="año"/>
      </p>
      </xsl:for-each>
      
 
          <h2 style="text-shadow: 1px 2px pink;">3) Tabla con todos los datos</h2>
         <table  border='1 ;'>
          <th>Titulo</th><th>Director</th><th>año</th><th>Telematica</th>
        <xsl:for-each select="//pelicula">
          <tr >
      <td ><xsl:value-of select="titulo"/></td>
            <td  ><xsl:value-of select="director"/></td>
                  <td  ><xsl:value-of select="año"/></td>
                      <td ><xsl:value-of select="@tematicas"/></td>
          </tr>
        </xsl:for-each>
      </table>
      <br></br>
      
      

          <h2 style="text-shadow: 1px 2px pink;"> 4) Peliculas de ficcion:</h2>
<xsl:for-each select="//pelicula">
  <strong>Titulo: </strong>
 
  <xsl:choose>
    <xsl:when test="@tematicas = 'Ficcion'">
      <span style="color: red"><xsl:value-of select="titulo"/></span><br/>
       <strong>Tematicas: </strong>
       <span style="color: red"><xsl:value-of select="@tematicas "/></span>
    </xsl:when>
    <xsl:otherwise>
           <span style="color: blue"><xsl:value-of select="titulo"/></span><br/>
           <strong>Tematicas: </strong>
       <span style="color: blue"><xsl:value-of select="@tematicas "/></span>
    </xsl:otherwise>
  </xsl:choose>
  <br/>
</xsl:for-each>

  </body>
    </html>
  
  </xsl:template>
</xsl:stylesheet>
