# Authorization Server database

Authorization Server database.

## Configuration

### Requirements

You need to install to following tools in your machine:

- Docker
- Docker Compose

### Environment variables

You need to set the environment variables below:

- **MONEY_TRACKER_AUTH_SERVER_DB_PORT:** Port number (ex: 4201);
- **MONEY_TRACKER_AUTH_SERVER_DB_ADMIN_USER:** Admin username (ex: admin);
- **MONEY_TRACKER_AUTH_SERVER_DB_ADMIN_PASS:** Admin password (ex: admin);
- **MONEY_TRACKER_AUTH_SERVER_DB_DB_NAME:** Database name (ex: auth_server);

## Run

### DevOps

To start the application You just need to run the command below inside this folder:

```shell
docker compose up -d
```

To stop the application You just need to run the command below inside this folder:

```shell
docker compose down
```
