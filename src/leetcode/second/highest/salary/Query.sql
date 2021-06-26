-- create a table
CREATE TABLE Employee (
  id INTEGER PRIMARY KEY,
  salary INTEGER NOT NULL
);
-- insert some values
INSERT INTO Employee VALUES (1, 100);
INSERT INTO Employee VALUES (2, 350);
INSERT INTO Employee VALUES (4, 250);
INSERT INTO Employee VALUES (3, 300);
INSERT INTO Employee VALUES (5, 400);

-- fetch some values

-- Write your MySQL query statement below
SELECT
    salary SecondHighestSalary
FROM
    Employee
ORDER BY
    salary desc
LIMIT 1 OFFSET 1;