pipeline
{
  agent any
	environment
	{
		pomfilepath="/var/lib/jenkins/workspace/JenkinsPerso/employee-management-webapp-main"
	}
	
  
  stages
  {
    stage('Checkout Git')
    {
      steps
      {
        echo 'Pulling'
        git branch: 'main', credentialsId: 'git', url: 'https://github.com/JmSkan141195/testValidation'
      }
    }
    stage ('MVN Clean')
	    {
		    steps
		    {
			    echo 'Git project recovered with success !'
			    echo 'Cleaning'
			    sh "mvn clean --f $pomfilepath"
		    }
		    post
			{
				success
                		{
                    			echo 'Clean Completed with Success ...'
				}
		    	}
	    }
	    stage ('MVN Compile')
	    {
		    steps
		    {
			    echo 'Compiling'
			    sh "mvn compile --f"
		    }
		    post
			{
				success
                		{
                    			echo 'Compilation Completed with Success ...'
				}
		    	}
		    
	    }
		
		stage ('Building ...')
		{
			steps
			{
			    echo 'Build Start ...'
			    sh "mvn package --f -Dmaven.main.skip -DskipTests"
			}

			post
			{
				success
                		{
                    			echo 'Build Completed with Success ...'
				}
		    	}
		}
  }
}
