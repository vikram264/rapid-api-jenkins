pipeline {
    agent any 
    stages {
        stage('Compile and Build') {
           steps {
               withMaven(maven : 'maven_3_6_3') {
                                     
                                    sh 'mvn clean compile'
                 }
           }
        }
        
        stage('Build and Install') {
           steps {
               withMaven(maven : 'maven_3_6_3') {
                                     
                                    sh 'mvn install'
                 }
           }
        }
        
        stage('Deploy Stage ') {
           steps {
               withMaven(maven : 'maven_3_6_3') {
                                     
                                    sh 'mvn deploy'
                 }
           }
        }
        
        
    }
}