create table sys_user(
  id serial primary key,
  username character varying(20) not null,
  password character varying(100) not null
);

insert into sys_user(username,password) values('admin', '111');

create table sys_role_user(
  user_id integer primary key,
  role_id integer
);

create table sys_role(
  id serial primary key,
  name character varying(50),
  description character varying(100),
  create_time integer,
  update_time integer
);
insert into sys_role(name, description, create_time, update_time) values('test1', 'xxx', 1586315864, 1586315864);

create table sys_role_permission(
  role_id integer,
  permission_id integer[]
);

insert into sys_role_permission values(1, '{1,2}');

create table sys_permission(
  id serial primary key,
  parent_id integer,
  name character varying(50),
  css character varying(30),
  href character varying(1000),
  type smallint,
  permission character varying(50),
  sort integer
);