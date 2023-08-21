<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  <html>
  <head>
<meta charset ="UTF-8"/>
<link rel="stylesheet" type="text/css " href="tabla.css"/>
  </head>
  <body>
  
  
  <h1>Ejemplo 1</h1>
  <xsl:for-each select="//pelicula">
  <p><b>Titulo:</b>
   <xsl:value-of select ="titulo"/> </p>
   </xsl:for-each>
  
   <h1>Ejemplo 2 ordenar por titulo </h1>
   <xsl:for-each select="//pelicula">
   <xsl:sort select="titulo"/>
  <p><b>Titulo:</b>
   <xsl:value-of select ="titulo"/> </p>
   </xsl:for-each>
  
   <h1>Ejemplo 3 ordenar por actor </h1>
   <xsl:for-each select="//pelicula">
   <xsl:sort select="actor[1]"/>
  <p><b>Titulo:</b>
   <xsl:value-of select ="titulo"/> </p>
   </xsl:for-each>
  
     <h1>Ejemplo 4 descendente  por actor </h1>
   <xsl:for-each select="//pelicula">
   <xsl:sort select="actor" order="descending"/>
  <p><b>Titulo:</b>
   <xsl:value-of select ="titulo"/> </p>
   </xsl:for-each>
  
    <h1>Ejemplo 5   Filtrar la salida  </h1>
   <xsl:for-each select="//pelicula[director='Fernando León']">
   <p><b>Titulo:</b>
<xsl:value-of select ="titulo"/></p>
<p><b>Actor:</b>
   <xsl:value-of select ="actor"/> </p>
   </xsl:for-each>
  
  <h1>Ejemplo 6  Condicion  </h1>
   <xsl:for-each select="//pelicula">
   <xsl:if  test ="director !='Fernando León'">
  <p><b>Titulo:</b>
<xsl:value-of select ="titulo"/></p>
    </xsl:if>
  </xsl:for-each>
  
   <h1>Ejemplo 7  choose  </h1>
   <xsl:for-each select="//pelicula">
   <xsl:choose>
   <xsl:when test="titulo='Los lunes al sol'">
<p>L</p>   
   </xsl:when>
    <xsl:when test="titulo='Ilegal'">
<p>I</p>   
   </xsl:when>
   <xsl:otherwise>
<p>Otro</p>   
   </xsl:otherwise>
</xsl:choose>
  </xsl:for-each>
  
    
  <h1>Ejemplo 8 Lista </h1>
 
  <p><b>Listado  pelicula</b></p>
     
   <ol >
   <xsl:for-each select="//pelicula">
   <li>
   <xsl:value-of select ="titulo"/></li>
     </xsl:for-each>
   </ol> 
   
   <h1>Ejemplo 9 tabla </h1>
  <p><b>Tabla  </b></p>
   <table bgcolor="#ccccff">
   <tr>
<td><b>Pelicula</b></td><td><b>Director</b></td>   
   </tr>
   <xsl:for-each select="//pelicula">
   <tr>
  <td><xsl:value-of select ="titulo"/></td>
<td><xsl:value-of select ="director"/> </td>
</tr>
     </xsl:for-each>
   </table>
   </body>
  
  </html>
  
  </xsl:template>
</xsl:stylesheet>
