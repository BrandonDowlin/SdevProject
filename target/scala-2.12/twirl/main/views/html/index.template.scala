
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Employee],List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], projects: List[models.Project], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""

"""),_display_(/*3.2*/main("employees",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee Page</p>
<br>
<div class="row">
  <div class="col-sm-2">

    <h4>Projects</h4>
    <div class="list-group">
      <a href=""""),_display_(/*12.17*/routes/*12.23*/.HomeController.index(0)),format.raw/*12.47*/("""" class="list-group-item">All projects</a>
      """),_display_(/*13.8*/for(p <- projects) yield /*13.26*/ {_display_(Seq[Any](format.raw/*13.28*/("""
        """),format.raw/*14.9*/("""<a href=""""),_display_(/*14.19*/routes/*14.25*/.HomeController.index(p.getId)),format.raw/*14.55*/("""" class="list-group-item">"""),_display_(/*14.82*/p/*14.83*/.getName),format.raw/*14.91*/("""
          """),format.raw/*15.11*/("""<span class="badge">"""),_display_(/*15.32*/p/*15.33*/.getEmployees.size()),format.raw/*15.53*/("""</span>
        </a>
      """)))}),format.raw/*17.8*/("""
    """),format.raw/*18.5*/("""</div>
  </div>
  <div class="col-sm-8">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*22.8*/if(flash.containsKey("success"))/*22.40*/ {_display_(Seq[Any](format.raw/*22.42*/("""
        """),format.raw/*23.9*/("""<div class="alert alert-success">
          """),_display_(/*24.12*/flash/*24.17*/.get("success")),format.raw/*24.32*/("""
        """),format.raw/*25.9*/("""</div>
      """)))}),format.raw/*26.8*/("""
      """),format.raw/*27.7*/("""<thead>
        <tr>
          <th></th>
          <th>ID</th>
          <th>Surname</th>
          <th>Forename</th>
          <th>Department</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-employees) yield /*39.27*/ {_display_(Seq[Any](format.raw/*39.29*/("""
          """),format.raw/*40.11*/("""<tr>
              """),_display_(/*41.16*/if(env.resource("public/images/employeeImages/thumbnails/" + p.getId + ".jpg").isDefined)/*41.105*/ {_display_(Seq[Any](format.raw/*41.107*/("""
                """),format.raw/*42.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*42.73*/(p.getId + ".jpg")),format.raw/*42.91*/(""""/></td>
            """)))}/*43.15*/else/*43.20*/{_display_(Seq[Any](format.raw/*43.21*/("""
                """),format.raw/*44.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""<td class="numeric">"""),_display_(/*46.34*/p/*46.35*/.getId),format.raw/*46.41*/("""</td>
            <td>"""),_display_(/*47.18*/p/*47.19*/.getLname),format.raw/*47.28*/("""</td>
               <td>"""),_display_(/*48.21*/p/*48.22*/.getFname),format.raw/*48.31*/("""</td>
                  
            <td>"""),_display_(/*50.18*/p/*50.19*/.getDepartment.getName),format.raw/*50.41*/("""</td>
            <td>
              <a href=""""),_display_(/*52.25*/routes/*52.31*/.HomeController.updateEmployee(p.getId)),format.raw/*52.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*56.25*/routes/*56.31*/.HomeController.deleteEmployee(p.getId)),format.raw/*56.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*61.10*/("""
      """),format.raw/*62.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*67.17*/routes/*67.23*/.HomeController.addEmployee()),format.raw/*67.52*/("""">
        <button class="btn btn-primary">Add an Employee</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*73.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.Employee],projects:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.Employee],List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 16:28:49 GMT 2018
                  SOURCE: /home/wdd/SdevCA-master/app/views/index.scala.html
                  HASH: 1b881c345d7a718a84371fd614d3f2e435eacc8d
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1538->297|1553->303|1598->327|1674->377|1708->395|1748->397|1784->406|1821->416|1836->422|1887->452|1941->479|1951->480|1980->488|2019->499|2067->520|2077->521|2118->541|2176->569|2208->574|2351->691|2392->723|2432->725|2468->734|2540->779|2554->784|2590->799|2626->808|2670->822|2704->829|2970->1068|3003->1085|3043->1087|3082->1098|3129->1118|3228->1207|3269->1209|3314->1226|3397->1282|3436->1300|3477->1323|3490->1328|3529->1329|3574->1346|3693->1434|3734->1447|3782->1468|3792->1469|3819->1475|3869->1498|3879->1499|3909->1508|3962->1534|3972->1535|4002->1544|4071->1586|4081->1587|4124->1609|4198->1656|4213->1662|4273->1701|4470->1871|4485->1877|4545->1916|4765->2105|4799->2112|4874->2160|4889->2166|4939->2195|5074->2300
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|49->17|50->18|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|59->27|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|78->46|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|82->50|82->50|82->50|84->52|84->52|84->52|88->56|88->56|88->56|93->61|94->62|99->67|99->67|99->67|105->73
                  -- GENERATED --
              */
          