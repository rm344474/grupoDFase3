create table order_location
(
id bigint auto_increment primary key,
date datetime(6) null,
latitude double null,
longetude double null
);

INSERT INTO order_location( date, latitude, longetude) VALUES('2022-10-21T19:30:30', -25.859647,-48.85471);
INSERT INTO order_location( date, latitude, longetude) VALUES('2022-10-19T19:30:30', -25.859647,-48.85471);
INSERT INTO order_location( date, latitude, longetude) VALUES('2022-10-13T19:30:30', -25.859647,-48.85471);

create table orders
(
id bigint auto_increment primary key,
operator_id bigint not null,
end_order_location_id bigint null,
start_order_location_id bigint null,
constraint FK_end_order_id
foreign key (end_order_location_id) references order_location (id),
constraint FK_start_order_id
foreign key (start_order_location_id) references order_location (id)
);
INSERT INTO orders( operator_id, end_order_location_id, start_order_location_id) VALUES(25,1,2);
INSERT INTO orders( operator_id, end_order_location_id, start_order_location_id) VALUES(23, 3,2);
INSERT INTO orders( operator_id, end_order_location_id, start_order_location_id) VALUES(87, 1,3);

create table orders_assists
(
order_id bigint not null,
assists_id bigint not null,
constraint FK_order_id_orders_assists foreign key (order_id) references orders(id),
constraint FK_assist_id_orders_assists foreign key (assists_id) references assistances(id)
);

INSERT INTO orders_assists( order_id, assists_id) VALUES(2,3);
INSERT INTO orders_assists( order_id, assists_id) VALUES(3,5);
INSERT INTO orders_assists( order_id, assists_id) VALUES(1,6);
