# Write your MySQL query statement below
Select  Name AS Customers
From Customers 
Left JOin Orders
on Orders.CustomerId=Customers.Id
Where Orders.CustomerID IS NULL

# SELECT Name AS Customers
# FROM CUSTOMERS
# LEFT JOIN ORDERS
# ON ORDERS.CustomerID = Customers.Id
# WHERE Orders.CustomerID IS NUL