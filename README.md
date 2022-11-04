# Quarkus RESt API example


## Running the application in `dev` mode

First start the docker:

```bash
$ cd docker && docker-compose up -d
```

Then create tables with some predefined data,

```bash
$ ./db_initializer.sh
```

Finally, you can run your application in dev mode that enables live coding using:

```bash
$ ./mvnw quarkus:dev
```

## Interacting with APIs

The app runs on `localhost:8080`. You can interact with the APIs via Swagger `localhost:8080/swagger-ui`

Alternatively you can use CURL as follows,

```bash
# get list of users (secured, accessible to users with 'ADMIN' or 'USER' role)
$ curl --anyauth --user leo:1234 localhost:8080/v1/users/

# get a specific user (secured, accessible to users with 'ADMIN' or 'USER' role)
$ curl --anyauth --user leo:1234 localhost:8080/v1/users/2

# create a user (open)
$ curl --request POST 'localhost:8080/v1/users' --header 'Content-Type: application/json' \
--data-raw '{
	"firstName": "Tom",
	"lastName": "Cruise",
	"age": 57
}'

# edit a user (secured, accessible to users with 'ADMIN' role only)
$ curl --anyauth --user admin:admin --request PUT 'localhost:8080/v1/users/1' --header 'Content-Type: application/json' \
--data-raw '{
	"firstName": "Leonardo",
	"lastName": "DiCaprio",
	"age": 46
}'

# delete a user (secured, accessible to users with 'ADMIN' role only)
$ curl --anyauth --user admin:admin --request DELETE 'localhost:8080/v1/users/2'
```

## Debugging the application

To debug the app, run the following command first,

```bash
$ ./mvnw quarkus:dev -Ddebug
```

This activates debug on port `5005`. Then use your IDE to connect to `localhost:5005` to debug the application.
