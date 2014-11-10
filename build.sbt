organization := "myorg"

name := "toplevel"

version := "0.1"

lazy val root = (project in file(".")).aggregate(model, client)

lazy val model = project.in(file("utest-example-module"))

lazy val client = project.in(file("utest-example-module-user")).dependsOn(model)




