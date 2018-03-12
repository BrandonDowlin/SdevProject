
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
                  """),_display_(/*56.20*/if(p.getDepartment != null)/*56.47*/{_display_(Seq[Any](format.raw/*56.48*/("""
                    """),format.raw/*57.21*/("""<td>"""),_display_(/*57.26*/p/*57.27*/.getDepartment.getName),format.raw/*57.49*/("""</td>
                  """)))}/*58.21*/else/*58.26*/{_display_(Seq[Any](format.raw/*58.27*/("""
                    """),format.raw/*59.21*/("""<td>Unassigned</td>
                  """)))}),format.raw/*60.20*/("""
            """),_display_(/*61.14*/if(user != null)/*61.30*/{_display_(Seq[Any](format.raw/*61.31*/("""
            """),_display_(/*62.14*/if(user.getRole().equals("admin"))/*62.48*/{_display_(Seq[Any](format.raw/*62.49*/("""

            
            """),format.raw/*65.13*/("""<td>
                
              <a href=""""),_display_(/*67.25*/routes/*67.31*/.HomeController.updateEmployee(p.getId)),format.raw/*67.70*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  
                
              </a>
            </td>        <td>
              <a href=""""),_display_(/*73.25*/routes/*73.31*/.HomeController.deleteEmployee(p.getId)),format.raw/*73.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          """)))}),format.raw/*77.12*/("""
        """)))}),format.raw/*78.10*/("""
          """),format.raw/*79.11*/("""</tr>
        """)))}),format.raw/*80.10*/("""
      """),format.raw/*81.7*/("""</tbody>
    </table>
  </div>
  
  """),_display_(/*85.4*/if(user != null)/*85.20*/{_display_(Seq[Any](format.raw/*85.21*/("""
    """),_display_(/*86.6*/if(user.getRole() == "admin")/*86.35*/{_display_(Seq[Any](format.raw/*86.36*/("""
  
  """),format.raw/*88.3*/("""<div class="col-sm-2">
    <h4>Admin Control</h4>
    <div class="list-group">
      <a href=""""),_display_(/*91.17*/routes/*91.23*/.HomeController.addEmployee()),format.raw/*91.52*/("""" class="list-group-item">
        <span class="">Add an Employee</span>
      </a>
      <a href=""""),_display_(/*94.17*/routes/*94.23*/.HomeController.addDepartment()),format.raw/*94.54*/("""" class="list-group-item">
          <span class="">Add a Department</span>
        </a>
        <a href=""""),_display_(/*97.19*/routes/*97.25*/.HomeController.addProject()),format.raw/*97.53*/("""" class="list-group-item">
            <span class="">Add a Project</span>
          </a>
          <a href=""""),_display_(/*100.21*/routes/*100.27*/.HomeController.addUser()),format.raw/*100.52*/("""" class="list-group-item">
              <span class="">Add a User</span>
            </a>
    </div>
  </div>
    """)))}),format.raw/*105.6*/("""
  """)))}),format.raw/*106.4*/("""
"""),format.raw/*107.1*/("""</div>
""")))}),format.raw/*108.2*/("""
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
                  DATE: Mon Mar 12 12:43:23 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/index.scala.html
                  HASH: a2e34c11f10ca3e269805b9288a0824ac3804a5b
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1538->297|1553->303|1598->327|1674->377|1708->395|1748->397|1784->406|1821->416|1836->422|1887->452|1941->479|1951->480|1980->488|2019->499|2067->520|2077->521|2118->541|2176->569|2208->574|2354->694|2395->726|2435->728|2471->737|2543->782|2557->787|2593->802|2629->811|2673->825|2707->832|2907->1005|2932->1021|2971->1022|3012->1036|3050->1065|3089->1066|3130->1079|3200->1118|3243->1130|3296->1156|3368->1201|3401->1218|3441->1220|3480->1231|3527->1251|3626->1340|3667->1342|3712->1359|3795->1415|3834->1433|3875->1456|3888->1461|3927->1462|3972->1479|4091->1567|4132->1580|4180->1601|4190->1602|4217->1608|4267->1631|4277->1632|4307->1641|4337->1644|4347->1645|4377->1654|4430->1680|4440->1681|4482->1702|4538->1731|4548->1732|4590->1753|4642->1778|4678->1805|4717->1806|4766->1827|4798->1832|4808->1833|4851->1855|4895->1881|4908->1886|4947->1887|4996->1908|5066->1947|5107->1961|5132->1977|5171->1978|5212->1992|5255->2026|5294->2027|5349->2054|5422->2100|5437->2106|5497->2145|5734->2355|5749->2361|5809->2400|6015->2575|6056->2585|6095->2596|6141->2611|6175->2618|6238->2655|6263->2671|6302->2672|6334->2678|6372->2707|6411->2708|6444->2714|6566->2809|6581->2815|6631->2844|6758->2944|6773->2950|6825->2981|6959->3088|6974->3094|7023->3122|7161->3232|7177->3238|7224->3263|7371->3379|7406->3383|7435->3384|7474->3392
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|49->17|50->18|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|60->28|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|71->39|73->41|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|83->51|84->52|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|89->57|90->58|90->58|90->58|91->59|92->60|93->61|93->61|93->61|94->62|94->62|94->62|97->65|99->67|99->67|99->67|105->73|105->73|105->73|109->77|110->78|111->79|112->80|113->81|117->85|117->85|117->85|118->86|118->86|118->86|120->88|123->91|123->91|123->91|126->94|126->94|126->94|129->97|129->97|129->97|132->100|132->100|132->100|137->105|138->106|139->107|140->108
                  -- GENERATED --
              */
          