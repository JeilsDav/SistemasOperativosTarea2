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
### 1. Compilar el proyecto
Navega al directorio raíz del proyecto y ejecuta:
```bash
javac -d bin src/main/Main.java
```
Esto compilará todos los archivos del proyecto en el directorio `bin`.

### 2. Ejecutar el programa
Desde el directorio raíz, ejecuta:
```bash
java -cp bin main.Main
```

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

