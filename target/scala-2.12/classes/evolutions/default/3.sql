# --- !Ups
delete from user;

insert into user (email,name,password,role) values ( 'admin@employees.com', 'Brandon Admin', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'manager@employees.com', 'Ronan Manager', 'password', 'manager' );

