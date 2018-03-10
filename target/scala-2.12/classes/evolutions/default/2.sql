# --- Sample dataset
 
# --- !Ups
 
delete from employee;
delete from project;
delete from department;
delete from address;

insert into department (id, name) values ( 1, 'Finance');
insert into department (id, name) values ( 2, 'IT');
insert into department (id, name) values ( 3, 'Sales');
insert into department (id, name) values ( 4, 'HR');
insert into department (id, name) values ( 5, 'R&D');

insert into project (id,name,description,deadline) values ( 1,'Alpha','Marketing Campaign','May, 2018');
insert into project (id,name,description,deadline) values ( 2,'Bravo','Employee Screening','April, 2018');
insert into project (id,name,description,deadline) values ( 3,'Charlie','Software Development','Janurary, 2019');
insert into project (id,name,description,deadline) values ( 4,'Delta','Newhire Training','June, 2018');
insert into project (id,name,description,deadline) values ( 5,'Echo','Feasibility Study','July, 2018');
insert into project (id,name,description,deadline) values ( 6,'Foxtrot','Product Testing','August, 2018');
insert into project (id,name,description,deadline) values ( 7,'Golf','Optimisation','October, 2018');

insert into address (id, street, county) values (1, 'Wood Street', 'Cork');
insert into address (id, street, county) values (2, '11th Street', 'Dublin');
insert into address (id, street, county) values (3, 'Maiden Lane', 'Tyrone');
insert into address (id, street, county) values (4, 'State Street', 'East Louth');
insert into address (id, street, county) values (5, 'Dogwood Drive', 'Dublin');
insert into address (id, street, county) values (6, 'Delaware Avenue', 'Galway');
insert into address (id, street, county) values (7, 'Bridle Lane', 'Dublin');
insert into address (id, street, county) values (8, 'Forest Drive', 'Mayo');
insert into address (id, street, county) values (9, 'Primrose Lane', 'Clare');
insert into address (id, street, county) values (10, 'Madison Street', 'Down');
insert into address (id, street, county) values (11, 'Jefferson Court', 'Limerick');
insert into address (id, street, county) values (12, 'York Road', 'Mayo');
insert into address (id, street, county) values (13, 'East Street', 'Dublin');
insert into address (id, street, county) values (14, 'Cooper Street', 'Dublin');
insert into address (id, street, county) values (15, 'Lake Avenue', 'Cork');
insert into address (id, street, county) values (16, 'Route 10', 'Roscommon');
insert into address (id, street, county) values (17, 'Canterbruy Drive', 'Limerick');
insert into address (id, street, county) values (18, 'James Street', 'Kerry');
insert into address (id, street, county) values (19, '3rd Avenue', 'Sligo');
insert into address (id, street, county) values (20, 'Route 9', 'Mayo');
insert into address (id, street, county) values (21, 'James Lane', 'Kildare');
insert into address (id, street, county) values (22, '4th Avenue', 'Offaly');
insert into address (id, street, county) values (23, 'Route 91', 'Tipperary');

insert into employee (id,fname, lname ,department_id, address_id) values ( 1,'Noah','Girotto', 2, 5);
insert into employee (id,fname, lname ,department_id, address_id) values ( 2,'Ethan','Starkey', 5, 13);
insert into employee (id,fname, lname ,department_id, address_id) values ( 3,'Dylan','Klebold', 4, 6);
insert into employee (id,fname, lname ,department_id, address_id) values ( 4,'Omar','Musleh', 3, 12);
insert into employee (id,fname, lname ,department_id, address_id) values ( 5,'Thomas','Smitherman', 4, 15);
insert into employee (id,fname, lname ,department_id, address_id) values ( 6,'Bobby','Irgashev', 1, 11);
insert into employee (id,fname, lname ,department_id, address_id) values ( 7,'Damian','Byrd', 5, 1);
insert into employee (id,fname, lname ,department_id, address_id) values ( 8,'Ian','Wickett', 4, 8);
insert into employee (id,fname, lname ,department_id, address_id) values ( 9,'Philip','Dayoub', 1, 7);
insert into employee (id,fname, lname ,department_id, address_id) values ( 10,'Jamaal','Waters', 2, 9);
insert into employee (id,fname, lname ,department_id, address_id) values ( 11,'Tyler','Smalls', 5, 23);
insert into employee (id,fname, lname ,department_id, address_id) values ( 12,'Tyler','Marc', 4, 3);
insert into employee (id,fname, lname ,department_id, address_id) values ( 13,'Eric','Harris', 1, 4);
insert into employee (id,fname, lname ,department_id, address_id) values ( 14,'Joseph','Duncan', 4, 10);
insert into employee (id,fname, lname ,department_id, address_id) values ( 15,'Elliot','Rodger', 3, 22);
insert into employee (id,fname, lname ,department_id, address_id) values ( 16,'Adam','Lanza', 2, 20);
insert into employee (id,fname, lname ,department_id, address_id) values ( 17,'Martin','Bryant', 2, 18);
insert into employee (id,fname, lname ,department_id, address_id) values ( 18,'Marc','Lepine', 4, 19);
insert into employee (id,fname, lname ,department_id, address_id) values ( 19,'Randy','Stair', 5, 17);
insert into employee (id,fname, lname ,department_id, address_id) values ( 20,'Tim','Kretschmer', 3, 2);
insert into employee (id,fname, lname ,department_id, address_id) values ( 21,'Jared','Loughner', 1, 21);
insert into employee (id,fname, lname ,department_id, address_id) values ( 22,'Robert','Hawkens', 2, 14);
insert into employee (id,fname, lname ,department_id, address_id) values ( 23,'Anders','Breivik', 5, 16);

insert into project_employee (project_id,employee_id) values (2,1,);
insert into project_employee (project_id,employee_id) values (4,2);
insert into project_employee (project_id,employee_id) values (6,3);
insert into project_employee (project_id,employee_id) values (6,4);
insert into project_employee (project_id,employee_id) values (3,5);
insert into project_employee (project_id,employee_id) values (5,6);
insert into project_employee (project_id,employee_id) values (7,7);
insert into project_employee (project_id,employee_id) values (2,8);
insert into project_employee (project_id,employee_id) values (4,9);
insert into project_employee (project_id,employee_id) values (6,10);
insert into project_employee (project_id,employee_id) values (1,11);
insert into project_employee (project_id,employee_id) values (2,12);
insert into project_employee (project_id,employee_id) values (7,13);
insert into project_employee (project_id,employee_id) values (5,14);
insert into project_employee (project_id,employee_id) values (3,15);
insert into project_employee (project_id,employee_id) values (1,16);
insert into project_employee (project_id,employee_id) values (2,17);
insert into project_employee (project_id,employee_id) values (4,18);
insert into project_employee (project_id,employee_id) values (3,19);
insert into project_employee (project_id,employee_id) values (7,20);
insert into project_employee (project_id,employee_id) values (5,21);
insert into project_employee (project_id,employee_id) values (3,22);
insert into project_employee (project_id,employee_id) values (1,23);
  



