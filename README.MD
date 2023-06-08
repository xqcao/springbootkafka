# 1, start kafka server and zookeeper

    docker-compose up --build
# 2. check:
    docker ps


# 3. start spring boot 
    

# 4. postman send message:
    localhost:8080/api/v1/send?message=hello world

# 5. exec to to check message:
    docker exec --interactive --tty broker \
            kafka-console-consumer \
            --bootstrap-server broker:9092 \
            --topic javaguides \
            --from-beginning
