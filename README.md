# Gestión de Memoria con Particiones Fijas

Este proyecto simula la gestión de memoria en un sistema operativo utilizando el algoritmo **First In, First Out (FIFO)** aplicado a particiones fijas. Es parte de una actividad académica para la materia de Sistemas Operativos.

## Descripción
El programa permite:
- Definir particiones de memoria de tamaño fijo.
- Asignar procesos a particiones disponibles utilizando el algoritmo FIFO.
- Mostrar los resultados de la asignación, incluyendo fragmentación interna y procesos no asignados.

## Requisitos
- **Java Development Kit (JDK)** 8 o superior.

## Estructura del Proyecto
El proyecto está organizado en los siguientes paquetes y clases:

### Paquete: `main`
- **`Main`**: Clase principal que coordina la ejecución del programa.

### Paquete: `models`
- **`Partition`**: Representa las particiones fijas de memoria.
- **`Process`**: Representa los procesos que solicitan memoria.

### Paquete: `services`
- **`MemoryManager`**: Implementa la lógica de asignación de procesos a particiones.
- **`OutputManager`**: Maneja la entrada y salida de datos, validando las entradas del usuario.

## Ejecución
### Paso 1: Clonar el repositorio
Clona este repositorio en tu máquina local usando el siguiente comando:
```bash
git clone https://github.com/tu_usuario/nombre_repositorio.git
```
Esto descargará todos los archivos necesarios para el programa.

### Paso 2: Importar el proyecto
Abre un entorno de desarrollo como **Eclipse** o **IntelliJ IDEA** y selecciona la opción para importar un proyecto existente desde el sistema de archivos. Asegúrate de configurar el entorno para usar una versión de JDK 8 o superior.

### Paso 3: Ejecutar la clase principal
Localiza la clase `Main` en el paquete `main` y ejecútala directamente desde el entorno de desarrollo. Esto iniciará el programa y te permitirá interactuar con él desde la consola integrada.

## Funcionalidades
1. **Ingreso de particiones**:
   - El usuario ingresa el número y tamaños de las particiones fijas.
   - Se valida que las entradas sean números enteros positivos.

2. **Ingreso de procesos**:
   - El usuario ingresa el número y tamaños de los procesos.
   - Se valida que las entradas sean números enteros positivos.

3. **Asignación de procesos**:
   - Cada proceso se asigna a la primera partición disponible que tenga espacio suficiente.
   - Si un proceso no puede ser asignado, queda marcado como "No asignado".

4. **Resultados**:
   - El programa muestra:
     - Procesos asignados a cada partición.
     - Fragmentación interna de las particiones asignadas.
     - Procesos no asignados.

## Ejemplo de Ejecución
### Entrada:
- Particiones: 50, 100, 200
- Procesos: 45, 70, 150, 250

### Salida:
```
Procesos asignados:
Proceso 1 (Tamaño: 45) -> Partición 1
Proceso 2 (Tamaño: 70) -> Partición 2
Proceso 3 (Tamaño: 150) -> Partición 3
Proceso 4 (Tamaño: 250) -> No asignado

Fragmentación interna:
Partición 1: 5 unidades no utilizadas
Partición 2: 30 unidades no utilizadas
Partición 3: 50 unidades no utilizadas
```

## Notas
- Asegúrate de ingresar valores positivos para particiones y procesos.
- Si un proceso excede el tamaño de todas las particiones, quedará "No asignado".

## Autor
David Beltrán

