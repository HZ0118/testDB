
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

     object list_Scope1 {
import models.users.User

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.FlightSchedule],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(flights: List[models.FlightSchedule], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.52*/("""

"""),_display_(/*4.2*/main("Flight", user)/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
    """),_display_(/*5.6*/if(flash.containsKey("success"))/*5.38*/{_display_(Seq[Any](format.raw/*5.39*/("""
        """),format.raw/*6.9*/("""<div class="alert alert-success">
            """),_display_(/*7.14*/flash/*7.19*/.get("success")),format.raw/*7.34*/("""
        """),format.raw/*8.9*/("""</div>
    """)))}),format.raw/*9.6*/("""

    """),format.raw/*11.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
        <tr>
            <th>Flight</th>
            <th>Route</th>
            <th>Flight Date</th>
            <th>Departure Time</th>
            <th>Arrival Time</th>
            <th>Aircraft</th>
        </tr>
        </thead>
        <tbody>
            <h3>Flight List</h3>
            """),_display_(/*24.14*/for(f <- flights) yield /*24.31*/ {_display_(Seq[Any](format.raw/*24.33*/("""
                """),format.raw/*25.17*/("""<tr>
                    <td class="numeric">"""),_display_(/*26.42*/f/*26.43*/.getFlightID),format.raw/*26.55*/("""</td>
                    <td class="numeric">"""),_display_(/*27.42*/f/*27.43*/.getRoutes),format.raw/*27.53*/("""</td>
                    <td>"""),_display_(/*28.26*/f/*28.27*/.getFlightDate),format.raw/*28.41*/("""</td>
                    <td>"""),_display_(/*29.26*/f/*29.27*/.getDepTime),format.raw/*29.38*/("""</td>
                    <td>"""),_display_(/*30.26*/f/*30.27*/.getArrTime),format.raw/*30.38*/("""</td>
                    <td>"""),_display_(/*31.26*/f/*31.27*/.getAircraft),format.raw/*31.39*/("""</td>
                    <td>
                        <a href=""""),_display_(/*33.35*/routes/*33.41*/.FlightsController.updateFlight(f.getFlightID)),format.raw/*33.87*/("""" class="btn-xs btn-danger">
                        <span class="glyphicon glyphicon-pencil"></span></a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*37.35*/routes/*37.41*/.FlightsController.deleteFlight(f.getFlightID)),format.raw/*37.87*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                </tr>
            """)))}),format.raw/*42.14*/("""
        """),format.raw/*43.9*/("""</tbody>
    </table>
    <p>
        <a href=""""),_display_(/*46.19*/routes/*46.25*/.FlightsController.addFlight()),format.raw/*46.55*/("""">
            <button class="btn btn-primary">Add a Flight</button>
        </a>
    </p>
    
    <script>
        function confirmDel()"""),format.raw/*52.30*/("""{"""),format.raw/*52.31*/("""
            """),format.raw/*53.13*/("""return confirm('Are you sure?');
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</script>
""")))}),format.raw/*56.2*/("""
"""))
      }
    }
  }

  def render(flights:List[models.FlightSchedule],user:User): play.twirl.api.HtmlFormat.Appendable = apply(flights,user)

  def f:((List[models.FlightSchedule],User) => play.twirl.api.HtmlFormat.Appendable) = (flights,user) => apply(flights,user)

  def ref: this.type = this

}


}
}

/**/
object list extends list_Scope0.list_Scope1.list
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 16:43:16 BST 2017
                  SOURCE: C:/Users/jayso/Downloads/2YearProj/2YearProject-master/app/views/list.scala.html
                  HASH: 379c963633239506f4b791c42e8c7aab257a9793
                  MATRIX: 821->27|966->77|994->80|1022->100|1060->101|1091->107|1131->139|1169->140|1204->149|1277->196|1290->201|1325->216|1360->225|1401->237|1434->243|1836->618|1869->635|1909->637|1954->654|2027->700|2037->701|2070->713|2144->760|2154->761|2185->771|2243->802|2253->803|2288->817|2346->848|2356->849|2388->860|2446->891|2456->892|2488->903|2546->934|2556->935|2589->947|2681->1012|2696->1018|2763->1064|2981->1255|2996->1261|3063->1307|3320->1533|3356->1542|3431->1590|3446->1596|3497->1626|3663->1764|3692->1765|3733->1778|3801->1819|3830->1820|3862->1825|3903->1836
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|38->5|38->5|39->6|40->7|40->7|40->7|41->8|42->9|44->11|57->24|57->24|57->24|58->25|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|66->33|66->33|66->33|70->37|70->37|70->37|75->42|76->43|79->46|79->46|79->46|85->52|85->52|86->53|87->54|87->54|88->55|89->56
                  -- GENERATED --
              */
          