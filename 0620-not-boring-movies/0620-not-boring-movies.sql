# Write your MySQL query statement below
select * from Cinema where not description = 'boring' and not MOD(id, 2) = 0
order by rating desc; 