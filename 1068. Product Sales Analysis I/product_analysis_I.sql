/* 
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #1068
 * Exercise Name: Product Sales Analysis I
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Basic Joins
 * Language Used: SQL
 * Tags: Database
*/
SELECT product_name, year, price
FROM Sales
LEFT JOIN Product
ON Product.product_id = Sales.product_id;