pipeline {
  environment {
    registry = "satu0king/calculator_app"
    registryCredential = 'dockerhub'
    dockerImage = ''
  }
  agent none
  stages {
    // stage('Maven') {
    //   agent {
    //     docker {
    //       image 'maven:3.6.3-jdk-11'
    //       args '-v /root/.m2:/root/.m2' 
    //     }
    //   }
    //   stages {
    //     stage('Build') {
    //       steps {
    //         sh 'mvn -B -DskipTests clean package'
    //       }
    //     }
    //     stage('Test') {
    //       steps {
    //         sh 'mvn test'
    //       }
    //        post {
    //             always {
    //                 junit 'target/surefire-reports/*.xml'
    //             }
    //         }
    //     }
    //   }
    // }
    // stage('Deliver') {
    //   agent any
    //   steps {
    //     sh 'docker build . -t calculator:1.0'
    //   }
    // }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
  }
}