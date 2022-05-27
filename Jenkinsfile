

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps {
                script {
                 echo "Init2"
                }
            }
        }
        stage("build") {
            steps {
                script {
                  echo "Build"
                }
            }
        }
        stage("test") {
            steps {
                script {
                   echo "Test"
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                   echo "Deploy"
                }
            }
        }
    }   
}
