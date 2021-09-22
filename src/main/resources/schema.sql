CREATE TABLE IF NOT EXISTS authors (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    emaiL VARCHAR(50),
    birth_date DATE,
    name VARCHAR(50),
    mini_resume VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS books (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(80),
    release_date DATE,
    number_of_pages INTEGER
);

CREATE TABLE IF NOT EXISTS author_books (
    author_id BIGINT,
    book_id BIGINT,
    PRIMARY KEY (author_id, book_id),
    CONSTRAINT fk_books_authors FOREIGN KEY (author_id) REFERENCES authors (id),
    CONSTRAINT fk_authors_books FOREIGN KEY (book_id) REFERENCES books (id)
);
