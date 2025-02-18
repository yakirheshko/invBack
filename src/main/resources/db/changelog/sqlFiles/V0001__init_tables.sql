create table if not exists requests
(
    id                varchar(255) not null primary key,
    created_at        datetime(6)  null,
    updated_at        datetime(6)  null,
    device_id         varchar(100) not null,
    title             varchar(100) not null,
    description       varchar(100) not null,
    category          varchar(100) not null,
    distance          varchar(100) not null,
    active            bit      not null default true
);

create table if not exists responses
(
    id                varchar(255) not null primary key,
    created_at        datetime(6)  null,
    updated_at        datetime(6)  null,
    device_id         varchar(100) not null,
    request_id        varchar(255) not null,
    response          longtext     not null
);

create table if not exists businesses
(
    id                varchar(255) not null primary key,
    created_at        datetime(6)  null,
    updated_at        datetime(6)  null,
    device_id         varchar(100) not null,
    category          varchar(50) not null,
    location          varchar(50) not null
);

