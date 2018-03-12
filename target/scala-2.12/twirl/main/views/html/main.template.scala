
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Sdev Project - """),_display_(/*9.28*/title),format.raw/*9.33*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Sdev Project</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="employees" )/*26.45*/{_display_(Seq[Any](format.raw/*26.46*/("""class="active"""")))}),format.raw/*26.61*/(""">
                    <a href="/">Employees</a>
                </li>
                """),_display_(/*29.18*/if(user != null)/*29.34*/{_display_(Seq[Any](format.raw/*29.35*/("""
                    """),_display_(/*30.22*/if(user.getRole() == "admin" || user.getRole() == "manager")/*30.82*/{_display_(Seq[Any](format.raw/*30.83*/("""
                """),format.raw/*31.17*/("""<li """),_display_(/*31.22*/if(title=="departments" )/*31.47*/{_display_(Seq[Any](format.raw/*31.48*/("""class="active"""")))}),format.raw/*31.63*/(""">
                    <a href="/departmentsPage">Departments</a>
                </li>
                <li """),_display_(/*34.22*/if(title=="projects" )/*34.44*/{_display_(Seq[Any](format.raw/*34.45*/("""class="active"""")))}),format.raw/*34.60*/(""">
                    <a href="/projectsPage">Projects</a>
                </li>
                <li """),_display_(/*37.22*/if(title=="users" )/*37.41*/{_display_(Seq[Any](format.raw/*37.42*/("""class="active"""")))}),format.raw/*37.57*/(""">
                    <a href="/usersPage">Users</a>
                </li>
            """)))}),format.raw/*40.14*/("""
        """)))}),format.raw/*41.10*/("""

                
                """),format.raw/*44.17*/("""<li """),_display_(/*44.22*/if(title=="Login")/*44.40*/{_display_(Seq[Any](format.raw/*44.41*/("""class="active"""")))}),format.raw/*44.56*/(""">
                    """),_display_(/*45.22*/if(user != null)/*45.38*/ {_display_(Seq[Any](format.raw/*45.40*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.LoginController.logout()),format.raw/*46.66*/("""">Logout """),_display_(/*46.76*/user/*46.80*/.getName()),format.raw/*46.90*/("""</a>
                    """)))}/*47.23*/else/*47.28*/{_display_(Seq[Any](format.raw/*47.29*/("""
                        """),format.raw/*48.25*/("""<a href=""""),_display_(/*48.35*/routes/*48.41*/.LoginController.login()),format.raw/*48.65*/("""">Login</a>
                    """)))}),format.raw/*49.22*/("""

                """),format.raw/*51.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*61.18*/content),format.raw/*61.25*/("""
            """),format.raw/*62.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("javascripts/main.js")),format.raw/*74.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 12 12:43:23 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/main.scala.html
                  HASH: 26d7d22c3978f77b9bb4ebf5efaf38b64f3914a6
                  MATRIX: 970->1|1121->57|1149->59|1271->155|1296->160|1508->345|1523->351|1585->392|1917->697|1949->720|1988->721|2034->736|2148->823|2173->839|2212->840|2261->862|2330->922|2369->923|2414->940|2446->945|2480->970|2519->971|2565->986|2700->1094|2731->1116|2770->1117|2816->1132|2945->1234|2973->1253|3012->1254|3058->1269|3177->1357|3218->1367|3281->1402|3313->1407|3340->1425|3379->1426|3425->1441|3475->1464|3500->1480|3540->1482|3593->1507|3630->1517|3645->1523|3691->1548|3728->1558|3741->1562|3772->1572|3817->1599|3830->1604|3869->1605|3922->1630|3959->1640|3974->1646|4019->1670|4083->1703|4129->1721|4292->1857|4320->1864|4361->1877|4598->2087|4613->2093|4674->2133
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|66->34|66->34|66->34|66->34|69->37|69->37|69->37|69->37|72->40|73->41|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|80->48|81->49|83->51|93->61|93->61|94->62|106->74|106->74|106->74
                  -- GENERATED --
              */
          