# clojure-crud
A simple crud application in clojure built as a part of the [London Clojure Dojo at uSwitch](https://www.meetup.com/London-Clojurians/events/jjdtzqybcfbmb/)

## Dependencies
1. ring
2. compojure
3. org.clojure/java.jdbc
4. org.postgresql/postgresql

## Setup
The application tries to connect to a postgres db as defined in: src/clojure_crud/core.clj
As of now, all it does is, fetch all rows from a table called "person" and display it at root route.

In order for this to work, create a table called "person" in the db  and insert a couple records in it. For example:
```sql
CREATE TABLE person (first_name: TEXT, last_name: TEXT);
INSERT INTO person(first_name, last_name) values('john', 'doe');
```
## Run
Start the web server using the following command:
```bash
lein ring server
```
and it should open up a browser window for [localhost:3000](http://localhost:3000/) where records from the "person" table should be visible

## Further work
1. Refactor the code
2. Fix the hardcoded SQL query
3. Add functionality to Create, Update and Delete
