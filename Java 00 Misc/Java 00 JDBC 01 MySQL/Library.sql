CREATE DATABASE library;
use library
CREATE TABLE author (author_id INT PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR (30),last_name1 VARCHAR (30),last_name2 VARCHAR (30) );
CREATE TABLE book (book_id INT PRIMARY KEY AUTO_INCREMENT, TITLE VARCHAR(30),author_id INT,foreign key (author_id) references author(author_id));
DESCRIBE author;
DESCRIBE book;