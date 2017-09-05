Test Jquery JavaMVC
===============================

Тестовое задание по Java Web программированию

Данное задание имеет целью выяснить:
- Умение спроектировать JAVA MVC приложение "с нуля", базовые навыки обработки событий на сервере средствами Spring MVC.
- Минимальные навыки верстки HTML, применение стилей
- Работа с клиенской частью приложения (JavaScript/jQuery/Ajax)
- Работа с coockies

Технологии, которые должны быть использованиы при выполнении:

1. Spring framework
2. Spring MVC
3. Hybernate
4. jQuery
5. Любая из популярных DB, предпочтительнее - MySQL (использована PostgreSQL)
6. Tomcat

Предлагается разработать тестовое приложение, выполняющее процедуру авторизации, а так же установку языка приложения.

Для хранения данных должна быть создана единственная таблица базы данных:

> Users <br>
> login: varchar, primary key<br>
> password: varchar<br>
> FirstName: varchar<br>
> LastName: varchar<br>
> Language: varchar<br>

Где password хранит закриптованное SHA1 алгоритмом  значение пароля, Language - значение языка пользователя по умолчанию (значение вида RU, DE, EN,...)

----


#### Конфигурация БД: resources\db\postgres.properties

- Инициализация БД: resources\db\initDB.sql
- Тестовые данные находятся в resources\db\populateDB.sql
