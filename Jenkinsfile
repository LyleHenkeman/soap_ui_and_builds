node {
    docker.withRegistry('http://ipaddress') {

        git url: "git@github.com:TAKEALOT/tal_soap.git", credentialsId: 'takealot-github-user'

        sh "git rev-parse --abbrev-ref HEAD > .git/branch-name"
        def branch = readFile('.git/branch-name').trim()

        stage "build"
        def app = docker.build "takealot/tal_soap"

        stage "publish"
        app.push "${branch}"
    }
}
