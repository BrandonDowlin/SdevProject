
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SdevProject/conf/routes
// @DATE:Fri Mar 09 09:12:14 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:25
  LoginController_2: controllers.LoginController,
  // @LINE:30
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:25
    LoginController_2: controllers.LoginController,
    // @LINE:30
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(proj:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addressPage""", """controllers.HomeController.addressPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address""", """controllers.HomeController.addressPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployee""", """controllers.HomeController.addEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAddress""", """controllers.HomeController.addAddress"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployeeSubmit""", """controllers.HomeController.addEmployeeSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAddressSubmit""", """controllers.HomeController.addAddressSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delAddress/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAddress/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAddress(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployeeSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployeeSubmit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAddressSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAddressSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_addressPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addressPage")))
  )
  private[this] lazy val controllers_HomeController_addressPage1_invoker = createInvoker(
    HomeController_0.addressPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addressPage",
      Nil,
      "GET",
      this.prefix + """addressPage""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_addressPage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address")))
  )
  private[this] lazy val controllers_HomeController_addressPage2_invoker = createInvoker(
    HomeController_0.addressPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addressPage",
      Nil,
      "GET",
      this.prefix + """address""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_addEmployee3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployee")))
  )
  private[this] lazy val controllers_HomeController_addEmployee3_invoker = createInvoker(
    HomeController_0.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """addEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_addAddress4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAddress")))
  )
  private[this] lazy val controllers_HomeController_addAddress4_invoker = createInvoker(
    HomeController_0.addAddress,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAddress",
      Nil,
      "GET",
      this.prefix + """addAddress""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_addEmployeeSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployeeSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEmployeeSubmit5_invoker = createInvoker(
    HomeController_0.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployeeSubmit",
      Nil,
      "POST",
      this.prefix + """addEmployeeSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addAddressSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAddressSubmit")))
  )
  private[this] lazy val controllers_HomeController_addAddressSubmit6_invoker = createInvoker(
    HomeController_0.addAddressSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAddressSubmit",
      Nil,
      "POST",
      this.prefix + """addAddressSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_deleteEmployee7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEmployee7_invoker = createInvoker(
    HomeController_0.deleteEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEmployee",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_deleteAddress8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delAddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteAddress8_invoker = createInvoker(
    HomeController_0.deleteAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delAddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_updateEmployee9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployee9_invoker = createInvoker(
    HomeController_0.updateEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployee",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_updateAddress10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAddress10_invoker = createInvoker(
    HomeController_0.updateAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateAddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployeeSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit11_invoker = createInvoker(
    HomeController_0.updateEmployeeSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployeeSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateEmployeeSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_updateAddressSubmit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAddressSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAddressSubmit12_invoker = createInvoker(
    HomeController_0.updateAddressSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateAddressSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateAddressSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_LoginController_login13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login13_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LoginController_loginSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit14_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LoginController_logout15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout15_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned16_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[Long]("proj", Some(0L))) { (proj) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(proj))
      }
  
    // @LINE:7
    case controllers_HomeController_addressPage1_route(params@_) =>
      call { 
        controllers_HomeController_addressPage1_invoker.call(HomeController_0.addressPage)
      }
  
    // @LINE:8
    case controllers_HomeController_addressPage2_route(params@_) =>
      call { 
        controllers_HomeController_addressPage2_invoker.call(HomeController_0.addressPage)
      }
  
    // @LINE:10
    case controllers_HomeController_addEmployee3_route(params@_) =>
      call { 
        controllers_HomeController_addEmployee3_invoker.call(HomeController_0.addEmployee)
      }
  
    // @LINE:11
    case controllers_HomeController_addAddress4_route(params@_) =>
      call { 
        controllers_HomeController_addAddress4_invoker.call(HomeController_0.addAddress)
      }
  
    // @LINE:13
    case controllers_HomeController_addEmployeeSubmit5_route(params@_) =>
      call { 
        controllers_HomeController_addEmployeeSubmit5_invoker.call(HomeController_0.addEmployeeSubmit)
      }
  
    // @LINE:14
    case controllers_HomeController_addAddressSubmit6_route(params@_) =>
      call { 
        controllers_HomeController_addAddressSubmit6_invoker.call(HomeController_0.addAddressSubmit)
      }
  
    // @LINE:16
    case controllers_HomeController_deleteEmployee7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEmployee7_invoker.call(HomeController_0.deleteEmployee(id))
      }
  
    // @LINE:17
    case controllers_HomeController_deleteAddress8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteAddress8_invoker.call(HomeController_0.deleteAddress(id))
      }
  
    // @LINE:19
    case controllers_HomeController_updateEmployee9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEmployee9_invoker.call(HomeController_0.updateEmployee(id))
      }
  
    // @LINE:20
    case controllers_HomeController_updateAddress10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateAddress10_invoker.call(HomeController_0.updateAddress(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateEmployeeSubmit11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEmployeeSubmit11_invoker.call(HomeController_0.updateEmployeeSubmit(id))
      }
  
    // @LINE:23
    case controllers_HomeController_updateAddressSubmit12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateAddressSubmit12_invoker.call(HomeController_0.updateAddressSubmit(id))
      }
  
    // @LINE:25
    case controllers_LoginController_login13_route(params@_) =>
      call { 
        controllers_LoginController_login13_invoker.call(LoginController_2.login)
      }
  
    // @LINE:26
    case controllers_LoginController_loginSubmit14_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit14_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:27
    case controllers_LoginController_logout15_route(params@_) =>
      call { 
        controllers_LoginController_logout15_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:30
    case controllers_Assets_versioned16_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned16_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
