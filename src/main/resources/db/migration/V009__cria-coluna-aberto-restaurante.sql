alter table restaurante add aberto tinyint(1) not null default false;
update restaurante set aberto = false;