# Calendar Reminder

Send sms to your mobile phone three days before any google calendar event

## Prerequisites

* Get credentials.json file from https://cloud.google.com/docs/authentication/production#auth-cloud-implicit-java
* put it in src/main/resources

## Getting Started

```
mvn clean compile assembly:single
java -jar target/calendar-reminder-1.0-SNAPSHOT-jar-with-dependencies.jar 
```


## Built With

* [Aws SNS](https://aws.amazon.com/sns/) - Aws sns
* [Maven](https://maven.apache.org/) - Dependency Management
* [Google Api](https://developers.google.com/api-client-library/java/) 


