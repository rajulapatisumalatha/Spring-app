pipeline {
    agent any
 tools{
    maven 'maven'
    }
    stages {

      stage('clean')
            {
                steps
                 { 
                    sh 'mvn clean install'
                 }
            }
        stage('deploy')
              {
                  steps
                  {
                      deploy adapters: [tomcat9(credentialsId: '7bba93f5-d5bd-427e-b462-f3c552dad961', path: '', url: 'http://http://3.15.212.114:8090/')], contextPath: '/cur', war: '**/*.war'

                  }
              }
 
}
}
