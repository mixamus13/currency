DROP TABLE IF EXISTS currency;

CREATE TABLE currency
(
    code VARCHAR(3) NOT NULL,
    rate numeric      NOT NULL,
    date date,
    PRIMARY KEY (date)
);


INSERT INTO currency (code, rate, date)
VALUES ('USD', 76.23, '2021-04-13');
INSERT INTO currency (code, rate, date)
VALUES ('AUS', 60.54, '2021-08-23');
INSERT INTO currency (code, rate, date)
VALUES ('EUR', 98.11, '2021-07-12');
INSERT INTO currency (code, rate, date)
VALUES ('DKK', 1000.55, '2021-06-09');
INSERT INTO currency (code, rate, date)
VALUES ('JPY', 350.31, '2020-06-25')