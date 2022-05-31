def buildApp() {
    echo 'building the application...'
} 

def issueKey = currentBuild.getBuildCauses('org.marvelution.jji.trigger.JiraCause')[0]['issueKey']

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'

} 

return this
