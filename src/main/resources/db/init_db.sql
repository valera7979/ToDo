DROP TABLE IF EXISTS todo;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE todo
(
  id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  description       VARCHAR NOT NULL,
  started TIMESTAMP DEFAULT now(),
  expiration_date TIMESTAMP,
  status VARCHAR NOT NULL DEFAULT 'In progress'

);