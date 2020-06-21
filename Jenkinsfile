pipeline {
    agent { docker 'maven:3-alpine' }
    stages {
        stage('Test') {            
            steps {
                echo 'Testing...'
                sh 'exit 0'
                sh "printenv"               
            }
        }
        tage('Coverage') {            
            steps {
                echo 'Testing...'
                sh 'exit 1'
                sh "printenv"               
            }
        }
        tage('Reporting') {            
            steps {
                echo 'Testing...'
                sh 'exit 0'
                sh "printenv"               
            }
        }
    }
}
