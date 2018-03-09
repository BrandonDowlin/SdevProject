
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

object addressPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Address],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

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
                  DATE: Fri Mar 09 10:40:40 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/addressPage.scala.html
                  HASH: 288f9c6096d43214a66e62fb441fd046d7b8061a
                  MATRIX: 1007->1|1186->85|1214->88|1244->110|1283->112|1311->114|1529->306|1570->338|1610->340|1646->349|1718->394|1732->399|1768->414|1804->423|1848->437|1882->444|2136->671|2169->688|2209->690|2248->701|2313->739|2323->740|2350->746|2400->769|2410->770|2442->781|2488->800|2522->825|2561->826|2606->843|2680->899|2693->904|2732->905|2773->918|2805->923|2815->924|2857->945|2887->948|2897->949|2939->970|2989->993|2999->994|3054->1028|3104->1047|3145->1060|3201->1089|3216->1095|3275->1133|3472->1303|3487->1309|3546->1347|3766->1536|3800->1543|3875->1591|3890->1597|3939->1625|4073->1729
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|49->17|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|71->39|72->40|72->40|72->40|76->44|76->44|76->44|81->49|82->50|87->55|87->55|87->55|93->61
                  -- GENERATED --
              */
          