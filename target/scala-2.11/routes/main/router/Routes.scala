
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/71740/webapps/2YearProj/conf/routes
// @DATE:Wed Apr 19 17:24:05 BST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:9
  LoginController_5: controllers.LoginController,
  // @LINE:13
  FlightsController_3: controllers.FlightsController,
  // @LINE:22
  RegistrationController_6: controllers.RegistrationController,
  // @LINE:26
  CountController_0: controllers.CountController,
  // @LINE:28
  AsyncController_2: controllers.AsyncController,
  // @LINE:31
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    LoginController_5: controllers.LoginController,
    // @LINE:13
    FlightsController_3: controllers.FlightsController,
    // @LINE:22
    RegistrationController_6: controllers.RegistrationController,
    // @LINE:26
    CountController_0: controllers.CountController,
    // @LINE:28
    AsyncController_2: controllers.AsyncController,
    // @LINE:31
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_5, FlightsController_3, RegistrationController_6, CountController_0, AsyncController_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_5, FlightsController_3, RegistrationController_6, CountController_0, AsyncController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """flights""", """controllers.FlightsController.flights"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addflight""", """controllers.FlightsController.addFlight"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addFlightSubmit""", """controllers.FlightsController.addFlightSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delFlight/""" + "$" + """id<[^/]+>""", """controllers.FlightsController.deleteFlight(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateFlight/""" + "$" + """id<[^/]+>""", """controllers.FlightsController.updateFlight(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.RegistrationController.Registration"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signupSubmit""", """controllers.RegistrationController.RegistrationSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LoginController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login1_invoker = createInvoker(
    LoginController_5.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """ Login Page""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_loginSubmit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit2_invoker = createInvoker(
    LoginController_5.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_FlightsController_flights3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("flights")))
  )
  private[this] lazy val controllers_FlightsController_flights3_invoker = createInvoker(
    FlightsController_3.flights,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FlightsController",
      "flights",
      Nil,
      "GET",
      """ Flight Page""",
      this.prefix + """flights"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_FlightsController_addFlight4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addflight")))
  )
  private[this] lazy val controllers_FlightsController_addFlight4_invoker = createInvoker(
    FlightsController_3.addFlight,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FlightsController",
      "addFlight",
      Nil,
      "GET",
      """ Add Flights Page""",
      this.prefix + """addflight"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_FlightsController_addFlightSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addFlightSubmit")))
  )
  private[this] lazy val controllers_FlightsController_addFlightSubmit5_invoker = createInvoker(
    FlightsController_3.addFlightSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FlightsController",
      "addFlightSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addFlightSubmit"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_FlightsController_deleteFlight6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delFlight/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FlightsController_deleteFlight6_invoker = createInvoker(
    FlightsController_3.deleteFlight(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FlightsController",
      "deleteFlight",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """delFlight/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_FlightsController_updateFlight7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateFlight/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FlightsController_updateFlight7_invoker = createInvoker(
    FlightsController_3.updateFlight(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FlightsController",
      "updateFlight",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """updateFlight/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RegistrationController_Registration8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_RegistrationController_Registration8_invoker = createInvoker(
    RegistrationController_6.Registration,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "Registration",
      Nil,
      "GET",
      """ Sign Up Page""",
      this.prefix + """signup"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RegistrationController_RegistrationSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signupSubmit")))
  )
  private[this] lazy val controllers_RegistrationController_RegistrationSubmit9_invoker = createInvoker(
    RegistrationController_6.RegistrationSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "RegistrationSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """signupSubmit"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CountController_count10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count10_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AsyncController_message11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message11_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_LoginController_login1_route(params) =>
      call { 
        controllers_LoginController_login1_invoker.call(LoginController_5.login)
      }
  
    // @LINE:10
    case controllers_LoginController_loginSubmit2_route(params) =>
      call { 
        controllers_LoginController_loginSubmit2_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:13
    case controllers_FlightsController_flights3_route(params) =>
      call { 
        controllers_FlightsController_flights3_invoker.call(FlightsController_3.flights)
      }
  
    // @LINE:16
    case controllers_FlightsController_addFlight4_route(params) =>
      call { 
        controllers_FlightsController_addFlight4_invoker.call(FlightsController_3.addFlight)
      }
  
    // @LINE:17
    case controllers_FlightsController_addFlightSubmit5_route(params) =>
      call { 
        controllers_FlightsController_addFlightSubmit5_invoker.call(FlightsController_3.addFlightSubmit)
      }
  
    // @LINE:18
    case controllers_FlightsController_deleteFlight6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FlightsController_deleteFlight6_invoker.call(FlightsController_3.deleteFlight(id))
      }
  
    // @LINE:19
    case controllers_FlightsController_updateFlight7_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_FlightsController_updateFlight7_invoker.call(FlightsController_3.updateFlight(id))
      }
  
    // @LINE:22
    case controllers_RegistrationController_Registration8_route(params) =>
      call { 
        controllers_RegistrationController_Registration8_invoker.call(RegistrationController_6.Registration)
      }
  
    // @LINE:23
    case controllers_RegistrationController_RegistrationSubmit9_route(params) =>
      call { 
        controllers_RegistrationController_RegistrationSubmit9_invoker.call(RegistrationController_6.RegistrationSubmit)
      }
  
    // @LINE:26
    case controllers_CountController_count10_route(params) =>
      call { 
        controllers_CountController_count10_invoker.call(CountController_0.count)
      }
  
    // @LINE:28
    case controllers_AsyncController_message11_route(params) =>
      call { 
        controllers_AsyncController_message11_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:31
    case controllers_Assets_versioned12_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
