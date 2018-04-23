# RR_RekeningAdministratie

## How to run project:
### Requirements:
- Payara (With MySQL connector in /lib folder)
- MySQL database

### Steps:
- Clone GitHub project
- Open project in Netbeans
- Make new Payara server for project
- Right-click on project, select 'Properties' (at the bottom) and go to 'Run'
- Select the new Payara server at the top

- In the Netbeans project, open Web Pages/WEB-INF/glassfish-resources.xml
- Change the User and Password properties to your own MySQL credentials
- Copy the database name from the property
- Go to Services and create a new database with the copied database name

- Run Payara server (*MAKE SURE YOUR DATABASE IS RUNNING IN NETBEANS!!!*)
- Right-click on server and select 'View Domain Admin Console' (a page will open in your browser)
- Navigate to 'Resources'
- Click on 'Add Resources' at the top, select the button before 'Local XML file that is accessible from Payara Server'
- Browse to the project's Web Pages/WEB-INF/glassfish-resources.xml
- Click OK at the top right

- In the menu on the left, expand Configurations, server-config, Security
- Click on 'Realms'
- Add a new realm named 'loginRealmESD'
- Select JDBCRealm as class name
- Enter the following properties (CASE-SENSITIVE!)
  - JAAS-Context: jdbcRealm
  - JNDI: jdbc/RekeningAdministratie
  - User Table: user
  - User Name Column: EMAIL
  - Password Column: PASSWORD
  - Group Table: user_role
  - Group Table User Name Column: User_ID
  - Group Name Column: role_NAME
  - Digest Algorithm: SHA-256
  - Encoding: Base64
  - Charset: UTF-8
# rekeningadministratie
