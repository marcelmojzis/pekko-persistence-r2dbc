/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * license agreements; and to You under the Apache License, version 2.0:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * This file is part of the Apache Pekko project, which was derived from Akka.
 */

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.9.0") // for maintenance of copyright file header
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.7.0")
addSbtPlugin("com.github.sbt" % "sbt-unidoc" % "0.5.0")

// for releasing
addSbtPlugin("org.mdedetrich" % "sbt-apache-sonatype" % "0.1.10")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")
addSbtPlugin("net.bzzt" % "sbt-reproducible-builds" % "0.31")
addSbtPlugin("com.github.pjfanning" % "sbt-source-dist" % "0.1.11")
addSbtPlugin("com.github.sbt" % "sbt-license-report" % "1.6.1")

//// docs

// We have to deliberately use older versions of sbt-paradox because current Pekko sbt build
// only loads on JDK 1.8 so we need to bring in older versions of parboiled which support JDK 1.8
addSbtPlugin(("org.apache.pekko" % "pekko-sbt-paradox" % "1.0.0").excludeAll(
  "com.lightbend.paradox", "sbt-paradox",
  "com.lightbend.paradox" % "sbt-paradox-apidoc",
  "com.lightbend.paradox" % "sbt-paradox-project-info"))
addSbtPlugin(("com.lightbend.paradox" % "sbt-paradox" % "0.9.2").force())
addSbtPlugin(("com.lightbend.paradox" % "sbt-paradox-apidoc" % "0.10.1").force())
addSbtPlugin(("com.lightbend.paradox" % "sbt-paradox-project-info" % "2.0.0").force())

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.4.1")
