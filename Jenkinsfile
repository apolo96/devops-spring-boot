pipeline {
    agent { docker 'maven:3-alpine' }
    stages {
        stage('Test') {            
            steps {
                echo 'Testing...'
                sh 'cd app/ && mvn test'
            }
        }
    }
}