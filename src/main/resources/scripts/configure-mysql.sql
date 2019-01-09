## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE scpa_dev;
CREATE DATABASE scpa_prod;

#Create database service accounts
CREATE USER 'scpa_dev_user'@'localhost' IDENTIFIED BY 'Pq4s67Xa';
CREATE USER 'scpa_prod_user'@'localhost' IDENTIFIED BY 'Pq4s67Xa';
CREATE USER 'scpa_dev_user'@'%' IDENTIFIED BY 'Pq4s67Xa';
CREATE USER 'scpa_prod_user'@'%' IDENTIFIED BY 'Pq4s67Xa';

#Database grants
GRANT SELECT ON scpa_dev.* to 'scpa_dev_user'@'localhost';
GRANT INSERT ON scpa_dev.* to 'scpa_dev_user'@'localhost';
GRANT DELETE ON scpa_dev.* to 'scpa_dev_user'@'localhost';
GRANT UPDATE ON scpa_dev.* to 'scpa_dev_user'@'localhost';
GRANT SELECT ON scpa_prod.* to 'scpa_prod_user'@'localhost';
GRANT INSERT ON scpa_prod.* to 'scpa_prod_user'@'localhost';
GRANT DELETE ON scpa_prod.* to 'scpa_prod_user'@'localhost';
GRANT UPDATE ON scpa_prod.* to 'scpa_prod_user'@'localhost';
GRANT SELECT ON scpa_dev.* to 'scpa_dev_user'@'%';
GRANT INSERT ON scpa_dev.* to 'scpa_dev_user'@'%';
GRANT DELETE ON scpa_dev.* to 'scpa_dev_user'@'%';
GRANT UPDATE ON scpa_dev.* to 'scpa_dev_user'@'%';
GRANT SELECT ON scpa_prod.* to 'scpa_prod_user'@'%';
GRANT INSERT ON scpa_prod.* to 'scpa_prod_user'@'%';
GRANT DELETE ON scpa_prod.* to 'scpa_prod_user'@'%';
GRANT UPDATE ON scpa_prod.* to 'scpa_prod_user'@'%';

