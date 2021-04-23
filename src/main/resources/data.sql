DROP TABLE IF EXISTS currency;

CREATE TABLE currency
(
    id   BIGINT     NOT NULL,
    code VARCHAR(3) NOT NULL,
    rate INTEGER    NOT NULL,
    date date,
    PRIMARY KEY (id)
);


INSERT INTO currency (id, code, rate, date)
VALUES (1, 'USD', 76, '2021-04-13');
INSERT INTO currency (id, code, rate, date)
VALUES (2, 'AUS', 60, '2021-08-23');
INSERT INTO currency (id, code, rate, date)
VALUES (3, 'EUR', 98, '2021-07-12');
INSERT INTO currency (id, code, rate, date)
VALUES (4, 'DKK', 1000, '2021-06-09');
INSERT INTO currency (id, code, rate, date)
VALUES (5, 'JPY', 350, '2020-06-25')