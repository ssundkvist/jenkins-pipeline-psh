def call(String name) {
    bat """
        FOR /f %%i IN ('git branch --list azure') DO SET BRANCH_EXISTS=%%i
        IF DEFINED BRANCH_EXISTS (git checkout azure) ELSE (git checkout -b azure)
        git push -f "https://%GIT_USERNAME%:%GIT_PASSWORD%@${name}.scm.azurewebsites.net:443/${name}.git" azure:master
    """
}
