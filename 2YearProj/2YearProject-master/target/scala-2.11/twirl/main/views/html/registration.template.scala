
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registration_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object registration_Scope1 {
import models.users.User

class registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addUserForm: Form[models.users.User], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.52*/("""

"""),_display_(/*5.2*/main("Add User", user)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""<div class="col-sm-4 col-sm-offset-4 text-center">
    <h3>Sign Up</h3>
    """),_display_(/*8.6*/if(addUserForm.hasGlobalErrors)/*8.37*/ {_display_(Seq[Any](format.raw/*8.39*/("""
        """),format.raw/*9.9*/("""<p class="alert alert-warning">
        """),_display_(/*10.10*/addUserForm/*10.21*/.globalError.message),format.raw/*10.41*/("""
        """),format.raw/*11.9*/("""</p>
            """)))}),format.raw/*12.14*/("""

    """),_display_(/*14.6*/form(action = routes.RegistrationController.RegistrationSubmit(),'class -> "form-horizontal", 'role->"form")/*14.114*/ {_display_(Seq[Any](format.raw/*14.116*/("""

            """),_display_(/*16.14*/inputText(addUserForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.89*/("""


            """),_display_(/*19.14*/inputText(addUserForm("email"), '_label -> "Email",'class -> "form-control")),format.raw/*19.90*/("""


           """),_display_(/*22.13*/inputPassword(addUserForm("password"), '_label -> "Password",'class -> "form-control")),format.raw/*22.99*/("""


    
        """),format.raw/*26.9*/("""<div class="action">
            <input type="submit" value="Add User" class="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.index()),format.raw/*28.52*/("""">
                <button class="btn btn-warning">Cancel</button>
            </a>
        </div>

    </div>
    """)))}),format.raw/*34.6*/("""
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(addUserForm:Form[models.users.User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(addUserForm,user)

  def f:((Form[models.users.User],User) => play.twirl.api.HtmlFormat.Appendable) = (addUserForm,user) => apply(addUserForm,user)

  def ref: this.type = this

}


}
}

/**/
object registration extends registration_Scope0.registration_Scope1.registration
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 18:13:52 BST 2017
                  SOURCE: C:/Users/jayso/Downloads/2YearProj/2YearProject-master/app/views/registration.scala.html
                  HASH: ce7fa449c29428ff553c814613b6ae0e07d2d1d1
                  MATRIX: 841->27|1001->77|1029->97|1059->119|1098->121|1129->126|1231->203|1270->234|1309->236|1344->245|1412->286|1432->297|1473->317|1509->326|1558->344|1591->351|1709->459|1750->461|1792->476|1888->551|1931->567|2028->643|2070->658|2177->744|2220->760|2365->878|2380->884|2424->907|2570->1023|2602->1025
                  LINES: 30->2|35->2|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|46->14|46->14|48->16|48->16|51->19|51->19|54->22|54->22|58->26|60->28|60->28|60->28|66->34|67->35
                  -- GENERATED --
              */
          