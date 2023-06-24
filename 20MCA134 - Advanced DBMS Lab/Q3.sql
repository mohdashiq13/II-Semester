USE bank;
SELECT DISTINCT deposit.cname FROM deposit LEFT JOIN borrow ON deposit.cname != borrow.cname ORDER BY deposit.cname;
SELECT deposit.cname FROM deposit JOIN borrow ON deposit.cname = borrow.cname;
SELECT cname FROM deposit WHERE bname IN (SELECT bname FROM deposit WHERE cname LIKE "Sunil");