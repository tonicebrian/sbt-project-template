name := "TestProject"

version := "1.0-SNAPSHOT"

organization := "com.example"

scalaVersion := "2.9.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.7.1" % "test"

seq(ProguardPlugin.proguardSettings :_*)

proguardOptions += keepMain("com.example.Calc")

