
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Irish Flights</title>
    <meta charset="utf-8">
        <!-- jQuery library -->
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""">
        <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav>
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.index()),format.raw/*23.52*/("""">
                <img src=""""),_display_(/*24.28*/routes/*24.34*/.Assets.versioned("images/logo1.png")),format.raw/*24.71*/(""""/>
            </a>
            <ul id="mainNav">
                <li """),_display_(/*27.22*/if(title =="Home")/*27.40*/{_display_(Seq[Any](format.raw/*27.41*/("""class="active"""")))}),format.raw/*27.56*/("""><a href=""""),_display_(/*27.67*/routes/*27.73*/.HomeController.index()),format.raw/*27.96*/("""">Home</a></li>
                <li """),_display_(/*28.22*/if(title =="Flight")/*28.42*/{_display_(Seq[Any](format.raw/*28.43*/("""class="active"""")))}),format.raw/*28.58*/("""><a href=""""),_display_(/*28.69*/routes/*28.75*/.FlightsController.flights()),format.raw/*28.103*/("""">Flight</a></li>
                <li """),_display_(/*29.22*/if(title =="Booking")/*29.43*/{_display_(Seq[Any](format.raw/*29.44*/("""class="active"""")))}),format.raw/*29.59*/("""><a href="#">My Bookings</a></li>
                <li """),_display_(/*30.22*/if(title =="Discount")/*30.44*/{_display_(Seq[Any](format.raw/*30.45*/("""class="active"""")))}),format.raw/*30.60*/("""><a href="#">Discounts</a></li>
            </ul>
            <ul id="rightNav">
                <li """),_display_(/*33.22*/if(title =="Signup")/*33.42*/{_display_(Seq[Any](format.raw/*33.43*/("""class="active"""")))}),format.raw/*33.58*/("""><a href=""""),_display_(/*33.69*/routes/*33.75*/.RegistrationController.Registration()),format.raw/*33.113*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li """),_display_(/*34.22*/if(title =="Login")/*34.41*/{_display_(Seq[Any](format.raw/*34.42*/("""class="active"""")))}),format.raw/*34.57*/(""">
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.LoginController.login()),format.raw/*35.61*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a>
                </li>
            </ul>
        </nav>
        <div class="banner">
          <img src=""""),_display_(/*40.22*/routes/*40.28*/.Assets.versioned("images/banner.jpg")),format.raw/*40.66*/("""" width="100%"/>
      </div>


        <div class="container text-center">
        """),format.raw/*46.32*/("""
        """),_display_(/*47.10*/content),format.raw/*47.17*/("""
        """),format.raw/*48.9*/("""</div>
        <footer class="container-fluid">
        </footer>
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


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 18:08:57 BST 2017
                  SOURCE: C:/Users/jayso/Downloads/2YearProj/2YearProject-master/app/views/main.scala.html
                  HASH: b306750c643d0d12a77ab4e890c65daac697e0f0
                  MATRIX: 766->1|916->56|944->58|1168->256|1182->262|1242->301|1294->326|1309->332|1371->373|1737->712|1752->718|1814->759|2168->1086|2183->1092|2227->1115|2284->1145|2299->1151|2357->1188|2456->1260|2483->1278|2522->1279|2568->1294|2606->1305|2621->1311|2665->1334|2729->1371|2758->1391|2797->1392|2843->1407|2881->1418|2896->1424|2946->1452|3012->1491|3042->1512|3081->1513|3127->1528|3209->1583|3240->1605|3279->1606|3325->1621|3454->1723|3483->1743|3522->1744|3568->1759|3606->1770|3621->1776|3681->1814|3795->1901|3823->1920|3862->1921|3908->1936|3967->1968|3982->1974|4027->1998|4220->2164|4235->2170|4294->2208|4406->2382|4443->2392|4471->2399|4507->2408
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|46->15|46->15|46->15|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|64->33|64->33|64->33|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|71->40|71->40|71->40|76->46|77->47|77->47|78->48
                  -- GENERATED --
              */
          