create table address (id_address bigint not null auto_increment, city varchar(255), flat_number varchar(255), house_number varchar(255), postal_code varchar(255), street varchar(255), primary key (id_address)) engine=InnoDB
create table client (id_client bigint not null auto_increment, mail varchar(255), name varchar(255), phone_number varchar(255), surname varchar(255), id_address bigint, primary key (id_client)) engine=InnoDB
create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table invoice (id_invoice bigint not null, amount bigint, invoice_date datetime, id_client bigint, id_invoice_status bigint, id_payment bigint, primary key (id_invoice)) engine=InnoDB
create table invoice_status (id_invoice_status bigint not null, invoice_status varchar(255), primary key (id_invoice_status)) engine=InnoDB
create table payment (id_payment bigint not null auto_increment, amount bigint, date_of_payment date, id_payment_method bigint, primary key (id_payment)) engine=InnoDB
create table payment_method (id_payment_method bigint not null auto_increment, name varchar(255), primary key (id_payment_method)) engine=InnoDB
alter table client add constraint FKiwweavm13m4nn3qwerurn89iq foreign key (id_address) references address (id_address)
alter table invoice add constraint FK8cr14nme7kjxny815hmg2hxw6 foreign key (id_client) references client (id_client)
alter table invoice add constraint FKlnatvuqpptf3287g1ykrjsgt foreign key (id_invoice_status) references invoice_status (id_invoice_status)
alter table invoice add constraint FKkhdc5chjervqr5lhd13alo0dr foreign key (id_payment) references payment (id_payment)
alter table payment add constraint FKdhst93ryal11amfoy464el7x2 foreign key (id_payment_method) references payment_method (id_payment_method)
