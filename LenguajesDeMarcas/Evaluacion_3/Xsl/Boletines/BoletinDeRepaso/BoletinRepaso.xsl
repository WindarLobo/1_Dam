<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  <html>
  <body>  
    <h3>Ejercicio 1 </h3>
     <h2 style="text-shadow: 1px 2px pink;">Creadores de los lenguaje :</h2>
     <p>
         <xsl:for-each select="//lenguaje">
  <u>creador:</u>
 <xsl:value-of select ="creador"/><br/>
  </xsl:for-each> <br/>
  </p>
  <h3>Ejercicio 2</h3>
     <h2 style="text-shadow: 1px 2px pink;">Tabla nombre  de los lenguaje :</h2>
   <table style ="border: 2px solid red; background-color: #85c1e9">
   <tr>
<td><b>Nombre</b></td> <td><b>Creador</b></td>
   </tr>
   <xsl:for-each select="//lenguaje">
   <tr>
  <td><xsl:value-of select ="nombre"/></td>
<td><xsl:value-of select ="creador"/> </td>
</tr>
     </xsl:for-each>
   </table>
   
    <h3>Ejercicio 3</h3>
     <h2 style="text-shadow: 1px 2px pink;">Tabla   lenguaje : posterior  1991</h2>
   <table style ="border: 2px solid red; background-color: #85c1e9">
   <tr>
<td><b>Nombre</b></td> <td><b>Creador</b></td>
   </tr>
   <xsl:for-each select="//lenguaje[fecha>1991]">
 <td><xsl:value-of select ="nombre"/></td>
<td><xsl:value-of select ="creador"/> </td>
     </xsl:for-each>
     </table>
    <p>El numero de lenguaje  posterior 1991 = <xsl:value-of select ="count(//lenguaje[fecha>1991])" /></p>
   
   <h3>Ejercicio 4</h3>
     <h2 style="text-shadow: 1px 2px pink;">Lista</h2>

<ol>
   <xsl:for-each select="//lenguaje">
   <li>
   <b>
   <xsl:value-of select ="nombre"/>
   </b>
<ul> 
<li>
<xsl:value-of select ="creador"/>
<xsl:value-of select ="fecha"/> 
</li></ul>
</li>
     </xsl:for-each>
</ol>
    
     <h3>Ejercicio 5</h3>
     <h2 style="text-shadow: 1px 2px pink;">Tabla   intepretado  o copilados</h2>
   <table style ="border: 2px solid blue; background-color: #bae985 ">
      <xsl:for-each select="//lenguaje[name(compilado)]">
   <tr>
<td style ="border: 2px solid  blue;">
<xsl:value-of select ="nombre"/>
</td>
<td style ="border: 2px solid  blue;">
<xsl:value-of select ="name(compilado)"/></td>
   </tr>
     </xsl:for-each>
          <xsl:for-each select="//lenguaje[name(interpretado)]">
   <tr>
<td style ="border: 2px solid  blue;">
<xsl:value-of select ="nombre"/>
</td>
<td style ="border: 2px solid  blue;">
<xsl:value-of select ="name(interpretado)"/>
</td>
   </tr>
     </xsl:for-each>
         </table>
      <p>El numero de lenguaje interpretado  = <xsl:value-of select ="count(//lenguaje[interpretado])" /></p>

  </body>
  </html>
  </xsl:template>
</xsl:stylesheet>
