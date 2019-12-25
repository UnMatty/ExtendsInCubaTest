-- begin EXTENDSINCUBATEST_PARENT_ONE
create table EXTENDSINCUBATEST_PARENT_ONE (
    DTYPE varchar(100),
    --
    FIRST_ATTR varchar(255),
    --
    -- from extendsincubatest_One
    SECOND_ varchar(255),
    --
    primary key (ID)
)^
-- end EXTENDSINCUBATEST_PARENT_ONE
-- begin EXTENDSINCUBATEST_PARENT_TWO
create table EXTENDSINCUBATEST_PARENT_TWO (
    DTYPE varchar(100),
    --
    FIRST_ varchar(255),
    --
    -- from extendsincubatest_Two
    SECOND_ varchar(255),
    --
    primary key (ID)
)^
-- end EXTENDSINCUBATEST_PARENT_TWO
