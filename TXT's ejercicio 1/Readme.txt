===============================================================
            INSTALACIÓN DEL AMBIENTE DE PRUEBAS
===============================================================

Este archivo README proporciona instrucciones detalladas para configurar el ambiente de pruebas automatizadas utilizando  IntelliJ IDEA 2024.1.1 (Community Edition).

1. Requisitos del sistema:
   - Sistema operativo: Windows 10, macOS 10.14 o superior, Ubuntu 20.04 LTS o distribuciones similares.
   - Memoria RAM: 4 GB o más.
   - Espacio en disco: 2 GB de espacio libre.
   - Java Development Kit (JDK) 22

2. Enlaces de descarga:
   - IntelliJ IDEA 2024.1.1 (Community Edition): (https://www.jetbrains.com/idea/download/)
   - JDK  https://www.oracle.com/java/technologies/downloads/#jdk22-windows
   - Maven 3.9.6 se encuentra en el repositorio de git
   - Proyecto Opencart (Norma Caiza - Ejercicio 1): https://github.com/ncaiza2010/opencart

3. Instrucciones de instalación:
   - Descargar IntelliJ IDEA 2024.1.1 (Community Edition) desde el enlace proporcionado.
   - Copiar el archivo  Maven 3.9.6 que se encuentra en el proyecto Git a la unidad C.
   - Instalar IntelliJ IDEA siguiendo las instrucciones del instalador.
   - Descargar el proyecto Opencart.

4. Configuración del entorno:
	- Abrir IntelliJ IDEA, arrastrar la carpeta del proyecto Opencart a la pantalla principal.
	- Configurar en el archivo testopencart.java en la linea 22, la  ruta donde se encuentra el chromedriver: 	
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	- Ejecutar el proyecto (Ctrl + Shift + F10)
	- Visualización de resultados.

5 Referencias:
   - [Documentación de IntelliJ IDEA](https://www.jetbrains.com/help/idea/)

¡Listo! Con estas instrucciones se puede ejecutar el proyecto.