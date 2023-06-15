# Write your MySQL query statement below
select ifnull(
    (select distinct Salary from Employee 
     Order by Salary Desc 
     Limit 1,1), null) 
     as SecondHighestSalary