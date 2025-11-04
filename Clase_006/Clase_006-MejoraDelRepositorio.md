
````markdown
# Clase 006 - Taller: Aplicando Principios de Código Limpio en Proyectos Reales  

**Repositorio analizado:** [cesaralvrz/recursos-programación](https://github.com/Acadeller/recursos-programacion)  
**Lenguaje:** SQL  
**Estudiantes:** Erick Alpusig - Claudio Peñaherrera - Saúl Tualombo  
**Fecha:** 4 de noviembre de 2025  

---

## 1️⃣ Introducción  

Este taller tiene como objetivo aplicar los **principios de Código Limpio** a un documento SQL extenso que recopila múltiples sentencias provenientes de la referencia rápida de W3Schools.  
El análisis busca identificar problemas de estructura, formato, claridad y repetición, así como proponer **mejoras** que favorezcan la **legibilidad, mantenibilidad y comprensión didáctica** del contenido.  

---

## 2️⃣ Archivo seleccionado  

| Archivo | Ruta en el repositorio | Descripción |
|----------|------------------------|--------------|
| `SQL_Quick_Reference.sql` | `/src/sql/` | Documento que reúne las principales sentencias SQL con su sintaxis general. |

---

## 3️⃣ Análisis del archivo: `SQL_Quick_Reference.sql`  

### Código original (fragmento representativo)
```sql
AND / OR	SELECT column_name(s)
FROM table_name
WHERE condition
AND|OR condition

ALTER TABLE	ALTER TABLE table_name
ADD column_name datatype
or
ALTER TABLE table_name
DROP COLUMN column_name

DELETE	DELETE FROM table_name
WHERE some_column=some_value
or
DELETE FROM table_name
(Note: Deletes the entire table!!)
````

---

### 🔹 Observaciones según principios de Código Limpio

| Principio                      | Observación                                                                                                                    |
| ------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| **Nombres significativos**     | Las sentencias SQL son correctas, pero los ejemplos carecen de nombres descriptivos en tablas o columnas.                      |
| **Estructura clara**           | El archivo mezcla más de 30 comandos sin organización ni separación por categorías (DDL, DML, DCL, TCL).                       |
| **Comentarios útiles**         | No hay comentarios explicativos sobre el propósito o efecto de cada sentencia.                                                 |
| **Evitar duplicación**         | Varias instrucciones (`DELETE`, `ALTER TABLE`, `CREATE INDEX`) se repiten con mínimas variaciones.                             |
| **Consistencia de formato**    | El uso de mayúsculas, saltos de línea y espaciado es irregular, dificultando la lectura.                                       |
| **Legibilidad y presentación** | Al estar en formato de tabla plana sin encabezados o contextos, no resulta claro cuál es el objetivo educativo de cada bloque. |

---

### 🔹 Olores de código detectados

* **Duplicación** de ejemplos y sintaxis redundante.
* **Ausencia de estructura jerárquica** (mezcla de DDL, DML, DCL).
* **Falta de comentarios explicativos.**
* **Formato inconsistente** (uso errático de mayúsculas, espacios y saltos).
* **Ausencia de contexto práctico** (tablas o datos ficticios que faciliten comprensión).

---

### 🔹 Propuestas de mejora

| Nº | Mejora                               | Descripción                                              | Justificación                                        |
| -- | ------------------------------------ | -------------------------------------------------------- | ---------------------------------------------------- |
| 1  | **Organizar por categorías SQL**     | Dividir en secciones DDL, DML, DCL, TCL y Funciones.     | Facilita el estudio y comprensión.                   |
| 2  | **Estandarizar formato SQL**         | Mantener comandos en mayúsculas y nombres en minúsculas. | Aumenta la legibilidad y profesionalismo.            |
| 3  | **Eliminar redundancias**            | Consolidar ejemplos repetidos con notas aclaratorias.    | Reduce confusión y mejora la limpieza del documento. |
| 4  | **Agregar ejemplos reales**          | Usar tablas como `empleados`, `productos`, `clientes`.   | Facilita la comprensión práctica.                    |
| 5  | **Agregar comentarios explicativos** | Breves descripciones del objetivo de cada comando.       | Mejora la utilidad pedagógica.                       |

---

### 🔹 Versión refactorizada propuesta

```sql
-- ============================================================
-- SECCIÓN DDL (Data Definition Language)
-- ============================================================

-- Crear una nueva base de datos
CREATE DATABASE tienda;

-- Crear tabla de empleados
CREATE TABLE empleados (
  id INT PRIMARY KEY,
  nombre VARCHAR(100),
  cargo VARCHAR(50),
  salario DECIMAL(10,2)
);

-- Modificar tabla (añadir columna)
ALTER TABLE empleados
ADD COLUMN fecha_ingreso DATE;

-- Eliminar columna
ALTER TABLE empleados
DROP COLUMN fecha_ingreso;

-- Eliminar tabla
DROP TABLE empleados;

-- ============================================================
-- SECCIÓN DML (Data Manipulation Language)
-- ============================================================

-- Insertar un registro
INSERT INTO empleados (id, nombre, cargo, salario)
VALUES (1, 'Ana Torres', 'Analista', 1800.00);

-- Consultar datos
SELECT nombre, cargo, salario
FROM empleados
WHERE salario > 1500
ORDER BY salario DESC;

-- Actualizar registros
UPDATE empleados
SET salario = salario * 1.10
WHERE cargo = 'Analista';

-- Eliminar un registro
DELETE FROM empleados
WHERE id = 1;

-- Truncar tabla (eliminar todos los registros)
TRUNCATE TABLE empleados;

-- ============================================================
-- SECCIÓN DE FILTRADO Y CONDICIONES
-- ============================================================

-- Uso de AND / OR
SELECT * FROM empleados
WHERE cargo = 'Analista' OR salario > 2000;

-- Uso de BETWEEN
SELECT nombre, salario
FROM empleados
WHERE salario BETWEEN 1500 AND 2500;

-- Uso de IN
SELECT nombre
FROM empleados
WHERE cargo IN ('Analista', 'Gerente', 'Supervisor');

-- Uso de LIKE
SELECT nombre
FROM empleados
WHERE nombre LIKE 'A%';

-- ============================================================
-- SECCIÓN DE FUNCIONES Y AGRUPACIÓN
-- ============================================================

-- Agrupar por cargo
SELECT cargo, AVG(salario) AS promedio_salarial
FROM empleados
GROUP BY cargo
HAVING AVG(salario) > 1600;

-- ============================================================
-- SECCIÓN DE JOINS
-- ============================================================

-- INNER JOIN
SELECT empleados.nombre, departamentos.nombre AS departamento
FROM empleados
INNER JOIN departamentos
ON empleados.id_departamento = departamentos.id;

-- LEFT JOIN
SELECT empleados.nombre, departamentos.nombre AS departamento
FROM empleados
LEFT JOIN departamentos
ON empleados.id_departamento = departamentos.id;

-- RIGHT JOIN
SELECT empleados.nombre, departamentos.nombre AS departamento
FROM empleados
RIGHT JOIN departamentos
ON empleados.id_departamento = departamentos.id;

-- FULL JOIN
SELECT empleados.nombre, departamentos.nombre AS departamento
FROM empleados
FULL JOIN departamentos
ON empleados.id_departamento = departamentos.id;

-- ============================================================
-- SECCIÓN DCL (Data Control Language)
-- ============================================================

-- Conceder permisos
GRANT SELECT, INSERT ON empleados TO 'usuario_app';

-- Revocar permisos
REVOKE INSERT ON empleados FROM 'usuario_app';

-- ============================================================
-- SECCIÓN TCL (Transaction Control Language)
-- ============================================================

BEGIN TRANSACTION;
UPDATE empleados SET salario = salario * 1.05;
COMMIT;

-- ============================================================
-- SECCIÓN DE VISTAS E ÍNDICES
-- ============================================================

-- Crear una vista
CREATE VIEW vista_empleados AS
SELECT nombre, cargo, salario
FROM empleados
WHERE salario > 1500;

-- Crear índice
CREATE INDEX idx_empleados_salario
ON empleados (salario);

-- ============================================================
-- SECCIÓN DE OPERADORES Y UNIONES
-- ============================================================

-- UNION (elimina duplicados)
SELECT nombre FROM empleados
UNION
SELECT nombre FROM clientes;

-- UNION ALL (incluye duplicados)
SELECT nombre FROM empleados
UNION ALL
SELECT nombre FROM clientes;

-- SELECT DISTINCT (valores únicos)
SELECT DISTINCT cargo FROM empleados;

-- SELECT TOP (dependiendo del motor)
SELECT TOP 5 * FROM empleados;
```

---

### 🔹 Conclusión del análisis

El documento original **SQL Quick Reference** contiene información valiosa, pero su estructura era desordenada, con repeticiones y sin contexto.
Tras aplicar los principios de **Código Limpio**, el resultado es un archivo más didáctico, coherente y profesional.
La división por secciones, los ejemplos significativos y los comentarios facilitan el uso del material tanto en entornos educativos como técnicos.

---

## ✅ Conclusión general del taller

Este taller demuestra que incluso un documento de referencia puede beneficiarse de los principios de **Código Limpio**:

* La **organización modular** y los **nombres significativos** facilitan el aprendizaje.
* Los **comentarios claros** y los **ejemplos contextualizados** aumentan el valor pedagógico.
* La **consistencia de formato** y la **eliminación de redundancia** mejoran la calidad documental.
```

