set datestyle = "ISO, DMY";
set datestyle to DMY, SQL;
show datestyle;
drop table if exists tipoContrato cascade ;
drop table if exists Empleado cascade ;

create table tipoContrato (
    IdtipoContrato  integer NOT NULL PRIMARY KEY ,
     Nombre varchar (50) NOT NULL   
  
	
);
create table Empleado(
   IdEmpleado SERIAL   not null PRIMARY KEY,
    Nombre varchar(50) NOT NULL,
    Apellidos varchar(50) NOT NULL,
    Dni varchar(50) NOT NULL,
    ClienteContratado INTEGER  NOT NULL,
	SalarioBase DECIMAL(10,2) NOT NULL,
	Fecha DATE NOT NULL,
	IdtipoContrato INTEGER  NOT NULL,
 FOREIGN KEY (IdtipoContrato)  REFERENCES tipoContrato (IdtipoContrato)
);

/*INSERTAR*/
INSERT INTO tipoContrato (IdtipoContrato, Nombre)
VALUES 
    (1, 'Permanente'),
    (2, 'Contratado');

INSERT INTO Empleado (Nombre,Apellidos,Dni,ClienteContratado ,SalarioBase,Fecha,IdtipoContrato)
values('Windar','Lobo Garces',22124628,10,1500,'10/03/2022',1);

/*MOSTRAR*/
select * from Empleado;

/*ACTUALIZAR*/
UPDATE tipoContrato
SET Nombre = 'Contrato Permanente'
WHERE IdtipoContrato = 1;

UPDATE Empleado
SET SalarioBase = 2500.00
WHERE IdEmpleado = 1;

/*ELIMINAR*/

DELETE FROM Empleado WHERE IdEmpleado = 2;