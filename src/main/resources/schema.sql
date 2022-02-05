DROP TABLE IF EXISTS FTR_ACT;
CREATE TABLE FTR_ACT
(
    VEH_FTR_D         BIGINT       auto_increment,
    VIN               VARCHAR(17)  NOT NULL,
    ACTI_DATE         DATE         NOT NULL,
    DEAC_DATE         DATE         NOT NULL,
    FTR_CODE      VARCHAR(50)  NOT NULL,
    FTR_DESC      VARCHAR(50)  NOT NULL,
    ENB_FLG           VARCHAR(10)  NOT NULL
);