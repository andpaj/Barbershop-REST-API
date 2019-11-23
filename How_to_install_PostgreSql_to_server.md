# Guide for installing PostgreSQL to a server

## Step 1: Update system
### Use following commands
    sudo apt update
    sudo apt -y install vim bash-completion wget
    sudo apt -y upgrade
    sudo reboot
    
## Step 2: Add PostgreSQL repository
### Use following commands
    wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -
    echo "deb http://apt.postgresql.org/pub/repos/apt/ 'lsb_release -cs'-pgdg main" |sudo tee /etc/apt/sources.list.d/pgdg.list
    
## Step 3: Install PostgreSQL on ubuntu
### Use following commands
    sudo apt update
    sudo apt -y install postgresql-12 postgresql-client-12
Now PostgreSQL service will be running after every system reboot
### To see your PostgreSQL service status use the following commands
    systemctl status postgresql.service
    systemctl status postgresql@12-main.service
    systemctl is-enabled postgresql
    
## Step 4: Test PostgreSQL connection
### First change the password of created user that was created automatically during installation
    sudo su - postgres
    psql -c "alter user postgres with password 'RandomPassword'"

### To use postgres you have to go into its prompt with following command
    psql

### Now to view connection info use following command in postgres prompt
    \conninfo
### To test that everything is working create new database through postgre prompt using following commands
    CREATE DATABASE mytestdb;
    CREATE USER mytestuser WITH ENCRYPTED PASSWORD 'MyStrongPassword';
    GRANT ALL PRIVILEGES ON DATABASE mytestdb to mytestuser;
### That did it, you can view all created databases using following command in postgres prompt
    \l
### To connect to the database use following command in postgres prompt
    \c mytestdb