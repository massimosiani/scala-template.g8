package project

object Configs {
  val EndToEndTest = config("e2e") extend Runtime
  val all = Seq(IntegrationTest, EndToEndTest)
}
