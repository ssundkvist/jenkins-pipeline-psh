def call(String name) {
    bat """
          git push -f "https://%GIT_USERNAME%:%GIT_PASSWORD%@${name}.scm.azurewebsites.net:443/${name}.git" master
        """
}
