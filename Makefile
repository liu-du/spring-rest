start:
	docker run --rm --name web-customer-tracker-db -p 3306:3306 \
		-v $(shell pwd)/sql:/docker-entrypoint-initdb.d \
		-e MYSQL_ROOT_PASSWORD=rootpassword \
		-e MYSQL_USER=springuser \
		-e MYSQL_PASSWORD=springpass \
		-e MYSQL_DATABASE=spring_rest \
		-d mysql

restart: stop start

mysql:
	docker exec -it web-customer-tracker-db mysql --user springuser --password=springpass

stop:
	docker kill web-customer-tracker-db
