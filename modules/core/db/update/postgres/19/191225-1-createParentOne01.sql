create table EXTENDSINCUBATEST_PARENT_ONE (
                                              ID uuid,
                                              VERSION integer not null,
                                              CREATE_TS timestamp,
                                              CREATED_BY varchar(50),
                                              UPDATE_TS timestamp,
                                              UPDATED_BY varchar(50),
                                              DELETE_TS timestamp,
                                              DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    FIRST_ATTR varchar(255),
    --
    -- from extendsincubatest_One
    SECOND_ varchar(255),
    --
    primary key (ID)
);