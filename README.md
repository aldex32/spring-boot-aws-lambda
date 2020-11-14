# Spring Boot AWS Lambda function

## Requirements
* Java 8
* Serverless Framework
* npm

## Deploy
```shell script
mvn install
npm install
sls deploy
```

## Test
### Create user
```shell script
curl --request POST 'https://{API-GW-id}.execute-api.eu-central-1.amazonaws.com/dev/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "First",
    "lastName": "Last"
}'
```
### Get created user
```shell script
curl https://{API-GW-id}.execute-api.eu-central-1.amazonaws.com/dev/users/{generated-id}
```
