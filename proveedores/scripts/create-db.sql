CREATE TABLE provincias (
id INT PRIMARY KEY AUTO_INCREMENT,
codigoprovincia VARCHAR (2) NOT NULL,
nombre VARCHAR (100) NOT NULL,
CONSTRAINT UNIQUE INDEX provincias_codigoprovincia_idx (codigoprovincia)
);

CREATE TABLE localidades (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
provincia_id INT NOT NULL,
CONSTRAINT UNIQUE INDEX localidades_nombre_idx (nombre),
FOREIGN KEY (provincia_id) REFERENCES provincias(id)
);

CREATE TABLE proveedores (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
domicilio VARCHAR (100),
cuitcuil VARCHAR (100),
localidad_id INT NOT NULL,
CONSTRAINT UNIQUE INDEX proveedores_nombre_idx (nombre),
FOREIGN KEY (localidad_id) REFERENCES localidades(id)
);
