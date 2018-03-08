
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SdevCA-master/conf/routes
// @DATE:Thu Mar 08 16:13:58 GMT 2018


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
