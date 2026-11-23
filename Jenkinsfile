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
		stage('Check maven version'){
			steps {
				bat 'mvn -version'
			}
		}
		stage('Clean and Compile') {
			steps{
				bat 'mvn clean compile'
			}
		}
		stage('Test') {
			steps{
				bat 'mvn test'
			}
		}
		stage('package') {
			steps{
				bat	'mvn package'
			}
		}
	}
}