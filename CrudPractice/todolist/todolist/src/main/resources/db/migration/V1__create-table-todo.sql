CREATE TABLE todo (
       id integer primary key unique auto_increment,
       name varchar(255) not null,
       description varchar(255) not null,
       accomplished bit(1) not null,
       priority integer not null
);