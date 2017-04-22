#! /bin/bash
./wait-for-it.sh mypostgres:5432 -t 15
java -Djava.security.egd=file:/dev/./urandom -jar app.jar
