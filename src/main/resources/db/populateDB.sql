DELETE FROM users;
--login: user pass:123
INSERT INTO users (login, PASSWORD, FirstName, LastName)
VALUES ('user', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 'Alexey', 'Simonow-123');

-- LANGUAGE ISO-3166
--login: admin pass:321
INSERT INTO users (login, PASSWORD, FirstName, LastName,LANGUAGE)
VALUES ('admin', '5f6955d227a320c7f1f6c7da2a6d96a851a8118f', 'Ivan', 'Ivanov-321','ru_RU');
