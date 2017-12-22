def myMethod(String firstVar, Map envVars = [:]) {
    def originalMap = [ JENKINS_COMMAND : firstVar ]
    def mergedMap = originalMap + envVars
    println mergedMap
}
myMethod('1', [me: 'at'])
myMethod('1')
