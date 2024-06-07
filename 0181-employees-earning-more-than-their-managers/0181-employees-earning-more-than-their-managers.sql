# Write your MySQL query statement below
SELECT E.name as Employee from Employee E
inner join Employee A on E.managerId = A.id
where E.salary > A.salary;