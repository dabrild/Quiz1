create role userdb with password '123456';
create database userdata owner userdb;
ALTER ROLE userdb LOGIN;

INSERT INTO my_table(column1, column2)
VALUES ('value1', 'value2');