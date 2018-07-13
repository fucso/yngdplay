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
  constructor_type_id           integer not null,
  display_color_id              integer not null,
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

create table site (
  id                            integer auto_increment not null,
  hidden_at                     datetime(6),
  site_name                     varchar(50),
  constractor_id                integer not null,
  transport_cost                integer not null,
  start_at                      datetime(6) not null,
  finish_at                     datetime(6),
  create_at                     datetime(6) not null,
  update_at                     datetime(6) not null,
  constraint pk_site primary key (id)
);

create index ix_constructor_constructor_type_id on constructor (constructor_type_id);
alter table constructor add constraint fk_constructor_constructor_type_id foreign key (constructor_type_id) references constructor_type (id) on delete restrict on update restrict;

create index ix_constructor_display_color_id on constructor (display_color_id);
alter table constructor add constraint fk_constructor_display_color_id foreign key (display_color_id) references color_palette (id) on delete restrict on update restrict;

create index ix_site_constractor_id on site (constractor_id);
alter table site add constraint fk_site_constractor_id foreign key (constractor_id) references constructor (id) on delete restrict on update restrict;


# --- !Downs

alter table constructor drop foreign key fk_constructor_constructor_type_id;
drop index ix_constructor_constructor_type_id on constructor;

alter table constructor drop foreign key fk_constructor_display_color_id;
drop index ix_constructor_display_color_id on constructor;

alter table site drop foreign key fk_site_constractor_id;
drop index ix_site_constractor_id on site;

drop table if exists color_palette;

drop table if exists constructor;

drop table if exists constructor_type;

drop table if exists site;

