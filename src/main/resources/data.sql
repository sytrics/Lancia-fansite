DROP TABLE IF EXISTS `product`;
DROP TABLE IF EXISTS `Cart`;

CREATE TABLE `product` (
	`id` INT,
	`name` VARCHAR(255),
	`imgpath` VARCHAR(512),
	`type` VARCHAR,
	`price` FLOAT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Cart` (
    `productid` INT,
    `quantity` INT,
    PRIMARY Key (`productid`)

);

INSERT INTO `product` (`id`, `name`, `imgpath`, `type`, `price`) VALUES
(5, 'Classic Cap','assets/img/products/cap.png','casquette',15),
(1, 'Baseball Cap','assets/img/products/lancia-baseballcap.jpg', 'casquette',20),
(2, 'Classic T-shirt','assets/img/products/classic.jpg', 'T-shirt',25),
(3, 'Italian Tribute T-shirt', 'assets/img/products/italian_tribute.jpeg','T-shirt',20),
(4, 'Keyring', 'assets/img/products/keyring.jpg', 'accessories',10);

INSERT INTO `Cart` (`productid`, `quantity`) VALUES
(1, 2),
(2, 1);



