USE bank;
SELECT DISTINCT deposit.cname FROM deposit LEFT JOIN borrow ON deposit.cname != borrow.cname ORDER BY deposit.cname;
SELECT deposit.cname FROM deposit JOIN borrow ON deposit.cname = borrow.cname;
SELECT cname FROM deposit WHERE bname IN (SELECT bname FROM deposit WHERE cname LIKE "Sunil");
SELECT DISTINCT customer.cname FROM customer 
	INNER JOIN branch 
	ON customer.city LIKE "NAGPUR" AND (branch.city = "BOMBAY" OR branch.city = "DELHI");
SELECT cname FROM deposit WHERE bname IN (SELECT bname FROM branch WHERE city LIKE "NAGPUR");
SELECT cname FROM deposit WHERE cname IN (SELECT cname FROM customer WHERE city LIKE "NAGPUR") 
								AND bname IN (SELECT bname FROM branch WHERE city LIKE "BOMBAY");
SELECT DISTINCT branch.city FROM branch INNER JOIN deposit ON (deposit.cname LIKE "Anil" OR deposit.cname LIKE "Sunil");
SELECT DISTINCT deposit.cname AS Customer_Name FROM deposit INNER JOIN borrow ON borrow.amount < 10000 AND deposit.amount > 1000;
SELECT DISTINCT customer.city AS "City Of Depositors" FROM customer INNER JOIN deposit ON deposit.bname LIKE "VRCE";
SELECT customer.cname AS "DEPOSITORS" FROM customer 
	INNER JOIN deposit ON customer.cname = deposit.cname 
    WHERE deposit.amount < 1000 AND customer.city IN (SELECT city FROM customer WHERE cname LIKE "Anil");
SELECT DISTINCT branch.city AS CITY FROM branch 
	INNER JOIN deposit ON deposit.bname=branch.bname
    WHERE deposit.cname LIKE "Anil" OR deposit.cname LIKE "Sunil";
SELECT deposit.amount AS DEPOSIT_AMOUNT, deposit.cname AS CUSTOMER FROM deposit INNER JOIN 
	customer ON deposit.cname = customer.cname 
    WHERE customer.city IN (SELECT city FROM customer WHERE cname LIKE "Anil");