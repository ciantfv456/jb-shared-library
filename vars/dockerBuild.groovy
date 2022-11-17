def call(Map settings) {
  runCommand("docker build -t ${settings.tag} ${settings.context}")
}
