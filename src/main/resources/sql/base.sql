create table sys_user(
  id serial primary key,
  username character varying(20) not null,
  password character varying(100) not null
);

insert into sys_user(username,password) values('admin', '111');