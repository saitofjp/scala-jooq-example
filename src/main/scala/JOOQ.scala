import collection.JavaConversions._


import support.Driver
import org.jooq._
import org.jooq.impl._
import org.jooq.impl.DSL._
import org.jooq.scalaextensions.Conversions._
import generated.Tables.AUTHOR

object JOOQ extends App {
  val c = DSL.using(
    Driver.getConnection(),
    SQLDialect.H2
  )

   val records = (c
    select(
      AUTHOR.ID,
      AUTHOR.FIRST_NAME,
      AUTHOR.LAST_NAME
    )
      from AUTHOR
      where
      (AUTHOR.ID <> 2)
      or
      (AUTHOR.FIRST_NAME in ( "Sonia", "S" ) )
  ).fetch()

  for (r <- records) println(r)

  //  https://www.jooq.org/doc/latest/manual/getting-started/jooq-and-scala/                                                           //
}