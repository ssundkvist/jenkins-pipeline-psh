def call(String name) {
    bat """
          git checkout azure
          git branch azure
          git add .funcpack
          git commit -m 'Updated'
          echo %GIT_USERNAME%
          git push -f "https://%GIT_USERNAME%:%GIT_PASSWORD%@${name}.scm.azurewebsites.net:443/${name}.git" azure
        """
}
