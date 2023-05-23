# Write your MySQL query statement below
select E1.employee_id from Employees as E1
where E1.manager_id NOT IN (select employee_id from Employees) and E1.salary < 30000
Order by E1.employee_id