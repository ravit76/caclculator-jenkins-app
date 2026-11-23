pipeline{
	agent any
	stages{
		stage('Welcome') {
			echo 'Welcome to Jenkins sample'
		}
		stage('Check Java version') {
			bat 'java --version'
		}
		stage('Check Java version'){
			bat 'mvn -version'
		}
		stage('Checkout') {
			bat 'mvn clean compile'
		}
		stage('run tests') {
			bat 'mvn test'
		}
		stage('package') {
			bat	'mvn package'
		}
	}
}