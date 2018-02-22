create table app_role(

    idrole serial,
    role_name varchar(255) not null,
    description varchar(255) not null,

    constraint fk_app_role_idrole primary key (idrole)

);

insert into app_role(role_name, description) values('STANDARD_USER', 'Standar User');
insert into app_role(role_name, description) values('ADMIN_USER', 'Admin User');

create table app_user(

    iduser serial,
    username varchar(255) not null,
    password varchar(255) not null,
    first_name varchar(255) not null,
    last_name varchar(255) not null,

    constraint fk_app_user_iduser primary key(iduser)
);


insert into app_user(username, password, first_name, last_name)
values('john', 'Doe', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a',
'john.doe');

insert into app_user(username, password, first_name, last_name)
values('Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a',
'admin.admin');

create table user_role(

    idrole int not null,
    iduser int not null,

    primary key (idrole, iduser),

    constraint fk_user_role_idrole foreign key (idrole) references app_role(idrole)
    match simple on update no action on delete no action,
    constraint fk_user_role_iduser foreign key (iduser) references app_user(iduser)
    match simple on update no action on delete no action
);


insert into user_role(idrole, iduser)values(1, 1);
insert into user_role(idrole, iduser)values(2, 1);
insert into user_role(idrole, iduser)values(2, 2);



create table city(

    idcity int not null,
    name varchar(255) not null,
    description varchar(255) not null,

    constraint pk_city_idcity primary key (idcity)

);

insert into city(idcity, name, description) values(1, 'Jakarta', 'Jakarta - Indonesia');
insert into city(idcity, name, description) values(2, 'New York', 'New York - America');
insert into city(idcity, name, description) values(3, 'Sapolo', 'Saopolo - Brazil');
insert into city(idcity, name, description) values(4, 'Bengaluru', 'Bengaluru - India');
insert into city(idcity, name, description) values(5, 'Bangkok', 'Bankok - Thailand');

update app_user set username='admin.admin', password='821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a',
first_name='admin', last_name='admin' where iduser=1;
update app_user set username='john.doe', password='821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a',
first_name='john', last_name='doe' where iduser=2;