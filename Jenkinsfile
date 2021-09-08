pipeline {
    agent any

    stages {
        stage ('Git Pull Stage') {
            steps {
                    git branch: 'main', credentialsId: '68762c80-8964-41c1-8cf1-fc88d6087436', url: 'https://github.com/sridharkondeti/JenkinsPractice'
            }
        }

        stage ('Build Stage') {
            steps {
                // sh 'export PATH=$PATH:/home/sridhar_skondeti/apache-maven-3.8.2/bin'
                sh '/home/sridhar_skondeti/apache-maven-3.8.2/bin/mvn clean'
                sh '/home/sridhar_skondeti/apache-maven-3.8.2/bin/mvn compile'
                sh '/home/sridhar_skondeti/apache-maven-3.8.2/bin/mvn package'
            }
        }
        stage ('Deployment Stage') {
            steps {
                    sh 'gcloud compute copy-files target/gs-maven-0.1.0 --project demoproject-323305 root@tomcat-2:/usr/local/tomcat/webapps/ --zone us-west4-b'
            }
        }
    }
}
