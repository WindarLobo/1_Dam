<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  <html>
   <head>
<meta charset ="UTF-8"/>
<link rel="stylesheet" type="text/css " href="tabla.css"/>
  </head>
 
  <body>  
  
   <h3>Blibioteca   A)</h3>
    <xsl:for-each select="//libro">
  <p>
  <b>Titulo:</b>
 <xsl:value-of select ="titulo"/><br/>
<b>Autor:</b>
 <xsl:value-of select ="autor"/>
 </p>
  </xsl:for-each> <br/>
  
   <h3>Blibioteca  B)</h3>
      <xsl:for-each select="//libro">
       <xsl:sort select ="titulo"/>
  <p>
  <b>Titulo:</b>
 <xsl:value-of select ="titulo"/><br/>
<b>Autor:</b>
 <xsl:value-of select ="autor"/>
 </p>
  </xsl:for-each><br/>
  
   <h3>Blibioteca  C)</h3>
      <xsl:for-each select="//libro[precio>30]">
    <p>
  <b>Titulo:</b>
 <xsl:value-of select ="titulo"/><br/>
 <b>Autor:</b>
 <xsl:value-of select ="autor"/><br/>
 <b>Precio:</b>
 <xsl:value-of select ="precio"/>
 </p>
  </xsl:for-each><br/>
  
    <h3>Blibioteca  D)</h3>
      <select>
 <xsl:for-each select="//libro">
<option><xsl:value-of select ="titulo"/> </option> 
  </xsl:for-each>
  </select>
  
    <h3>Mi Blibioteca E)</h3>
             <ol>
      <xsl:for-each select="//libro[@leng='español']">

        <li><b>Titulo:</b>
       <xsl:value-of select="titulo"/></li>
           <b>Autor:</b>
        <xsl:value-of select="autor"/><br/><br/>
      </xsl:for-each><br/>
    </ol>
    
    <h3>Blibioteca  F)</h3>
     <table>
   <tr id="Color2">
<td><b>Titulo</b></td> <td><b>Isbn</b></td>
   </tr>
   <xsl:for-each select="//libro">
   <tr>
  <td><xsl:value-of select ="titulo"/></td>
<td><xsl:value-of select ="isbn"/> </td>
</tr>
     </xsl:for-each>
   </table>
   
     <h3>Blibioteca  G)</h3>
   <table>
   <tr id="Color1" >
<td><b>Titulo</b></td><td><b>Autor</b></td>   <td><b>Isbn</b></td>   <td><b>Precio</b></td>   
   </tr>
   <xsl:for-each select="//libro">
   <tr>
  <td><xsl:value-of select ="titulo"/></td>
<td><xsl:value-of select ="autor"/> </td>
<td><xsl:value-of select ="isbn"/> </td>
<td><xsl:value-of select ="precio"/> </td>
</tr>
     </xsl:for-each>
   </table><br/>
   <b>El numero de libros es de  = </b><xsl:value-of select ="count(//libro)" />
   
    <h3>Blibioteca  H)</h3>
        <table >
        <xsl:for-each select="//libro">
          <xsl:choose>
            <xsl:when test="precio &gt;30">
                      <tr><td><xsl:value-of select="titulo"/></td> <td><xsl:value-of select ="autor"/></td> <td><xsl:value-of select="isbn"/></td> <td id="rojo"><xsl:value-of select ="precio"/></td></tr>
            </xsl:when>
            <xsl:otherwise>
            <tr ><td><xsl:value-of select="titulo"/></td> <td><xsl:value-of select ="autor"/></td> <td><xsl:value-of select="isbn"/></td> <td><xsl:value-of select ="precio"/></td></tr>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:for-each>
      </table>
      <p><strong>La media de los precios = </strong><xsl:value-of select="sum (//precio) div count(//libro)"/></p><br/><br/>
    </body>
  </html>

  </xsl:template>
</xsl:stylesheet>
