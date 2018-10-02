create table CUBATRAININGTASK_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(100) not null,
    SECOND_NAME varchar(100) not null,
    BITH_DATE date not null,
    EMAIL varchar(100),
    SALARY varchar(20) not null,
    CENTER_ID varchar(36) not null,
    --
    primary key (ID)
);
