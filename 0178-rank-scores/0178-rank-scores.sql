# Write your MySQL query statement below
select score, Dense_Rank() Over(order by score desc) as 'rank' from Scores;