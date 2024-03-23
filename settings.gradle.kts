pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ru.mirea.Bykonya.Lesson3"
include(":app")
include(":app:intentapp")
include(":app:sharer")
include(":app:favoritebook")
include(":app:systemintentsapp")
include(":app:simplefragmentapp")
include(":app:mireaproject")
