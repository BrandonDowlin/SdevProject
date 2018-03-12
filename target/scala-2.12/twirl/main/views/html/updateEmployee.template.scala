
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

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,Form[models.Employee],Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateEmployeeForm: Form[models.Employee], updateAddressForm: Form[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Update employee", user)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
    
"""),format.raw/*7.1*/("""<p class="lead"> Update Employee</p>
<div class="col-xs-5">
"""),_display_(/*9.2*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
        """),_display_(/*13.10*/inputText(updateEmployeeForm("fname"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.93*/("""
        """),_display_(/*14.10*/inputText(updateEmployeeForm("lname"), '_label -> "Surname", 'class -> "form-control")),format.raw/*14.96*/(""" 
        """),format.raw/*15.9*/("""<label>Projects</label><br>
        """),_display_(/*16.10*/for((value, name) <- Project.options) yield /*16.47*/ {_display_(Seq[Any](format.raw/*16.49*/("""
            """),format.raw/*17.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*17.64*/value),format.raw/*17.69*/(""""

            /> """),_display_(/*19.17*/name),format.raw/*19.21*/(""" """),format.raw/*19.22*/("""<br>
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""<br><br>
        """),_display_(/*22.10*/select(
        updateEmployeeForm("department.id"), 
        options(Department.options), '_label -> "Department", '_default -> "-- Choose a department --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*26.10*/("""
        
        """),_display_(/*28.10*/inputText(updateAddressForm("street"), '_label -> "Address", 'class -> "form-control")),format.raw/*28.96*/("""
        """),_display_(/*29.10*/inputText(updateAddressForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*29.95*/("""
    
    """),format.raw/*31.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*37.19*/routes/*37.25*/.HomeController.index(0)),format.raw/*37.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
        </div>
 """)))}),format.raw/*41.3*/("""
"""),format.raw/*42.1*/("""</div>
""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateEmployeeForm:Form[models.Employee],updateAddressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateEmployeeForm,updateAddressForm,user)

  def f:((Long,Form[models.Employee],Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateEmployeeForm,updateAddressForm,user) => apply(id,updateEmployeeForm,updateAddressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 04:37:55 GMT 2018
                  SOURCE: /home/brandon/Desktop/SdevProject/app/views/updateEmployee.scala.html
                  HASH: 99224c57aa4000461db4d8a05f6e5da91663e69f
                  MATRIX: 1016->1|1208->123|1254->120|1282->139|1309->141|1346->170|1385->172|1417->178|1503->239|1652->379|1692->381|1725->414|1757->420|1770->424|1801->434|1838->444|1942->527|1979->537|2086->623|2123->633|2187->670|2240->707|2280->709|2321->722|2399->773|2425->778|2471->797|2496->801|2525->802|2570->816|2606->825|2651->843|2901->1072|2947->1091|3054->1177|3091->1187|3197->1272|3234->1282|3486->1507|3501->1513|3546->1537|3683->1644|3711->1645|3749->1653
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|48->16|48->16|48->16|49->17|49->17|49->17|51->19|51->19|51->19|52->20|53->21|54->22|58->26|60->28|60->28|61->29|61->29|63->31|69->37|69->37|69->37|73->41|74->42|75->43
                  -- GENERATED --
              */
          