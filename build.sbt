name := "UserToUser"

version := "1.0-SNAPSHOT"

organization := "com.tuenti.recsys"

scalaVersion := "2.9.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.8" % "test"

seq(ProguardPlugin.proguardSettings :_*)

proguardOptions += keepMain("com.example.Calc")

