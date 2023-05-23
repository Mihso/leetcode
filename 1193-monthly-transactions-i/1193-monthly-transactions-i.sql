# Write your MySQL query statement below
select Date_Format(trans_date, '%Y-%m') as 'month', 
country, 
count(month(trans_date)) as trans_count,
count(IF(state = 'approved', 1, null)) as approved_count,
sum(amount) as trans_total_amount ,
sum(if(state = "approved", amount, 0)) as approved_total_amount
from Transactions
group by Date_Format(trans_date, '%Y-%m'), country