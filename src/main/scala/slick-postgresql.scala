//import com.typesafe.config.Config
import slick.driver.PostgresDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global
import slick.jdbc.JdbcBackend
import slick.jdbc.JdbcBackend.Database
//import slick.driver.MySQLDriver.api._

import java.text.SimpleDateFormat
import java.util.Calendar

object slickpostgresql {

  def main(args: Array[String]) {

    val db = Database.forConfig("database")

    try {
      // ...
    } finally db.close

    println("Hi, there!")
  }
}
