# RabbitMQ
docker run -d --hostname my-rabbit --name some-rabbit -p 8080:15672 rabbitmq:3-management
# MySQL
docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:latest