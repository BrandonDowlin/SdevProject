
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
    """),_display_(/*12.6*/select(
        updateAddressForm("employee.id"),
        options(Employee.options),
        '_label -> "Employee", '_default -> "-- Choose a employee --",
        '_showConstraints -> false, 'class -> "form-control"
    )),format.raw/*17.6*/("""   
    """),format.raw/*18.5*/("""<label>Caution, selecting an employee with an already assigned address will not work</label>
    <div class="actions">
        <input type="submit" value="Update Address" class="btn btn-primary">
        <a href=""""),_display_(/*21.19*/routes/*21.25*/.HomeController.addressPage()),format.raw/*21.54*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*25.3*/("""
""")))}),format.raw/*26.2*/("""
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
                  DATE: Fri Mar 09 11:28:12 GMT 2018
                  SOURCE: /home/wdd/SdevProject/app/views/updateAddress.scala.html
                  HASH: 57355a4f9582e89003aea1176e3e2f8c979aa8ca
                  MATRIX: 993->1|1142->79|1187->77|1214->96|1250->124|1288->125|1315->126|1378->164|1525->303|1564->305|1596->338|1627->344|1639->348|1669->358|1702->365|1810->452|1842->458|2084->680|2119->688|2360->902|2375->908|2425->937|2558->1040|2590->1042
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|43->11|43->11|44->12|49->17|50->18|53->21|53->21|53->21|57->25|58->26
                  -- GENERATED --
              */
          