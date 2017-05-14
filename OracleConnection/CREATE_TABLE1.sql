--------------------------------------------------------
--  DDL for Table TABLE1
--------------------------------------------------------
CREATE TABLE TABLE1 
(	
   COLUMN1 VARCHAR2(20 BYTE)
); 

COMMIT;

INSERT INTO "ME"."TABLE1" (COLUMN1) VALUES ('data1');
INSERT INTO "ME"."TABLE1" (COLUMN1) VALUES ('data2');
INSERT INTO "ME"."TABLE1" (COLUMN1) VALUES ('data3');
INSERT INTO "ME"."TABLE1" (COLUMN1) VALUES ('data4');

COMMIT;
