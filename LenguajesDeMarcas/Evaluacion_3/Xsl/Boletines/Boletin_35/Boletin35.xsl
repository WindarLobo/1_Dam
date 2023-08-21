<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
  <meta charset ="UTF-8"/>
  <body>  
  <h1>Ejercicios 1</h1>
 <h3>XML</h3>
 <xsl:for-each select="horario/dia">
 <p>
 El numero de dia:
 <xsl:value-of select ="numdia"></xsl:value-of>
  </p>
      </xsl:for-each>
      
      
      <h1>Ejercicio 2</h1>
      <b>Tarea apartir del miercoles:</b>
      <br/>
      <xsl:for-each select="horario/dia[numdia &gt;2]">
       <xsl:for-each select="tarea">
          <xsl:value-of select ="nombre"/>
                <br/>
          </xsl:for-each>
              </xsl:for-each>
              
          <h1>Ejercicio 3</h1>
             <xsl:for-each select="horario/dia">
    <p>
    <b>Dia:</b>
        <xsl:value-of select ="numdia"/>
        <br/>
<b>Tarea:     </b>
            <xsl:for-each select="tarea">
          <xsl:value-of select ="nombre"/>
           <br/>
<b>Prioridad:</b>
              <xsl:value-of select="@prioridad"/>
              <br/>
<b>Inicio:</b>
            <xsl:value-of select="hora-ini"/>
            <b>Fin:</b>
             <xsl:value-of select="hora-fin"/>
                <br/>   
              
                        </xsl:for-each>
                      </p>
                </xsl:for-each>
                
                <h1>Ejercicio 4</h1>
             <xsl:for-each select="horario/dia" >
               <xsl:sort select="numdia"/>
    <p>
    <b>Dia:</b>
        <xsl:value-of select ="numdia"/>
        <br/>
<b>Tarea:     </b>
            <xsl:for-each select="tarea">
          <xsl:value-of select ="nombre"/>
           <br/>
<b>Prioridad:</b>
              <xsl:value-of select="@prioridad"/>
              <br/>
<b>Inicio:</b>
            <xsl:value-of select="hora-ini"/>
            <b>Fin:</b>
             <xsl:value-of select="hora-fin"/>
                <br/>   
              
                        </xsl:for-each>
                      </p>
                </xsl:for-each>
           
         <h1>Ejercicio 5</h1>
         
       <xsl:for-each select="horario/dia" >
               <xsl:sort select="numdia"/>
    <p>
    <b>Dia:</b>
        <xsl:value-of select ="numdia"/>
        <br/>
<b>Tarea:     </b>
            <xsl:for-each select="tarea">
          <xsl:value-of select ="nombre"/>
           <br/>
<xsl:if  test ="@prioridad">
<b>Prioridad:</b>
     <xsl:value-of select="@prioridad"/>
     <br/>
    </xsl:if>
         <b>Inicio:</b>
            <xsl:value-of select="hora-ini"/>
            <b>Fin:</b>
             <xsl:value-of select="hora-fin"/>
                <br/>   
              
                        </xsl:for-each>
                      </p>
                </xsl:for-each>
                
                 <h1>Ejercicio 6</h1>
                  <xsl:for-each select="//dia">
                <xsl:sort select="numdia"/>
    <p>
    <b>Dia:</b>
      
        <xsl:value-of select ="numdia"/>
        <br/>
                  <xsl:for-each select="tarea">
                  <b>Tarea:     </b>
              <xsl:value-of select="nombre"/>
                    <br/>   
                    
                     <b>Inicio:</b>
            <xsl:value-of select="hora-ini"/>
            <b>Fin:</b>
             <xsl:value-of select="hora-fin"/>
                <br/>   

                <xsl:choose>
                <xsl:when test="hora-fin =14">Mediodía</xsl:when>
                  <xsl:when test="hora-fin &lt; 12">Mañana</xsl:when>

                  <xsl:otherwise>tarde</xsl:otherwise>
                </xsl:choose>

          </xsl:for-each>
                           </p>
              </xsl:for-each>
                     
                     
      </body>  
  </html>
  </xsl:template>
</xsl:stylesheet>
