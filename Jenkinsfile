node
{
 	    stage('git check out')
		{
		git 'https://github.com/Naveendharshan3/Finalgit.git'
		}
	
	stage('mvn package')
		{
			def mvnHome =tool name: 'maven-3', type: 'maven'
			def mvnCMD = "${mvnHome}/bin/mvn"
			sh "${mvnCMD} clean package"
        }
	
	
	stage('docker images')
		{
		sh 'docker build -t $JOB_NAME .'
		
		}
	
	
	stage('docker push to docker hub')
		{
			
			docker.withRegistry('https://636658394677.dkr.ecr.us-east-1.amazonaws.com/newrepos','ecr:us-east-1:ecr-credentials')
			{
			sh  'docker tag $JOB_NAME:latest 636658394677.dkr.ecr.us-east-1.amazonaws.com/$JOB_NAME:latest'
			sh 'docker push 636658394677.dkr.ecr.us-east-1.amazonaws.com/$JOB_NAME:latest'
			
			}
		}
	
	
	stage('docker push to docker hub')
		{
			
			
		}
	
	
}
