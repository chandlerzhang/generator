
    drop table M_ROLE cascade constraints;

    drop table M_USER cascade constraints;

    drop table M_USER_ROLE cascade constraints;

    drop sequence SEQ_M_ROLE;

    drop sequence SEQ_M_USER;

    create table M_ROLE (
        ID number(19,0) not null,
        NAME varchar2(255 char) not null unique,
        primary key (ID)
    );

    create table M_USER (
        ID number(19,0) not null,
        NAME varchar2(255 char) not null unique,
        PASSWORD varchar2(255 char),
        STATUS varchar2(255 char),
        primary key (ID)
    );

    create table M_USER_ROLE (
        USER_ID number(19,0) not null,
        ROLE_ID number(19,0) not null,
        primary key (ROLE_ID, USER_ID)
    );

    alter table M_USER_ROLE 
        add constraint FK2C21B2F852388A1A 
        foreign key (ROLE_ID) 
        references M_ROLE;

    alter table M_USER_ROLE 
        add constraint FK2C21B2F8F7634DFA 
        foreign key (USER_ID) 
        references M_USER;

    create sequence SEQ_M_ROLE;

    create sequence SEQ_M_USER;
