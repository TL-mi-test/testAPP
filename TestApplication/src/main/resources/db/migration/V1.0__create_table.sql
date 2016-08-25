create table person_master (
    person_id INTEGER primary key,
    firstname VARCHAR(64),
    familyname VARCHAR(64),
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
