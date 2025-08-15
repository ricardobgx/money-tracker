# Discovery Server application

Application to register services.

## Configuration

### Requirements

You need to install to following tools in your machine:

- Docker
- Docker Compose

### Environment variables

You need to set the environment variables below:

- **MONEY_TRACKER_DISCOVERY_SERVER_APP_PORT:** HTTP port (ex: 4101);
- **MONEY_TRACKER_DISCOVERY_SERVER_APP_DISCOVERY_URL:** Discovery URL (ex: http://192.168.0.0:4101/eureka);

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
