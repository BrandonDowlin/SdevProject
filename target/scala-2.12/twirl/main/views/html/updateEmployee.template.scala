
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

"""),_display_(/*9.2*/form(action=routes.HomeController.updateEmployeeSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*10.51*/ {_display_(Seq[Any](format.raw/*10.53*/("""
    """),format.raw/*11.33*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),format.raw/*13.5*/("""<container>
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
        """),_display_(/*16.10*/inputText(updateEmployeeForm("fname"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.93*/("""
        """),_display_(/*17.10*/inputText(updateEmployeeForm("lname"), '_label -> "Surname", 'class -> "form-control")),format.raw/*17.96*/(""" 
        """),format.raw/*18.9*/("""<label>Projects</label><br>
        """),_display_(/*19.10*/for((value, name) <- Project.options) yield /*19.47*/ {_display_(Seq[Any](format.raw/*19.49*/("""
            """),format.raw/*20.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*20.64*/value),format.raw/*20.69*/(""""

            /> """),_display_(/*22.17*/name),format.raw/*22.21*/(""" """),format.raw/*22.22*/("""<br>
        """)))}),format.raw/*23.10*/("""
        """),format.raw/*24.9*/("""<br><br>
        """),_display_(/*25.10*/select(
        updateEmployeeForm("department.id"), 
        options(Department.options), '_label -> "Department", '_default -> "-- Choose a department --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*29.10*/("""
        
        """),_display_(/*31.10*/inputText(updateAddressForm("street"), '_label -> "Address", 'class -> "form-control")),format.raw/*31.96*/("""
        """),_display_(/*32.10*/inputText(updateAddressForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*32.95*/("""
    
    """),format.raw/*34.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Employee" class="btn btn-primary">
        <a href=""""),_display_(/*40.19*/routes/*40.25*/.HomeController.index(0)),format.raw/*40.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
        </div>
    </div>
    </container>
 """)))}),format.raw/*46.3*/("""
""")))}),format.raw/*47.2*/("""
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
                  DATE: Sat Mar 10 02:23:25 GMT 2018
                  SOURCE: /home/brandon/Documents/SdevProject/app/views/updateEmployee.scala.html
                  HASH: ceda0901e953f279157e3002865621bcbed17dc1
                  MATRIX: 1016->1|1208->123|1254->120|1282->139|1309->141|1346->170|1385->172|1417->178|1481->217|1630->357|1670->359|1703->392|1735->398|1748->402|1779->412|1811->417|1935->514|2039->597|2076->607|2183->693|2220->703|2284->740|2337->777|2377->779|2418->792|2496->843|2522->848|2568->867|2593->871|2622->872|2667->886|2703->895|2748->913|2998->1142|3044->1161|3151->1247|3188->1257|3294->1342|3331->1352|3583->1577|3598->1583|3643->1607|3808->1742|3840->1744
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|44->12|44->12|45->13|48->16|48->16|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|55->23|56->24|57->25|61->29|63->31|63->31|64->32|64->32|66->34|72->40|72->40|72->40|78->46|79->47
                  -- GENERATED --
              */
          