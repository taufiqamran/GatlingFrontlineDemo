package computerdatabase.Module.payrollObject

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object PayrollNewTransactionCodeView {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadApplication = {
    exec(http("request_71")
      .get("/TransactionMY/Allowance/MY/Listing")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
    )
      .exec(http("request_72")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_73")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_74")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm")
      )
      .exec(http("request_75")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(950.milliseconds)
      .exec(http("request_76")
        .get("/DXR.axd?r=0_2223-O3Vxm")
      )
      .pause(141.milliseconds)
      .exec(http("request_77")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_78")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_79")
        .get("/DXR.axd?r=0_5687-O3Vxm")
      )
      .exec(http("request_80")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .exec(http("request_81")
        .get("/DXR.axd?r=0_2321-O3Vxm")
      )
      .exec(http("request_82")
        .get("/DXR.axd?r=0_2216-O3Vxm")
      )
      .exec(http("request_83")
        .get("/DXR.axd?r=0_2316-O3Vxm")
      )
      .exec(http("request_84")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_85")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_86")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623473734899")
      )
      .pause(893.milliseconds)
      .exec(http("request_87")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=0L5Cbn8NkdXrXdXxledqB22H2aZ6aIFLvm6ZLO8vG1a5Y1qJiV8inJuURBJ5LBCaJvNr6TxXyd%2B1i7OrzGLUmolIJdNbf7kIXrGnD0Ygbj1GRH1XatTDrtlVQaYmwD3sdxcRwzc371CfP8AvI1dnOMLxgcisDHhGhF32di1qCdo%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623473734900")
      )
      .pause(1)
  }

  def logout = {
    exec(http("Submit Logout")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css")
      .check(status.is(302)))
      .exec(http("request_89")
        .get("/Account/Login")
      )
      .exec(http("request_90")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1")
      )
      .exec(http("request_91")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_92")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
      )
      .exec(http("request_93")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm")
      )
      .exec(http("request_94")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm")
      )
      .exec(http("request_95")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_96")
        .get("/Content/Images/bg-login.jpg?V=03")
      )
  }

}
