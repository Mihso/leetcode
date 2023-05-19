# Write your MySQL query statement below
Select Employee.name, Bonus.bonus from Employee
left join Bonus on Bonus.empId = Employee.empId
where Bonus.bonus < 1000 or Bonus.bonus is null;