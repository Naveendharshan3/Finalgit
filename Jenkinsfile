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
		sh 'docker build -t $JOB_NAME:v1.$BUILD_ID .'
		}
	
	stage('docker push to docker hub')
		{
		sh 'docker login -u naveendockertt -p asdf1345'
		sh 'docker push $JOB_NAME:v1.$BUILD_ID'
		}
	
	
	
}
