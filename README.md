# spring-boot-microservices

This repository maintains an example template for spring boot netflix cloud microservice architecture.

## Components

- Eureka Server
    - Performs Service Registry
- API-Gateway
    - Provide Gateway endpoints


## How to run individual components.

- Eureka
    #### Build using `docker build` 
```sh
docker build --build-arg artifactId="eureka-server" --build-arg version=0.0.1-SNAPSHOT -t eureka-server:latest . 
```
- API Gateway
```sh 
docker build --build-arg artifactId="api-gateway" --build-arg version=0.0.1-SNAPSHOT -t api-gateway .
``` 
- Client
```sh
docker build --build-arg artifactId="resource-server" --build-arg version=0.0.1-SNAPSHOT -t resource-server .
```

