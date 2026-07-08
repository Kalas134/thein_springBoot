select current_database();

select version();

create table BOARD_TABLE (
	id bigint generated always as identity primary key,
	title varchar(200) not null,
	writer varchar(100) not null,
	pass varchar(100) not null,
	contents text not null
);

drop table BOARD_TABLE;