USE bank;
SELECT bname AS BRANCH, SUM(amount) AS DEPOSIT FROM deposit GROUP BY bname HAVING SUM(amount) > 5000;
SELECT D.bname AS BRANCH, SUM(D.amount) AS DEPOSIT FROM deposit D 
	WHERE D.bname IN (SELECT bname FROM branch WHERE city LIKE "BOMBAY") 
    GROUP BY D.bname 
    HAVING SUM(amount) > 500;
#SELECT  FROM deposit GROUP BY bname HAVING AVG(amount);