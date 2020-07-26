node {
      
      def dockerHome = tool name: 'docker1',type: 'dockerTool'
      def dockerCMD =  "${dockerHome}/bin/docker"
      
      stage ('checkout') {
          
           git credentialsId: 'github', url: 'https://github.com/sukumarvmv/bootcampday2work.git'
          
      }
    
      stage ('build') {
          
          echo 'build is in progress'
       
          def mavenHome = tool name: 'maven3',type: 'maven'
          def mavenCMD =  "${mavenHome}/bin/mvn"
          sh "${mavenCMD} clean package" 

          
          
      }
      
      stage ('docker build') {
          echo 'deploy is in progress'
          
          sh "${dockerCMD} build -t sukumarvommina1/springbook:8.0 ."
      }
      
      stage ('docker login & push') {
           
           
             withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'pass', usernameVariable: 'user')]) {
                      sh "${dockerCMD} login -u $user -p $pass"
           sh "${dockerCMD} push sukumarvommina1/springbook:8.0"
         }
      }

       stage ('pcf login & push') {
                 
           withCredentials([usernamePassword(credentialsId: 'pcfcred', passwordVariable: 'pass', usernameVariable: 'user')]) {
           sh "cf login -a https://api.run.pivotal.io -u $user -p $pass"
           sh "cf push kumarspringapp --docker-image sukumarvommina1/springbook:8.0"
            }
      }
      
    
}
