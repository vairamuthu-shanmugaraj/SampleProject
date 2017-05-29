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
    
    stage 'Compile'
    {
    def mvnHome = tool 'maven-3'
    sh "${mvnHome}/bin/mvn clean install -DskipTests"
    stash 'working-copy'
}
    
    
  }
}
