alter table CUBATRAININGTASK_CUSTOMER drop column PASSPORT_NO cascade ;
alter table CUBATRAININGTASK_CUSTOMER drop column INN cascade ;
alter table CUBATRAININGTASK_CUSTOMER alter column DTYPE set data type varchar(31) ;
