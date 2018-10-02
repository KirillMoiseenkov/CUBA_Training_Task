alter table CUBATRAININGTASK_CUSTOMER add column PASSPORT_NO varchar(10) ^
update CUBATRAININGTASK_CUSTOMER set PASSPORT_NO = '' where PASSPORT_NO is null ;
alter table CUBATRAININGTASK_CUSTOMER alter column PASSPORT_NO set not null ;
alter table CUBATRAININGTASK_CUSTOMER add column DTYPE varchar(100) ;
