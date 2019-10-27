CREATE TABLE Client_Marka(
                       id      SERIAL PRIMARY KEY,
                       firstName VARCHAR(255) NOT NULL,
                       lastName VARCHAR(255) NOT NULL,
                       phone LONG,
                       mail VARCHAR(50),
                       services VARCHAR(255),
                       date VARCHAR(255),
                       time VARCHAR(255)
);