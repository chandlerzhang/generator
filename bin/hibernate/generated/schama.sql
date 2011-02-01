
    alter table m_contact 
        drop 
        foreign key FKE66A0E4EA6E6D972;

    alter table m_menu_role 
        drop 
        foreign key FKB19FBE041BC1592;

    alter table m_menu_role 
        drop 
        foreign key FKB19FBE04E84D80F2;

    alter table m_role_resource 
        drop 
        foreign key FKC29FA9651BC1592;

    alter table m_role_resource 
        drop 
        foreign key FKC29FA9651C7CC292;

    alter table m_user_role 
        drop 
        foreign key FK20DD0B18A6E6D972;

    alter table m_user_role 
        drop 
        foreign key FK20DD0B181BC1592;

    drop table if exists m_contact;

    drop table if exists m_dictionary;

    drop table if exists m_menu;

    drop table if exists m_menu_role;

    drop table if exists m_resource;

    drop table if exists m_role;

    drop table if exists m_role_resource;

    drop table if exists m_user;

    drop table if exists m_user_role;

    create table m_contact (
        ID bigint not null auto_increment,
        USER_ID bigint not null,
        EMAIL varchar(255),
        STATUS varchar(1) not null,
        CREATOR bigint not null,
        CREATED datetime not null,
        MODIFICATOR bigint,
        MODIFIED datetime,
        primary key (ID)
    ) ENGINE=InnoDB;

    create table m_dictionary (
        ID bigint not null auto_increment,
        CODE integer not null,
        SERIAL integer not null,
        NAME varchar(255) not null,
        PARENT_ID bigint not null,
        STATUS varchar(1) not null,
        CREATOR bigint not null,
        CREATED datetime not null,
        MODIFICATOR bigint,
        MODIFIED datetime,
        primary key (ID)
    ) ENGINE=InnoDB;

    create table m_menu (
        ID bigint not null auto_increment,
        SERIAL integer not null,
        NAME varchar(255) not null unique,
        TITLE varchar(255) not null,
        PARENT_ID bigint not null,
        MENU_TYPE varchar(255) not null,
        URL varchar(255),
        STATUS varchar(1) not null,
        CREATOR bigint not null,
        CREATED datetime not null,
        MODIFICATOR bigint,
        MODIFIED datetime,
        primary key (ID)
    ) ENGINE=InnoDB;

    create table m_menu_role (
        ROLE_ID bigint not null,
        MENU_ID bigint not null,
        primary key (MENU_ID, ROLE_ID)
    ) ENGINE=InnoDB;

    create table m_resource (
        ID bigint not null auto_increment,
        NAME varchar(255) not null,
        RESOURCE_TYPE varchar(255) not null,
        RESOURCE_STRING varchar(255) not null unique,
        STATUS varchar(1) not null,
        CREATOR bigint not null,
        CREATED datetime not null,
        MODIFICATOR bigint,
        MODIFIED datetime,
        primary key (ID)
    ) ENGINE=InnoDB;

    create table m_role (
        ID bigint not null auto_increment,
        ROLE_TYPE varchar(255) not null,
        NAME varchar(255) not null,
        STATUS varchar(1) not null,
        CREATOR bigint not null,
        CREATED datetime not null,
        MODIFICATOR bigint,
        MODIFIED datetime,
        primary key (ID)
    ) ENGINE=InnoDB;

    create table m_role_resource (
        ROLE_ID bigint not null,
        RESOURCE_ID bigint not null,
        primary key (RESOURCE_ID, ROLE_ID)
    ) ENGINE=InnoDB;

    create table m_user (
        ID bigint not null auto_increment,
        ORIGIN_SYSTEM integer,
        ORIGIN_ID bigint,
        ORIGIN_CODE varchar(255),
        NAME varchar(255) not null,
        PASSWORD varchar(255) not null,
        NICKNAME varchar(255) not null,
        STATUS varchar(1) not null,
        CREATOR bigint not null,
        CREATED datetime not null,
        MODIFICATOR bigint,
        MODIFIED datetime,
        primary key (ID)
    ) ENGINE=InnoDB;

    create table m_user_role (
        USER_ID bigint not null,
        ROLE_ID bigint not null,
        primary key (USER_ID, ROLE_ID)
    ) ENGINE=InnoDB;

    alter table m_contact 
        add index FKE66A0E4EA6E6D972 (USER_ID), 
        add constraint FKE66A0E4EA6E6D972 
        foreign key (USER_ID) 
        references m_user (ID);

    alter table m_menu_role 
        add index FKB19FBE041BC1592 (ROLE_ID), 
        add constraint FKB19FBE041BC1592 
        foreign key (ROLE_ID) 
        references m_role (ID);

    alter table m_menu_role 
        add index FKB19FBE04E84D80F2 (MENU_ID), 
        add constraint FKB19FBE04E84D80F2 
        foreign key (MENU_ID) 
        references m_menu (ID);

    alter table m_role_resource 
        add index FKC29FA9651BC1592 (ROLE_ID), 
        add constraint FKC29FA9651BC1592 
        foreign key (ROLE_ID) 
        references m_role (ID);

    alter table m_role_resource 
        add index FKC29FA9651C7CC292 (RESOURCE_ID), 
        add constraint FKC29FA9651C7CC292 
        foreign key (RESOURCE_ID) 
        references m_resource (ID);

    alter table m_user_role 
        add index FK20DD0B18A6E6D972 (USER_ID), 
        add constraint FK20DD0B18A6E6D972 
        foreign key (USER_ID) 
        references m_user (ID);

    alter table m_user_role 
        add index FK20DD0B181BC1592 (ROLE_ID), 
        add constraint FK20DD0B181BC1592 
        foreign key (ROLE_ID) 
        references m_role (ID);
