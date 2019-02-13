pipeline
{
  agent any
    
    stages {
       
        stage ('compiles')
		{      
        steps
		{
			def mvnHome = tool name: 'maven-3', type: 'maven'
			def mvnCMD = "${mvnHome}/bin/home"
			sh "${mvnCMD} clean package"
        }
        } 
        stage ('compile stage')
		{      
        steps
		{
          echo 'hello hi there..!'
        }
		}		
 
        
    
    }
 }
