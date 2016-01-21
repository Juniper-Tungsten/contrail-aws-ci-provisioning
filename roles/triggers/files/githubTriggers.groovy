import jenkins.model.*

instance = Jenkins.getInstance()
subscribers = org.jenkinsci.plugins.github.extension.GHEventsSubscriber.all()

for (job in instance.getAllItems(Job.class)) {
    if (!subscribers[0].isApplicable(job)) {
        job.addTrigger(new com.cloudbees.jenkins.GitHubPushTrigger())
    }
}

instance.save()

