create table CUBATRAININGTASK_CAR_SERVICE_CENTER_CITY_LINK (
    CAR_SERVICE_CENTER_ID varchar(36) not null,
    CITY_ID varchar(36) not null,
    primary key (CAR_SERVICE_CENTER_ID, CITY_ID)
);
