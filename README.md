# Money Tracker

Application to track your money spend.

## Modules

This application contains the modules below:

- [x] Reverse Proxy
  - [x] Application
- [x] Discovery Server
  - [x] Application
- [x] Authorization Server
  - [x] Database
  - [x] Application
- [ ] Profiles
  - [ ] Database
  - [ ] API
- [ ] Transactions
  - [ ] Database
  - [ ] API
- [ ] Web
  - [ ] app

## Configuration

### Requirements

You need to install the following tools in your machine:

- Docker
- Docker Compose

### Environment variables

Please refer to each module's README file to set the environment variables correctly.

## Run

### DevOps

To start the application You just need to run the command below inside this folder:

```sh
docker compose up -d
```

To stop the application You just need to run the command below inside this folder:

```sh
docker compose down
```

## Ports mapping

Below You'll find the ports mapping of the project:

| Module               | Ports                 |
| -------------------- | --------------------- |
| Reverse Proxy        | 4001 (app)            |
| Discovery Server     | 4101 (app)            |
| Authorization Server | 4201 (db), 4202 (app) |
| Profiles             | 4301 (db), 4302 (api) |
| Transactions         | 4401 (db), 4402 (api) |
| Web                  | 4501 (app)            |
