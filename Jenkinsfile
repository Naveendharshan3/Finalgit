pipeline
{
  agent any
    
    stages {
       
        stage ('compile stage'){      
        steps{
        withMaven(maven : 'maven-3')  
        {
        sh 'mvn clean compile'
        }
        }
        }
    
    }
 }