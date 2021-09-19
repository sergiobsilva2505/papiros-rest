CREATE TABLE IF NOT EXISTS authors (
    id BIGINT NOT NULL PRIMARY KEY,
    emaiL VARCHAR(50),
    birth_date DATE,
    name VARCHAR(50),
    mini_resume VARCHAR(255)
);