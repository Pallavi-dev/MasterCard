

INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (3,'EXTERNAL','TestRole','TEST','ACTIVE','pallavi123');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (4,'BILL_OPS','DevelopmentRole','TEST','ACTIVE','upesh');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (5,'BILL_DEV','DevelopmentRole','TEST','ACTIVE','mohit');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (6,'TAM','DevelopmentRole','TEST','ACTIVE','leela');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (7,'GCC','DevelopmentRole','TEST','ACTIVE','snehal');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (8,'CTS','DevelopmentRole','TEST','INACTIVE','pallavi');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (9,'CCM','DevelopmentRole','TEST','ACTIVE','snehal');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (10,'BILL_PROJECT','DevelopmentRole','TEST','ACTIVE','shoyam');
INSERT INTO USER_ROLES(id,role_Name,role_Description,ICA,STATUS,user_Id) VALUES (11,'BILL_ARCH','DevelopmentRole','TEST','ACTIVE','vivek');


INSERT INTO ROLE_MAPPING(role_Name,download_Detail_Count,download_Summary_Count,summary_Response_Count,detail_Response_Count) VALUES ('BILL_OPS',100000,100000,300,300);
INSERT INTO ROLE_MAPPING(role_Name,download_Detail_Count,download_Summary_Count,summary_Response_Count,detail_Response_Count) VALUES ('BI',100000,100000,300,300);
INSERT INTO ROLE_MAPPING(role_Name,download_Detail_Count,download_Summary_Count,summary_Response_Count,detail_Response_Count) VALUES ('BILL_BIZ',100000,100000,300,300);
INSERT INTO ROLE_MAPPING(role_Name,download_Detail_Count,download_Summary_Count,summary_Response_Count,detail_Response_Count) VALUES ('BILL_DEV',100000,100000,300,300);
INSERT INTO ROLE_MAPPING(role_Name,download_Detail_Count,download_Summary_Count,summary_Response_Count,detail_Response_Count) VALUES ('BILL_PROJ',100000,100000,300,300);


INSERT INTO ELEMENT_MAPPING(id,feeder,elements,role_Name,enable,as_Fields) VALUES(2,'AUTH','IME_TRACE_ID','BILL_OPS','Y','imeTraceId');
INSERT INTO ELEMENT_MAPPING(id,feeder,elements,role_Name,enable,as_Fields) VALUES(3,'AUTH','MTI_FUNC_CD','BILL_OPS','N','mtiFunction');
INSERT INTO ELEMENT_MAPPING(id,feeder,elements,role_Name,enable,as_Fields) VALUES(4,'AUTH','MTI_FUNC_CD','BILL_OPS','Y','mtiFunction');
INSERT INTO ELEMENT_MAPPING(id,feeder,elements,role_Name,enable,as_Fields) VALUES(5,'AUTH','MTI_FUNC_CD','BILL_biz','Y','mtiFunction');

