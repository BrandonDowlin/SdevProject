
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.User],models.users.User,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User], user: models.users.User, roleList: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.86*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add User",user)/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new User</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.addUserSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(userForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*13.86*/("""
        """),_display_(/*14.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*14.84*/("""
        """),_display_(/*15.10*/if(user != null)/*15.26*/{_display_(Seq[Any](format.raw/*15.27*/("""
            """),_display_(/*16.14*/if(user.getRole() == "admin")/*16.43*/{_display_(Seq[Any](format.raw/*16.44*/("""
                """),_display_(/*17.18*/select(
        userForm("role"), 
        options(roleList), '_label -> "Role", '_default -> "-- Choose a role --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*21.10*/("""
            """)))}),format.raw/*22.14*/("""
        """)))}),format.raw/*23.10*/("""
        """),_display_(/*24.10*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*24.94*/("""
        
        """),format.raw/*26.9*/("""<div class="actions">
            <input type="submit" value="Add User" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.usersPage()),format.raw/*28.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*32.6*/("""
"""),format.raw/*33.1*/("""</div>
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User,roleList:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user,roleList)

  def f:((Form[models.users.User],models.users.User,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user,roleList) => apply(userForm,user,roleList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 12:43:23 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/addUser.scala.html
                  HASH: b7296ac855f606be68d9bef7254c6ca62f72f22f
                  MATRIX: 998->1|1155->87|1200->85|1227->103|1254->105|1283->126|1322->128|1353->133|1445->200|1599->345|1639->347|1676->384|1713->394|1726->398|1757->408|1794->418|1891->494|1928->504|2023->578|2060->588|2085->604|2124->605|2165->619|2203->648|2242->649|2287->667|2496->855|2541->869|2582->879|2619->889|2724->973|2769->991|2915->1110|2930->1116|2978->1143|3126->1261|3154->1262
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|53->21|54->22|55->23|56->24|56->24|58->26|60->28|60->28|60->28|64->32|65->33
                  -- GENERATED --
              */
          