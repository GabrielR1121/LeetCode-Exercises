/* 
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #1378
 * Exercise Name: Replace Employee ID With The Unique Identifier
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Basic Joins
 * Language Used: SQL
 * Tags: Database
*/
SELECT unique_id, name
FROM Employees LEFT JOIN EmployeeUNI
ON Employees.id = EmployeeUNI.id;