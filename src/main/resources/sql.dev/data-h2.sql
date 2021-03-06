INSERT INTO address VALUES ( 'Long', 5, 34, 'New York', '44-300');
INSERT INTO address VALUES ( 'Long streen', 54, 66, 'Paris', '49-321');
INSERT INTO address VALUES ( '18 Street', 31, 43, 'Sydney', '34-323');

INSERT INTO client VALUES ( 'John', 'New', '500493003', 'janek21313@oc.eu', 1);
INSERT INTO client VALUES ( 'Mark', 'Spencer', '504939203', 'kulek123121@oc.eu',2);
INSERT INTO client VALUES ( 'Jules', 'Black',  '511493003', 'marta3421@oc.eu',3);
INSERT INTO client VALUES ( 'Maria', 'White',  '521493003', 'jannowosielski2344@oc.eu',4);
INSERT INTO client VALUES ( 'Paris', 'Mary',  '503493003', 'martakorycka2349@oc.eu',5);

INSERT INTO invoice_status VALUES ( 'New');
INSERT INTO invoice_status VALUES ( 'Finished');
INSERT INTO invoice_status VALUES ( 'Canceled');

INSERT INTO payment_method VALUES ( 'Debit card');
INSERT INTO payment_method VALUES ( 'Credit card');
INSERT INTO payment_method VALUES ( 'Cash');

INSERT INTO payment VALUES (1, 1, 100, NOW());
INSERT INTO payment VALUES (2, 2, 220, NOW());
INSERT INTO payment VALUES (3, 3, 260, NOW());
INSERT INTO payment VALUES (4, 3, 150, NOW());
INSERT INTO payment VALUES (5, 2, 240, NOW());
INSERT INTO payment VALUES (6, 2, 130, NOW());
INSERT INTO payment VALUES (7, 3, 355, NOW());
INSERT INTO payment VALUES (8, 2, 435, NOW());
INSERT INTO payment VALUES (9, 2, 755, NOW());
INSERT INTO payment VALUES (10, 1, 125, NOW());

INSERT INTO invoice VALUES (1, 1, 1, 3, NOW(), NOW(), NOW(), 120);
INSERT INTO invoice VALUES (2, 3, 2, 3, NOW(), NOW(), NOW(), 340);
INSERT INTO invoice VALUES (3, 1, 3, 3, NOW(), NOW(), NOW(), 110);
INSERT INTO invoice VALUES (4, 2, 4, 3, NOW(), NOW(), NOW(), 420);
INSERT INTO invoice VALUES (5, 3, 5, 3, NOW(), NOW(), NOW(), 490);
INSERT INTO invoice VALUES (6, 3, 6, 1, NOW(), NOW(), NOW(), 150);
INSERT INTO invoice VALUES (7, 3, 1, 1, NOW(), NOW(), NOW(), 90);
INSERT INTO invoice VALUES (8, 3, 3, 2, NOW(), NOW(), NOW(), 130);
INSERT INTO invoice VALUES (9, 1, 4, 2, NOW(), NOW(), NOW(), 175);
INSERT INTO invoice VALUES (10, 2,1, 3, NOW(), NOW(), NOW(), 200);
INSERT INTO invoice VALUES (11, 3, 2, 4, NOW(), NOW(), NOW(), 140);
INSERT INTO invoice VALUES (12, 3, 3, 4, NOW(), NOW(), NOW(), 200);
INSERT INTO invoice VALUES (13, 2, 1, 4, NOW(), NOW(), NOW(), 220);
INSERT INTO invoice VALUES (14, 1, 5, 1, NOW(), NOW(), NOW(), 160);
INSERT INTO invoice VALUES (15, 1, 4, 5, NOW(), NOW(), NOW(), 120);
