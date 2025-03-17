# Demo spring gradle

## What?

Dummy project for testing how to do PR decoration without CI integration with sonarqube server.

## How?

1. Create your project in sonarqube server by importing this github project
2. Scan main branch manually `./gradlew sonar   -Dsonar.projectKey=PROJECT_KEY   -Dsonar.projectName='demo-spring-gradle'   -Dsonar.host.url=https://YOUR_SONARQUBE_SERVER_HOST   -Dsonar.token=YOUR_TOKEN`
3. Checkout `dummy_pr` branch: `git checkout dummy_pr`
4. Test, generate test report and trigger analysis in the branch: `./gradlew test jacocoTestReport sonar   -Dsonar.projectKey=PROJECT_KEY   -Dsonar.projectName='demo-spring-gradle'   -Dsonar.host.url=https://lurodrig.ngrok.io   -Dsonar.token=YOUR_TOKEN -Dsonar.pullrequest.key=1 -Dsonar.pullrequest.branch=dummy_pr -Dsonar.pullrequest.base=main`

See [setting up the pull request analysis](https://docs.sonarsource.com/sonarqube-server/latest/analyzing-source-code/pull-request-analysis/setting-up-the-pull-request-analysis/) 
