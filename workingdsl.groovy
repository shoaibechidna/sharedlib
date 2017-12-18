@Library('pipeline-library')_

pipeline {
  agent any
  tools {
    maven 'maven'
  }
  stages {
    stage('code') {
      steps {
        echo "cloning the petapp"
        git 'https://github.com/shoaibechidna/spring-petclinic.git'
      }
    }

    stage('install') {
      steps {
        sh 'mvn clean install -DskipTests=true'
      }
    }
  }
}
