
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
"""),_display_(/*5.2*/main("Update employee", user)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
    
"""),format.raw/*7.1*/("""<p class="lead"> Update Project</p>

"""),_display_(/*9.2*/form(action=routes.HomeController.updateProjectSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),format.raw/*13.5*/("""<container>
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                    """),_display_(/*16.22*/inputText(updateProjectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.103*/("""
                    """),_display_(/*17.22*/inputText(updateProjectForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*17.117*/("""
                    """),_display_(/*18.22*/inputText(updateProjectForm("deadline"), '_label -> "Deadline", 'class -> "form-control")),format.raw/*18.111*/("""

    """),format.raw/*20.5*/("""<div class="actions">
        <input type="submit" value="Update Project" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.projectsPage()),format.raw/*22.55*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
        </div>
    </div>
    </container>
 """)))}),format.raw/*28.3*/("""
""")))}),format.raw/*29.2*/("""
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
                  DATE: Sat Mar 10 02:32:20 GMT 2018
                  SOURCE: /home/brandon/Documents/SdevProject/app/views/updateProject.scala.html
                  HASH: 4480480aecf65102682dc2377b2f8ebc53fb9b89
                  MATRIX: 993->1|1142->80|1187->77|1215->96|1242->98|1279->127|1318->129|1350->135|1413->173|1561->312|1601->314|1634->347|1666->353|1679->357|1710->367|1742->372|1878->481|1981->562|2030->584|2147->679|2196->701|2307->790|2340->796|2484->913|2499->919|2550->949|2715->1084|2747->1086
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|48->16|48->16|49->17|49->17|50->18|50->18|52->20|54->22|54->22|54->22|60->28|61->29
                  -- GENERATED --
              */
          