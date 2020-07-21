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
     /**   stage('deploy')
              {
                  steps
                  {
                       
  withCredentials([usernamePassword(credentialsId: 'tomcatCred', passwordVariable: 'password', usernameVariable: 'username')])
                      {
   sh 'curl  http://3.128.155.152:8090/manager/text/undeploy?path=/cur -u ${username}:${password}'
   sh 'curl -v -u ${username}:${password} -T target/Spring-app-0.0.1-SNAPSHOT.war http://3.128.155.152:8090/manager/text/deploy?path=/cur'
                      }

                     
                  }
              }*/
    stage('Uploading artifacts to Ansible'){
            steps{
 withCredentials([usernamePassword(credentialsId: 'docker1', passwordVariable: 'pass', usernameVariable: 'userId')]) {
                              sh 'sshpass -p ${pass} scp -o StrictHostKeyChecking=no target/*.war  revathi$172.31.18.28:~/target'

            }
}
    }
}
}
