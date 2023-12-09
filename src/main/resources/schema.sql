create table if not exists Students (
    id identity primary key not null,
    user_name varchar(50) not null,
    password varchar(50) not null,
    user_token varchar(50) not null
);