pipeline {
    agent { docker 'maven:3-alpine' }
    stages {
        stage('Test') {            
            steps {
                echo 'Testing...'
                dir('app'){
                    sh 'mvn test'
                }
                sh "printenv"               
            }
        }
    }
}
