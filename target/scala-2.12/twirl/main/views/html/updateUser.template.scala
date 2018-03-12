
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object updateUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Form[models.users.User],models.users.User,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, updateUserForm: Form[models.users.User], user: models.users.User, roleList: List[String], pass: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.118*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update User",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Update User</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.updateUserSubmit(id), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""

        """),_display_(/*14.10*/inputText(updateUserForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*14.92*/("""
        """),_display_(/*15.10*/inputText(updateUserForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*15.90*/("""
        """),_display_(/*16.10*/if(user != null)/*16.26*/{_display_(Seq[Any](format.raw/*16.27*/("""
            """),_display_(/*17.14*/if(user.getRole() == "admin")/*17.43*/{_display_(Seq[Any](format.raw/*17.44*/("""
                """),_display_(/*18.18*/select(
        updateUserForm("role"), 
        options(roleList), '_label -> "Role", '_default -> "-- Choose a role --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*22.10*/("""
        """),_display_(/*23.10*/inputPassword(updateUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*23.100*/("""
        """),format.raw/*24.9*/("""<label>Previous Password: """),_display_(/*24.36*/pass),format.raw/*24.40*/("""</label>
            """)))}),format.raw/*25.14*/("""
        """)))}),format.raw/*26.10*/("""
        
        
        """),format.raw/*29.9*/("""<div class="actions">
            <input type="submit" value="Update User" class="btn btn-primary">
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.HomeController.usersPage()),format.raw/*31.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*35.6*/("""
"""),format.raw/*36.1*/("""</div>
""")))}))
      }
    }
  }

  def render(id:String,updateUserForm:Form[models.users.User],user:models.users.User,roleList:List[String],pass:String): play.twirl.api.HtmlFormat.Appendable = apply(id,updateUserForm,user,roleList,pass)

  def f:((String,Form[models.users.User],models.users.User,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (id,updateUserForm,user,roleList,pass) => apply(id,updateUserForm,user,roleList,pass)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 04:37:55 GMT 2018
                  SOURCE: /home/brandon/Desktop/SdevProject/app/views/updateUser.scala.html
                  HASH: beffbb96145fdb760d234ff62cd92d9a7b7bc2b6
                  MATRIX: 1015->1|1204->119|1250->117|1277->135|1304->137|1336->161|1375->163|1406->168|1495->232|1654->382|1694->384|1731->421|1768->431|1781->435|1812->445|1850->456|1953->538|1990->548|2091->628|2128->638|2153->654|2192->655|2233->669|2271->698|2310->699|2355->717|2570->911|2607->921|2719->1011|2755->1020|2809->1047|2834->1051|2887->1073|2928->1083|2982->1110|3131->1232|3146->1238|3194->1265|3342->1383|3370->1384
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|54->22|55->23|55->23|56->24|56->24|56->24|57->25|58->26|61->29|63->31|63->31|63->31|67->35|68->36
                  -- GENERATED --
              */
          