USE bank;
SELECT SUM(amount) AS Total_Loan FROM borrow;
SELECT SUM(amount) AS Total_Deposit FROM deposit;
SELECT SUM(amount) AS "Total Loan" FROM borrow WHERE bname LIKE "KAROLBAGH";
SELECT SUM(amount) FROM deposit WHERE adate > 1996-01-01;
SELECT SUM(deposit.amount) AS TOTAL FROM deposit INNER JOIN customer
	ON customer.cname = deposit.cname 
    WHERE customer.city LIKE "NAGPUR";
SELECT MAX(deposit.amount) AS Maximum_Amount FROM deposit INNER JOIN customer
	ON customer.cname = deposit.cname 
    WHERE deposit.bname IN (SELECT bname FROM branch WHERE city LIKE "BOMBAY");
