-- begin CUBATRAININGTASK_CITY
create table CUBATRAININGTASK_CITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    CODE integer not null,
    --
    primary key (ID)
)^
-- end CUBATRAININGTASK_CITY
-- begin CUBATRAININGTASK_CUSTOMER
create table CUBATRAININGTASK_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    NAME varchar(100) not null,
    PHONE integer not null,
    EMAIL varchar(100),
    --
    primary key (ID)
)^
-- end CUBATRAININGTASK_CUSTOMER
-- begin CUBATRAININGTASK_CAR_SERVICE_CENTER
create table CUBATRAININGTASK_CAR_SERVICE_CENTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    PHONE integer not null,
    ADRESS varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUBATRAININGTASK_CAR_SERVICE_CENTER
-- begin CUBATRAININGTASK_EMPLOYEE
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
    LAST_NAME varchar(100) not null,
    BITH_DATE date not null,
    EMAIL varchar(100),
    SALARY varchar(20) not null,
    CENTER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CUBATRAININGTASK_EMPLOYEE
-- begin CUBATRAININGTASK_CAR_SERVICE_CENTER_CITY_LINK
create table CUBATRAININGTASK_CAR_SERVICE_CENTER_CITY_LINK (
    CAR_SERVICE_CENTER_ID varchar(36) not null,
    CITY_ID varchar(36) not null,
    primary key (CAR_SERVICE_CENTER_ID, CITY_ID)
)^
-- end CUBATRAININGTASK_CAR_SERVICE_CENTER_CITY_LINK
-- begin CUBATRAININGTASK_INDIVIDUAL
create table CUBATRAININGTASK_INDIVIDUAL (
    ID varchar(36) not null,
    --
    PASSPORT_NO varchar(10) not null,
    --
    primary key (ID)
)^
-- end CUBATRAININGTASK_INDIVIDUAL
-- begin CUBATRAININGTASK_COMPANY
create table CUBATRAININGTASK_COMPANY (
    ID varchar(36) not null,
    --
    INN integer not null,
    --
    primary key (ID)
)^
-- end CUBATRAININGTASK_COMPANY
