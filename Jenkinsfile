pipeline {
    agent { docker 'maven:3-alpine' }
    stages {
        stage('Test') {            
            steps {
                step{
                    echo 'Testing...'
                    sh 'cd app/ && mvn test'
                }
                
                step{
                    sh "printenv"
                }
                
            }
        }
    }
}
