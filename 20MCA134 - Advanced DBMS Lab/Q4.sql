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
SELECT SUM(deposit.amount) AS Maximum_Amount FROM deposit INNER JOIN customer
	ON customer.cname = deposit.cname 
    WHERE deposit.bname IN (SELECT bname FROM branch WHERE city LIKE "BOMBAY");
SELECT city, COUNT(bname) AS "No_Of_Branche's" FROM branch GROUP BY (city);
SELECT city, COUNT(cname) AS "No_Of_Customer's" FROM customer GROUP BY (city);
SELECT bname AS Branch_Name, SUM(amount) AS DEPOSIT FROM deposit GROUP BY (bname);
#SELECT B.city ,D.bname AS BRANCH, SUM(D.amount) AS DEPOSIT FROM deposit D, branch B GROUP BY D.bname;
SELECT bname AS BRANCH, SUM(amount) AS LOAN FROM borrow GROUP BY bname;
SELECT COUNT(cname) AS TOTAL_CUSTOMERS FROM customer;
SELECT bname AS BRANCH, COUNT(cname) FROM customer GROUP BY bname;