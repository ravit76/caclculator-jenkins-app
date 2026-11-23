pipeline{
	agent any
	stages{
		stage('Welcome') {
			steps{
				echo 'Welcome to Jenkins sample'
			}
		}
		stage('Check Java version') {
			steps{
				bat 'java --version'
			}
		}
		stage('Check Java version'){
			steps {
				bat 'mvn -version'
			}
		}
		stage('Checkout') {
			steps{
				bat 'mvn clean compile'
			}
		}
		stage('run tests') {
			steps{
				bat 'mvn test'
			}
		}
		stage('package') {
			bat	'mvn package'
		}
	}
}