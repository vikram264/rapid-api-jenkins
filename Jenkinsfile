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
        
        stage('Deploy Stage') {
           steps {
               pushToCloudFoundry cloudSpace: 'rapid-api-space', credentialsId: 'pcf-creds', organization: 'vik-spring-org', target: 'api.run.pivotal.io'
           }
        }
        
        stage('CleanWorkspace') {
            steps {
                cleanWs()
            }
        }
        
        
    }
}