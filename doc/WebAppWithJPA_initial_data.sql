USE WebAppWithJPA;



SET AUTOCOMMIT=0;
INSERT INTO Address VALUES (1,'malad','mumbai','india','2006-02-15 04:34:33'),
(2,'Canal Street,New Orleans','LA','amarica','2006-02-15 04:34:33'),
(3,'Delaware Avenue,Buffalo','NY','amarica','2006-02-15 04:34:33'),
(4,'Las Vegas Boulevard, Las Vegas','LA','amarica','2006-02-15 04:34:33'),
(5,'Fifth Avenue, New York','NY','amarica','2006-02-15 04:34:33'),
(6,'Vermont Street, San Francisco','CA','amarica','2006-02-15 04:34:33'),
(7,'Mulholland Drive, Los Angeles','CA','amarica','2006-02-15 04:34:33'),
(8,'mindspace,airoli','mumbai','india','2006-02-15 04:34:33'),
(9,'ayodyanagar,2nd-lane','berhampur','india','2006-02-15 04:34:33')
;

COMMIT;


SET AUTOCOMMIT=0;
INSERT INTO Customers VALUES (1,'sagar','mahapatro','2006-02-15 04:34:33',9),
(2,'akash','saha','2006-02-15 04:34:33',8),
(3,'arnav','mahapatro','2006-02-15 04:34:33',1),
(4,'vikas','gupta','2006-02-15 04:34:33',3),
(5,'arun','govil','2006-02-15 04:34:33',8),
(6,'ashis','malothra','2006-02-15 04:34:33',6),
(7,'somin','shaik','2006-02-15 04:34:33',3),
(8,'girish','mehata','2006-02-15 04:34:33',4),
(9,'simran','khan','2006-02-15 04:34:33',3)
;

COMMIT;



SET AUTOCOMMIT=0;
INSERT INTO Product VALUES (1,'TV',20000.00,'2006-02-15 04:34:33'),
(2,'Fridge',20000.00,'2006-02-15 04:34:33'),
(3,'Car',3000000.00,'2006-02-15 04:34:33'),
(4,'GameConsole',20000.00,'2006-02-15 04:34:33'),
(5,'Bed',20000.00,'2006-02-15 04:34:33'),
(6,'Sofa',40000.00,'2006-02-15 04:34:33'),
(7,'Shirt',10000.00,'2006-02-15 04:34:33'),
(8,'Sharee',15000.00,'2006-02-15 04:34:33'),
(9,'Mobile',22000.00,'2006-02-15 04:34:33')
;

COMMIT;

SET AUTOCOMMIT=0;
INSERT INTO ListItems VALUES (1,'TV',20000.00,'2006-02-15 04:34:33'),
(2,'Fridge',20000.00,'2006-02-15 04:34:33'),
(3,'Car',3000000.00,'2006-02-15 04:34:33'),
(4,'GameConsole',20000.00,'2006-02-15 04:34:33'),
(5,'Bed',20000.00,'2006-02-15 04:34:33'),
(6,'Sofa',40000.00,'2006-02-15 04:34:33'),
(7,'Shirt',10000.00,'2006-02-15 04:34:33'),
(8,'Sharee',15000.00,'2006-02-15 04:34:33'),
(9,'Mobile',22000.00,'2006-02-15 04:34:33')
;

COMMIT;