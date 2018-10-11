CREATE TABLE product_book (
  booking_id bigint(20) NOT NULL AUTO_INCREMENT,
  product_id bigint(20) NOT NULL,
  delivery_address varchar(255) NOT NULL,
  count bigint(20) NOT NULL,
  PRIMARY KEY(booking_id)
);