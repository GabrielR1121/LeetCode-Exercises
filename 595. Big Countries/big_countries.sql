/* 
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #595
 * Exercise Name: Big Countries
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Select
 * Language Used: SQL
 * Tags: Database
*/
SELECT name, population, area 
FROM World
WHERE area >= 3000000 || population >= 25000000;