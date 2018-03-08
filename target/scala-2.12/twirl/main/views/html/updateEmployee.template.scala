
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

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateEmployeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*3.2*/main("Update employee", user)/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Employee</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""

    """),_display_(/*11.6*/inputText(updateEmployeeForm("fname"), '_label -> "Forename", 'class -> "form-control")),format.raw/*11.93*/("""
        """),_display_(/*12.10*/inputText(updateEmployeeForm("lname"), '_label -> "Surname", 'class -> "form-control")),format.raw/*12.96*/("""

        """),_display_(/*14.10*/select(
            updateEmployeeForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*19.10*/("""
        """),_display_(/*20.10*/select(
            updateEmployeeForm("address.id"),
            options(Address.options),
            '_label -> "Address", '_default -> "-- Choose an address --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*25.10*/("""
        """),format.raw/*26.9*/("""<label>Projects</label><br>
        """),_display_(/*27.10*/for((value,name) <- Project.options) yield /*27.46*/{_display_(Seq[Any](format.raw/*27.47*/("""
            """),format.raw/*28.13*/("""<input type = "checkbox" name="projSelect[]" value=""""),_display_(/*28.66*/value),format.raw/*28.71*/(""""
            """),_display_(/*29.14*/if(Project.inProject(value.toLong, id))/*29.53*/ {_display_(Seq[Any](format.raw/*29.55*/("""
                """),format.raw/*30.17*/("""checked
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""/> """),_display_(/*32.17*/name),format.raw/*32.21*/("""<br>
        """)))}),format.raw/*33.10*/("""
        
    
    """),format.raw/*36.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*42.19*/routes/*42.25*/.HomeController.index(0)),format.raw/*42.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*46.3*/("""
""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,user)

  def f:((Long,Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,user) => apply(id,updateEmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 16:37:13 GMT 2018
                  SOURCE: /home/wdd/SdevCA-master/app/views/updateEmployee.scala.html
                  HASH: 18b5861956c95c383816ef33d408b2ae205e9453
                  MATRIX: 995->1|1146->81|1191->79|1218->98|1255->127|1293->128|1320->129|1384->168|1532->308|1571->310|1603->343|1634->349|1646->353|1676->363|1709->370|1817->457|1854->467|1961->553|1999->564|2271->815|2308->825|2569->1065|2605->1074|2669->1111|2721->1147|2760->1148|2801->1161|2881->1214|2907->1219|2949->1234|2997->1273|3037->1275|3082->1292|3134->1313|3175->1326|3206->1330|3231->1334|3276->1348|3322->1367|3574->1592|3589->1598|3634->1622|3767->1725|3799->1727
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|43->11|43->11|44->12|44->12|46->14|51->19|52->20|57->25|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|64->32|64->32|64->32|65->33|68->36|74->42|74->42|74->42|78->46|79->47
                  -- GENERATED --
              */
          