/* 
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #1148
 * Exercise Name: Article Views I
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Select
 * Language Used: SQL
 * Tags: Database
*/
SELECT DISTINCT author_id as "id"
FROM Views
WHERE author_id = viewer_id
ORDER BY author_id asc;