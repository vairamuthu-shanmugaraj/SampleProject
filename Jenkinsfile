pipeline {
  agent any
  stages {
    stage('SCM-Checkout') {
      steps {
        git(url: 'https://github.com/vairamuthu-shanmugaraj/SampleStudentProject.git', branch: 'master')
      }
    }
    stage('Build') {
      steps {
        echo 'hello'
      }
    }
  }
}