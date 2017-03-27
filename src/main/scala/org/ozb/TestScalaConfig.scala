package org.ozb

import org.slf4j.LoggerFactory
import com.typesafe.config.ConfigFactory

object TestScalaConfig {
  lazy val log = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]) {
    log.info("***** Starting *****")

    log.info("Application configuration")
    val conf = ConfigFactory.load()
    log.info("myapp.environment = " + conf.getString("myapp.environment"))
    log.info("myapp.server-address = " + conf.getString("myapp.server-address"))
    log.info("myapp.server-port = " + conf.getInt("myapp.server-port"))
    log.info("myapp.some-other-setting = " + conf.getString("myapp.some-other-setting"))

    log.info("***** Finished *****")
  }

}