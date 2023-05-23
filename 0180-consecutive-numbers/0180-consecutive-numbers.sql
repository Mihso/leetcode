# Write your MySQL query statement below
select Distinct Logs.num as ConsecutiveNums from Logs, Logs as L2, Logs as L3
where Logs.id = L2.id+1 and L2.id = L3.id+1 and Logs.num = L2.num and L2.num = L3.num