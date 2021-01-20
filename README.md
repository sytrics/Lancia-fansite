# Projet FullStack Lancia

## Introduction 

Dev : Guillaume Leinen @Sytrics 

front-end : Bootstrap, Jquery

Back-end : Thymeleaf, Spring 

project : develop a prototype of a fictional scuderia Lancia Fan store with Boutique. 

## Running the project 

* Run ***"LanciaApplication"*** File on project 

* check Application.properties file to have the access port (set as 9090, feel free to change this)

* open a web-browser and type 127.0.0.1:port (127.0.0.1:9090 by default) to access the site on local host

* to access the Database, go to 127.0.0.1:port/h2 and click on connect (Userid and pswd in Application.properties)
* Enjoy ! 

## Frontend (dossier src/main/resources)

4 main pages : Boutique, History, Index, membership 

2 Thymeleafs fragments : list (list of products), shoppingcart. Both included in Boutique Page

In Assets you will find some pictures and some JS files : 

* DistancetoLocation computes the distance between parameter location and Torino and returns the distance (considering the curvature of the earth)

## backend (dossier src/main/java)

2 database Tables : Product, cart 

Product has its class, its repo (to link it to DB), and its controller

Cart has its class, its repo and its controller which is included in Homecontroller 

