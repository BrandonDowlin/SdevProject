
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

object address extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addresses: List[models.Address], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""

"""),_display_(/*3.2*/main("addresses",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Address Page</p>
<br>
<div class="row">
  <div class="col-sm-2"> 
  </div>
  <div class="col-sm-8">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*12.8*/if(flash.containsKey("success"))/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
        """),format.raw/*13.9*/("""<div class="alert alert-success">
          """),_display_(/*14.12*/flash/*14.17*/.get("success")),format.raw/*14.32*/("""
        """),format.raw/*15.9*/("""</div>
      """)))}),format.raw/*16.8*/("""
      """),format.raw/*17.7*/("""<thead>
        <tr>
          <th>Address ID</th>
          <th>Address</th>
          <th>Employee</th>
          <th>Department</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*28.10*/for(a<-addresses) yield /*28.27*/ {_display_(Seq[Any](format.raw/*28.29*/("""
          """),format.raw/*29.11*/("""<tr>
            <td class="numeric">"""),_display_(/*30.34*/a/*30.35*/.getId),format.raw/*30.41*/("""</td>
            <td>"""),_display_(/*31.18*/a/*31.19*/.getAddress),format.raw/*31.30*/("""</td>
            """),_display_(/*32.14*/if(a.getEmployee == null)/*32.39*/{_display_(Seq[Any](format.raw/*32.40*/("""
                """),format.raw/*33.17*/("""<td>N/A</td>
                <td>N/A</td>
            """)))}/*35.15*/else/*35.20*/{_display_(Seq[Any](format.raw/*35.21*/("""
            """),format.raw/*36.13*/("""<td>"""),_display_(/*36.18*/a/*36.19*/.getEmployee.getLname),format.raw/*36.40*/(""", """),_display_(/*36.43*/a/*36.44*/.getEmployee.getFname),format.raw/*36.65*/("""</td>
            <td>"""),_display_(/*37.18*/a/*37.19*/.getEmployee.getDepartment.getName),format.raw/*37.53*/("""</td>
            """)))}),format.raw/*38.14*/("""
            """),format.raw/*39.13*/("""<td>
              <a href=""""),_display_(/*40.25*/routes/*40.31*/.HomeController.updateAddress(a.getId)),format.raw/*40.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*44.25*/routes/*44.31*/.HomeController.deleteAddress(a.getId)),format.raw/*44.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*49.10*/("""
      """),format.raw/*50.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*55.17*/routes/*55.23*/.HomeController.addAddress()),format.raw/*55.51*/("""">
        <button class="btn btn-primary">Add an Address</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*61.2*/("""
"""))
      }
    }
  }

  def render(addresses:List[models.Address],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addresses,user,env)

  def f:((List[models.Address],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addresses,user,env) => apply(addresses,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 17:16:44 GMT 2018
                  SOURCE: /home/wdd/SdevCA-master/app/views/address.scala.html
                  HASH: 288f9c6096d43214a66e62fb441fd046d7b8061a
                  MATRIX: 1003->1|1182->85|1210->88|1240->110|1279->112|1307->114|1525->306|1566->338|1606->340|1642->349|1714->394|1728->399|1764->414|1800->423|1844->437|1878->444|2132->671|2165->688|2205->690|2244->701|2309->739|2319->740|2346->746|2396->769|2406->770|2438->781|2484->800|2518->825|2557->826|2602->843|2676->899|2689->904|2728->905|2769->918|2801->923|2811->924|2853->945|2883->948|2893->949|2935->970|2985->993|2995->994|3050->1028|3100->1047|3141->1060|3197->1089|3212->1095|3271->1133|3468->1303|3483->1309|3542->1347|3762->1536|3796->1543|3871->1591|3886->1597|3935->1625|4069->1729
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|49->17|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|71->39|72->40|72->40|72->40|76->44|76->44|76->44|81->49|82->50|87->55|87->55|87->55|93->61
                  -- GENERATED --
              */
          