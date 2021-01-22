DROP TABLE IF EXISTS person;

create table person(

id int AUTO_INCREMENT primary key,
name VARCHAR(512) NOT NULL,
address VARCHAR(512) NOT NULL,
dob VARCHAR(512) NOT NULL
);

