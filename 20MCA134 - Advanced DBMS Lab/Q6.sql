USE bank;
SELECT D.cname AS CUSTOMER, B.city AS BRANCH_CITY, C.city AS BRANCH FROM deposit D 
	JOIN customer AS C ON C.cname=D.cname
    JOIN branch AS B ON B.bname=D.bname 
	WHERE C.city LIKE "BOMBAY" AND D.bname IN (SELECT bname FROM branch WHERE city LIKE "NAGPUR");
SELECT D.cname AS CUSTOMER, B.city AS BRANCH_CITY, C.city AS BRANCH FROM deposit D 
	JOIN customer AS C ON C.cname=D.cname
    JOIN branch AS B ON B.bname=D.bname 
    WHERE B.city = C.city;
SELECT C.cname AS CUSTOMER FROM customer AS C
	JOIN deposit AS D ON D.cname=C.cname
    JOIN borrow AS B ON B.cname=C.cname
    WHERE C.city LIKE "NAGPUR";
SELECT B.cname AS CUSTOMER, B.amount AS LOAN, D.amount AS DEPOSIT FROM borrow AS B
	JOIN deposit D ON D.cname=B.cname
    WHERE D.amount > 1000 AND B.amount > 2000;
SELECT cname AS CUSTOMER, bname AS BRANCH FROM deposit
	WHERE bname LIKE (SELECT bname FROM deposit WHERE cname LIKE "Sunil");
SELECT cname AS CUSTOMER, amount AS LOAN FROM borrow
	WHERE amount > (SELECT amount FROM borrow WHERE cname LIKE "PRAMOD");
SELECT DISTINCT C.cname AS CUSTOMER, C.city AS CITY FROM customer AS C
	JOIN deposit AS D ON D.cname=C.cname
    JOIN branch AS B ON B.city=C.city
    WHERE C.city LIKE (SELECT city FROM branch WHERE bname LIKE (SELECT bname FROM deposit WHERE cname LIKE "Sunil"));
SELECT D.cname AS CUSTOMER, B.city AS BRANCH_CITY, C.city AS LIVING_CITY FROM deposit D 
	JOIN branch AS B ON B.bname = D.bname
    JOIN customer AS C ON C.cname = D.cname
    WHERE D.cname LIKE "PRAMOD";
SELECT DISTINCT B.city AS BRANCH_CITY, D.cname AS CUSTOMER FROM branch AS B 
	JOIN deposit AS D ON D.bname=B.bname
    WHERE D.cname IN ("SUNIL","Anil");
SELECT city AS LIVING_CITY FROM customer WHERE cname IN ("Anil", "Sunil");