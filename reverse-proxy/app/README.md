# Reverse Proxy application

Application to route requests.

## Configuration

### Requirements

You need to install to following tools in your machine:

- Docker
- Docker Compose

### Environment variables

You need to set the environment variables below:

- **MONEY_TRACKER_REVERSE_PROXY_APP_PORT:** HTTP port (ex: 4001);
- **MONEY_TRACKER_REVERSE_PROXY_APP_AUTHORIZATION_SERVER_URL:** Authorization Server URL (ex: http://192.168.0.0:4202);
- **MONEY_TRACKER_REVERSE_PROXY_APP_DISCOVERY_SERVER_URL:** Discovery Server URL (ex: http://192.168.0.0:4101);

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
