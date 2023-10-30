CREATE TABLE login (
    id VARCHAR(9),
    name VARCHAR(50),
    surname VARCHAR(50),
    password VARCHAR(50),
);
CREATE TABLE Grades (
    id VARCHAR(9),
    subject VARCHAR(50),
    grade INT,
    FOREIGN KEY (id) REFERENCES login(id)
);
