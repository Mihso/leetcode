# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
delete Person from Person, Person as P
where Person.email = P.email and Person.id > P.id;