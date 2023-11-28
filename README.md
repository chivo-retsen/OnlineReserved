# OnlineReserved


1) Окружение.

- MySql (испльзовалась версия 5.1.45),
- веб-сервер (испльзовался Apache Tomcat версия 8.0.0).

2) Сборка.

- С помощью скрипта "initScriptDB.sql" (путь "OnlineReserved\src\main\resources\db\initScriptDB.sql") создайте базу данных для приложения (не имеет первоначальное заполнение).
- Укажите актуальные имя пользователя и пароль для доступа к БД (файл настроек - "OnlineReserved\src\main\resources\hibernate.cfg.xml").

3) Запуск. 

- Запустите Tomcat (если ранее он не был запущен) - "Tomcat\bin\startup.bat".
- После этого тестовое приложение станет доступно по адресу "http://localhost:8089/"

Описание:



Проект имеет следующие функции:



- Просмотр списка фильмов. Создание, редактирование и удаление фильмов.
- Просмотр списка кинотеатров. Создание, редактирование и удаление кинотеатров.
