/*==============================================================*/

DROP TABLE IF EXISTS address CASCADE;

DROP TABLE IF EXISTS client CASCADE;

DROP TABLE IF EXISTS payment CASCADE;

DROP TABLE IF EXISTS payment_method CASCADE;

DROP TABLE IF EXISTS invoice CASCADE;

DROP TABLE IF EXISTS invoice_status CASCADE;


/*==============================================================*/
/* Table: address                                               */
/*==============================================================*/
CREATE TABLE address
(
  id_address   INT  NOT NULL PRIMARY KEY AUTO_INCREMENT,
  street       TEXT NOT NULL,
  house_number TEXT NOT NULL,
  flat_number  TEXT NOT NULL,
  city         TEXT NOT NULL,
  postal_code  TEXT NOT NULL
);

/*==============================================================*/
/* Table: client                                                */
/*==============================================================*/
CREATE TABLE client
(
  id_client    INT  NOT NULL PRIMARY KEY AUTO_INCREMENT,
  id_address   INT  NOT NULL ,
  name         TEXT NOT NULL,
  surname      TEXT NOT NULL,
  PESEL        TEXT NOT NULL,
  phone_number TEXT NOT NULL,
  mail         TEXT NOT NULL
);

/*==============================================================*/
/* Table: payment_method                                        */
/*==============================================================*/
CREATE TABLE payment_method
(
  id_payment_method NUMERIC  NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name              TEXT NOT NULL
);

/*==============================================================*/
/* Table: payment                                               */
/*==============================================================*/
CREATE TABLE payment
(
  id_payment        NUMERIC  NOT NULL PRIMARY KEY AUTO_INCREMENT,
  id_payment_method NUMERIC  NOT NULL REFERENCES payment_method (id_payment_method),
  value             INT  NOT NULL,
  date_of_payment   DATE NOT NULL
);



/*==============================================================*/
/* Table: reservation_status                                    */
/*==============================================================*/
CREATE TABLE invoice_status
(
  id_invoice_status NUMERIC  NOT NULL PRIMARY KEY AUTO_INCREMENT,
  invoice_status    TEXT NOT NULL
);



/*==============================================================*/
/* Table: reservation                                           */
/*==============================================================*/
CREATE TABLE invoice
(
  id_invoice            NUMERIC  NOT NULL PRIMARY KEY AUTO_INCREMENT,
  id_resrevation_status NUMERIC  NOT NULL REFERENCES invoice_status (id_invoice_status),
  id_payment            NUMERIC  NOT NULL REFERENCES payment (id_payment),
  id_client             NUMERIC  NOT NULL REFERENCES client (id_client),
  from_date             DATE NOT NULL,
  to_date               DATE NOT NULL,
  invoice_date          DATE NOT NULL,
  amount                INT  NOT NULL
);

