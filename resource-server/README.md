# Spring Resource Server

Just a template rest api.

### How to build

- Edit the spring boot property for specifying the eureka registry url.

 `eureka.client.serviceUrl.defaultZone=http://eureka:8761/eureka`

 
```sh
docker build --build-arg artifactId="resource-server" --build-arg version=0.0.1-SNAPSHOT .

```

### How to run

```sh
docker run -d  -p8081:8081  --network spring-boot-microservices --network-alias resource  --name resource-server resource-server
```