
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

object projectsPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Project], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""

"""),_display_(/*3.2*/main("projects",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Projects Page</p>
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
          <th>Description</th>
          <th>Deadline</th>
          <th>Employees</th>
          """),_display_(/*25.12*/if(user != null)/*25.28*/{_display_(Seq[Any](format.raw/*25.29*/("""
            """),_display_(/*26.14*/if(user.getRole() == "admin")/*26.43*/{_display_(Seq[Any](format.raw/*26.44*/("""
            """),format.raw/*27.13*/("""<th colspan="2">Edit</th>
            """)))}),format.raw/*28.14*/("""
          """)))}),format.raw/*29.12*/("""      
        """),format.raw/*30.9*/("""</tr>
      </thead>

      <tbody>
        """),_display_(/*34.10*/for(p<-projects) yield /*34.26*/ {_display_(Seq[Any](format.raw/*34.28*/("""
          """),format.raw/*35.11*/("""<tr>
            <td class="numeric">"""),_display_(/*36.34*/p/*36.35*/.getId),format.raw/*36.41*/("""</td>
            <td>"""),_display_(/*37.18*/p/*37.19*/.getName),format.raw/*37.27*/("""</td>
            <td>"""),_display_(/*38.18*/p/*38.19*/.getDescription),format.raw/*38.34*/("""</td>
            <td>"""),_display_(/*39.18*/p/*39.19*/.getDeadline),format.raw/*39.31*/("""</td>
            <td class="numeric">"""),_display_(/*40.34*/p/*40.35*/.getEmployees.size),format.raw/*40.53*/("""</td>
            """),_display_(/*41.14*/if(user != null)/*41.30*/{_display_(Seq[Any](format.raw/*41.31*/("""
            """),_display_(/*42.14*/if(user.getRole().equals("admin"))/*42.48*/{_display_(Seq[Any](format.raw/*42.49*/("""

            
            """),format.raw/*45.13*/("""<td>
                
              <a href=""""),_display_(/*47.25*/routes/*47.31*/.HomeController.updateProject(p.getId)),format.raw/*47.69*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  
                
              </a>
            </td>        <td>
              <a href=""""),_display_(/*53.25*/routes/*53.31*/.HomeController.deleteProject(p.getId)),format.raw/*53.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          """)))}),format.raw/*57.12*/("""
        """)))}),format.raw/*58.10*/("""
          """),format.raw/*59.11*/("""</tr>
        """)))}),format.raw/*60.10*/("""
      """),format.raw/*61.7*/("""</tbody>
    </table>
  </div>
  
  """),_display_(/*65.4*/if(user != null)/*65.20*/{_display_(Seq[Any](format.raw/*65.21*/("""
    """),_display_(/*66.6*/if(user.getRole() == "admin")/*66.35*/{_display_(Seq[Any](format.raw/*66.36*/("""
  
  """),format.raw/*68.3*/("""<div class="col-sm-2">
    <h4>Admin Control</h4>
    <div class="list-group">
        <a href=""""),_display_(/*71.19*/routes/*71.25*/.HomeController.addEmployee()),format.raw/*71.54*/("""" class="list-group-item">
            <span class="">Add an Employee</span>
          </a>
          <a href=""""),_display_(/*74.21*/routes/*74.27*/.HomeController.addProject()),format.raw/*74.55*/("""" class="list-group-item">
              <span class="">Add a Department</span>
            </a>
            <a href=""""),_display_(/*77.23*/routes/*77.29*/.HomeController.addProject()),format.raw/*77.57*/("""" class="list-group-item">
                <span class="">Add a Project</span>
              </a>
              <a href=""""),_display_(/*80.25*/routes/*80.31*/.HomeController.addProject()),format.raw/*80.59*/("""" class="list-group-item">
                  <span class="">Add a User</span>
                </a>
    </div>
  </div>
    """)))}),format.raw/*85.6*/("""
  """)))}),format.raw/*86.4*/("""
"""),format.raw/*87.1*/("""</div>
""")))}),format.raw/*88.2*/("""
"""))
      }
    }
  }

  def render(projects:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(projects,user,env)

  def f:((List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (projects,user,env) => apply(projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 10 02:38:41 GMT 2018
                  SOURCE: /home/brandon/Documents/SdevProject/app/views/projectsPage.scala.html
                  HASH: 176336d13c5992c24796df2dc20e79475abea4d8
                  MATRIX: 1008->1|1186->84|1214->87|1243->108|1282->110|1310->112|1531->307|1572->339|1612->341|1648->350|1720->395|1734->400|1770->415|1806->424|1850->438|1884->445|2077->611|2102->627|2141->628|2182->642|2220->671|2259->672|2300->685|2370->724|2413->736|2455->751|2527->796|2559->812|2599->814|2638->825|2703->863|2713->864|2740->870|2790->893|2800->894|2829->902|2879->925|2889->926|2925->941|2975->964|2985->965|3018->977|3084->1016|3094->1017|3133->1035|3179->1054|3204->1070|3243->1071|3284->1085|3327->1119|3366->1120|3421->1147|3494->1193|3509->1199|3568->1237|3805->1447|3820->1453|3879->1491|4085->1666|4126->1676|4165->1687|4211->1702|4245->1709|4308->1746|4333->1762|4372->1763|4404->1769|4442->1798|4481->1799|4514->1805|4638->1902|4653->1908|4703->1937|4842->2049|4857->2055|4906->2083|5052->2202|5067->2208|5116->2236|5265->2358|5280->2364|5329->2392|5483->2516|5517->2520|5545->2521|5583->2529
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|57->25|57->25|57->25|58->26|58->26|58->26|59->27|60->28|61->29|62->30|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|77->45|79->47|79->47|79->47|85->53|85->53|85->53|89->57|90->58|91->59|92->60|93->61|97->65|97->65|97->65|98->66|98->66|98->66|100->68|103->71|103->71|103->71|106->74|106->74|106->74|109->77|109->77|109->77|112->80|112->80|112->80|117->85|118->86|119->87|120->88
                  -- GENERATED --
              */
          