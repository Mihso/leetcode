# Write your MySQL query statement below
Select Person.firstName, Person.lastName, Address.city, Address.state from Person
Left Join Address on Address.personID = Person.personId;