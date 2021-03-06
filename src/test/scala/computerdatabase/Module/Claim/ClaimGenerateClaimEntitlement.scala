package computerdatabase.Module.Claim

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object ClaimGenerateClaimEntitlement {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadApplication = {
    exec(http("Load Generate Claim Entitlement Page")
      .get("/ClaimEntitlementProcess/ProcessControlPanel")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
    )
      .exec(http("request_72")
        .get("/signalr/hubs")
      )
      .exec(http("request_73")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(783.milliseconds)
      .exec(http("request_74")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1")
      )
      .exec(http("request_75")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1")
      )
      .exec(http("request_76")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_77")
        .get("/Content/Images/unifiedhcms_logo.png?V=01")
      )
      .exec(http("request_78")
        .get("/profile_picture.ashx?EmployeeID=5302")
      )
      .exec(http("request_79")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_80")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_81")
        .get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41")
      )
      .exec(http("request_82")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .pause(432.milliseconds)
      .exec(http("request_83")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_84")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623294561969")
      )
      .exec(http("request_85")
        .get("/Notifications/GetNotificationCounts")
      )
      .pause(2)
      .exec(http("request_86")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=bgCoMohY%2BlM1N2sc6IYGyrV7IDbcWBoe2pk%2FbEPx0vBtA74W17AsByKMePnp7rySbinVlTt3YF33EgZk5zuRgLRuOgqhnlhZsoiiz1uZerJgRFa7NYyBjH4%2FnTJ%2BU7HnT0MlCXz6jOE4rZFyhmufGROvT%2FjLo19GhyWNTXARuNo%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623294561970")
      )
      .pause(1)
      .exec(http("request_87")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FClaimEntitlementProcess%2FProcessControlPanel&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._e3kzj&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=41292")
      )
      .pause(5)
      .exec(http("request_88")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_89")
        .get("/DXR.axd?r=0_2303-O3Vxm")
      )
  }

  def GenerateClaimEntitle = {
    exec(http("Filter by Branch")
      .post("/Criteria/RenderOrganizationUnitsPartial")

      .formParam("organizationLevel", "2")
      .formParam("criteriaObject[Type]", "OrganizationUnits")
      .formParam("criteriaObject[Name]", "Organization")
      .formParam("criteriaObject[Label]", "Organization")
      .formParam("criteriaObject[DefaultValue]", "")
      .formParam("criteriaObject[DefaultDate]", "")
      .formParam("criteriaObject[DefaultDateRangeFrom]", "")
      .formParam("criteriaObject[DefaultDateRangeTo]", "")
      .formParam("criteriaObject[Value]", "")
      .formParam("criteriaObject[GroupId]", "2")
      .formParam("criteriaObject[IsRequired]", "false")
      .formParam("criteriaObject[Group][Id]", "2")
      .formParam("criteriaObject[Group][Title]", "Optional Selection")
      .formParam("criteriaObject[DropDownListProperties][TextField]", "LOCATION_LABEL")
      .formParam("criteriaObject[DropDownListProperties][ValueField]", "LOCATION_LEVEL")
      .formParam("criteriaObject[DropDownListProperties][FilterField]", "")
      .formParam("criteriaObject[DropDownListProperties][DatasourceName]", "OrganizationLevels")
      .formParam("criteriaObject[DropDownListProperties][DisplayFormatString]", "")
      .formParam("criteriaObject[DropDownListProperties][SourceFrom]", "0")
      .formParam("criteriaObject[DropDownListProperties][DefaultIndex]", "")
      .formParam("criteriaObject[DropDownListProperties][SelectedIndexChangedJsCallBack]", "")
      .formParam("criteriaObject[DropDownListProperties][ColumnsList]", "")
      .formParam("criteriaObject[DropDownListProperties][IsMultiSelection]", "true")
      .formParam("criteriaObject[DropDownListProperties][DefaultValues]", "")
      .formParam("criteriaObject[DropDownListProperties][LoadOnDemand]", "false")
      .formParam("criteriaObject[DropDownListProperties][SelectAllMode]", "false")
      .formParam("criteriaObject[DropDownListProperties][DefaultSelectAll]", "false")
      .formParam("criteriaObject[DropDownListProperties][CascadeControl]", "")
      .formParam("criteriaObject[DropDownListProperties][DatasourceParameters]", "")
      .formParam("criteriaObject[DropDownListProperties][IsWrapText]", "true")
      .formParam("criteriaObject[CascadeDropDownListProperties]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][TextField]", "LOCATION_NAME")
      .formParam("criteriaObject[ChildDropDownListProperties][ValueField]", "LOCATION_CODE")
      .formParam("criteriaObject[ChildDropDownListProperties][FilterField]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][DatasourceName]", "AllEntityLocations")
      .formParam("criteriaObject[ChildDropDownListProperties][DisplayFormatString]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][SourceFrom]", "0")
      .formParam("criteriaObject[ChildDropDownListProperties][DefaultIndex]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][SelectedIndexChangedJsCallBack]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][0][Name]", "LOCATION_CODE")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][0][Label]", "Code")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][0][Width]", "120")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][0][ColumnDisplayFormatString]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][1][Name]", "LOCATION_NAME")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][1][Label]", "Description")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][1][Width]", "350")
      .formParam("criteriaObject[ChildDropDownListProperties][ColumnsList][1][ColumnDisplayFormatString]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][IsMultiSelection]", "true")
      .formParam("criteriaObject[ChildDropDownListProperties][DefaultValues]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][LoadOnDemand]", "false")
      .formParam("criteriaObject[ChildDropDownListProperties][SelectAllMode]", "false")
      .formParam("criteriaObject[ChildDropDownListProperties][DefaultSelectAll]", "false")
      .formParam("criteriaObject[ChildDropDownListProperties][CascadeControl]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][DatasourceParameters]", "")
      .formParam("criteriaObject[ChildDropDownListProperties][IsWrapText]", "false")
      .formParam("criteriaObject[CheckListProperties]", "")
      .formParam("criteriaObject[DefaultIndex]", "")
      .formParam("criteriaObject[IsAddLabel]", "false")
      .formParam("criteriaObject[IsChecked]", "false")
      .formParam("criteriaObject[Caption]", "")
      .formParam("criteriaObject[CheckedChangedJsCallBack]", "")
      .formParam("criteriaObject[MaxLength]", "0")
      .formParam("criteriaObject[DisplayFormatString]", "")
      .formParam("criteriaObject[NullText]", "")
      .formParam("criteriaObject[ShowIncrementButtons]", "false")
      .formParam("criteriaObject[Page]", "0")
      .formParam("criteriaObject[CascadeControl]", "")
      .formParam("criteriaObject[ValueFieldDelimiter]", "")
      .formParam("criteriaObject[DownloadBy]", "")
      .formParam("criteriaObject[InitJsCallBack]", "")
      .formParam("criteriaObject[MultiValueDelimiter]", "")
      .formParam("criteriaObject[DefaultValueTo]", ""))
      .pause(295.milliseconds)
      .exec(http("request_91")
        .get("/DXR.axd?r=0_2316-O3Vxm")
      )
      .pause(1)
      .exec(http("request_92")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_93")
        .post("/ClaimEntitlementProcess/OrganizationUnitsDisplay")

        .formParam("objectLabel", "Organization")
        .formParam("objectSelectedIds[0][Number]", "2")
        .formParam("objectSelectedIds[0][Name]", "Branch")
        .formParam("objectSelectedIds[0][UnitsId][]", "C"))
      .pause(1)
      .exec(http("request_94")
        .post("/Account/VerifyAccess")
      )
      .exec(http("Submit the Process")
        .post("/ClaimEntitlementProcess/SubmitProcess")

        .formParam("strJSONCriteriaOption", """{"Location":[],"LevelRanges":[{"Level":"2","LocationIds":["C"]}],"Category":[],"Grade":[],"Position":[],"Employee":[],"Race":[],"Religion":[],"CostCenter":[],"Claim":[],"ClaimBudgetGroup":[]}""")
        .formParam("strTemplateName", "")
        .formParam("ProcessType", "CLMPRC0001"))
      .pause(5)
  }

  def checkStatusMonito = {
    exec(http("Load Overview Page")
      .get("/CriteriaLog/Overview")
    )
      .exec(http("request_97")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1")
      )
      .exec(http("request_98")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41")
      )
      .exec(http("request_99")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7")
      )
      .exec(http("request_100")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1")
      )
      .exec(http("request_101")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1")
      )
      .exec(http("request_102")
        .get("/Content/Images/unifiedhcms_logo.png?V=01")
      )
      .exec(http("request_103")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_104")
        .get("/profile_picture.ashx?EmployeeID=5302")
      )
      .exec(http("request_105")
        .get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1")
      )
      .exec(http("request_106")
        .get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1")
      )
      .exec(http("request_107")
        .get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1")
      )
      .exec(http("request_108")
        .get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41")
      )
      .exec(http("request_109")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_110")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_111")
        .get(uri3 + "?family=Open+Sans:300,400,600,700")
      )
      .exec(http("request_112")
        .get(uri3 + "?family=Roboto:400,300,500,700")
      )
      .exec(http("request_113")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm")
      )
      .exec(http("request_114")
        .get("/signalr/hubs")
      )
      .exec(http("request_115")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(727.milliseconds)
      .exec(http("request_116")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .exec(http("request_117")
        .get("/DXR.axd?r=0_2223-O3Vxm")
      )
      .pause(252.milliseconds)
      .exec(http("request_118")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_119")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_120")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623294600466")
      )
      .pause(2)
      .exec(http("request_121")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=bQl1bexsoBNgPDd3%2FDpzwORd81JJ71ZHDmfcS1r0Lxz2791w%2BAjTJ5Uvs0jvykiYOyqfvfHB3G%2FK%2F1agxTcFvzrTkRL%2FQMnOfstvUGIeuqwjt7Iu5Kqf8LEnZHduRb1dyXCOg6CyYvRL%2BMR9dXKSz4TG87djxInMzWWeRvpIoTs%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623294600467")
      )
      .pause(507.milliseconds)
      .exec(http("request_122")
        .post("/CriteriaLog/Overview_GridViewPartial")

        .formParam("DXCallbackName", "gvCriteriaProcessJobView")
        .formParam("__DXCallbackArgument", """c0:KV|42;["2","4","3","5","1","6","10","7","8","9"];GB|19;4|SORT1|40|0|4|true;""")
        .formParam("gvCriteriaProcessJobView", "{&quot;keys&quot;:[&quot;2&quot;,&quot;4&quot;,&quot;3&quot;,&quot;5&quot;,&quot;1&quot;,&quot;6&quot;,&quot;10&quot;,&quot;7&quot;,&quot;8&quot;,&quot;9&quot;],&quot;callbackState&quot;:&quot;trQiKcBCaY/NnQh8M2Cjasn02Cs4+g/jWusbVfxXh0oxho3a23Y9rOzY/05S5txb/yGEg6zb7vTtRmEyc//dz6YWKkUYuojdwtCQgtorMsTQ1BRTD8TTmy9pbQAbMFdWZMj0NgIImqvIOnh1A9/N+NECGI9mcYFgvub2GmWnfFqs8SJ4FjiWo9EYPsMKQ3gAivsZCEHEIV6/iFOxNpjJqhMleyhOoW/mv+XbTBV02YlLgF/JtI2hGeOSpBAO374dt0/R9xfepKNeAoL3khZssWXwEBx/tWzS47hdNinl3QuWhcWw+7sBXN3Jjr4Y8G4IhTMKlGSsQWCyjytlH8J9IFqv2z7RhNp/uT3+HFO7o9/ZnWbZxO8YLl4TmrbbXCMKN+14H7xVlhxSRpXJ8IWaKYC7X9QZddXNYYTiqeQYA9pQBO7rLAKistzxBfObmQIq3uQB0B3i7LQ+VZWF6iPq0wI7i0EF6sEXYKMq3AeuCEGMUDNkJzv2jpn7ov2jWwja&quot;,&quot;selection&quot;:&quot;&quot;}")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol1", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol2", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol3", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol4", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol5", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol6", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol7", "")
        .formParam("DXMVCEditorsValues", "{}")
        .formParam("reset", "true"))
      .pause(769.milliseconds)
      .exec(http("request_123")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FCriteriaLog%2FOverview&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._6rddfx&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=38910")
      )
      .pause(867.milliseconds)
      .exec(http("request_124")
        .post("/CriteriaLog/Overview_GridViewPartial")

        .formParam("DXCallbackName", "gvCriteriaProcessJobView")
        .formParam("__DXCallbackArgument", """c0:KV|42;["1","2","3","4","5","6","7","8","9","10"];GB|19;4|SORT1|40|0|4|true;""")
        .formParam("gvCriteriaProcessJobView", "{&quot;keys&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;,&quot;4&quot;,&quot;5&quot;,&quot;6&quot;,&quot;7&quot;,&quot;8&quot;,&quot;9&quot;,&quot;10&quot;],&quot;callbackState&quot;:&quot;PeiL/DMp1KD5wOTrlansFeL811AKq/K+C/O0Sm5cI6Y8muEhPsuKhf6w/B3Z0GVX5yU1gs3IwgETZSIYTpksQkvLI1UViE0v0NYGTGFpzQO8zDbY32DNLLCe6rFYuENd2YdOf91+4PikIpwV0CI+MtnyQ91vqq6ZFDLNst/I1ZzoH5RQPXfM6UrjePcKdyYRYqK9FQhBDZQfyLeKnEgtY7uPCU1LmgyH4METLt/SUpzvLKsD+SzxxEDKKoDwltrbgqMVu2GFFGxuhMEYXQPMgfuLJfCVCFM1hR44ew3IjlPeceXUEVeEgt5+HG9naxdC6WUETHjMDemjwIXupq3//VBA5WZBeILkd3BFYLO3777xHsg30bBzdm2CJOGWAE+leKNLz1T/+uowbhCd8khyNwI7EllAvbqenAj6niPfRRtzbQlJASyD9dpgsDcejGHrK/tntsI0q25ylnfiok+vqfYeH/YP2MXbnUBCAyMI5qpTGu+fteybaDWdC2utXovj&quot;,&quot;selection&quot;:&quot;&quot;}")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol1", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol2", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol3", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol4", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol5", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol6", "")
        .formParam("gvCriteriaProcessJobView$DXFREditorcol7", "")
        .formParam("DXMVCEditorsValues", "{}")
        .formParam("reset", "true"))
      .pause(7)
      .exec(http("request_125")
        .get("/CriteriaLog/Overview_GetProcessStatusMessage?processId=3079")
      )
      .pause(5)
  }

  def logout = {
    exec(http("Submit Logout")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css")
      .check(status.is(302)))
      .exec(http("request_127")
        .get("/Account/Login")
      )
      .exec(http("request_128")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1")
      )
      .exec(http("request_129")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_130")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
      )
      .exec(http("request_131")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm")
      )
      .exec(http("request_132")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm")
      )
      .exec(http("request_133")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_134")
        .get("/Content/Images/bg-login.jpg?V=03")
      )
  }

}
