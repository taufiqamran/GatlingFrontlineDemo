package computerdatabase.Module.payrollObject

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

object PayrollUpload {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadPayrollUpload = {
    exec(http("request_37")
      .get("/PayrollProcess/ProcessControlPanel")
    )
      .exec(http("request_38")
        .get("/Home/DashboardWidgetPartial")
      )
      .exec(http("request_39")
        .get("/DXR.axd?r=0_2223-O3Vxm"))
      .exec(http("request_40")
        .get("/GlobalLeaveApplication/GlobalLeaveApplicationCriteria")
      )
      .exec(http("request_41")
        .get("/profile_picture.ashx?EmployeeID=7317"))
      .exec(http("request_42")
        .get("/profile_picture.ashx?EmployeeID=9126")
      )
      .exec(http("request_43")
        .post("/GetLeaveJson")

        .formParam("leaveType", "2")
        .formParam("nShowSubord", "1")
        .formParam("nShowSubordInd", "0")
        .formParam("dateFrom", "2021-05-30")
        .formParam("dateTo", "2021-07-11")
        .formParam("start", "2021-05-30")
        .formParam("end", "2021-07-11"))
      .exec(http("request_44")
        .post("/GetLeaveJson")

        .formParam("leaveType", "1")
        .formParam("nShowSubord", "1")
        .formParam("nShowSubordInd", "0")
        .formParam("dateFrom", "2021-05-30")
        .formParam("dateTo", "2021-07-11")
        .formParam("start", "2021-05-30")
        .formParam("end", "2021-07-11"))
      .exec(http("request_45")
        .post("/GetHolidayJson")

        .formParam("dateFrom", "2021-05-30")
        .formParam("dateTo", "2021-07-11")
        .formParam("start", "2021-05-30")
        .formParam("end", "2021-07-11"))
      .exec(http("request_46")
        .post("/GetLeaveJson")

        .formParam("leaveType", "0")
        .formParam("nShowSubord", "1")
        .formParam("nShowSubordInd", "0")
        .formParam("dateFrom", "2021-05-30")
        .formParam("dateTo", "2021-07-11")
        .formParam("start", "2021-05-30")
        .formParam("end", "2021-07-11"))
      .exec(http("request_47")
        .get("/profile_picture.ashx?EmployeeID=6433")
      )
      .exec(http("request_48")
        .get("/profile_picture.ashx?EmployeeID=10376")
      )
      .exec(http("request_49")
        .get("/profile_picture.ashx?EmployeeID=11135")
      )
      .pause(157.milliseconds)
      .exec(http("request_50")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FHome%2FDashboard&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._vo75l9&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=17554")
      )
      .exec(http("request_51")
        .get("/profile_picture.ashx?EmployeeID=8196")
      )
      .exec(http("request_52")
        .get("/profile_picture.ashx?EmployeeID=7452")
      )
      .exec(http("request_53")
        .get("/profile_picture.ashx?EmployeeID=6652")
      )
      .exec(http("request_54")
        .get("/SalaryAdvanceProcess/ProcessControlPanel")
      )
      .pause(5)
      .exec(http("request_55")
        .get("/PayrollTransactionUpload/BatchUpload")
        .check(regex("'uploadingKey':'(.+?)'").saveAs("uploadKey"))
        .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationTokenLogout"))
        .check(regex("'settings':'(.+?)'").saveAs("setting"))
      )
      .exec(session => {

        val uploadKey = session("uploadKey").as[String]
        val settingKey = session("setting").as[String]
        println(s"Upload : $uploadKey")
        println(s"Setting : $settingKey")
        session
      })
      .exec(http("request_56")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
      .exec(http("request_57")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
      .exec(http("request_58")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
      .exec(http("request_59")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
      .exec(http("request_60")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
      .exec(http("request_61")
        .get("/Content/Images/unifiedhcms_logo.png?V=01"))
      .exec(http("request_62")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_63")
        .get("/profile_picture.ashx?EmployeeID=5302"))
      .exec(http("request_64")
        .get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
      .exec(http("request_65")
        .get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
      .exec(http("request_66")
        .get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
      .exec(http("request_67")
        .get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
      .exec(http("request_68")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
      .exec(http("request_69")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
      .exec(http("request_70")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_71")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_72")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
      .exec(http("request_73")
        .get("/signalr/hubs")
      )
      .exec(http("request_74")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(641.milliseconds)
      .exec(http("request_75")
        .get("/DXR.axd?r=0_2314-O3Vxm"))
      .pause(512.milliseconds)
      .exec(http("request_76")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_77")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623913116126")
      )
      .pause(354.milliseconds)
      .exec(http("request_78")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=4v1bNsHzULnGFs6hM%2FKTzibAk9NLLuDUtHnHSZcNQHnVMgLRs1vxeqELnYVta431iiupx%2BXFUqAONnJv1FanwDLlxOhjUliEvvAgEEZe40AOFePvgko6eVJcYl2aZP7KSSHRVVhDsQTqR3PQB0iQVM7fkJ7Ky8ArIsf0ukcrnAY%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623913116127")
      )
      .exec(http("request_79")
        .get("/Notifications/GetNotificationCounts")
      )
      .pause(4)
      .exec(http("request_80")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FPayrollTransactionUpload%2FBatchUpload&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._j3sgoo&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=28189")
      )

  }

  def uploadExcelFile = {
    exec(http("Upload 1")
      .post("/ASPxUploadProgressHandlerPage.ashx?DXProgressHandlerKey=${uploadKey}&DXHelperUploadingCallback=fuTransaction")
      .formParamMap(Map(
        "sNewUploading" -> "true",
        "Settings" -> "${setting}",
        "State" -> "",
        "TotalSize" -> "17388",
        "FileIndex" -> "0",
        "FileSize" -> "17388",
        "FileType" -> "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
        "ChunkSize" -> "17388",
        "FileName" -> "Payroll Transaction Uploadkaka.xlsx"))
      .bodyPart(RawFileBodyPart("Data", "data/Payroll Transaction Uploadkaka.xlsx")
        .fileName("Payroll Transaction Uploadkaka.xlsx")
        .transferEncoding("binary"))
      .check(regex("state=\"(.+?)\"").saveAs("stateKey"))
      .check(bodyString.saveAs("bodyUpload1"))
    )

      .exec(session => {

        val state = session("stateKey").as[String]
        val body = session("bodyUpload1").as[String]
        println(s"$body")
        println(s"$state")

        session
      })

      .exec(http("Upload 2")
        .post("/PayrollTransactionUpload/MultiSelectionFileUpload?DXProgressHandlerKey=${uploadKey}&DXHelperUploadingCallback=fuTransaction&DXMVC=true")
        .formParam("module","MSLocation")
        .formParam("PayPeriodId$State","{\"rawValue\":\"202102 - Month End Salary (ARC)\",\"validationState\":\"\"}")
        .formParam("PayPeriodId_VI","347")
        .formParam("PayPeriodId","202102 - Month End Salary (ARC)")
        .formParam("PayPeriodId$DDDState","")
        .formParam("PayPeriodId$DDD$L$State","{\"windowsState\":\"0:0:-1:228:181:1:467:196:1:0:0:0\"}\nPayPeriodId$DDD$L$State: {\"CustomCallback\":\"\"}")
        .formParam("PayPeriodId$DDD$L","347")
        .formParam("fuTransaction","{\"inputCount\":1,\"finState\":{\"settings\":\"${setting}\",\"state\":\"${stateKey}\"}}")
        .bodyPart(RawFileBodyPart("fuTransaction_TextBoxT_Input", "data/Payroll Transaction Uploadkaka.xlsx")
          .fileName("Payroll Transaction Uploadkaka.xlsx")
          .transferEncoding("binary"))
        .formParam("fuTransaction_DXMVCUploadControl","")
        .formParam("Mode$State","{\"rawValue\":\"Overwrite\",\"validationState\":\"\"}")
        .formParam("Mode_VI","O")
        .formParam("Mode","Overwrite")
        .formParam("Mode$DDDState","{\"windowsState\":\"0:0:-1:348:290:1:337:49:1:0:0:0\"}")
        .formParam("Mode$DDD$L$State","{\"CustomCallback\":\"\"}")
        .formParam("Mode$DDD$L","O")
        .formParam("DXScript","1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
        .formParam("DXCss","/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/TransactionUpload.css")
        .formParam("DXMVCEditorsValues","{\"PayPeriodId_DDD_L\":[347],\"PayPeriodId\":347,\"Mode_DDD_L\":[\"O\"],\"Mode\":\"O\"}")
        .check(bodyString.saveAs("bodyUpload2")))

      .exec(session =>{
        val bodyUpload = session("bodyUpload2").as[String]
        println(s"body $bodyUpload")

        session
      })
      .exec(http("request_83")
        .post("/Account/VerifyAccess")
      )
  }
  def submitPayroll = {
    exec(http("Press submit")
      .post("/PayrollTransactionUpload/BatchUploadSubmit")
      .formParam("PayPeriodId", "347")
      .formParam("Mode", "O")
      .formParam("UploadedLinks[]", """C:\inetpub\wwwroot\UnifyPantai\Content\Uploads\PayrollTransaction\Payroll Transaction Uploadkaka.xlsx"""))
      .pause(21)

  }
  def logout = {
    exec(http("request_86")
      .post("/Account/LogOff")
      .formParam("__RequestVerificationToken", "${__RequestVerificationTokenLogout}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/TransactionUpload.css")
      .check(status.is(302)))
      .exec(http("request_87")
        .get("/Account/Login")
      )
      .exec(http("request_88")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
      .exec(http("request_89")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_90")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm"))
      .exec(http("request_91")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1"))
      .exec(http("request_92")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm"))
      .exec(http("request_93")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(110.milliseconds)
      .exec(http("request_94")
        .get("/Content/Images/bg-login.jpg?V=03"))
  }
}
