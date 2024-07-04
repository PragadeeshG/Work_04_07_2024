create table if not exists customer_volunteering(
activity_name varchar(255) not null,
location_code varchar(255) null,
office_name varchar(255) null,
venue varchar(255) null,
number_of_accomodation varchar(255) null,
travel_guides varchar(255) null,
noshow_registerations varchar(255) null,
spot_registerations Integer null,
own_transportation varchar(255) null,
line_manager_approval varchar(255) null,
entity_state varchar(255) null,
constraint customer_volunteering_pk primary key(activity_name));