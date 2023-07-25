CREATE SCHEMA fastnews;
/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_prueba'@'%' identified by 'Usuar1o_Clave.';

/*Se asignan los prvilegios sobr ela base de datos fastnews al usuario creado */
grant all privileges on fastnews.* to 'usuario_prueba'@'%';
flush privileges;
USE fastnews;


CREATE TABLE fastnews.usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  password varchar(512) NOT NULL,
  nombre VARCHAR(20) NOT NULL,
  apellidos VARCHAR(30) NOT NULL,
  correo VARCHAR(25) NULL,
  telefono VARCHAR(15) NULL,
  ruta_imagen varchar(1024),
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

CREATE TABLE fastnews.feedback (
id_feedback INT NOT NULL auto_increment PRIMARY KEY,
detalle_feedback VARCHAR(800) NOT NULL,
nombre varchar(15),
id_usuario INT NOT NULL,
foreign key fk_feedback_usuario (id_usuario) references fastnews.usuario(id_usuario)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table fastnews.sucesos (

  id_sucesos INT NOT NULL AUTO_INCREMENT,
  nombre varchar(20) not null,
  categoria varchar(20) NOT NULL,
  descripcion VARCHAR(1024) NOT NULL,
  ruta_imagen varchar(1024),

  PRIMARY KEY (id_sucesos))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table fastnews.deportes (

  id_deportes INT NOT NULL AUTO_INCREMENT,
  nombre varchar(20) not null,
  categoria varchar(20) NOT NULL,
  descripcion VARCHAR(1024) NOT NULL,
  ruta_imagen varchar(1024),
  PRIMARY KEY (id_deportes)
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

CREATE table fastnews.contactenos(
id_contactenos INT NOT NULL AUTO_INCREMENT primary key,
nombre varchar(20) not null,
apellido varchar(30) not null,
correo VARCHAR(40) NOT NULL,
tema_consulta varchar(800) NOT NULL
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table fastnews.entretenimiento (

  id_entretenimiento INT NOT NULL AUTO_INCREMENT,
  nombre varchar(20) not null,
  categoria varchar (30) not null,
  descripcion VARCHAR(1024) NOT NULL,
  ruta_imagen varchar(1024),
    ruta_imagen2 varchar(1024),

  PRIMARY KEY (id_entretenimiento))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table fastnews.tecnologia (

  id_tecnologia INT NOT NULL AUTO_INCREMENT,
  nombre varchar(20) not null,
  categoria varchar (30) not null,
  descripcion VARCHAR(1024) NOT NULL,
  ruta_imagen varchar(1024),
    ruta_imagen2 varchar(1024),

  PRIMARY KEY (id_tecnologia))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table fastnews.economia (

  id_economia INT NOT NULL AUTO_INCREMENT,
  nombre varchar(20) not null,
  categoria varchar (30) not null,
  descripcion VARCHAR(1024) NOT NULL,
  ruta_imagen varchar(1024),
  ruta_imagen2 varchar(1024),

  PRIMARY KEY (id_economia))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

