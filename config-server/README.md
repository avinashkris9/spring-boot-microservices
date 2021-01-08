# spring-boot-microservices-config-server

An implementation of spring cloud server.

For sake of simplicity, the config server uses local file system as repository. 

## Building from docker file.


  
    ```sh 
    docker build --build-arg artifactId="config-server" --build-arg version=0.0.1-SNAPSHOT -t config-server .

    ``` 

    ```sh
    
    docker run -d -p8888:8888 --network spring-boot-microservices --network-alias config-server --volume //D//GIT//spring-boot-microservices//config-server//src//main//resources//config-repo:/opt/config-repo --name config-server config-server
    ```


