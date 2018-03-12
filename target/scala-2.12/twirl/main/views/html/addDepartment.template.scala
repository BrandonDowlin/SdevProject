
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

object addDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departmentForm: Form[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.68*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Department",user)/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new Department</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.addDepartmentSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(departmentForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.88*/("""
        """),_display_(/*14.10*/inputText(departmentForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.77*/("""
        
        """),format.raw/*16.9*/("""<div class="actions">
            <input type="submit" value="Add Department" class="btn btn-primary">
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.HomeController.departmentsPage()),format.raw/*18.62*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*22.6*/("""
"""),format.raw/*23.1*/("""</div>
""")))}))
      }
    }
  }

  def render(departmentForm:Form[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(departmentForm,user)

  def f:((Form[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (departmentForm,user) => apply(departmentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 12:43:23 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/addDepartment.scala.html
                  HASH: ebe188fa666a7950e1993b1dd471aab07dba7334
                  MATRIX: 991->1|1130->69|1175->67|1202->85|1229->87|1264->114|1303->116|1334->121|1432->194|1592->345|1632->347|1669->384|1706->394|1719->398|1750->408|1787->418|1886->496|1923->506|2011->573|2056->591|2208->716|2223->722|2277->755|2425->873|2453->874
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|48->16|50->18|50->18|50->18|54->22|55->23
                  -- GENERATED --
              */
          