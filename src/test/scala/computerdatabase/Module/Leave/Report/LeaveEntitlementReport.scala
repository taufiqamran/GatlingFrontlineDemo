package computerdatabase.Module.Leave.Report
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object LeaveEntitlementReport {
  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadLeaveEntitlementReport = {
    exec(http("request_49")
      .get("/Report/LeaveEntitlementReport")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationTokenLogout"))
    )
      .exec(http("request_50")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_51")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_52")
        .get("/signalr/hubs")
      )
      .exec(http("request_53")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
      .pause(122.milliseconds)
      .exec(http("request_54")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(934.milliseconds)
      .exec(http("request_55")
        .get("/DXR.axd?r=0_2314-O3Vxm"))
      .exec(http("request_56")
        .get("/DXR.axd?r=0_2216-O3Vxm"))
      .exec(http("request_57")
        .get("/DXR.axd?r=0_2316-O3Vxm"))
      .exec(http("request_58")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
      .exec(http("request_59")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
      .pause(204.milliseconds)
      .exec(http("request_60")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_61")
        .get("/DXR.axd?r=0_2303-O3Vxm"))
  }
  def searchProcess = {
    exec(http("request_62")
      .post("/LeaveEntitlementReport/CheckBoxListDisplay")
      .formParam("objectLabel", "EmployeeStatus")
      .formParam("objectSelectedIds[]", "A")
      .formParam("objectSelectedIds[]", "L")
      .formParam("objectSelectedIds[]", "I"))
      .exec(http("request_63")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_64")
        .post("/LeaveEntitlementReport/ComboBoxDisplay")

        .formParam("objectLabel", "GroupBy")
        .formParam("comboBoxValue", "1"))
      .pause(258.milliseconds)
      .exec(http("request_65")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_66")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_67")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00562&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1621526646415")
      )
      .pause(2)
      .exec(http("request_68")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00562&connectionToken=FRJ%2FzWya9sTLabtj2fCFNO4LWKlpUiii9n7bSHuc%2FGJ3wYfyuzUT%2FKHMAjfn0qHuaIu%2F1efvF9DtMi2JEzbTa85C7cWEnF0vJrMUjImyK1cUPSHfBfFm1Cn2XOtoZI4JZQVR%2FW%2F4hYFEYLlVa8AXiEGt%2Fl85OqWqPbVCOmmzjy4%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1621526646416")
      )
      .pause(1)
      .exec(http("request_69")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FReport%2FLeaveEntitlementReport&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._4v0cqd&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=31927")
      )
      .pause(23)
      .exec(http("request_70")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_71")
        .post("/Criteria/RenderOrganizationUnitsPartial")
        .formParam("organizationLevel", "1")
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
      .pause(6)
      .exec(http("request_72")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_73")
        .post("/LeaveEntitlementReport/OrganizationUnitsDisplay")
        .formParam("objectLabel", "Organization")
        .formParam("objectSelectedIds[0][Number]", "1")
        .formParam("objectSelectedIds[0][Name]", "Company")
        .formParam("objectSelectedIds[0][UnitsId][]", "PHA"))
      .pause(3)
      .exec(http("request_74")
        .post("/Account/VerifyAccess")
      )
  }
  def submitSearch = {
    exec(http("Submit Search")
      .post("/Report/GenerateLeaveEntitlementReport")
      .formParam("CustomSearchParameters[0][Name]", "LeaveYear")
      .formParam("CustomSearchParameters[0][Value]", "2021")
      .formParam("CustomSearchParameters[1][Name]", "ShowDetails")
      .formParam("CustomSearchParameters[1][Value]", "true")
      .formParam("CustomSearchParameters[2][Name]", "EmployeeStatus")
      .formParam("CustomSearchParameters[2][Value]", "A,L,I")
      .formParam("CustomSearchParameters[3][Name]", "GroupBy")
      .formParam("CustomSearchParameters[3][Value]", "1")
      .formParam("CustomSearchParameters[4][Name]", "Location")
      .formParam("CustomSearchParameters[4][Value]", "")
      .formParam("CustomSearchParameters[5][Name]", "LevelRanges")
      .formParam("CustomSearchParameters[5][Value]", "PHA|||||||||")
      .formParam("CustomSearchParameters[6][Name]", "Category")
      .formParam("CustomSearchParameters[6][Value]", "")
      .formParam("CustomSearchParameters[7][Name]", "Grade")
      .formParam("CustomSearchParameters[7][Value]", "")
      .formParam("CustomSearchParameters[8][Name]", "Employee")
      .formParam("CustomSearchParameters[8][Value]", "")
      .formParam("CustomSearchParameters[9][Name]", "HireDateFrom")
      .formParam("CustomSearchParameters[9][Value]", "")
      .formParam("CustomSearchParameters[10][Name]", "HireDateTo")
      .formParam("CustomSearchParameters[10][Value]", "")
      .formParam("CustomSearchParameters[11][Name]", "TerminationDateFrom")
      .formParam("CustomSearchParameters[11][Value]", "")
      .formParam("CustomSearchParameters[12][Name]", "TerminationDateTo")
      .formParam("CustomSearchParameters[12][Value]", "")
      .formParam("CustomSearchParameters[13][Name]", "LeaveGroup")
      .formParam("CustomSearchParameters[13][Value]", "")
      .formParam("CustomSearchParameters[14][Name]", "LeaveType")
      .formParam("CustomSearchParameters[14][Value]", "")
      .formParam("ReportObjectTypeName", "Reports.Leave.LeaveEntitlementReport")
      .check(bodyString.saveAs("ReportViewer"))
    )
      .pause(226.milliseconds)
      .exec(http("request_76")
        .get("/DXR.axd?r=24_367-N3Vxm")
      )
  }

  def logout = {
    exec(http("request_0")
      .post("/Account/LogOff")
      .formParam("__RequestVerificationToken", "${__RequestVerificationTokenLogout}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/jquery-ui.css")
      .check(status.is(302)))
      .exec(http("request_1")
        .get("/Account/Login"))
      .exec(http("request_2")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_3")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_4")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm"))
      .exec(http("request_5")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1"))
      .exec(http("request_6")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm"))
      .exec(http("request_7")
        .get("/Content/fonts/icomoon.ttf?5vru0d"))
      .pause(178.milliseconds)
      .exec(http("request_8")
        .get("/Content/Images/bg-login.jpg?V=03"))
  }
}