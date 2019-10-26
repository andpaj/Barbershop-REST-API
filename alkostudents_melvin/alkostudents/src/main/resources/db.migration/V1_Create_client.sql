CREATE TABLE Client(
    id      SERIAL PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    phone INTEGER(10),
    mail VARCHAR(50),
    serviceId SMALLINT,
    foreign key (serviceId) references BARBERSERVICES(serviceid),
    timeId  INTEGER,
    foreign key (timeId) references TIMETABLE(timeId)
);