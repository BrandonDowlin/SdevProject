
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Documents/SdevProject/conf/routes
// @DATE:Sat Mar 10 02:25:00 GMT 2018

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
  // @LINE:20
  LoginController_2: controllers.LoginController,
  // @LINE:25
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:20
    LoginController_2: controllers.LoginController,
    // @LINE:25
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployee""", """controllers.HomeController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployeeSubmit""", """controllers.HomeController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployee(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployeeSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEmployeeSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projectsPage""", """controllers.HomeController.projectsPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.HomeController.addProject"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProject(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectSubmit""", """controllers.HomeController.addProjectSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProjectSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProjectSubmit(id:Long)"""),
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
  private[this] lazy val controllers_HomeController_addEmployee1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployee")))
  )
  private[this] lazy val controllers_HomeController_addEmployee1_invoker = createInvoker(
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

  // @LINE:8
  private[this] lazy val controllers_HomeController_addEmployeeSubmit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployeeSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEmployeeSubmit2_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_HomeController_deleteEmployee3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEmployee3_invoker = createInvoker(
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

  // @LINE:10
  private[this] lazy val controllers_HomeController_updateEmployee4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployee4_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployeeSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit5_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_projectsPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectsPage")))
  )
  private[this] lazy val controllers_HomeController_projectsPage6_invoker = createInvoker(
    HomeController_0.projectsPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projectsPage",
      Nil,
      "GET",
      this.prefix + """projectsPage""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addProject7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_HomeController_addProject7_invoker = createInvoker(
    HomeController_0.addProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProject",
      Nil,
      "GET",
      this.prefix + """addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_deleteProject8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProject8_invoker = createInvoker(
    HomeController_0.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_updateProject9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProject9_invoker = createInvoker(
    HomeController_0.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addProjectSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectSubmit10_invoker = createInvoker(
    HomeController_0.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_updateProjectSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProjectSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProjectSubmit11_invoker = createInvoker(
    HomeController_0.updateProjectSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProjectSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateProjectSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_login12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login12_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_LoginController_loginSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit13_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_LoginController_logout14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout14_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
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
    case controllers_HomeController_addEmployee1_route(params@_) =>
      call { 
        controllers_HomeController_addEmployee1_invoker.call(HomeController_0.addEmployee)
      }
  
    // @LINE:8
    case controllers_HomeController_addEmployeeSubmit2_route(params@_) =>
      call { 
        controllers_HomeController_addEmployeeSubmit2_invoker.call(HomeController_0.addEmployeeSubmit)
      }
  
    // @LINE:9
    case controllers_HomeController_deleteEmployee3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEmployee3_invoker.call(HomeController_0.deleteEmployee(id))
      }
  
    // @LINE:10
    case controllers_HomeController_updateEmployee4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEmployee4_invoker.call(HomeController_0.updateEmployee(id))
      }
  
    // @LINE:11
    case controllers_HomeController_updateEmployeeSubmit5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEmployeeSubmit5_invoker.call(HomeController_0.updateEmployeeSubmit(id))
      }
  
    // @LINE:13
    case controllers_HomeController_projectsPage6_route(params@_) =>
      call { 
        controllers_HomeController_projectsPage6_invoker.call(HomeController_0.projectsPage)
      }
  
    // @LINE:14
    case controllers_HomeController_addProject7_route(params@_) =>
      call { 
        controllers_HomeController_addProject7_invoker.call(HomeController_0.addProject)
      }
  
    // @LINE:15
    case controllers_HomeController_deleteProject8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProject8_invoker.call(HomeController_0.deleteProject(id))
      }
  
    // @LINE:16
    case controllers_HomeController_updateProject9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProject9_invoker.call(HomeController_0.updateProject(id))
      }
  
    // @LINE:17
    case controllers_HomeController_addProjectSubmit10_route(params@_) =>
      call { 
        controllers_HomeController_addProjectSubmit10_invoker.call(HomeController_0.addProjectSubmit)
      }
  
    // @LINE:18
    case controllers_HomeController_updateProjectSubmit11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProjectSubmit11_invoker.call(HomeController_0.updateProjectSubmit(id))
      }
  
    // @LINE:20
    case controllers_LoginController_login12_route(params@_) =>
      call { 
        controllers_LoginController_login12_invoker.call(LoginController_2.login)
      }
  
    // @LINE:21
    case controllers_LoginController_loginSubmit13_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit13_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:22
    case controllers_LoginController_logout14_route(params@_) =>
      call { 
        controllers_LoginController_logout14_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:25
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
