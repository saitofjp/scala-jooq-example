/*
 * This file is generated by jOOQ.
*/
package generated


import generated.tables.Author

import javax.annotation.Generated

import org.jooq.Index
import org.jooq.OrderField
import org.jooq.impl.Internal

import scala.Array


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.10.6"
  ),
  comments = "This class is generated by jOOQ"
)
object Indexes {

  // -------------------------------------------------------------------------
  // INDEX definitions
  // -------------------------------------------------------------------------

  val PRIMARY_KEY_7 = Indexes0.PRIMARY_KEY_7

  // -------------------------------------------------------------------------
  // [#1459] distribute members to avoid static initialisers > 64kb
  // -------------------------------------------------------------------------

  private object Indexes0 {
    val PRIMARY_KEY_7 : Index = Internal.createIndex("PRIMARY_KEY_7", Author.AUTHOR, Array[OrderField [_] ](Author.AUTHOR.ID), true)
  }
}