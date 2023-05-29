# gradle-multi-project-masterclass-groovy
This is a project where I tested out building a multi-module project with Gradle groovy

# buildSrc
This is the directory which is always built, before other sub-projects in a Gradle project.

## build.gradle
Holds a build script using the 'groovy-gradle-plugin' to build a local plugin which can be used in sub-projects called common-conventions.

## common-conventions.gradle
Holds the plugins, repositories, test setup and dependencies which should be common for all sub-projects

# app, model, service
These sub-projects all have separate build.gradle scripts which utilize the common-convention plugin. They also pull in the necessary additional plugins and dependencies needed.