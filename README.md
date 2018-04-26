# JOOQ.scala

Type safe で、ほぼSQL

``````scala
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
``````

# setup

## H2.scala

動かすとDBとgenが動く

## コマンドラインでgenするなら

### sbt pack

```
sbt pack
```

### copy

```
   target/*.jar
   target/gen.xml
```

### gen

```
java -classpath jooq-3.10.6.jar;jooq-meta-3.10.6.jar;jooq-codegen-3.10.6.jar;h2-1.3.159.jar;. org.jooq.util.GenerationTool gen.xml
```