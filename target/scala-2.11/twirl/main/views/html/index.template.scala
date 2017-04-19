
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Home", user)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  
    """),format.raw/*5.5*/("""<h3 >Welcome to Irish Flights!</h3>
    <p>Enjoy Your Flight!</p>
  
  """)))}),format.raw/*8.4*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 17:24:06 BST 2017
                  SOURCE: C:/Users/71740/webapps/2YearProj/app/views/index.scala.html
                  HASH: 8ce4036e01ce505831e9e9441fdcb59607217dd3
                  MATRIX: 756->1|876->26|904->29|930->47|969->49|1003->57|1104->129
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8
                  -- GENERATED --
              */
          