#!/usr/bin/env groovy

def call(String test = 'false') {
  echo "test=${test}"
  if (test.equalsIgnoreCase('false')) {
    mavenJob('mavenjob') {
      goals('clean install -DskipTests')
    }
  } else{
    mavenJob('mavenjob') {
      goals('clean install')
    }
  }
}
