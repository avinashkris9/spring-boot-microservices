# spring-boot-microservices

This repository maintains an example template for spring boot netflix cloud microservice architecture.

## Components

- Eureka Server
    - Performs Service Registry
- API-Gateway
    - Provide Gateway endpoints


## How to run individual components.


### - Create docker network
Docker by default create a bridge network for same host container. Here we are creating a user network and provide alias for each services.

```sh
docker network create spring-boot-microservices
```

### - Eureka

   - Build using `docker build` 
    ```sh
    docker build --build-arg artifactId="eureka-server" --build-arg version=0.0.1-SNAPSHOT -t eureka-server:latest . 
    ```
   - Run using `docker run` 
    ```sh
    docker run -d  -p8761:8761  --network spring-boot-microservices --network-alias eureka  --name eureka-server eureka-server 
    ```
1.

### - API Gateway

    ```sh 
    docker build --build-arg artifactId="api-gateway" --build-arg version=0.0.1-SNAPSHOT -t api-gateway .
    ``` 

    ```sh
    docker run -d  -p8080:8080  --network spring-boot-microservices --network-alias api-gateway  --name api-gateway api-gateway
    ```

### - Client
    ```sh
    docker build --build-arg artifactId="resource-server" --build-arg version=0.0.1-SNAPSHOT -t resource-server .
    ```

    ```sh
    docker run -d  -p8081:8081  --network spring-boot-microservices --network-alias api-gateway  --name resource-server resource-server
    ```
