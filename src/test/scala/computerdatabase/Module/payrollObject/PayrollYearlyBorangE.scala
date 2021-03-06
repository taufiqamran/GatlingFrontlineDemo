package computerdatabase.Module.payrollObject

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object PayrollYearlyBorangE {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadApplication = {

    exec(http("Yearly Borang E Report")
      .get("/Report/BorangEReport")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
    )
      .exec(http("request_55")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1")
      )
      .exec(http("request_56")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41")
      )
      .exec(http("request_57")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7")
      )
      .exec(http("request_58")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1")
      )
      .exec(http("request_59")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1")
      )
      .exec(http("request_60")
        .get("/Content/Images/unifiedhcms_logo.png?V=01")
      )
      .exec(http("request_61")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_62")
        .get("/profile_picture.ashx?EmployeeID=5302")
      )
      .exec(http("request_63")
        .get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1")
      )
      .exec(http("request_64")
        .get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1")
      )
      .exec(http("request_65")
        .get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1")
      )
      .exec(http("request_66")
        .get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41")
      )
      .exec(http("request_67")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_68")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_69")
        .get(uri3 + "?family=Open+Sans:300,400,600,700")
      )
      .exec(http("request_70")
        .get(uri3 + "?family=Roboto:400,300,500,700")
      )
      .exec(http("request_71")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm")
      )
      .exec(http("request_72")
        .get("/signalr/hubs")
      )
      .exec(http("request_73")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(640.milliseconds)
      .exec(http("request_74")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1")
      )
      .exec(http("request_75")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1")
      )
      .exec(http("request_76")
        .get("/Content/Images/unifiedhcms_logo.png?V=01")
      )
      .exec(http("request_77")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_78")
        .get("/profile_picture.ashx?EmployeeID=5302")
      )
      .exec(http("request_79")
        .get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41")
      )
      .exec(http("request_80")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .exec(http("request_81")
        .get("/DXR.axd?r=0_2216-O3Vxm")
      )
      .exec(http("request_82")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_83")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_84")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_85")
        .get("/DXR.axd?r=0_2303-O3Vxm")
      )
      .exec(http("request_86")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_87")
        .post("/BorangEReport/ComboBoxDisplay")

        .formParam("objectLabel", "Status Majikan")
        .formParam("comboBoxValue", ""))
      .exec(http("request_88")
        .post("/BorangEReport/ComboBoxDisplay")

        .formParam("objectLabel", "EMPLOYER_AGENCY_ID")
        .formParam("comboBoxValue", ""))
      .exec(http("request_89")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_90")
        .post("/BorangEReport/ComboBoxDisplay")

        .formParam("objectLabel", "Status Perniagaan")
        .formParam("comboBoxValue", "1"))
      .exec(http("request_91")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_92")
        .post("/BorangEReport/ComboBoxDisplay")

        .formParam("objectLabel", "Cara Pengemukaan CP8D")
        .formParam("comboBoxValue", "1"))
      .exec(http("request_93")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_94")
        .post("/BorangEReport/ComboBoxDisplay")

        .formParam("objectLabel", "Reported to LHDN")
        .formParam("comboBoxValue", "1"))
      .pause(181.milliseconds)
      .exec(http("request_95")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_96")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_97")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624250737411")
      )
      .pause(781.milliseconds)
      .exec(http("request_98")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=lJjF7EZpjR5nDMbP4AGHC5auX3FHl0Iid6145SEVGKlAXKBkFBIH%2BDqTbv3ekHqM7Hrri20P5lA%2FrvRhNeuxKSaJVe%2FerHTnYU%2FEhqqPX7Wl7kTloMONSzdtj%2Fu%2FEfMx8y3yi4PXSoYcu9DAH%2Br1V58ILjg8bOO8SIhLYRbwuw8%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624250737412")
      )
      .pause(3)
      .exec(http("request_99")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FReport%2FBorangEReport&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._z3n6qq&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=15444")
      )
      .pause(209.milliseconds)
      .exec(http("request_100")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_101")
        .post("/BorangEReport/ComboBoxDisplay")

        .formParam("objectLabel", "EMPLOYER_AGENCY_ID")
        .formParam("comboBoxValue", "16"))
      .pause(5)
      .exec(http("request_102")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_103")
        .post("/BorangEReport/DropDownListDisplay")
      )
      .pause(5)
      .exec(http("request_104")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_105")
        .post("/BorangEReport/ComboBoxDisplay")

        .formParam("objectLabel", "Status Majikan")
        .formParam("comboBoxValue", "1"))
      .pause(11)
      .exec(http("request_106")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_107")
        .post("/BorangEReport/TextBoxMultiFieldDisplay")

        .formParam("objectLabel", "NoCukaiPendapatan1")
        .formParam("textBoxValue1", "A")
        .formParam("textBoxValue2", "")
        .check(status.is(404)))
      .pause(2)
      .exec(http("request_108")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_109")
        .post("/BorangEReport/TextBoxMultiFieldDisplay")

        .formParam("objectLabel", "NoCukaiPendapatan1")
        .formParam("textBoxValue1", "A")
        .formParam("textBoxValue2", "123")
        .check(status.is(404)))
      .pause(3)
      .exec(http("request_110")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_111")
        .post("/Report/GenerateBorangEReport")

        .formParam("CustomSearchParameters[0][Name]", "EmployerAgencyEPF")
        .formParam("CustomSearchParameters[0][Value]", "16")
        .formParam("CustomSearchParameters[1][Name]", "PayrollYear")
        .formParam("CustomSearchParameters[1][Value]", "2021")
        .formParam("CustomSearchParameters[2][Name]", "TaxArea")
        .formParam("CustomSearchParameters[2][Value]", "")
        .formParam("CustomSearchParameters[3][Name]", "StatusMajikan")
        .formParam("CustomSearchParameters[3][Value]", "1")
        .formParam("CustomSearchParameters[4][Name]", "StatusPerniagaan")
        .formParam("CustomSearchParameters[4][Value]", "1")
        .formParam("CustomSearchParameters[5][Name]", "NoCukaiPendapatan1")
        .formParam("CustomSearchParameters[5][Value]", "A")
        .formParam("CustomSearchParameters[6][Name]", "NoCukaiPendapatan2")
        .formParam("CustomSearchParameters[6][Value]", "123")
        .formParam("CustomSearchParameters[7][Name]", "CaraPengemukaanCP8D")
        .formParam("CustomSearchParameters[7][Value]", "1")
        .formParam("CustomSearchParameters[8][Name]", "ReportedtoLHDN")
        .formParam("CustomSearchParameters[8][Value]", "1")
        .formParam("ReportObjectTypeName", "Reports.Statutory.BorangEReport"))
      .pause(161.milliseconds)
      .exec(http("request_112")
        .get("/DXR.axd?r=24_367-N3Vxm")
      )
      .pause(111.milliseconds)
      .exec(http("request_113")
        .post("/Report/DXXRDV.axd")

        .formParam("actionKey", "startBuild")
        .formParam("arg", "%7B%22reportId%22%3A%22b7e13b62c1af4a0795a5d111bb439009%22%2C%22reportUrl%22%3A%22%22%2C%22drillDownKeys%22%3A%5B%5D%2C%22sortingState%22%3A%5B%5D%2C%22timeZoneOffset%22%3A480%2C%22parameters%22%3A%5B%7B%22Value%22%3A%222021%22%2C%22Key%22%3A%22payroll_year%22%2C%22TypeString%22%3A%22System.Int32%22%7D%2C%7B%22Value%22%3A%221%22%2C%22Key%22%3A%22StatusMajikan%22%2C%22TypeString%22%3A%22System.String%22%7D%2C%7B%22Value%22%3A%221%22%2C%22Key%22%3A%22StatusPerniagaan%22%2C%22TypeString%22%3A%22System.String%22%7D%2C%7B%22Value%22%3A%22A%22%2C%22Key%22%3A%22NoCukai1%22%2C%22TypeString%22%3A%22System.String%22%7D%2C%7B%22Value%22%3A%221%22%2C%22Key%22%3A%22CaraPengemukaan%22%2C%22TypeString%22%3A%22System.String%22%7D%2C%7B%22Value%22%3A%221%22%2C%22Key%22%3A%22LHDNM%22%2C%22TypeString%22%3A%22System.String%22%7D%2C%7B%22Value%22%3A%22123%22%2C%22Key%22%3A%22NoCukai2%22%2C%22TypeString%22%3A%22System.String%22%7D%2C%7B%22Value%22%3A%22%22%2C%22Key%22%3A%22test%22%2C%22TypeString%22%3A%22System.String%22%7D%5D%7D"))
      .pause(342.milliseconds)
      .exec(http("request_114")
        .post("/Report/DXXRDV.axd")

        .formParam("actionKey", "getBuildStatus")
        .formParam("arg", "%7B%22documentId%22%3A%220c28d911812c4dcf945a5837a4946fd0%22%2C%22timeOut%22%3A120000%7D"))
      .pause(255.milliseconds)
      .exec(http("request_115")
        .post("/Report/DXXRDV.axd")

        .formParam("actionKey", "getBuildStatus")
        .formParam("arg", "%7B%22documentId%22%3A%220c28d911812c4dcf945a5837a4946fd0%22%2C%22timeOut%22%3A120000%7D"))
      .exec(http("request_116")
        .post("/Report/DXXRDV.axd")

        .formParam("actionKey", "getDocumentData")
        .formParam("arg", "0c28d911812c4dcf945a5837a4946fd0"))
      /*		.exec(http("request_117")
            .get("/Report/DXXRDV.axd?actionKey=getPage&unifier=7bb84e4f-3424-f442-88ca-a44433b1983c&arg=%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%220c28d911812c4dcf945a5837a4946fd0%22%2C%22resolution%22%3A72%7D")
            )*/
      .exec(http("request_118")
        .post("/Report/DXXRDV.axd")

        .formParam("actionKey", "getBrickMap")
        .formParam("arg", "%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%220c28d911812c4dcf945a5837a4946fd0%22%7D"))
      /*		.exec(http("request_119")
            .get("/Report/DXXRDV.axd?actionKey=getPage&unifier=7bb84e4f-3424-f442-88ca-a44433b1983c&arg=%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%220c28d911812c4dcf945a5837a4946fd0%22%2C%22resolution%22%3A63%7D")
            )*/
      .pause(9)

  }


  def logout = {

    exec(http("Logout Submission")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/jquery-ui.css")
      .check(status.is(302)))
      .exec(http("Login After Logout")
        .get("/Account/Login")
      )
      .exec(http("request_122")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1")
      )
      .exec(http("request_123")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_124")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
      )
      .exec(http("request_125")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm")
      )
      .exec(http("request_126")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm")
      )
      .exec(http("request_127")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(103.milliseconds)
      .exec(http("request_128")
        .get("/Content/Images/bg-login.jpg?V=03")
      )

  }

}
