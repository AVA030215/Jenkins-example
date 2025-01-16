pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Cloning repository from GitHub...'
                git url: 'https://github.com/your-username/Jenkins-example.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh './gradlew test'
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
