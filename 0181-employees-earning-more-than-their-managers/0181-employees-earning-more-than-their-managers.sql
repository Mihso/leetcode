# Write your MySQL query statement below
select A.name as 'Employee' from Employee as A, Employee as B
where A.salary > B.salary And A.ManagerId = B.Id;