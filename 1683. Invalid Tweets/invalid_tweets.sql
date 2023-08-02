/* 
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #1683
 * Exercise Name: Invalid Tweets
 * Difficulty: Easy
 * Study Plan: SQL 50
 * Category: Select
 * Language Used: SQL
 * Tags: Database
*/
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;