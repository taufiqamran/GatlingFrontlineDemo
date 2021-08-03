package computerdatabase.Module.payrollObject

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object PayrollYearlySlipJawapan {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadApplication = {

    exec(http("Slip Jawapan Report ")
      .get("/Report/SlipJawapanReport")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
    )
      .exec(http("request_61")
        .get(uri3 + "?family=Roboto:400,300,500,700")
      )
      .exec(http("request_62")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm")
      )
      .exec(http("request_63")
        .get("/signalr/hubs")
      )
      .exec(http("request_64")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(451.milliseconds)
      .exec(http("request_65")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_66")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_67")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .exec(http("request_68")
        .get("/DXR.axd?r=0_2216-O3Vxm")
      )
      .exec(http("request_69")
        .get("/DXR.axd?r=0_2316-O3Vxm")
      )
      .pause(166.milliseconds)
      .exec(http("request_70")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_71")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_72")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_73")
        .get("/DXR.axd?r=0_2303-O3Vxm")
      )
      .exec(http("request_74")
        .post("/SlipJawapanReport/ComboBoxDisplay")

        .formParam("objectLabel", "EMPLOYER_AGENCY_ID")
        .formParam("comboBoxValue", ""))
      .exec(http("request_75")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_76")
        .post("/SlipJawapanReport/CheckBoxListDisplay")

        .formParam("objectLabel", "EmployeeStatus")
        .formParam("objectSelectedIds[]", "A")
        .formParam("objectSelectedIds[]", "L")
        .formParam("objectSelectedIds[]", "I"))
      .exec(http("request_77")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_78")
        .post("/SlipJawapanReport/ComboBoxDisplay")

        .formParam("objectLabel", "DOCUMENT_TYPE")
        .formParam("comboBoxValue", ""))
      .pause(197.milliseconds)
      .exec(http("request_79")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_80")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624250836295")
      )
      .exec(http("request_81")
        .get("/Notifications/GetNotificationCounts")
      )
      .pause(539.milliseconds)
      .exec(http("request_82")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=Ax0O%2FAv6unfrg6L1MasP%2FsoWCoABT9eXxofKjhptMK%2F2Wy1MklgoseiXOk4Muo%2F%2FAn%2Fi5YLRDWecR0S7CHLM1Zrrb2MwhzQc8HoyEyfDPskOA%2FS9%2FnUebBCSHXcCEOjQvPGXR39Tz4tGMQx32w0MUesDHKrAwtAC%2Fa7IvDOS0L8%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624250836296")
      )
      .pause(2)
      .exec(http("request_83")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FReport%2FSlipJawapanReport&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._2nlzik&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=64067")
      )
      .pause(1)
      .exec(http("request_84")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_85")
        .post("/SlipJawapanReport/ComboBoxDisplay")

        .formParam("objectLabel", "EMPLOYER_AGENCY_ID")
        .formParam("comboBoxValue", "16"))
      .pause(14)
      .exec(http("request_86")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_87")
        .post("/SlipJawapanReport/ComboBoxDisplay")

        .formParam("objectLabel", "DOCUMENT_TYPE")
        .formParam("comboBoxValue", "EA - NA"))
      .pause(21)
      .exec(http("request_88")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_89")
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
      .pause(2)
      .exec(http("request_90")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_91")
        .post("/SlipJawapanReport/OrganizationUnitsDisplay")

        .formParam("objectLabel", "Organization")
        .formParam("objectSelectedIds[0][Number]", "1")
        .formParam("objectSelectedIds[0][Name]", "Company")
        .formParam("objectSelectedIds[0][UnitsId][]", "IHH"))
      .pause(3)
      .exec(http("request_92")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_93")
        .post("/Report/PublishSlipJawapanProcess")

        .formParam("strJSONCriteriaOption", """{"EmployeeAgencyNo":"16","PayrollYear":"2021","EmployeeStatus":["A","L","I"],"PublishDate":"2021/06/21","DocumentType":"EA - NA","Location":[],"LevelRanges":[{"Level":"1","LocationIds":["IHH"]}],"Category":[],"Grade":[],"Employee":[],"HireDateFrom":"","HireDateTo":"","TerminationDateFrom":"","TerminationDateTo":"","TaxArea":[],"PublishRemarks":"","PrintDate":"2021/06/21"}""")
        .formParam("ProcessType", "SLJAWA"))
      .pause(1)
      .exec(http("request_94")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_95")
        .post("/Report/DownloadSlipJawapanReport")

        .formParam("CustomSearchParameters[0][Name]", "EmployeeAgencyNo")
        .formParam("CustomSearchParameters[0][Value]", "16")
        .formParam("CustomSearchParameters[1][Name]", "PayrollYear")
        .formParam("CustomSearchParameters[1][Value]", "2021")
        .formParam("CustomSearchParameters[2][Name]", "EmployeeStatus")
        .formParam("CustomSearchParameters[2][Value]", "A,L,I")
        .formParam("CustomSearchParameters[3][Name]", "PublishDate")
        .formParam("CustomSearchParameters[3][Value]", "2021/06/21")
        .formParam("CustomSearchParameters[4][Name]", "DocumentType")
        .formParam("CustomSearchParameters[4][Value]", "EA - NA")
        .formParam("CustomSearchParameters[5][Name]", "Location")
        .formParam("CustomSearchParameters[5][Value]", "")
        .formParam("CustomSearchParameters[6][Name]", "LevelRanges")
        .formParam("CustomSearchParameters[6][Value]", "IHH|||||||||")
        .formParam("CustomSearchParameters[7][Name]", "Category")
        .formParam("CustomSearchParameters[7][Value]", "")
        .formParam("CustomSearchParameters[8][Name]", "Grade")
        .formParam("CustomSearchParameters[8][Value]", "")
        .formParam("CustomSearchParameters[9][Name]", "Employee")
        .formParam("CustomSearchParameters[9][Value]", "")
        .formParam("CustomSearchParameters[10][Name]", "HireDateFrom")
        .formParam("CustomSearchParameters[10][Value]", "")
        .formParam("CustomSearchParameters[11][Name]", "HireDateTo")
        .formParam("CustomSearchParameters[11][Value]", "")
        .formParam("CustomSearchParameters[12][Name]", "TerminationDateFrom")
        .formParam("CustomSearchParameters[12][Value]", "")
        .formParam("CustomSearchParameters[13][Name]", "TerminationDateTo")
        .formParam("CustomSearchParameters[13][Value]", "")
        .formParam("CustomSearchParameters[14][Name]", "TaxArea")
        .formParam("CustomSearchParameters[14][Value]", "")
        .formParam("CustomSearchParameters[15][Name]", "PublishRemarks")
        .formParam("CustomSearchParameters[15][Value]", "")
        .formParam("CustomSearchParameters[16][Name]", "PrintDate")
        .formParam("CustomSearchParameters[16][Value]", "2021/06/21")
        .formParam("ReportObjectTypeName", "Reports.Statutory.SlipJawapanReport"))
      /*		.exec(http("Download Part Here")
            .get("""/Report/Download?filename=C:\inetpub\wwwroot\UnifyPantai\Content\Uploads\TempDownloads\5964c3b7-0e57-423f-986c-eacda0f9ec3b\SlipJawapanReport.pdf""")
            )*/
      .pause(4)

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
      .exec(http("request_99")
        .get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1")
      )
      .exec(http("request_100")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_101")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
      )
      .exec(http("request_102")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm")
      )
      .exec(http("request_103")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm")
      )
      .pause(127.milliseconds)
      .exec(http("request_104")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(213.milliseconds)
      .exec(http("request_105")
        .get("/Content/Images/bg-login.jpg?V=03")
      )

  }

}
