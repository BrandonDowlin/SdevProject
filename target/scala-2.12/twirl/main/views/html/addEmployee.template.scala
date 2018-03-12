
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
    """),format.raw/*5.5*/("""<p class="lead">Add a new Employee</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.addEmployeeSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        
        """),_display_(/*14.10*/inputText(employeeForm("fname"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.87*/("""
        """),_display_(/*15.10*/inputText(employeeForm("lname"), '_label -> "Surname", 'class -> "form-control")),format.raw/*15.90*/(""" 
        """),format.raw/*16.9*/("""<label>Projects</label><br>
        """),_display_(/*17.10*/for((value, name) <- Project.options) yield /*17.47*/ {_display_(Seq[Any](format.raw/*17.49*/("""
            """),format.raw/*18.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*18.64*/value),format.raw/*18.69*/(""""

            /> """),_display_(/*20.17*/name),format.raw/*20.21*/(""" """),format.raw/*20.22*/("""<br>
        """)))}),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""<br><br>
        """),_display_(/*23.10*/select(
        employeeForm("department.id"), 
        options(Department.options), '_label -> "Department", '_default -> "-- Choose a department --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*27.10*/("""
        
        """),_display_(/*29.10*/inputText(addressForm("street"), '_label -> "Address", 'class -> "form-control")),format.raw/*29.90*/("""
        """),_display_(/*30.10*/inputText(addressForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*30.89*/("""

        """),_display_(/*32.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*32.75*/("""
        """),_display_(/*33.10*/inputText(addressForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*33.74*/("""
        
        """),format.raw/*35.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Employee" class="btn btn-primary">
            <a href=""""),_display_(/*40.23*/routes/*40.29*/.HomeController.index(0)),format.raw/*40.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*44.6*/("""
"""),format.raw/*45.1*/("""</div>
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
                  DATE: Mon Mar 12 12:43:23 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/addEmployee.scala.html
                  HASH: 65c71a29e375d00f6bdcd00511b5faa27e67dc36
                  MATRIX: 1008->1|1178->100|1223->98|1250->116|1277->118|1310->143|1349->145|1380->150|1476->221|1634->370|1674->372|1711->409|1748->419|1761->423|1792->433|1838->452|1936->529|1973->539|2074->619|2111->629|2175->666|2228->703|2268->705|2309->718|2387->769|2413->774|2459->793|2484->797|2513->798|2558->812|2594->821|2639->839|2883->1062|2929->1081|3030->1161|3067->1171|3167->1250|3205->1261|3291->1326|3328->1336|3413->1400|3458->1418|3730->1663|3745->1669|3790->1693|3938->1811|3966->1812
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|49->17|49->17|49->17|50->18|50->18|50->18|52->20|52->20|52->20|53->21|54->22|55->23|59->27|61->29|61->29|62->30|62->30|64->32|64->32|65->33|65->33|67->35|72->40|72->40|72->40|76->44|77->45
                  -- GENERATED --
              */
          