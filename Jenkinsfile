pipeline {
    agent { docker 'maven:3-alpine' }
    stages {
        stage('Build'){
            steps{
                echo 'Build Successfull!!!'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing...'
                dir('app'){
                    echo 'Test Succesfull!!!'
                    //sh 'mvn test'
                }
                sh "printenv"               
            }
        }
        
                
        stage('Code Analyse'){
            steps{
                echo 'Build Successfull!!!'
            }
        }
        
        stage('Package develop'){
            when{
                branch 'develop'
            }
            steps{
                echo 'Package new app version to develop'
            }
        }
        
        stage('Deploy to develop'){
            when{
                branch 'develop'
            }
            steps{
                echo 'Deploy new app version to develop'
            }
        }
        
        stage('Package to prod'){
            when{
                branch 'master'
            }
            steps{
                echo 'Package new app version to production'
            }
        }
        
        stage('Deploy to prod'){
            when{
                branch 'master'
            }
            steps{
                echo 'Deploy new app version to production'
            }
        }
        
    }
}
