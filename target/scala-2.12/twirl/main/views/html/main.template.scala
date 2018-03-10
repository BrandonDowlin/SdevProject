
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
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="employees" )/*26.45*/{_display_(Seq[Any](format.raw/*26.46*/("""class="active"""")))}),format.raw/*26.61*/(""">
                    <a href="/">Employees</a>
                </li>

                <li """),_display_(/*30.22*/if(title=="projects" )/*30.44*/{_display_(Seq[Any](format.raw/*30.45*/("""class="active"""")))}),format.raw/*30.60*/(""">
                    <a href="/projectsPage">Projects</a>
                </li>

                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*41.22*/if(title=="Login")/*41.40*/{_display_(Seq[Any](format.raw/*41.41*/("""class="active"""")))}),format.raw/*41.56*/(""">
                    """),_display_(/*42.22*/if(user != null)/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
                        """),format.raw/*43.25*/("""<a href=""""),_display_(/*43.35*/routes/*43.41*/.LoginController.logout()),format.raw/*43.66*/("""">Logout """),_display_(/*43.76*/user/*43.80*/.getName()),format.raw/*43.90*/("""</a>
                    """)))}/*44.23*/else/*44.28*/{_display_(Seq[Any](format.raw/*44.29*/("""
                        """),format.raw/*45.25*/("""<a href=""""),_display_(/*45.35*/routes/*45.41*/.LoginController.login()),format.raw/*45.65*/("""">Login</a>
                    """)))}),format.raw/*46.22*/("""

                """),format.raw/*48.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*58.18*/content),format.raw/*58.25*/("""
            """),format.raw/*59.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("javascripts/main.js")),format.raw/*73.65*/(""""></script>
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
                  DATE: Sat Mar 10 02:23:24 GMT 2018
                  SOURCE: /home/brandon/Documents/SdevProject/app/views/main.scala.html
                  HASH: 1054117370277e2a1b6996f5d63623d99b5e788f
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1915->695|1947->718|1986->719|2032->734|2151->826|2182->848|2221->849|2267->864|2573->1143|2600->1161|2639->1162|2685->1177|2735->1200|2760->1216|2800->1218|2853->1243|2890->1253|2905->1259|2951->1284|2988->1294|3001->1298|3032->1308|3077->1335|3090->1340|3129->1341|3182->1366|3219->1376|3234->1382|3279->1406|3343->1439|3389->1457|3552->1593|3580->1600|3621->1613|3929->1894|3944->1900|4005->1940
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|62->30|62->30|62->30|62->30|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|80->48|90->58|90->58|91->59|105->73|105->73|105->73
                  -- GENERATED --
              */
          