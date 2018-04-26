import support.Driver
import java.sql.ResultSet

import org.jooq.util.GenerationTool

import scala.io.Source

object H2 extends App
{
  val conn = Driver.getConnection()

  conn.setAutoCommit(false)

  val stmt = conn.createStatement
  stmt.execute {
"""
CREATE TABLE IF NOT EXISTS `author` (
  `id` int NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);"""
  }

  stmt.execute("delete  from author")
  stmt.execute("INSERT INTO author(id, first_name, last_name) VALUES(1, 'Anju', 'Saito')")
  stmt.execute("INSERT INTO author(id, first_name, last_name) VALUES(2, 'Sonia', 'Sato')")
  stmt.execute("INSERT INTO author(id, first_name, last_name) VALUES(3, 'Asha', 'Ana')")

  val rs: ResultSet = stmt.executeQuery("select * from author")
  while ( {
    rs.next
  }) {
    System.out.println("Id " + rs.getInt("id") + " Name " + rs.getString("first_name"))
  }
  stmt.close()
  conn.commit()

  conn.close()


  val fileContents = Source.fromResource("gen.xml").getLines.mkString
  GenerationTool.generate(fileContents)
}