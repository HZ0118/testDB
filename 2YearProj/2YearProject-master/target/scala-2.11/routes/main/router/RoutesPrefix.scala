
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jayso/Downloads/2YearProj/2YearProject-master/conf/routes
// @DATE:Tue Apr 18 18:07:14 BST 2017


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
