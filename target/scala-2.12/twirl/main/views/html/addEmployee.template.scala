
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.Employee],Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee], addressForm: Form[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.99*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Employee",user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new employee</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addEmployeeSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),format.raw/*12.9*/("""<container>
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
        """),_display_(/*15.10*/inputText(employeeForm("fname"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.87*/("""
        """),_display_(/*16.10*/inputText(employeeForm("lname"), '_label -> "Surname", 'class -> "form-control")),format.raw/*16.90*/(""" 
        """),format.raw/*17.9*/("""<label>Projects</label><br>
        """),_display_(/*18.10*/for((value, name) <- Project.options) yield /*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""
            """),format.raw/*19.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*19.64*/value),format.raw/*19.69*/(""""

            /> """),_display_(/*21.17*/name),format.raw/*21.21*/(""" """),format.raw/*21.22*/("""<br>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""<br><br>
        """),_display_(/*24.10*/select(
        employeeForm("department.id"), 
        options(Department.options), '_label -> "Department", '_default -> "-- Choose a department --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*28.10*/("""
        
        """),_display_(/*30.10*/inputText(addressForm("street"), '_label -> "Address", 'class -> "form-control")),format.raw/*30.90*/("""
        """),_display_(/*31.10*/inputText(addressForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*31.89*/("""

        """),_display_(/*33.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*33.75*/("""
        """),_display_(/*34.10*/inputText(addressForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*34.74*/("""
        
        """),format.raw/*36.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*41.23*/routes/*41.29*/.HomeController.index(0)),format.raw/*41.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    </div>
    </container>
    """)))}),format.raw/*47.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],addressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,addressForm,user)

  def f:((Form[models.Employee],Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,addressForm,user) => apply(employeeForm,addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 10 02:23:24 GMT 2018
                  SOURCE: /home/brandon/Documents/SdevProject/app/views/addEmployee.scala.html
                  HASH: 9403aec3d8d52deb821647f8a88f3a824a2d8594
                  MATRIX: 1008->1|1178->100|1223->98|1250->116|1277->118|1310->143|1349->145|1380->150|1449->194|1606->343|1645->345|1682->382|1719->392|1732->396|1763->406|1799->415|1923->512|2021->589|2058->599|2159->679|2196->689|2260->726|2313->763|2353->765|2394->778|2472->829|2498->834|2544->853|2569->857|2598->858|2643->872|2679->881|2724->899|2968->1122|3014->1141|3115->1221|3152->1231|3252->1310|3290->1321|3376->1386|3413->1396|3498->1460|3543->1478|3815->1723|3830->1729|3875->1753|4051->1899
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|44->12|47->15|47->15|48->16|48->16|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|53->21|54->22|55->23|56->24|60->28|62->30|62->30|63->31|63->31|65->33|65->33|66->34|66->34|68->36|73->41|73->41|73->41|79->47
                  -- GENERATED --
              */
          