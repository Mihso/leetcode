# Write your MySQL query statement below
Select product_name, year, price from Sales
left join Product on sales.product_id=Product.product_id;