package support

import java.sql.{Connection, DriverManager}

object Driver {
  def getConnection():Connection = {
    Class.forName("org.h2.Driver")
    DriverManager.getConnection("jdbc:h2:h2db/database", "sa", "")
  }
}
