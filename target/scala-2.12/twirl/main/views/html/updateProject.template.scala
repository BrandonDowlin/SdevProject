
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

object updateProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProjectForm: Form[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Update Project", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    
"""),format.raw/*7.1*/("""<p class="lead"> Update Project</p>
<div class="col-xs-5">
"""),_display_(/*9.2*/form(action=routes.HomeController.updateProjectSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
                    """),_display_(/*13.22*/inputText(updateProjectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.103*/("""
                    """),_display_(/*14.22*/inputText(updateProjectForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*14.117*/("""
                    """),_display_(/*15.22*/inputText(updateProjectForm("deadline"), '_label -> "Deadline", 'class -> "form-control")),format.raw/*15.111*/("""

    """),format.raw/*17.5*/("""<div class="actions">
        <input type="submit" value="Update Project" class="btn btn-primary">
        <a href=""""),_display_(/*19.19*/routes/*19.25*/.HomeController.projectsPage()),format.raw/*19.55*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
        </div>
 """)))}),format.raw/*23.3*/("""
"""),format.raw/*24.1*/("""</div>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateProjectForm:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProjectForm,user)

  def f:((Long,Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProjectForm,user) => apply(id,updateProjectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 04:37:55 GMT 2018
                  SOURCE: /home/brandon/Desktop/SdevProject/app/views/updateProject.scala.html
                  HASH: 100151e7d9653ea1dd4cbde4ce1aed8b9a3c24da
                  MATRIX: 993->1|1142->80|1187->77|1215->96|1242->98|1278->126|1317->128|1349->134|1434->194|1582->333|1622->335|1655->368|1687->374|1700->378|1731->388|1780->410|1883->491|1932->513|2049->608|2098->630|2209->719|2242->725|2386->842|2401->848|2452->878|2589->985|2617->986|2655->994
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|51->19|51->19|51->19|55->23|56->24|57->25
                  -- GENERATED --
              */
          