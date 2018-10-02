update CUBATRAININGTASK_CUSTOMER set PASSPORT_NO = '' where PASSPORT_NO is null ;
alter table CUBATRAININGTASK_CUSTOMER alter column PASSPORT_NO set not null ;
