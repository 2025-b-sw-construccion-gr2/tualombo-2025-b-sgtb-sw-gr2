
## 📘 SQL Quick Reference (Formato Markdown)

| SQL Statement | Syntax |
|---------------|---------|
| **AND / OR** | ```sql\nSELECT column_name(s)\nFROM table_name\nWHERE condition\nAND / OR condition\n``` |
| **ALTER TABLE** | ```sql\nALTER TABLE table_name\nADD column_name datatype;\n\n-- o eliminar columna\nALTER TABLE table_name\nDROP COLUMN column_name;\n``` |
| **AS (alias)** | ```sql\nSELECT column_name AS column_alias\nFROM table_name;\n\n-- o\nSELECT column_name\nFROM table_name AS table_alias;\n``` |
| **BETWEEN** | ```sql\nSELECT column_name(s)\nFROM table_name\nWHERE column_name BETWEEN value1 AND value2;\n``` |
| **CREATE DATABASE** | ```sql\nCREATE DATABASE database_name;\n``` |
| **CREATE TABLE** | ```sql\nCREATE TABLE table_name (\n  column_name1 data_type,\n  column_name2 data_type,\n  column_name3 data_type,\n  ...\n);\n``` |
| **CREATE INDEX** | ```sql\nCREATE INDEX index_name ON table_name (column_name);\n\n-- o índice único\nCREATE UNIQUE INDEX index_name ON table_name (column_name);\n``` |
| **CREATE VIEW** | ```sql\nCREATE VIEW view_name AS\nSELECT column_name(s)\nFROM table_name\nWHERE condition;\n``` |
| **DELETE** | ```sql\nDELETE FROM table_name WHERE some_column = some_value;\n\n-- o elimina toda la tabla (precaución)\nDELETE FROM table_name;\nDELETE * FROM table_name;\n``` |
| **DROP DATABASE** | ```sql\nDROP DATABASE database_name;\n``` |
| **DROP INDEX** | ```sql\n-- SQL Server\nDROP INDEX table_name.index_name;\n\n-- MS Access\nDROP INDEX index_name ON table_name;\n\n-- DB2 / Oracle\nDROP INDEX index_name;\n\n-- MySQL\nALTER TABLE table_name DROP INDEX index_name;\n``` |
| **DROP TABLE** | ```sql\nDROP TABLE table_name;\n``` |
| **EXISTS** | ```sql\nIF EXISTS (SELECT * FROM table_name WHERE id = ?)\nBEGIN\n  -- instrucciones si existe\nEND\nELSE\nBEGIN\n  -- instrucciones si no existe\nEND\n``` |
| **GROUP BY** | ```sql\nSELECT column_name, aggregate_function(column_name)\nFROM table_name\nWHERE column_name operator value\nGROUP BY column_name;\n``` |
| **HAVING** | ```sql\nSELECT column_name, aggregate_function(column_name)\nFROM table_name\nWHERE column_name operator value\nGROUP BY column_name\nHAVING aggregate_function(column_name) operator value;\n``` |
| **IN** | ```sql\nSELECT column_name(s)\nFROM table_name\nWHERE column_name IN (value1, value2, ...);\n``` |
| **INSERT INTO** | ```sql\nINSERT INTO table_name VALUES (value1, value2, value3, ...);\n\n-- o\nINSERT INTO table_name (column1, column2, column3, ...)\nVALUES (value1, value2, value3, ...);\n``` |
| **INNER JOIN** | ```sql\nSELECT column_name(s)\nFROM table_name1\nINNER JOIN table_name2\nON table_name1.column_name = table_name2.column_name;\n``` |
| **LEFT JOIN** | ```sql\nSELECT column_name(s)\nFROM table_name1\nLEFT JOIN table_name2\nON table_name1.column_name = table_name2.column_name;\n``` |
| **RIGHT JOIN** | ```sql\nSELECT column_name(s)\nFROM table_name1\nRIGHT JOIN table_name2\nON table_name1.column_name = table_name2.column_name;\n``` |
| **FULL JOIN** | ```sql\nSELECT column_name(s)\nFROM table_name1\nFULL JOIN table_name2\nON table_name1.column_name = table_name2.column_name;\n``` |
| **LIKE** | ```sql\nSELECT column_name(s)\nFROM table_name\nWHERE column_name LIKE pattern;\n``` |
| **ORDER BY** | ```sql\nSELECT column_name(s)\nFROM table_name\nORDER BY column_name [ASC | DESC];\n``` |
| **SELECT** | ```sql\nSELECT column_name(s)\nFROM table_name;\n``` |
| **SELECT \*** | ```sql\nSELECT * FROM table_name;\n``` |
| **SELECT DISTINCT** | ```sql\nSELECT DISTINCT column_name(s)\nFROM table_name;\n``` |
| **SELECT INTO** | ```sql\nSELECT * INTO new_table_name [IN externaldatabase]\nFROM old_table_name;\n\n-- o\nSELECT column_name(s)\nINTO new_table_name [IN externaldatabase]\nFROM old_table_name;\n``` |
| **SELECT TOP** | ```sql\nSELECT TOP number | percent column_name(s)\nFROM table_name;\n``` |
| **TRUNCATE TABLE** | ```sql\nTRUNCATE TABLE table_name;\n``` |
| **UNION** | ```sql\nSELECT column_name(s) FROM table_name1\nUNION\nSELECT column_name(s) FROM table_name2;\n``` |
| **UNION ALL** | ```sql\nSELECT column_name(s) FROM table_name1\nUNION ALL\nSELECT column_name(s) FROM table_name2;\n``` |
| **UPDATE** | ```sql\nUPDATE table_name\nSET column1 = value1, column2 = value2, ...\nWHERE some_column = some_value;\n``` |
| **WHERE** | ```sql\nSELECT column_name(s)\nFROM table_name\nWHERE column_name operator value;\n``` |
