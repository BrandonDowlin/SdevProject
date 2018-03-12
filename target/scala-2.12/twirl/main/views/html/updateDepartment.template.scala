
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

object updateDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateDepartmentForm: Form[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.84*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update Department",user)/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""
    """),format.raw/*5.5*/("""<p class="lead">Update Department</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.updateDepartmentSubmit(id), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(updateDepartmentForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.94*/("""
        
        """),format.raw/*15.9*/("""<div class="actions">
            <input type="submit" value="Update Department" class="btn btn-primary">
            <a href=""""),_display_(/*17.23*/routes/*17.29*/.HomeController.departmentsPage()),format.raw/*17.62*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*21.6*/("""
"""),format.raw/*22.1*/("""</div>
""")))}))
      }
    }
  }

  def render(id:Long,updateDepartmentForm:Form[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateDepartmentForm,user)

  def f:((Long,Form[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateDepartmentForm,user) => apply(id,updateDepartmentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 12:43:23 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/updateDepartment.scala.html
                  HASH: 9b15974764e2873efebddcc4b222e53882905bfe
                  MATRIX: 999->1|1154->85|1199->83|1226->101|1253->103|1291->133|1330->135|1361->140|1456->210|1621->366|1661->368|1698->405|1735->415|1748->419|1779->429|1816->439|1921->523|1966->541|2121->669|2136->675|2190->708|2338->826|2366->827
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|47->15|49->17|49->17|49->17|53->21|54->22
                  -- GENERATED --
              */
          