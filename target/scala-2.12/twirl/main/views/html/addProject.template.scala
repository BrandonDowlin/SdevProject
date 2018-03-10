
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
    """),format.raw/*5.5*/("""<p class="lead">Add a new project</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProjectSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),format.raw/*12.9*/("""<container>
            <div class="col-sm-2"></div>
            <div class="col-sm-8">

        """),_display_(/*16.10*/inputText(projectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.85*/("""
        """),_display_(/*17.10*/inputText(projectForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*17.99*/("""
        """),_display_(/*18.10*/inputText(projectForm("deadline"), '_label -> "Deadline", 'class -> "form-control")),format.raw/*18.93*/("""

        """),_display_(/*20.10*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*20.74*/("""
        
        """),format.raw/*22.9*/("""<div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.HomeController.projectsPage()),format.raw/*24.59*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    </div>
    </container>
    """)))}),format.raw/*30.6*/("""
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
                  DATE: Sat Mar 10 02:32:20 GMT 2018
                  SOURCE: /home/brandon/Documents/SdevProject/app/views/addProject.scala.html
                  HASH: c4f7a4055f9d33508fbd9306197b2014e29c959f
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1736->375|1861->473|1957->548|1994->558|2104->647|2141->657|2245->740|2283->751|2368->815|2413->833|2562->955|2577->961|2628->991|2804->1137
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|44->12|48->16|48->16|49->17|49->17|50->18|50->18|52->20|52->20|54->22|56->24|56->24|56->24|62->30
                  -- GENERATED --
              */
          