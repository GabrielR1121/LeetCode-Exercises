/* 
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #1581
 * Exercise Name: Customer WHo Visited but Dis Not Make Any Transactions
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Basic Joins
 * Language Used: SQL
 * Tags: Database
*/
SELECT customer_id, count(Visits.visit_id) as "count_no_trans"
FROM Visits 
LEFT JOIN Transactions
ON Visits.visit_id = Transactions.visit_id
WHERE Transactions.transaction_id IS NULL 
GROUP BY Visits.customer_id;