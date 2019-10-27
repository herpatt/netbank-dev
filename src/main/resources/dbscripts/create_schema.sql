CREATE TABLE `USER` (
  `USER_ID` varchar(50) NOT NULL,
  `USERNAME` varchar(100) NOT NULL,
  `PASSWORD` varchar(250) NOT NULL,
  `USER_ROLE` char(1) DEFAULT 'C',
  `USER_STATUS` char(1) DEFAULT NULL,
  `FIRSTNAME` varchar(100) DEFAULT NULL,
  `LASTNAME` varchar(100) DEFAULT NULL,
  `DOB` DATETIME DEFAULT NULL,
  `ADD_LINE1` varchar(255) DEFAULT NULL,
  `ADD_LINE2` varchar(255) DEFAULT NULL,
  `CITY` varchar(50) DEFAULT NULL,
  `STATE` varchar(50) DEFAULT NULL,
  `PIN` int(6) DEFAULT NULL,
  `MOBILE_NUMBER` int(10) DEFAULT NULL,
  `EMAIL_ID` varchar(100) DEFAULT NULL,
  `AADHAR_ID` int(16) DEFAULT NULL,
  `PAN` varchar(10) DEFAULT NULL,
   PRIMARY KEY (`USER_ID`)
);


INSERT INTO USER Values ('56516db3-69d1-4af7-988d-ce00fc01ee3a', 'adminmanager', '$2a$11$9sHr/5Blb95fQ4CoWntjSuDCLb8vz6DR5qSiFULtI2NH3eHdOGbK.', 'M', 'A', 'Manager', 'One', '1990-12-12 00:00:00', 'Test', '', 'Chennai', 'TamilNadu', '600100', '1234567890', 'test@gmail.com', '0', '');
commit;



