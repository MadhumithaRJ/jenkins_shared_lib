def call(){
    sh "export MAVEN_OPTS='--add-opens jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED' && mvn test"
    sh 'mvn test'
}
