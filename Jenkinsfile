pipeline {
    agent any 
    stages {
    
    stage('CleanWorkspace') {
            steps {
                cleanWs()
            }
        }
        
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
        
        stage('Deploy Stage') {
           steps {
               pushToCloudFoundry cloudSpace: 'vik-spring-space', credentialsId: 'pcf-creds', organization: 'vik-spring-org', target: 'api.pivotal.run.io'
           }
        }
        
        
    }
}