def gv

pipeline {
    agent any
    //parameters {
    //    choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
    //    booleanParam(name: 'executeTests', defaultValue: true, description: '')
    //}
    stages {
        stage("init") {
            steps {
                script {
                   gv = load "script.groovy" 
	           bat 'java -jar C:\\agent\\DBmaestroAgent.jar -GetEnvPackages -ProjectName "poc_oracle" -EnvName "Dev_Env_1" -Server "DOPX-BERKE:8017" -AuthType DBmaestroAccount -UserName "poc@dbmaestro.com"'
  
		
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
		    bat 'java -jar C:\\agent\\DBmaestroAgent.jar -GetEnvPackages -ProjectName "poc_oracle" -EnvName "Release Source" -Server "DOPX-BERKE:8017" -AuthType DBmaestroAccount -UserName "poc@dbmaestro.com"'
                }
            }
        }
        stage("test") {
            //when {
            //    expression {
            //        params.executeTests
            //    }
            //}
            steps {
                script {
                    gv.testApp()
		    bat 'java -jar C:\\agent\\DBmaestroAgent.jar -GetEnvPackages -ProjectName "poc_oracle" -EnvName "QA_Env_1" -Server "DOPX-BERKE:8017" -AuthType DBmaestroAccount -UserName "poc@dbmaestro.com"'
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
		        bat 'java -jar C:\\agent\\DBmaestroAgent.jar -GetEnvPackages -ProjectName "poc_oracle" -EnvName "Prod_Env_1" -Server "DOPX-BERKE:8017" -AuthType DBmaestroAccount -UserName "poc@dbmaestro.com"'
                }
            }
        }
    }   
}
