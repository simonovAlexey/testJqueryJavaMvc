DROP TABLE IF EXISTS users;

CREATE TABLE users
(
  login     VARCHAR PRIMARY KEY,
  PASSWORD  VARCHAR,
  FirstName VARCHAR,
  LastName  VARCHAR,
  LANGUAGE  VARCHAR
)

