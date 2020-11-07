# Peer_Study_Helping_Backend
This is the working repository for group project Peer Study Helping platform.

The `master` branch is for completed code merged from other feature branch. Do not push directly into `master`.

One branch for each group member with their unique tasks.

**This is the backend project repository, if you are looking for the front project, checkout [this link](https://github.sydney.edu.au/ELEC5619-2020/Peer_Study_Helping_Frontend).**
## Project setup
### Dependencies that need to be installed manually
- Java: Open JDK 11
- MySQL: 8

To install the Java project dependencies, use Maven command or the Maven tool window in IntelliJ.

### MySQL setup
- Port: `3306`
- Database name: `peerhelping`
- Database user: `root`
- Database password: `mysql_pwd`

### Connect MySQL in IntelliJ
Click `View -> Tool Windows -> Database`, then click the `+` button and add MySQL as datasource.

In the configuration:

**General**
- `Host`: `localhost`
- `User`: `root`
- `Password`: `mysql_pwd`
- `Database`: `peerhelping`
- `Port`: `3306`

**Advanced**

Find `serverTimezone`, set the value to `UTC`, then apply.

### Create table in database
**Create database before you use the SQL script!**
1. Create tables in your database using SQL script.
    SQL script location: `/src/main/resources/static/sql/elec5619_assignment.sql`
2. Load sample data into your tables
    SQL scripts location: `/src/main/recourses/static/sql/peerhelping_[table_name].sql`

Run the scripts in IntelliJ.

#### Table
1. courses

|Field name|Type|Null type|key|
|----|----|----|----|
|courseId|int|Not Null|yes|
|description|varchar(45)|Not Null||
|name|varchar(45)|Not Null||
|courseCode|varchar(45)|Not Null||

2. users

|Field name|Type|Null type|key|
|----|----|----|----|
|sid|int|Not Null|yes|
|first_name|varchar(45)|Not Null||
|last_name|varchar(45)|Not Null||
|gender|varchar(45)|||
|password|varchar(45)|Not Null||

3. matches

|Field name|Type|Null type|key|
|----|----|----|----|
|matchId|int|Not Null|yes|
|studentSid|int)|Not Null||
|tutorSid|int|Not Null||
|courseId|int|Not Null||
|matchTime|varchar(45)|Not Null||

4. calendar

|Field name|Type|Null type|key|
|----|----|----|----|
|calendarId|int|Not Null|yes|
|sid|int|Not Null||
|availableTime|varchar(45)|Not Null||

5. intrestedIn

|Field name|Type|Null type|key|
|----|----|----|----|
|sid|int|Not Null||
|courseId|int|Not Null||
|interestId|int)|Not Null|yes|


### Run the project
Start your MySQL server **before** launch the Spring application!

In your IntelliJ IDEA：
Click `Run` -> `Run 'PeerhelpingApplication'`, the Tomcat server will run on `localhost:8888` .

If you can't see the run option in your IDE, go to `src/main/java/org/elec5619/peerhelping/PeerhelpingApplication.java` and run this Java file.
