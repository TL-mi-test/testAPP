create table person_master (
    person_id INTEGER primary key,
    first_name VARCHAR(64),
    family_name VARCHAR(64),
    age INTEGER,
    validity BIT
);

create table phone_list (
    list_id INTEGER primary key,
    person_id INTEGER,
    phone_number VARCHAR(20),
    mobile_flag BIT,
    validity BIT
);
