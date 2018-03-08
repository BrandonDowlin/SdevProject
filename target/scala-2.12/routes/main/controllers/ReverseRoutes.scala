
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SdevCA-master/conf/routes
// @DATE:Thu Mar 08 16:13:58 GMT 2018

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

  
    // @LINE:18
    def updateEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addEmployeeSubmit")
    }
  
    // @LINE:7
    def address(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address")
    }
  
    // @LINE:22
    def updateAddressSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateAddressSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def addAddress(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addAddress")
    }
  
    // @LINE:16
    def deleteAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delAddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def deleteEmployee(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(proj:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(proj == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("proj", proj)))))
    }
  
    // @LINE:9
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addEmployee")
    }
  
    // @LINE:21
    def updateEmployeeSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateEmployeeSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:19
    def updateAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateAddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def addAddressSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addAddressSubmit")
    }
  
  }

  // @LINE:24
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:26
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:24
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
