CREATE DATABASE library;

CREATE TABLE `library`.`user` (
    `id` INT NOT NULL AUTO_INCREMENT , 
    `username` VARCHAR(20) NOT NULL , 
    `password` VARCHAR(20) NOT NULL , 
    PRIMARY KEY (`id`), 
    UNIQUE `UQ_USERNAME` (`username`)
) ENGINE = InnoDB;

INSERT INTO `user` (`username`, `password`) VALUES ('carlos', '12345');

CREATE TABLE books (
    id INT NOT NULL AUTO_INCREMENT, -- Llave primaria
    isbn VARCHAR(255) NOT NULL, -- Código ISBN, único
    author VARCHAR(255) NOT NULL, -- Nombre del autor
    title VARCHAR(255) NOT NULL, -- Título del libro
    publication DATE, -- Fecha de publicación
    price DECIMAL(10, 2), -- Precio con dos decimales
    PRIMARY KEY (id), -- Definimos el campo 'id' como la clave primaria
    UNIQUE (isbn), -- Restricción para que el ISBN sea único
    UNIQUE (author, title) -- Restricción para que la combinación autor-título sea única
) ENGINE = InnoDB;

INSERT INTO books (isbn, author, title, publication, price) VALUES
('978-3-16-148410-0', 'J.R.R. Tolkien', 'The Hobbit', '1937-09-21', 19.99),
('978-0-7432-7356-5', 'George Orwell', '1984', '1949-06-08', 14.50),
('978-0-06-112008-4', 'Harper Lee', 'To Kill a Mockingbird', '1960-07-11', 18.99),
('978-0-452-28423-4', 'Herman Melville', 'Moby-Dick', '1851-11-14', 22.50),
('978-0-7434-6794-2', 'J.K. Rowling', 'Harry Potter and the Philosopher''s Stone', '1997-06-26', 25.99),
('978-0-14-243723-0', 'Fyodor Dostoevsky', 'Crime and Punishment', '1866-01-01', 15.99),
('978-1-4767-4658-6', 'Leo Tolstoy', 'War and Peace', '1869-01-01', 20.00),
('978-0-385-51232-5', 'Frank Herbert', 'Dune', '1965-08-01', 21.50),
('978-0-15-100811-7', 'Gabriel García Márquez', 'One Hundred Years of Solitude', '1967-05-30', 17.00),
('978-1-5011-8777-7', 'Neil Gaiman', 'American Gods', '2001-06-19', 24.99);
