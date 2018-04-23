pipeline {
    agent any
 
    tools {
        jdk 'jdk8'
        maven 'maven3'
    }
 
    stages {
    stage('Test and SonarQube parallel') {
        steps {
        parallel(
                test: {
                    sh "mvn -U clean test cobertura:cobertura -Dcobertura.report.format=xml"
                },
                sonar: {
                    sh "mvn sonar:sonar -Dsonar.host.url=${env.SONARQUBE_HOST}"
                }
        )
        }
        post {
        always {
            junit '**/target/*-reports/TEST-*.xml'
            step([$class: 'CoberturaPublisher', coberturaReportFile: 'target/site/cobertura/coverage.xml'])
        }
        }
    }
 
    stage ('Deploy to artifactory'){
        steps{
        configFileProvider([configFile(fileId: 'our_settings', variable: 'SETTINGS')]) {
            sh "mvn -s $SETTINGS deploy -DskipTests -Dartifactory_url=${env.ARTIFACTORY_URL}"
        }
        }
    }
    }
}

