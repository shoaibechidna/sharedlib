@Library(pipeline-library)_

stage('Demo') {
  echo "under the job demo"
  hello 'shoaib'
}
