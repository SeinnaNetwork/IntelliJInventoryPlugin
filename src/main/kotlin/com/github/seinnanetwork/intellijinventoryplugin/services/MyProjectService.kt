package com.github.seinnanetwork.intellijinventoryplugin.services

import com.intellij.openapi.project.Project
import com.github.seinnanetwork.intellijinventoryplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
