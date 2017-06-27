# Spring Boot app & Postgresql & Docker compose

## 1. Build app & Dockerfile

`mvn clean install`

OR:

`docker run -it --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven -v /var/run/:/var/run/ maven mvn clean install`

## 2. Run docker-compose

`cd src/main/docker`

`docker-compose up`

**What happens:**

1. Starts Postgresql and waits up to 15 seconds for it to finish ([using wait-for-it](https://github.com/vishnubob/wait-for-it))
2. Starts Spring boot application which populates database with some test data

## 3. Test

Navigate to <http://localhost:8080> and you should see: `[{"id":1,"name":"A"},{"id":2,"name":"B"},{"id":3,"name":"C"}]`
