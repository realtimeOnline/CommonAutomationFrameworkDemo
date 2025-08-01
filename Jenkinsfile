// Jenkins Pipeline for CommonAutomationFrameworkDemo
pipeline {
    parameters {
        choice(name: 'BrowserName', choices: ['Chrome', 'Firefox'], description: 'Select the browser to run tests')
        choice(name: 'Url', choices: ['https://www.cannondale.com', 'https://www.cannondale.com1'], description: 'Select the URL to test')
        choice(name: 'TestEnv', choices: ['QA', 'Dev'], description: 'Select the test environment')
    }
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    // Use Maven to build the project with parameters
                    bat "mvn clean install -DBrowserName=%BrowserName% -DUrl=%Url% -DTestEnv=%TestEnv%"
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    // Run tests using Maven with parameters
                    bat "mvn test -DBrowserName=%BrowserName% -DUrl=%Url% -DTestEnv=%TestEnv%"
                }
            }
        }
        stage('Archive Results') {
            steps {
                archiveArtifacts artifacts: 'target/surefire-reports/*.html', allowEmptyArchive: true
                junit 'target/surefire-reports/*.xml'
                // Allure report generation
               allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}
