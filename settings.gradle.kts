pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS);
    repositories {
        google();
        mavenCentral();
        // You can keep other repositories here if needed
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "Comp-Troub"
include(":app")
