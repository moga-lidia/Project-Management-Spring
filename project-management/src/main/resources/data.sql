-- INSERT EMPLOYEES			
insert into employee (employee_id, first_name, last_name, email) values (1, 'Ana', 'Popescu', 'popescu@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (2, 'Mhai', 'Lava', 'lava.mihai@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (3, 'Stefan', 'Szmecskas', 'stefan@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (4, 'Ada', 'Lupulescu', 'lup@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (5, 'Andreea', 'Salvator', 'Sal@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (6, 'Rebeca', 'Curea', 'curea@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (7, 'Richi', 'John', 'john@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (8, 'Lewis', 'Pop', 'Lewis.pop@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (9, 'Olena', 'Hantig', 'olena.hantig@gmail.com');

-- INSERT PROJECTS			
insert into project (project_id, name, state, description) values (100, 'Honneywell deliver', 'NOTSTARTED', 'This requires 10 delivers.');
insert into project (project_id, name, state, description) values (101, 'Autoliv production',  'COMPLETED', 'Decide on the new production');
insert into project (project_id, name, state, description) values (102, 'Office Update', 'INPROGRESS', 'Update the furniture.');
insert into project (project_id, name, state, description) values (103, 'Improve Security', 'INPROGRESS', 'Buy and install new security cameras.');

-- INSERT PROJECT_EMPLOYEE_RELATION (Removed duplicates from video)
insert into project_employee (employee_id, project_id) values (1,100);
insert into project_employee (employee_id, project_id) values (1,101);
insert into project_employee (employee_id, project_id) values (1,102);
insert into project_employee (employee_id, project_id) values (3,100);
insert into project_employee (employee_id, project_id) values (6,102);
insert into project_employee (employee_id, project_id) values (6,103);
													