
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

                <li """),_display_(/*30.22*/if(title=="addresses" )/*30.45*/{_display_(Seq[Any](format.raw/*30.46*/("""class="active"""")))}),format.raw/*30.61*/(""">
                    <a href="/address">Addresses</a>
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
                  DATE: Thu Mar 08 17:16:44 GMT 2018
                  SOURCE: /home/wdd/SdevCA-master/app/views/main.scala.html
                  HASH: 3764a62eb61e06480bac59ed165ef7372773ba62
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1915->695|1947->718|1986->719|2032->734|2151->826|2183->849|2222->850|2268->865|2570->1140|2597->1158|2636->1159|2682->1174|2732->1197|2757->1213|2797->1215|2850->1240|2887->1250|2902->1256|2948->1281|2985->1291|2998->1295|3029->1305|3074->1332|3087->1337|3126->1338|3179->1363|3216->1373|3231->1379|3276->1403|3340->1436|3386->1454|3549->1590|3577->1597|3618->1610|3926->1891|3941->1897|4002->1937
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|62->30|62->30|62->30|62->30|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|80->48|90->58|90->58|91->59|105->73|105->73|105->73
                  -- GENERATED --
              */
          