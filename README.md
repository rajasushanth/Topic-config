# Topic Config

Topic Config is a configuration server for externalizing the properties of the Topic Service and Topic Web applications. Updating application properties is simple and achievable without restarting the application 

## Getting Started

Clone the repository to your local by executing the command in git bash.

```git clone https://github.com/rajasushanth/Topic-config.git```

## Prerequisites

* JDK v1.8 or above
* Maven v3.0.5 or above

## Installing

1. Navigate to the project root where pom.xml resides
2. Built the WAR module by executing ```mvn clean install```

## Continous Integration / Continous Deployment - Travis CI
**Why Travis CI ?**

1. Travis CI is a free Continous Integration service for projects hosted in GitHub
2. Simple configuration steps through .travis.yml 
3. Support for deployment of application in Pivotal cloud foundry

**Steps to deploy**
1. Sign in to [Travis CI](https://travis-ci.org/) with you GitHub account.
2. Add the Topic-config repository in Travis CI
3. Push the app in GitHub, which triggers the build process and deploys the application in Pivotal cloud foundry

## Manual Deployment 
**Running it in local**

1. Navigate tho the path where WAR build resides
2. Execute the command in the command line
```java -jar topic-config-0.0.1-SNAPSHOT.jar```

**Running in Pivotal cloud foundry**
1. Create an account in [Pivotal cloud foundry](https://login.run.pivotal.io/login)
2. Install the [Cloud Foundry CLI](https://docs.cloudfoundry.org/cf-cli/install-go-cli.html)
3. Get the [manifest.yml](https://github.com/rajasushanth/Topic-manifest/blob/master/topic-config/manifest.yml)
4. Execute the command ```cf push```

## Author

* **RajaSushanth** - [GitHub RajaSushanth](https://github.com/rajasushanth)
