# Authorization Server application

Application to manage accounts and authorize requests.

## Configuration

### Requirements

You need to install to following tools in your machine:

- Docker
- Docker Compose

### Environment variables

You need to set the environment variables below:

- **MONEY_TRACKER_AUTH_SERVER_APP_PORT:** HTTP port (ex: 4101);
- **MONEY_TRACKER_AUTH_SERVER_APP_URL:** URL using reverse proxy (ex: http://192.168.0.0:4001/auth);
- **MONEY_TRACKER_AUTH_SERVER_APP_ADMIN_USER:** Admin username (ex: admin);
- **MONEY_TRACKER_AUTH_SERVER_APP_ADMIN_USER:** Admin password (ex: admin);
- **MONEY_TRACKER_AUTH_SERVER_APP_DB_URL:** Data source URL (ex: jdbc:postgresql://auth-server-db/auth_server);
- **MONEY_TRACKER_AUTH_SERVER_APP_DB_USER:** Data source username (ex: admin);
- **MONEY_TRACKER_AUTH_SERVER_APP_DB_PASS:** Data source password (ex: admin).

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
