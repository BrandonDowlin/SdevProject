
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

object departmentsPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Department],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departments: List[models.Department], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.91*/("""

"""),_display_(/*3.2*/main("departments",user)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.1*/("""<p class="lead">Departments Page</p>
<br>
<div class="row">
  <div class="col-sm-2">
  </div>
  
  <div class="col-sm-8">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*13.8*/if(flash.containsKey("success"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
        """),format.raw/*14.9*/("""<div class="alert alert-success">
          """),_display_(/*15.12*/flash/*15.17*/.get("success")),format.raw/*15.32*/("""
        """),format.raw/*16.9*/("""</div>
      """)))}),format.raw/*17.8*/("""
      """),format.raw/*18.7*/("""<thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Employees</th>
          """),_display_(/*23.12*/if(user != null)/*23.28*/{_display_(Seq[Any](format.raw/*23.29*/("""
            """),_display_(/*24.14*/if(user.getRole() == "admin")/*24.43*/{_display_(Seq[Any](format.raw/*24.44*/("""
            """),format.raw/*25.13*/("""<th colspan="2">Edit</th>
            """)))}),format.raw/*26.14*/("""
          """)))}),format.raw/*27.12*/("""      
        """),format.raw/*28.9*/("""</tr>
      </thead>

      <tbody>
        """),_display_(/*32.10*/for(d<-departments) yield /*32.29*/ {_display_(Seq[Any](format.raw/*32.31*/("""
          """),format.raw/*33.11*/("""<tr>
            <td class="numeric">"""),_display_(/*34.34*/d/*34.35*/.getId),format.raw/*34.41*/("""</td>
            <td>"""),_display_(/*35.18*/d/*35.19*/.getName),format.raw/*35.27*/("""</td>
            <td class="numeric">"""),_display_(/*36.34*/d/*36.35*/.getEmployees.size),format.raw/*36.53*/("""</td>
            """),_display_(/*37.14*/if(user != null)/*37.30*/{_display_(Seq[Any](format.raw/*37.31*/("""
            """),_display_(/*38.14*/if(user.getRole().equals("admin"))/*38.48*/{_display_(Seq[Any](format.raw/*38.49*/("""

            
            """),format.raw/*41.13*/("""<td>
                
              <a href=""""),_display_(/*43.25*/routes/*43.31*/.HomeController.updateDepartment(d.getId)),format.raw/*43.72*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  
                
              </a>
            </td>        <td>
              <a href=""""),_display_(/*49.25*/routes/*49.31*/.HomeController.deleteDepartment(d.getId)),format.raw/*49.72*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          """)))}),format.raw/*53.12*/("""
        """)))}),format.raw/*54.10*/("""
          """),format.raw/*55.11*/("""</tr>
        """)))}),format.raw/*56.10*/("""
      """),format.raw/*57.7*/("""</tbody>
    </table>
  </div>
  
  """),_display_(/*61.4*/if(user != null)/*61.20*/{_display_(Seq[Any](format.raw/*61.21*/("""
    """),_display_(/*62.6*/if(user.getRole() == "admin")/*62.35*/{_display_(Seq[Any](format.raw/*62.36*/("""
  
  """),format.raw/*64.3*/("""<div class="col-sm-2">
    <h4>Admin Control</h4>
    <div class="list-group">
        <a href=""""),_display_(/*67.19*/routes/*67.25*/.HomeController.addEmployee()),format.raw/*67.54*/("""" class="list-group-item">
            <span class="">Add an Employee</span>
          </a>
          <a href=""""),_display_(/*70.21*/routes/*70.27*/.HomeController.addDepartment()),format.raw/*70.58*/("""" class="list-group-item">
              <span class="">Add a Department</span>
            </a>
            <a href=""""),_display_(/*73.23*/routes/*73.29*/.HomeController.addProject()),format.raw/*73.57*/("""" class="list-group-item">
                <span class="">Add a Project</span>
              </a>
              <a href=""""),_display_(/*76.25*/routes/*76.31*/.HomeController.addUser()),format.raw/*76.56*/("""" class="list-group-item">
                  <span class="">Add a User</span>
                </a>
    </div>
  </div>
    """)))}),format.raw/*81.6*/("""
  """)))}),format.raw/*82.4*/("""
"""),format.raw/*83.1*/("""</div>
""")))}),format.raw/*84.2*/("""
"""))
      }
    }
  }

  def render(departments:List[models.Department],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(departments,user,env)

  def f:((List[models.Department],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (departments,user,env) => apply(departments,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 12:43:22 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/departmentsPage.scala.html
                  HASH: 8b45168881f659d2b056219df0a465dc75f88df6
                  MATRIX: 1014->1|1198->90|1226->93|1258->117|1297->119|1325->121|1549->319|1590->351|1630->353|1666->362|1738->407|1752->412|1788->427|1824->436|1868->450|1902->457|2036->564|2061->580|2100->581|2141->595|2179->624|2218->625|2259->638|2329->677|2372->689|2414->704|2486->749|2521->768|2561->770|2600->781|2665->819|2675->820|2702->826|2752->849|2762->850|2791->858|2857->897|2867->898|2906->916|2952->935|2977->951|3016->952|3057->966|3100->1000|3139->1001|3194->1028|3267->1074|3282->1080|3344->1121|3581->1331|3596->1337|3658->1378|3864->1553|3905->1563|3944->1574|3990->1589|4024->1596|4087->1633|4112->1649|4151->1650|4183->1656|4221->1685|4260->1686|4293->1692|4417->1789|4432->1795|4482->1824|4621->1936|4636->1942|4688->1973|4834->2092|4849->2098|4898->2126|5047->2248|5062->2254|5108->2279|5262->2403|5296->2407|5324->2408|5362->2416
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|60->28|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|73->41|75->43|75->43|75->43|81->49|81->49|81->49|85->53|86->54|87->55|88->56|89->57|93->61|93->61|93->61|94->62|94->62|94->62|96->64|99->67|99->67|99->67|102->70|102->70|102->70|105->73|105->73|105->73|108->76|108->76|108->76|113->81|114->82|115->83|116->84
                  -- GENERATED --
              */
          