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
		stage('perform Checkout') {
			steps{
				bat 'mvn clean compile'
			}
		}
		stage('run tests') {
			steps{
				bat 'mvn test'
			}
		}
		stage('run package') {
			steps{
				bat	'mvn package'
			}
		}
	}
}