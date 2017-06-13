# Grocery API

Basis for grocery app api.

## Usage

Start postgres in docker:

`docker run --name postgres-server -e POSTGRES_PASSWORD=* -d -p 5432:5432 postgres`

Start server:

`lein ring server`

Run tests:

`lein test`
