CREATE TABLE catalog (
    id serial CONSTRAINT primary_key PRIMARY KEY,
    title varchar(40) NOT NULL,
    category varchar(40) NOT NULL
);
