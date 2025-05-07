## Generador credenciales para evento
### Integrantes
-Jordan Murillo - patrones de diseño
---
## Objetivo
El objetivo de este proyecto es crear un programa para la generacion de credenciales para un evento en java donde se ejerciten los patrones de diseño singleton y prototype el programa debe de poder crear credenciales con nombre, apellido, rut y cargo esta clase debe de implementar la interfas de Cloneable para poder clonar una instancia y crear objetos de forma rapida la clase de ConfiguracionGlobal debe implementar el patron singleton con su metodo para obtener una instancia 
## Clonar y ejecutar el repositorio
```bash
git clone https://github.com/Jordan27CM/SistemaCredenciales
cd sistemacredenciales/src/sistemacredenciales
```
ejecucuion
```bash
 java -cp . Main.java
```

## Patron Prototype
la clase credencial implementa Prototype y se usa en la Main
```java
Credencial credencial = credencialBase.clone();
System.out.println("Agrege el nombre :");
String nombre = input.nextLine();
```
## Patron Singleton
el patron singleton se utiliza en dos clases la configuracion global del evento y en el inventario que contiene una lista donde se almacenan las credenciales
```java
Inventario inventario = Inventario.getInstancia();
ConfiguracionGloba configuracionGloba = ConfiguracionGloba.getInstancia();
```
## Menu de consola
```
System.out.println(""
                + "+---------------------------+\n"
                + "|            MENU           |\n"
                + "+---------------------------+\n"
                + "| 1 | Agregar Credencial    |\n"
                + "| 2 | Ver Credenciales      |\n"
                + "| 0 | Salir                 |\n"
                + "+---------------------------+");
```
## Diagrama UML
![image](https://github.com/user-attachments/assets/09da5c29-ad8f-4e5f-be8a-d56edec84af6)

## Ejecucion
![image](https://github.com/user-attachments/assets/ca077ffe-eb94-4343-bed8-a4e664df1aca)

pantalla inicial con el menu de bienvenida

![image](https://github.com/user-attachments/assets/4aa3879f-e451-4504-b6bc-56c29a918d26)


ingreseo de datos para la creacion de un credenciales

![image](https://github.com/user-attachments/assets/3ca697f4-a71e-4b8a-bbd6-00473ac80be4)


imprime las credenciales ya creadas sacadas de la lista de Inventario

![image](https://github.com/user-attachments/assets/cc442891-e8e6-43d4-81b5-d0e525088593)

salidad del sistema
