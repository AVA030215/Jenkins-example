pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Cloning repository from GitHub...'
                git credentialsId: 'GitHub-Credential', url: 'https://github.com/AVA030215/Jenkins-example.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                bat './gradlew.bat build'  // Windows 환경에서는 gradlew.bat 사용
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat './gradlew.bat test'  // Windows 환경에서는 gradlew.bat 사용
            }
        }

        stage('Deploy') {
            steps {
                echo 'Simulating deployment...'
                echo 'Deploy successful!'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the logs for details.'
        }
    }
}
