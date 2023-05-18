# Write your MySQL query statement below
select A.name as 'Employee' from Employee as A, Employee as B
where A.salary > (Select B.salary where A.managerId = B.id);