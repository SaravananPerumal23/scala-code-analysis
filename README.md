# Sample Scala Application with static code analysis setup 
Sample Scala application with SonarQube integrated for code analysis

#### Pre-Requisite
* Install Scala
* Install SBT
* Setup SonarQube or make use of SonarCloud
* Setup Jenkins


### Best Practices
* Use proper naming convention
* Create unit test cases as part of your development
* Use code scanning tools for static code analysis, code vulnerability checks (For Ex. SonarQube, Fortify)
* Follow git branching strategy and allow merge to master branch through PRs with code review done

#### Building project
```
sbt compile
```
#### Running project
```
sbt run
```

## Setting up Jenkins & SonarQube

For easy use case, we could setup Jenkins & Sonarqube using Docker and its been simplified with docker-compose.

Use below commands to create docker containers 

```
docker-compose -f docker-compose.yml up --build
```

```
docker-compose up -d
```

After Jenkins and Sonarqube has been setup with Docker containers, you should be able to access them from browser. 
If its hosted using docker-machine, then you need to access using its IP Address

<b><u>Jenkins</u></b>

http://localhost:8080

or

http://{DOCKER-ENGINE-IPADDRESS}:8080


<b><u>Sonarqube</u></b>

http://localhost:9000

or

http://{DOCKER-ENGINE-IPADDRESS}:9000


## Jenkins Pipeline
Pipeline can be setup to build, unit test, code scan with Sonarqube which gets triggered with every code push.

Once your Jenkins is up and running, install the pre-requisites from 'Manage Jenkins' menu option

* Git
* Sbt plugin

#### Jenkins job setup
* Create a new job/item
    * Give it a name (“Scala/SBT Test 1”)
    * Choose Pipeline
    * Click Ok
* Next screen
    * Fill in the Description (whatever you want)
* Under Pipeline:
    * Choose “Pipeline script from SCM”
    * SCM = Git
    * Repo URL: Provide path of Git repo and the JenkinsFile location
* Save
* Click “Build now”

