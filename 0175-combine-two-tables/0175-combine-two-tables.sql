# Write your MySQL query statement below
Select firstName, lastName, NullIf(city, "") as city, NullIf(state,"") as state from person
left join Address on person.personId = address.personId;