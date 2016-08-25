INSERT INTO person_master
 (person_id, first_name, family_name, age, validity)
VALUES
(1, 'Akane', 'Ando', 35, 1),
(2, 'Ichiro', 'Baba', 29, 1),
(3, 'Utako', 'Chouno', 25, 1),
(4, 'Eiji', 'Doumoto', 43, 1),
(5, 'Orie', 'Enomoto', 31, 1);

INSERT INTO phone_list
 (list_id, person_id, phone_number, mobile_flag, validity)
VALUES
(1, 1, '090-1234-0001', 1, 1),
(2, 1, '03-1234-0001', 0, 1),
(3, 2, '090-1234-0002', 1, 1),
(4, 3, '090-1234-0003', 1, 1),
(5, 4, '050-1234-0001', 0, 1),
(6, 4, '090-1234-0004', 1, 1),
(7, 4, '090-1234-0005', 1, 0),
(8, 5, '090-1234-0006', 1, 1);
