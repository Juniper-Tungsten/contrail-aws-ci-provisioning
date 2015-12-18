OpenContrail CI Provisioning
================================

This ansible playbook configures a jenkins server running on AWS.

This jenkins server is configured with a job for the repository:
  - github.com/Juniper/container-networking-ansible

Roles:
  - jenkins
  Installs the software packages required by the master.

  - jenkins_system
  Enables jenkins authentication, downloads the CLI and installs the plugins.

*** container-networking-ansible ***


