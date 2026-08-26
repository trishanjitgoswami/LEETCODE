SELECT Department, Employee, Salary
FROM (
    SELECT
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        MAX(e.salary) OVER (PARTITION BY d.name) AS max_salary
    FROM Employee e
    JOIN Department d
        ON e.departmentId = d.id
) x
WHERE Salary = max_salary;