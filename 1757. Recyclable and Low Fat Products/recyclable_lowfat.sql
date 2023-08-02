/*
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #1757
 * Exercise Name: Recyclable and Low Fat Products
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Select
 * Language Used: SQL
 * Tags: Database
*/
SELECT product_id
FROM Products
WHERE low_fats = 'Y' && recyclable = 'Y';