## Spring-boot Tutorial

### 🪜Quick steps before build a spring boot project!
#### 1. install Visual Studio Code
#### 2. install an extensions such as Java extension pack and Spring Boot extension pack
<img width="580" src="https://user-images.githubusercontent.com/122346708/232107876-d16dba52-192f-46fb-9233-33cfa5349970.png"> <img width="580" src="https://user-images.githubusercontent.com/122346708/232107884-1259202f-1a5a-4520-87de-1f4f084d2a69.png">

### 💡To build a spring boot project!
#### 1. Click Create Java Project button.
#### 2. Select the project type > Spring Boot > Maven Project > Specify your spring boot version (mine is 3.0.5) > Java > com.example > demo > Jar > 17 (Java version) > Select dependencies such as Spring Web, Spring Data JPA, Lombok, MySQL Driver
#### 3. Go to src/main/java then create folders > 1. model or entity 2. repository 3. service 4. controller
#### 4. Start coding in model or entity 's layer.
#### 5. Go to MySQLWorkbench to create schema and table.
#### 6. Back to spring-boot project and go to application.properties.
####     6.1 Specify a server port.
####     6.2 Specify a DataSource Configuration (remember your username and password carefully!).
#### 7. Coding all layers and ready to run your project!
#### 8. Go to Postman and choose http request as you want (GET, POST, PUT, DELETE)
#### 9. After did the http request using Postman, then you can get back to MySQLWorkbench and run to check the content in your table.

### Where to run a project?
<img width="308" src="https://user-images.githubusercontent.com/122346708/232104640-1d12378c-9f68-4509-9874-7db51b1487a1.png">

### Also can run a project here!
<img width="544" src="https://user-images.githubusercontent.com/122346708/232105490-8ec88e6b-1bd7-4cdb-bde9-2ead31745536.png">


### Copy my database script to your MySQLWorkbench query and run it.
#### it will display a table in your MySQLWorkbench!

```
-- Host: localhost    Database: customer_service
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customer_id` varchar(20) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('1','John','Wick',45),('2','George','Rubsarb',35);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-19 15:41:09

```

### 🛠️ Tools Used 🛠️ :
#### Visaul Studio Code, MySQLWorkbench and Postman
<img width="50" height="50" src="https://user-images.githubusercontent.com/122346708/232232661-440c4d4d-1ef0-48db-bbdc-88d765aa87af.jpg"> <img width="50" height="50" src="https://user-images.githubusercontent.com/122346708/232232663-39d160f1-a644-4c7e-ac53-70be7cf9e348.png"> <img width="50" height="50" src="https://user-images.githubusercontent.com/122346708/232232678-2ac95237-afe3-4c3c-96c6-9b749a687ea9.svg">
