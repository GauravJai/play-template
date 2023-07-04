// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/gaurav.jaiswalmercator.group/IdeaProjects/play-template/conf/routes
// @DATE:Mon Jul 03 17:31:51 BST 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
