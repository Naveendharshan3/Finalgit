pipeline
{
  agent any
    
    stages {
       
        stage ('compile stages'){      
        steps{
        withMaven(maven : 'maven-3')
        {
        sh 'mvn clean'
        }
        }
        }
    
    }
 }
