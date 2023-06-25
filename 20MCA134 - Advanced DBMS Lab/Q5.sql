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
SELECT branch.city AS CITY, branch.bname AS BRANCH, SUM(deposit.amount) AS DEPOSIT FROM branch INNER JOIN deposit ON deposit.bname=branch.bname GROUP BY deposit.bname;
SELECT bname AS BRANCH, SUM(amount) AS LOAN FROM borrow GROUP BY bname;
SELECT COUNT(cname) AS TOTAL_CUSTOMERS FROM customer;
SELECT bname AS BRANCH, COUNT(cname) FROM deposit GROUP BY bname;
SELECT MAX(amount) AS MAXIMUM_LOAN_VRCE FROM borrow WHERE bname LIKE "VRCE";
SELECT deposit.cname AS CUSTOMERS FROM deposit INNER JOIN borrow ON borrow.cname = deposit.cname;