# Simple Spring boot application with docker

## Steps
1. git clone this app.
2. change jar path in docker file to your local system path.
3. build using:
    mvn clean install dockerfile:build      
4. Then you can push to dockhub using:
    docker push ashutosh3/mytest1:0.0.1-SNAPSHOT 
5.Run the app in docker using:
    docker run -p 8080:8080 -t ashutosh3/mytest1:0.0.1-SNAPSHOT
6. verify application by browsing :
    localhost:8080

### -- Ashutosh Shashi
#### https://www.ashutoshshashi.com

