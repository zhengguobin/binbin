package com.github.zhengguobin.binbin.services

import com.github.zhengguobin.binbin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
