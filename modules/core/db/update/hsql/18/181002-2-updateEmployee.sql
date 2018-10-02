alter table CUBATRAININGTASK_EMPLOYEE add column LAST_NAME varchar(100) ^
update CUBATRAININGTASK_EMPLOYEE set LAST_NAME = '' where LAST_NAME is null ;
alter table CUBATRAININGTASK_EMPLOYEE alter column LAST_NAME set not null ;
alter table CUBATRAININGTASK_EMPLOYEE drop column SECOND_NAME cascade ;
