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
	
	
	stage('build image')
		{
		sh 'docker build -t $JOB_NAME:v1.$BUILD_ID .'
		}
	
	
	
}
