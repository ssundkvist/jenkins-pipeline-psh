def call(cmd) {
  bat 'powershell.exe -NonInteractive -NoProfile -ExecutionPolicy Bypass -Command "& ' + cmd + '"'
}
