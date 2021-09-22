-- AUTHORS
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('peter.junior@google.com', '1958-06-09', 'Peter Jandl Junior', 'Um mini resumo dos livros de Peter Jandl Junior');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('eric.freeman@google.com', '1938-06-06', 'Eric Freeman', 'Um mini resumo dos livros de Eric Freeman');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('elisabeth.robson@google.com', '1938-06-06', 'Elisabeth Robson', 'Um mini resumo dos livros de Elisabeth Robson');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('erich.gamma@google.com', '1872-05-03', 'Erich Gamma', 'Um mini resumo dos livros de Erich Gamma');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('richard.helm@google.com', '1872-05-03', 'Richard Helm', 'Um mini resumo dos livros de Richard Helm');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('ralph.johnson@google.com', '1872-05-03', 'Ralph Johson', 'Um mini resumo dos livros de Ralph Johson');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('john.vlissides@google.com', '1872-05-03', 'John Vlissides', 'Um mini resumo dos livros de John Vlissides');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('robert.martin@google.com', '1899-06-09', 'Robert C. Martin', 'Habilidades práticas do agile software'); -- 8
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('andrew.stellmamn@google.com', '1922-04-02', 'Andrew Stellman', 'Um mini resumo dos livros de Andrew Stellman');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('jennifer.greene@google.com', '1899-06-09', 'Jennifer Greene', 'Um mini resumo dos livros de Jennifer Greene');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('kathy.sierra@google.com', '1899-06-09', 'Kathy Sierra', 'Um mini resumo dos livros de Kathy Sierra');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('bert.bates@google.com', '1899-06-09', 'Bert Bates', 'Um mini resumo dos livros de Kathy Sierra'); -- 12
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('lynn.beighley@google.com', '1899-06-09', 'Lynn Beighley', 'Um mini resumo dos livros de Lynn Beighley');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('paul.deitel@google.com', '1899-06-09', 'Paul Deitel', 'Um mini resumo dos livros de Paul Deitel');
INSERT INTO authors (email, birth_date, name, mini_resume) VALUES ('harvey.deitel@google.com', '1899-06-09', 'Harvey Deitel', 'Um mini resumo dos livros de Harvey Deitel');

-- BOOKS
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Java: Guia do programador.', '2021-04-22', 555);
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Use a cabeça: Programação JavaScript.', '2021-04-22', 661);
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Código Limpo', '2021-04-22', 456);
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Padrões de Projeto', '1995-04-22', 366);
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Use a cabeça: C#', '2011-04-22', 800);
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Use a cabeça: Java', '2011-04-22', 485);
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Use a cabeça: SQL', '2011-04-22', 455);
INSERT INTO books (title, release_date, number_of_pages) VALUES ('Java como programar', '2011-04-22', 935);

-- AUTHOR_BOOKS
INSERT INTO author_books (author_id, book_id) VALUES (1, 1);
INSERT INTO author_books (author_id, book_id) VALUES (2, 2);
INSERT INTO author_books (author_id, book_id) VALUES (3, 2);
INSERT INTO author_books (author_id, book_id) VALUES (4, 4);
INSERT INTO author_books (author_id, book_id) VALUES (5, 4);
INSERT INTO author_books (author_id, book_id) VALUES (6, 4);
INSERT INTO author_books (author_id, book_id) VALUES (7, 4);
INSERT INTO author_books (author_id, book_id) VALUES (8, 3);
INSERT INTO author_books (author_id, book_id) VALUES (9, 5);
INSERT INTO author_books (author_id, book_id) VALUES (10, 5);
INSERT INTO author_books (author_id, book_id) VALUES (11, 6);
INSERT INTO author_books (author_id, book_id) VALUES (12, 6);
INSERT INTO author_books (author_id, book_id) VALUES (13, 7);
INSERT INTO author_books (author_id, book_id) VALUES (14, 8);
INSERT INTO author_books (author_id, book_id) VALUES (15, 8);