CREATE TABLE IF NOT EXISTS users (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(256) NOT NULL,
  password VARCHAR(256) NOT NULL,
  role VARCHAR(256) NOT NULL,
  first_name VARCHAR(256) NOT NULL,
  last_name VARCHAR(256) NOT NULL,
  age INTEGER NOT NULL
) engine=InnoDB;
CREATE TABLE IF NOT EXISTS ruche (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  position VARCHAR(256) NOT NULL,
  isActif BOOLEAN NOT NULL,
  type VARCHAR(256) NOT NULL,
  poids INTEGER NOT NULL,
  temperature INTEGER NOT NULL,
  humidite INTEGER NOT NULL
) engine=InnoDB;

-- password = admin
INSERT IGNORE INTO users(username, password, role, first_name, last_name, age) VALUES("admin", "$2a$10$0.sx37/fBVMAxmasa3M5.uvNUPPXj6HSvjdyOsPONvG2WCVjq1KVW", "ADMIN", "tapoupa", "tara", 30);

INSERT IGNORE INTO ruche(position,isActif,type,poids,temperature,humidite)  VALUES("Pays de la loire",true,"A",15,10,60);