def call(String name) {
    bat """
        git branch -d azure)
        git checkout -B azure
        git push -f "https://%GIT_USERNAME%:%GIT_PASSWORD%@${name}.scm.azurewebsites.net:443/${name}.git" azure:master
    """
}
