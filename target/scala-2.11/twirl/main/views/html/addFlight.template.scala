
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addFlight_Scope0 {
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

     object addFlight_Scope1 {
import models.users.User
import helper._

class addFlight extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.FlightSchedule],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addFlightForm: Form[models.FlightSchedule], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.58*/("""

"""),_display_(/*6.2*/main("Add Flight", user)/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<h3>Add a new Flight</h3>
    
    """),_display_(/*9.6*/form(action = routes.FlightsController.addFlightSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.109*/{_display_(Seq[Any](format.raw/*9.110*/("""
        """),_display_(/*10.10*/inputText(addFlightForm("flight_date"), '_label -> "Flight Date", 'class -> "form-control")),format.raw/*10.101*/("""
        """),_display_(/*11.10*/inputText(addFlightForm("departure_time"), '_label -> "Departure Time", 'class -> "form-control")),format.raw/*11.107*/("""
        """),_display_(/*12.10*/inputText(addFlightForm("arrival_time"), '_label -> "Arrival Time", 'class -> "form-control")),format.raw/*12.103*/("""
        """),_display_(/*13.10*/inputText(addFlightForm("aircraft"), '_label -> "Aircraft", 'class -> "form-control")),format.raw/*13.95*/("""
        """),_display_(/*14.10*/inputText(addFlightForm("routes"), '_label -> "Route", 'class -> "form-control")),format.raw/*14.90*/("""
        
        
        
        """),format.raw/*18.9*/("""<div class="actions">
            <input type="submit" value="Add Flight" class="btn btn-primary">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.HomeController.index()),format.raw/*20.52*/(""""
                <button class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*24.6*/("""
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(addFlightForm:Form[models.FlightSchedule],user:User): play.twirl.api.HtmlFormat.Appendable = apply(addFlightForm,user)

  def f:((Form[models.FlightSchedule],User) => play.twirl.api.HtmlFormat.Appendable) = (addFlightForm,user) => apply(addFlightForm,user)

  def ref: this.type = this

}


}
}

/**/
object addFlight extends addFlight_Scope0.addFlight_Scope1.addFlight
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 17:24:06 BST 2017
                  SOURCE: C:/Users/71740/webapps/2YearProj/app/views/addFlight.scala.html
                  HASH: 8c08947102a8985040ef82bb6475ebbaad2340af
                  MATRIX: 852->45|1003->101|1031->104|1063->128|1101->129|1132->134|1193->170|1305->273|1344->274|1381->284|1494->375|1531->385|1650->482|1687->492|1802->585|1839->595|1945->680|1982->690|2083->770|2146->806|2294->927|2309->933|2353->956|2486->1059|2518->1061
                  LINES: 31->4|36->4|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|50->18|52->20|52->20|52->20|56->24|57->25
                  -- GENERATED --
              */
          