
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

     object login_Scope1 {
import models.users.User

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.users.Login], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.51*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
  """),format.raw/*6.3*/("""<!-- HTML content for the index view -->
    <div class="col-sm-4 col-sm-offset-4 text-center">
        <h3>Log in</h3>
            <!-- Display login errors if they exist -->
        """),_display_(/*10.10*/if(loginForm.hasGlobalErrors)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
            """),_display_(/*12.14*/loginForm/*12.23*/.globalError.message),format.raw/*12.43*/("""
            """),format.raw/*13.13*/("""</p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<div class="alert alert-warning">
            """),_display_(/*17.14*/flash/*17.19*/.get("loginRequired")),format.raw/*17.40*/("""
            """),format.raw/*18.13*/("""</div>
        """)))}),format.raw/*19.10*/("""
            """),format.raw/*20.13*/("""<!-- The login form -->
        """),_display_(/*21.10*/helper/*21.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.80*/ {_display_(Seq[Any](format.raw/*21.82*/("""

            """),format.raw/*23.13*/("""<div class="form-group">
                """),_display_(/*24.18*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*24.121*/("""
            """),format.raw/*25.13*/("""</div>
            <div class="form-group">
                """),_display_(/*27.18*/inputPassword(loginForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*27.131*/("""
            """),format.raw/*28.13*/("""</div>

                <!-- Add a submit button -->
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}
}

/**/
object login extends login_Scope0.login_Scope1.login
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 16:43:16 BST 2017
                  SOURCE: C:/Users/jayso/Downloads/2YearProj/2YearProject-master/app/views/login.scala.html
                  HASH: 130444bec87b9686557536b4acce78e622d0d6fa
                  MATRIX: 821->27|980->76|1007->94|1034->96|1061->115|1100->117|1129->120|1341->305|1379->334|1419->336|1460->349|1532->394|1550->403|1591->423|1632->436|1677->450|1714->460|1753->490|1793->492|1834->505|1908->552|1922->557|1964->578|2005->591|2052->607|2093->620|2153->653|2168->659|2241->723|2281->725|2323->739|2392->781|2517->884|2558->897|2646->958|2781->1071|2822->1084|3049->1280|3081->1285
                  LINES: 30->2|35->2|36->4|37->5|37->5|37->5|38->6|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|53->21|53->21|53->21|53->21|55->23|56->24|56->24|57->25|59->27|59->27|60->28|66->34|67->35
                  -- GENERATED --
              */
          