CREATE TABLE todo (
       id bigint primary key unique,
       name varchar(255) not null,
       description varchar(255) not null,
       accomplished bit(1) not null,
       priority integer not null
);