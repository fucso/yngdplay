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


# --- !Downs

drop table if exists color_palette;

