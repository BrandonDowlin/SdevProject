
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: Form[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Project",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new Project</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.addProjectSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(projectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),_display_(/*14.10*/inputText(projectForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*14.99*/("""
        """),_display_(/*15.10*/inputText(projectForm("deadline"), '_label -> "Deadline", 'class -> "form-control")),format.raw/*15.93*/("""

        """),_display_(/*17.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.74*/("""
        
        """),format.raw/*19.9*/("""<div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.projectsPage()),format.raw/*21.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</div>
""")))}))
      }
    }
  }

  def render(projectForm:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 12:43:23 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/addProject.scala.html
                  HASH: 2ad6cb7bf5ef8fb66d80c02f5c961367db2e5ef1
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1414->182|1571->330|1611->332|1648->369|1685->379|1698->383|1729->393|1766->403|1862->478|1899->488|2009->577|2046->587|2150->670|2188->681|2273->745|2318->763|2467->885|2482->891|2533->921|2681->1039|2709->1040
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|51->19|53->21|53->21|53->21|57->25|58->26
                  -- GENERATED --
              */
          