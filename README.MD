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

Users
login: varchar, primary key
password: varchar
FirstName: varchar
LastName: varchar
Language: varchar

Где password хранит закриптованное SHA1 алгоритмом  значение пароля, Language - значение языка пользователя по умолчанию (значение вида RU, DE, EN,...)

----
<a href="http://www.scand.by/ru/company/tasks/test_jquery_javamvc.doc" target="_blank">Полная версия задания</a>