
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
      """),_display_(/*23.8*/if(flash.containsKey("success"))/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
        """),format.raw/*24.9*/("""<div class="alert alert-success">
          """),_display_(/*25.12*/flash/*25.17*/.get("success")),format.raw/*25.32*/("""
        """),format.raw/*26.9*/("""</div>
      """)))}),format.raw/*27.8*/("""
      """),format.raw/*28.7*/("""<thead>
        <tr>
          <th colspan="2">ID</th>
          <th>Name</th>
          <th>Address</th>
          <th>County</th>
          <th>Department</th>
          """),_display_(/*35.12*/if(user != null)/*35.28*/{_display_(Seq[Any](format.raw/*35.29*/("""
            """),_display_(/*36.14*/if(user.getRole() == "admin")/*36.43*/{_display_(Seq[Any](format.raw/*36.44*/("""
            """),format.raw/*37.13*/("""<th colspan="2">Edit</th>
            """)))}),format.raw/*38.14*/("""
          """)))}),format.raw/*39.12*/("""
                
        """),format.raw/*41.9*/("""</tr>
      </thead>

      <tbody>
        """),_display_(/*45.10*/for(p<-employees) yield /*45.27*/ {_display_(Seq[Any](format.raw/*45.29*/("""
          """),format.raw/*46.11*/("""<tr>
              """),_display_(/*47.16*/if(env.resource("public/images/employeeImages/thumbnails/" + p.getId + ".jpg").isDefined)/*47.105*/ {_display_(Seq[Any](format.raw/*47.107*/("""
                """),format.raw/*48.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*48.73*/(p.getId + ".jpg")),format.raw/*48.91*/(""""/></td>
            """)))}/*49.15*/else/*49.20*/{_display_(Seq[Any](format.raw/*49.21*/("""
                """),format.raw/*50.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*51.14*/("""
            """),format.raw/*52.13*/("""<td class="numeric">"""),_display_(/*52.34*/p/*52.35*/.getId),format.raw/*52.41*/("""</td>
            <td>"""),_display_(/*53.18*/p/*53.19*/.getLname),format.raw/*53.28*/(""", """),_display_(/*53.31*/p/*53.32*/.getFname),format.raw/*53.41*/("""</td>
               <td>"""),_display_(/*54.21*/p/*54.22*/.getAddress.getStreet),format.raw/*54.43*/("""</td>
                  <td>"""),_display_(/*55.24*/p/*55.25*/.getAddress.getCounty),format.raw/*55.46*/("""</td>
            <td>"""),_display_(/*56.18*/p/*56.19*/.getDepartment.getName),format.raw/*56.41*/("""</td>
            """),_display_(/*57.14*/if(user != null)/*57.30*/{_display_(Seq[Any](format.raw/*57.31*/("""
            """),_display_(/*58.14*/if(user.getRole().equals("admin"))/*58.48*/{_display_(Seq[Any](format.raw/*58.49*/("""

            
            """),format.raw/*61.13*/("""<td>
                
              <a href=""""),_display_(/*63.25*/routes/*63.31*/.HomeController.updateEmployee(p.getId)),format.raw/*63.70*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  
                
              </a>
            </td>        <td>
              <a href=""""),_display_(/*69.25*/routes/*69.31*/.HomeController.deleteEmployee(p.getId)),format.raw/*69.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          """)))}),format.raw/*73.12*/("""
        """)))}),format.raw/*74.10*/("""
          """),format.raw/*75.11*/("""</tr>
        """)))}),format.raw/*76.10*/("""
      """),format.raw/*77.7*/("""</tbody>
    </table>
  </div>
  
  """),_display_(/*81.4*/if(user != null)/*81.20*/{_display_(Seq[Any](format.raw/*81.21*/("""
    """),_display_(/*82.6*/if(user.getRole() == "admin")/*82.35*/{_display_(Seq[Any](format.raw/*82.36*/("""
  
  """),format.raw/*84.3*/("""<div class="col-sm-2">
    <h4>Admin Control</h4>
    <div class="list-group">
        <a href=""""),_display_(/*87.19*/routes/*87.25*/.HomeController.addEmployee()),format.raw/*87.54*/("""" class="list-group-item">
            <span class="">Add an Employee</span>
          </a>
          <a href=""""),_display_(/*90.21*/routes/*90.27*/.HomeController.addEmployee()),format.raw/*90.56*/("""" class="list-group-item">
              <span class="">Add a Department</span>
            </a>
            <a href=""""),_display_(/*93.23*/routes/*93.29*/.HomeController.addProject()),format.raw/*93.57*/("""" class="list-group-item">
                <span class="">Add a Project</span>
              </a>
              <a href=""""),_display_(/*96.25*/routes/*96.31*/.HomeController.addEmployee()),format.raw/*96.60*/("""" class="list-group-item">
                  <span class="">Add a User</span>
                </a>
    </div>
  </div>
    """)))}),format.raw/*101.6*/("""
  """)))}),format.raw/*102.4*/("""
"""),format.raw/*103.1*/("""</div>
""")))}),format.raw/*104.2*/("""
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
                  DATE: Sat Mar 10 02:37:14 GMT 2018
                  SOURCE: /home/brandon/Documents/SdevProject/app/views/index.scala.html
                  HASH: 583902beed1ae241d00b38a7222d15293b4fbfa0
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1538->297|1553->303|1598->327|1674->377|1708->395|1748->397|1784->406|1821->416|1836->422|1887->452|1941->479|1951->480|1980->488|2019->499|2067->520|2077->521|2118->541|2176->569|2208->574|2354->694|2395->726|2435->728|2471->737|2543->782|2557->787|2593->802|2629->811|2673->825|2707->832|2907->1005|2932->1021|2971->1022|3012->1036|3050->1065|3089->1066|3130->1079|3200->1118|3243->1130|3296->1156|3368->1201|3401->1218|3441->1220|3480->1231|3527->1251|3626->1340|3667->1342|3712->1359|3795->1415|3834->1433|3875->1456|3888->1461|3927->1462|3972->1479|4091->1567|4132->1580|4180->1601|4190->1602|4217->1608|4267->1631|4277->1632|4307->1641|4337->1644|4347->1645|4377->1654|4430->1680|4440->1681|4482->1702|4538->1731|4548->1732|4590->1753|4640->1776|4650->1777|4693->1799|4739->1818|4764->1834|4803->1835|4844->1849|4887->1883|4926->1884|4981->1911|5054->1957|5069->1963|5129->2002|5366->2212|5381->2218|5441->2257|5647->2432|5688->2442|5727->2453|5773->2468|5807->2475|5870->2512|5895->2528|5934->2529|5966->2535|6004->2564|6043->2565|6076->2571|6200->2668|6215->2674|6265->2703|6404->2815|6419->2821|6469->2850|6615->2969|6630->2975|6679->3003|6828->3125|6843->3131|6893->3160|7048->3284|7083->3288|7112->3289|7151->3297
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|49->17|50->18|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|60->28|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|71->39|73->41|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|83->51|84->52|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|93->61|95->63|95->63|95->63|101->69|101->69|101->69|105->73|106->74|107->75|108->76|109->77|113->81|113->81|113->81|114->82|114->82|114->82|116->84|119->87|119->87|119->87|122->90|122->90|122->90|125->93|125->93|125->93|128->96|128->96|128->96|133->101|134->102|135->103|136->104
                  -- GENERATED --
              */
          