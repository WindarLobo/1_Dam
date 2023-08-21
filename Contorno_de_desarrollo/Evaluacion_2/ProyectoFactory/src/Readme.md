````mermaid
classDiagram

      ITransporte <|.. Bicicleta: implements
            ITransporte <|.. Camion : implements
      class ITransporte{
     + Float costoTotal(Integer cp) 
    +Integer tipoEmbalaje (Integer cp,Float dimencionX,Float dimencionY, dimen-cionZ,Float peso)
    }
      <<Interface>>ITransporte
      App "1" *--> "1..*" factorySencilla : association
           class App{
        +objecto transporte :ITransporte()
        +main()
      }
      class factorySencilla
       factorySencilla:  +ITransporte getProducto(TipoTransporte type)
         
      factorySencilla "1"*-->"1..*" ITransporte : association
      class Bicicleta{
      +Float costoTotal(Integer cp)
     + Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso)}
      
      
      class Camion{
     + Float costoTotal(Integer cp) 
     + Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso)} 
  
  
      

````
