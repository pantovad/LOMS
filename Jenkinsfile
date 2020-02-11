pipeline {
  agent any
  options {
    timestamps()
    timeout(time: 15, unit: 'MINUTES')
  }
   
//  libraries {
//    lib('jenkins-library')
//  }

  parameters {
      string(name: 'VERSION', description: 'Specify artefact version')
      booleanParam(
		name: 'RELEASE',
		defaultValue: false, 
		description: 'This version will be served as \'release\' target', 
      )
  }

  environment {
      chatChannel = 'jenkins_deploy'
      ARTEFACT_FILE = "schedulebeta-${params.VERSION}.tgz"
      VERSION_URL = "https://d14zqdqr03kypy.cloudfront.net/${params.VERSION}"
      RELEASE_URL = "https://d14zqdqr03kypy.cloudfront.net/release"
  }
  
  stages {
    stage('Approve') {
        input {
        	message "Deploying schedulebeta version ${params.VERSION}. Would you like to proceed ?"
        	submitterParameter "APPROVER"
        }
        steps {
  			script {
  			    env.APPROVER = env.APPROVER
  			}
    	}
    }

    stage('Start') {
        steps {
            echo 'Starting deploy ...'
        }
    }
 
    stage('Artefact Download') {
	steps {
	    echo 'Getting artefact ...'	
	}

    }

    stage(Deploy) {
	failFast true
        parallel {
	    stage('Version Upload') {
		steps {
			echo 'Uploading version ...'
		}
	    }

	    stage('Release Upload') {
		when { expression { return params.RELEASE }}
		steps {
			echo 'Uploading release ...'
			}
		}
	    }
  	}
    }
 
  post {
      always {
	echo 'Notify build status ...'
      }
      cleanup {
        cleanWs()
      }
  }
}
