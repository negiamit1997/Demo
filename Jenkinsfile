pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                bat "mvn clean package -DskipTests"
            }
        }
        stage('Build Image') {
            steps {
                //sh
                bat "docker build -t 8049376624/selenium-docker -f ./Dockerfile.txt ."
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'coldplay@60', usernameVariable: 'negiamit117')]) {
                    //sh
			        bat "docker login --username=${user} --password=${pass}"
			        bat "docker push negiamit117/selenium-docker:latest"
			    }                           
            }
        }
    }
}