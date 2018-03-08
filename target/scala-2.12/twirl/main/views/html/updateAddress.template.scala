
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

object updateAddress extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Address],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateAddressForm: Form[models.Address], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.78*/("""
"""),_display_(/*3.2*/main("Update address", user)/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Address</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateAddressSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""

    """),_display_(/*11.6*/inputText(updateAddressForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*11.93*/("""
        
    """),format.raw/*13.5*/("""<div class="actions">
        <input type="submit" value="Update Address" class="btn btn-primary">
        <a href=""""),_display_(/*15.19*/routes/*15.25*/.HomeController.address()),format.raw/*15.50*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*19.3*/("""
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateAddressForm:Form[models.Address],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateAddressForm,user)

  def f:((Long,Form[models.Address],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateAddressForm,user) => apply(id,updateAddressForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 17:16:44 GMT 2018
                  SOURCE: /home/wdd/SdevCA-master/app/views/updateAddress.scala.html
                  HASH: 941dc31fdc24fe744aabc6080439c266f2ea33b9
                  MATRIX: 993->1|1142->79|1187->77|1214->96|1250->124|1288->125|1315->126|1378->164|1525->303|1564->305|1596->338|1627->344|1639->348|1669->358|1702->365|1810->452|1851->466|1995->583|2010->589|2056->614|2189->717|2221->719
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|43->11|43->11|45->13|47->15|47->15|47->15|51->19|52->20
                  -- GENERATED --
              */
          