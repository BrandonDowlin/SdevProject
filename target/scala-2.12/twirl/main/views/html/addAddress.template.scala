
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

object addAddress extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addressForm: Form[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Address",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new Address</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addAddressSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(addressForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*13.91*/("""
        """),_display_(/*14.10*/inputText(addressForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*14.74*/("""
        
        """),format.raw/*16.9*/("""<div class="actions">
            <input type="submit" value="Add Address" class="btn btn-primary">
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.HomeController.address()),format.raw/*18.54*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*22.6*/("""
""")))}))
      }
    }
  }

  def render(addressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addressForm,user)

  def f:((Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addressForm,user) => apply(addressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 16:37:13 GMT 2018
                  SOURCE: /home/wdd/SdevCA-master/app/views/addAddress.scala.html
                  HASH: 70a7cd85c2d04a9fb935a57bc66cd09ff17ce15f
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1738->377|1840->458|1877->468|1962->532|2007->550|2156->672|2171->678|2217->703|2365->821
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|48->16|50->18|50->18|50->18|54->22
                  -- GENERATED --
              */
          