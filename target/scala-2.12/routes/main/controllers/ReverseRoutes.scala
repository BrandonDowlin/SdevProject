
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Documents/SdevProject/conf/routes
// @DATE:Sat Mar 10 02:25:00 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProject")
    }
  
    // @LINE:10
    def updateEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:18
    def updateProjectSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateProjectSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addEmployeeSubmit")
    }
  
    // @LINE:9
    def deleteEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(proj:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(proj == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("proj", proj)))))
    }
  
    // @LINE:13
    def projectsPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projectsPage")
    }
  
    // @LINE:7
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addEmployee")
    }
  
    // @LINE:11
    def updateEmployeeSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateEmployeeSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProjectSubmit")
    }
  
  }

  // @LINE:20
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:22
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:20
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:25
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
