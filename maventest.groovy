#!/usr/bin/env groovy

#def call(String test = 'false') {
#  echo "received test=${test}"

#  if (test.equalsIgnoreCase('false')) {
    echo "running for test false"
    stages {
      stage ('install') {
        steps {
          withMaven(maven : 'maven_3_5_0') {
          sh 'mvn clean install -Dskiptest'
          }
        }
      }
    }
#  } else{
#    echo "running for test true"
#    maven {
#      goals('clean install')
#    }
#  }
#}
