# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table test_table (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_test_table primary key (id)
);


# --- !Downs

drop table if exists test_table;

