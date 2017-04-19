
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/71740/webapps/2YearProj/conf/routes
// @DATE:Wed Apr 19 17:24:05 BST 2017


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
