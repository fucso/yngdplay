# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table color_palette (
  id                            integer auto_increment not null,
  color_code                    varchar(6) not null,
  create_at                     datetime(6) not null,
  update_at                     datetime(6) not null,
  constraint pk_color_palette primary key (id)
);

create table constructor (
  id                            integer auto_increment not null,
  hidden_at                     datetime(6),
  constructor_name              varchar(50) not null,
  constructor_type              integer not null,
  display_color                 integer not null,
  create_at                     datetime(6) not null,
  update_at                     datetime(6) not null,
  constraint pk_constructor primary key (id)
);

create table constructor_type (
  id                            integer auto_increment not null,
  type_name                     varchar(50) not null,
  create_at                     datetime(6) not null,
  update_at                     datetime(6) not null,
  constraint pk_constructor_type primary key (id)
);


# --- !Downs

drop table if exists color_palette;

drop table if exists constructor;

drop table if exists constructor_type;

