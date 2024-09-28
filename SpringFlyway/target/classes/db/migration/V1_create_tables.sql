CREATE TABLE IF NOT EXISTS candidates (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    fullName VARCHAR(80) NOT NULL,
    email VARCHAR(80) NOT NULL,
    gender VARCHAR(50) NOT NULL,
    salaryExpected VARCHAR(10) NOT NULL,
    roleApply  VARCHAR(50) NOT NULL,
    career VARCHAR(50) NOT NULL
    );