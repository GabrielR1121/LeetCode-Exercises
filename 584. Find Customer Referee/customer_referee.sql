/*
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #584
 * Exercise Name: Find Customer Referee
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Select
 * Language Used: SQL
 * Tags: Database
*/
SELECT name 
FROM Customer
WHERE referee_id != 2 or referee_id is null;