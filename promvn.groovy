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

                    dir ('baz') {
                        git 'https://github.com/shoaibechidna/spring-petclinic.git'
                    }

                }


             }

    stage('install') {
        steps {
            mavenjob 'false'
        }
    }

    }

}
