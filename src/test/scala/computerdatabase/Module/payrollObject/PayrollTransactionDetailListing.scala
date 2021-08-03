package computerdatabase.Module.payrollObject

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object PayrollTransactionDetailListing {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadApplication = {
    exec(http("Transaction Detail Listing Page")
      .get("/CustomReport/ReportViewerDisplay/transaction-detail-report")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
    )
      .exec(http("request_72")
        .get("/signalr/hubs")
      )
      .exec(http("request_73")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(1)
      .exec(http("request_74")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_75")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_76")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .exec(http("request_77")
        .get("/DXR.axd?r=0_2216-O3Vxm")
      )
      .exec(http("request_78")
        .get("/DXR.axd?r=0_2316-O3Vxm")
      )
      .pause(266.milliseconds)
      .exec(http("request_79")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_80")
        .get("/DXR.axd?r=0_2303-O3Vxm")
      )
      .exec(http("request_81")
        .post("/CustomReport/CheckBoxListDisplay")

        .formParam("objectLabel", "EmployeeStatus")
        .formParam("objectSelectedIds[]", "A")
        .formParam("objectSelectedIds[]", "L")
        .formParam("objectSelectedIds[]", "I"))
      .pause(223.milliseconds)
      .exec(http("request_82")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_83")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1622520345936")
      )
      .exec(http("request_84")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_85")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=dXknTCxn8pgIu9Upl%2F2GUvX2b8FFlmq6yraB8Gdsdwd21pdzNJvAIa20fu8WZWSZsFE6uKcvWUTOSXJo0iK1xqWvaCnWi5%2BbdOH2UeC%2BpS3lHiP2bM1oU7kkfYOmklUj%2FWByDe%2BX4dc1L5X%2BKwJvaU0ZSvrUgTOdMJoJ52iYhd0%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1622520345937")
      )
      .pause(1)
      .exec(http("request_86")
        .get("/DXR.axd?r=0_2223-O3Vxm")
      )
      .pause(1)
      .exec(http("request_87")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_88")
        .post("/CustomReport/SearchableDropDownListDisplay")

        .formParam("objectLabel", "PayPeriod")
        .formParam("objectSelectedIds[]", "347")
        .formParam("isAllSelected", "false"))
      .exec(http("request_89")
        .post("/Criteria/SearchableDropDownListGridLookupPartial?criteriaObjectInString=%7B%22Type%22%3A%22SearchableDropDownList%22%2C%22Name%22%3A%22PayPeriod%22%2C%22Label%22%3A%22PayPeriod%22%2C%22DefaultValue%22%3Anull%2C%22DefaultDate%22%3Anull%2C%22DefaultDateRangeFrom%22%3Anull%2C%22DefaultDateRangeTo%22%3Anull%2C%22Value%22%3Anull%2C%22GroupId%22%3A1%2C%22IsRequired%22%3Afalse%2C%22Group%22%3A%7B%22Id%22%3A1%2C%22Title%22%3A%22Mandatory%20Selection%22%7D%2C%22DropDownListProperties%22%3A%7B%22TextField%22%3A%22PAY_PERIOD_DESCRIPTION%22%2C%22ValueField%22%3A%22ID%22%2C%22FilterField%22%3Anull%2C%22DatasourceName%22%3A%22PayPeriods%22%2C%22DisplayFormatString%22%3A%22%7B0%7D%22%2C%22SourceFrom%22%3A0%2C%22DefaultIndex%22%3Anull%2C%22SelectedIndexChangedJsCallBack%22%3Anull%2C%22ColumnsList%22%3A%5B%7B%22Name%22%3A%22PAY_PERIOD_DESCRIPTION%22%2C%22Label%22%3A%22PayPeriod%22%2C%22Width%22%3A250%2C%22ColumnDisplayFormatString%22%3Anull%7D%2C%7B%22Name%22%3A%22COMPANY.LOCATION_CODE%22%2C%22Label%22%3A%22Company%22%2C%22Width%22%3A100%2C%22ColumnDisplayFormatString%22%3Anull%7D%5D%2C%22IsMultiSelection%22%3Atrue%2C%22DefaultValues%22%3Anull%2C%22LoadOnDemand%22%3Afalse%2C%22SelectAllMode%22%3Atrue%2C%22DefaultSelectAll%22%3Afalse%2C%22CascadeControl%22%3Anull%2C%22DatasourceParameters%22%3Anull%2C%22IsWrapText%22%3Afalse%7D%2C%22CascadeDropDownListProperties%22%3Anull%2C%22ChildDropDownListProperties%22%3Anull%2C%22CheckListProperties%22%3Anull%2C%22DefaultIndex%22%3Anull%2C%22IsAddLabel%22%3Afalse%2C%22IsChecked%22%3Afalse%2C%22Caption%22%3Anull%2C%22CheckedChangedJsCallBack%22%3Anull%2C%22MaxLength%22%3A0%2C%22DisplayFormatString%22%3Anull%2C%22NullText%22%3Anull%2C%22ShowIncrementButtons%22%3Afalse%2C%22Page%22%3A0%2C%22CascadeControl%22%3Anull%2C%22ValueFieldDelimiter%22%3Anull%2C%22DownloadBy%22%3Anull%2C%22InitJsCallBack%22%3Anull%2C%22MultiValueDelimiter%22%3Anull%2C%22DefaultValueTo%22%3Anull%7D")

        .formParam("DXCallbackName", "PayPeriod_DDD_gv")
        .formParam("__DXCallbackArgument", """c0:SR|1;T;KV|580;["347","720","1030","758","987","834","676","312","446","600","484","796","523","949","872","562","637","1031","910","268","379","380","438","59","417","82","420","427","986","91","402","186","387","675","227","310","311","343","344","238","424","443","445","249","414","599","105","408","483","113","390","124","396","522","211","399","948","1029","135","405","165","411","561","718","255","430","147","393","267","345","346","27","29","30","31","32","33","34","35","280","286","58","415","416","55","56","57","61","62","63","64","65","298","306","81","418","419","79","80","83"];FR|1;0;GB|33;14|CUSTOMCALLBACK13|GLP_AC|3;347;;""")
        .formParam("PayPeriod$DDD$gv", "{&quot;focusedRow&quot;:0,&quot;keys&quot;:[&quot;347&quot;,&quot;720&quot;,&quot;1030&quot;,&quot;758&quot;,&quot;987&quot;,&quot;834&quot;,&quot;676&quot;,&quot;312&quot;,&quot;446&quot;,&quot;600&quot;,&quot;484&quot;,&quot;796&quot;,&quot;523&quot;,&quot;949&quot;,&quot;872&quot;,&quot;562&quot;,&quot;637&quot;,&quot;1031&quot;,&quot;910&quot;,&quot;268&quot;,&quot;379&quot;,&quot;380&quot;,&quot;438&quot;,&quot;59&quot;,&quot;417&quot;,&quot;82&quot;,&quot;420&quot;,&quot;427&quot;,&quot;986&quot;,&quot;91&quot;,&quot;402&quot;,&quot;186&quot;,&quot;387&quot;,&quot;675&quot;,&quot;227&quot;,&quot;310&quot;,&quot;311&quot;,&quot;343&quot;,&quot;344&quot;,&quot;238&quot;,&quot;424&quot;,&quot;443&quot;,&quot;445&quot;,&quot;249&quot;,&quot;414&quot;,&quot;599&quot;,&quot;105&quot;,&quot;408&quot;,&quot;483&quot;,&quot;113&quot;,&quot;390&quot;,&quot;124&quot;,&quot;396&quot;,&quot;522&quot;,&quot;211&quot;,&quot;399&quot;,&quot;948&quot;,&quot;1029&quot;,&quot;135&quot;,&quot;405&quot;,&quot;165&quot;,&quot;411&quot;,&quot;561&quot;,&quot;718&quot;,&quot;255&quot;,&quot;430&quot;,&quot;147&quot;,&quot;393&quot;,&quot;267&quot;,&quot;345&quot;,&quot;346&quot;,&quot;27&quot;,&quot;29&quot;,&quot;30&quot;,&quot;31&quot;,&quot;32&quot;,&quot;33&quot;,&quot;34&quot;,&quot;35&quot;,&quot;280&quot;,&quot;286&quot;,&quot;58&quot;,&quot;415&quot;,&quot;416&quot;,&quot;55&quot;,&quot;56&quot;,&quot;57&quot;,&quot;61&quot;,&quot;62&quot;,&quot;63&quot;,&quot;64&quot;,&quot;65&quot;,&quot;298&quot;,&quot;306&quot;,&quot;81&quot;,&quot;418&quot;,&quot;419&quot;,&quot;79&quot;,&quot;80&quot;,&quot;83&quot;],&quot;callbackState&quot;:&quot;oPeV2PJWQG+hCwuLFQnZ6aqIeBeBcCJspzdiz5rju9G79qZsyiXyaL2qnPeNQCjKe39z0pbDL7VPlo9nIpfYP9cYwfabmq/gJjTPrbXwF0OpQj+0Ul3wRgswQXDRMgJkz74Q4SqzcH30NyrsRIU/Cc5Sqhc5pd6Dwgxf4tg86t0M6RtBHfbvTsAR/qt2TL06hdbU92gWHGyaVQBRBuz1mEyrosRBkKTdlIxnTmseaKmp/jGxIq5Ufnp3aPXAEzE0FVkT0oFmk+pzvri/DQXnXdVLtffX7EpskwnepJ0z5OLTBvuABqpOF7UKw+7FsM7aR0/HwSurTJvZOU2TFiAQQcWIx3bNCq7PDNa4PZRwhpKieB9Ndisy0TZ2N3GRD+4sPr/Xg3PpqJqWt0YPZaH0z0lNSDJSuGAqL8o6ID8ykPZJU/mdawqVFhADvj7AFNOZJjA3cKCOctXjnHzez7WNZ0qsJxCb0IYYkingfVJKj2KhDVBRX6mfQILqGIWndZeO/s6/v71/sYFeIoVOLmofaoetb9zuSEbPzrwJQKZ5mPoTi7o/HKZsUw0M0pQCOyytzM3R1xn/38fdCBLAr4CT2quUgM/p2HG3F5V5ItoAZ7E=&quot;,&quot;lastMultiSelectIndex&quot;:-1,&quot;scrollState&quot;:null,&quot;selection&quot;:&quot;T&quot;,&quot;focusedKey&quot;:&quot;347&quot;}")
        .formParam("PayPeriod$DDD$gv$DXFREditorcol1", "")
        .formParam("PayPeriod$DDD$gv$DXFREditorcol2", "")
        .formParam("DXMVCEditorsValues", """{"PayPeriod_DDD_gv_DXFREditorcol1":null,"PayPeriod_DDD_gv_DXFREditorcol2":null,"PayPeriod":["347"],"EmployeeStatus":["A","L","I"],"ddlOrganizationLevel_DDD_L":[],"ddlOrganizationLevel":null,"Organization":[],"ddlChildOrganization":null,"Category_DDD_gv_DXFREditorcol1":null,"Category":null,"Grade_DDD_gv_DXFREditorcol1":null,"Grade":null,"Employee_DDD_gv_DXFREditorcol1":null,"Employee_DDD_gv_DXFREditorcol2":null,"Employee_DDD_gv_DXFREditorcol3":null,"Employee":null,"HireDateFrom":null,"HireDateTo":null,"TerminationDateFrom":null,"TerminationDateTo":null}""")
        .formParam("PayPeriod$State", "{&quot;validationState&quot;:&quot;&quot;,&quot;selectedKeyValues&quot;:[&quot;347&quot;]}")
        .formParam("PayPeriod", "202102 - Month End Salary (ARC)"))
      .pause(730.milliseconds)
      .exec(http("request_90")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FCustomReport%2FReportViewerDisplay%2Ftransaction-detail-report&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._4s414d&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=19093")
      )
      .pause(14)
      .exec(http("request_91")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_92")
        .post("/CustomReport/ReportViewerWithHeaderPartial")

        .formParam("layout[CustomSearchParameters][0][Name]", "PayPeriod")
        .formParam("layout[CustomSearchParameters][0][Value]", "347")
        .formParam("layout[CustomSearchParameters][1][Name]", "EmployeeStatus")
        .formParam("layout[CustomSearchParameters][1][Value]", "A,L,I")
        .formParam("layout[CustomSearchParameters][2][Name]", "Location")
        .formParam("layout[CustomSearchParameters][2][Value]", "")
        .formParam("layout[CustomSearchParameters][3][Name]", "LevelRanges")
        .formParam("layout[CustomSearchParameters][3][Value]", "|||||||||")
        .formParam("layout[CustomSearchParameters][4][Name]", "Category")
        .formParam("layout[CustomSearchParameters][4][Value]", "")
        .formParam("layout[CustomSearchParameters][5][Name]", "Grade")
        .formParam("layout[CustomSearchParameters][5][Value]", "")
        .formParam("layout[CustomSearchParameters][6][Name]", "Employee")
        .formParam("layout[CustomSearchParameters][6][Value]", "")
        .formParam("layout[CustomSearchParameters][7][Name]", "HireDateFrom")
        .formParam("layout[CustomSearchParameters][7][Value]", "")
        .formParam("layout[CustomSearchParameters][8][Name]", "HireDateTo")
        .formParam("layout[CustomSearchParameters][8][Value]", "")
        .formParam("layout[CustomSearchParameters][9][Name]", "TerminationDateFrom")
        .formParam("layout[CustomSearchParameters][9][Value]", "")
        .formParam("layout[CustomSearchParameters][10][Name]", "TerminationDateTo")
        .formParam("layout[CustomSearchParameters][10][Value]", "")
        .formParam("layout[GroupFooterSummaryTextField]", "Employee No.")
        .formParam("layout[NumberOfVisibleColumns]", "0")
        .formParam("layout[NumberOfGroupedColumns]", "0")
        .formParam("layout[ColumnProperties][0][Visible]", "true")
        .formParam("layout[ColumnProperties][0][Width]", "100")
        .formParam("layout[ColumnProperties][0][VisibleIndex]", "0")
        .formParam("layout[ColumnProperties][0][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][0][FieldName]", "Employee No.")
        .formParam("layout[ColumnProperties][0][AllowCellMerge]", "true")
        .formParam("layout[ColumnProperties][0][FieldCaption]", "Employee No.")
        .formParam("layout[ColumnProperties][0][FieldType]", "")
        .formParam("layout[ColumnProperties][1][Visible]", "true")
        .formParam("layout[ColumnProperties][1][Width]", "100")
        .formParam("layout[ColumnProperties][1][VisibleIndex]", "1")
        .formParam("layout[ColumnProperties][1][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][1][FieldName]", "Employee Name")
        .formParam("layout[ColumnProperties][1][AllowCellMerge]", "true")
        .formParam("layout[ColumnProperties][1][FieldCaption]", "Employee Name")
        .formParam("layout[ColumnProperties][1][FieldType]", "")
        .formParam("layout[ColumnProperties][2][Visible]", "true")
        .formParam("layout[ColumnProperties][2][Width]", "100")
        .formParam("layout[ColumnProperties][2][VisibleIndex]", "2")
        .formParam("layout[ColumnProperties][2][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][2][FieldName]", "Type")
        .formParam("layout[ColumnProperties][2][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][2][FieldCaption]", "Type")
        .formParam("layout[ColumnProperties][2][FieldType]", "")
        .formParam("layout[ColumnProperties][3][Visible]", "true")
        .formParam("layout[ColumnProperties][3][Width]", "100")
        .formParam("layout[ColumnProperties][3][VisibleIndex]", "3")
        .formParam("layout[ColumnProperties][3][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][3][FieldName]", "Code")
        .formParam("layout[ColumnProperties][3][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][3][FieldCaption]", "Code")
        .formParam("layout[ColumnProperties][3][FieldType]", "")
        .formParam("layout[ColumnProperties][4][Visible]", "true")
        .formParam("layout[ColumnProperties][4][Width]", "100")
        .formParam("layout[ColumnProperties][4][VisibleIndex]", "4")
        .formParam("layout[ColumnProperties][4][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][4][FieldName]", "Description")
        .formParam("layout[ColumnProperties][4][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][4][FieldCaption]", "Description")
        .formParam("layout[ColumnProperties][4][FieldType]", "")
        .formParam("layout[ColumnProperties][5][Visible]", "true")
        .formParam("layout[ColumnProperties][5][Width]", "100")
        .formParam("layout[ColumnProperties][5][VisibleIndex]", "5")
        .formParam("layout[ColumnProperties][5][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][5][FieldName]", "Qty")
        .formParam("layout[ColumnProperties][5][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][5][FieldCaption]", "Qty")
        .formParam("layout[ColumnProperties][5][FieldType]", "")
        .formParam("layout[ColumnProperties][6][Visible]", "true")
        .formParam("layout[ColumnProperties][6][Width]", "100")
        .formParam("layout[ColumnProperties][6][VisibleIndex]", "6")
        .formParam("layout[ColumnProperties][6][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][6][FieldName]", "Rate")
        .formParam("layout[ColumnProperties][6][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][6][FieldCaption]", "Rate")
        .formParam("layout[ColumnProperties][6][FieldType]", "")
        .formParam("layout[ColumnProperties][7][Visible]", "true")
        .formParam("layout[ColumnProperties][7][Width]", "100")
        .formParam("layout[ColumnProperties][7][VisibleIndex]", "7")
        .formParam("layout[ColumnProperties][7][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][7][FieldName]", "Currency")
        .formParam("layout[ColumnProperties][7][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][7][FieldCaption]", "Currency")
        .formParam("layout[ColumnProperties][7][FieldType]", "")
        .formParam("layout[ColumnProperties][8][Visible]", "true")
        .formParam("layout[ColumnProperties][8][Width]", "100")
        .formParam("layout[ColumnProperties][8][VisibleIndex]", "8")
        .formParam("layout[ColumnProperties][8][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][8][FieldName]", "Trans. Amount")
        .formParam("layout[ColumnProperties][8][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][8][FieldCaption]", "Trans. Amount")
        .formParam("layout[ColumnProperties][8][FieldType]", "")
        .formParam("layout[ColumnProperties][9][Visible]", "true")
        .formParam("layout[ColumnProperties][9][Width]", "100")
        .formParam("layout[ColumnProperties][9][VisibleIndex]", "9")
        .formParam("layout[ColumnProperties][9][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][9][FieldName]", "Exch. Rate")
        .formParam("layout[ColumnProperties][9][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][9][FieldCaption]", "Exch. Rate")
        .formParam("layout[ColumnProperties][9][FieldType]", "")
        .formParam("layout[ColumnProperties][10][Visible]", "true")
        .formParam("layout[ColumnProperties][10][Width]", "100")
        .formParam("layout[ColumnProperties][10][VisibleIndex]", "10")
        .formParam("layout[ColumnProperties][10][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][10][FieldName]", "Local Amount")
        .formParam("layout[ColumnProperties][10][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][10][FieldCaption]", "Local Amount")
        .formParam("layout[ColumnProperties][10][FieldType]", "")
        .formParam("layout[ColumnProperties][11][Visible]", "false")
        .formParam("layout[ColumnProperties][11][Width]", "100")
        .formParam("layout[ColumnProperties][11][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][11][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][11][FieldName]", "Country, Currency")
        .formParam("layout[ColumnProperties][11][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][11][FieldCaption]", "Country, Currency")
        .formParam("layout[ColumnProperties][11][FieldType]", "R")
        .formParam("layout[ColumnProperties][12][Visible]", "false")
        .formParam("layout[ColumnProperties][12][Width]", "100")
        .formParam("layout[ColumnProperties][12][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][12][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][12][FieldName]", "Entity")
        .formParam("layout[ColumnProperties][12][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][12][FieldCaption]", "Entity")
        .formParam("layout[ColumnProperties][12][FieldType]", "R")
        .formParam("layout[ColumnProperties][13][Visible]", "false")
        .formParam("layout[ColumnProperties][13][Width]", "100")
        .formParam("layout[ColumnProperties][13][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][13][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][13][FieldName]", "Pay Period")
        .formParam("layout[ColumnProperties][13][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][13][FieldCaption]", "Pay Period")
        .formParam("layout[ColumnProperties][13][FieldType]", "R")
        .formParam("layout[ColumnProperties][14][Visible]", "false")
        .formParam("layout[ColumnProperties][14][Width]", "100")
        .formParam("layout[ColumnProperties][14][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][14][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][14][FieldName]", "Pay Cycle")
        .formParam("layout[ColumnProperties][14][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][14][FieldCaption]", "Pay Cycle")
        .formParam("layout[ColumnProperties][14][FieldType]", "R")
        .formParam("layout[ColumnProperties][15][Visible]", "false")
        .formParam("layout[ColumnProperties][15][Width]", "100")
        .formParam("layout[ColumnProperties][15][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][15][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][15][FieldName]", "Net Pay")
        .formParam("layout[ColumnProperties][15][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][15][FieldCaption]", "Net Pay")
        .formParam("layout[ColumnProperties][15][FieldType]", "R")
        .formParam("layout[ColumnProperties][16][Visible]", "false")
        .formParam("layout[ColumnProperties][16][Width]", "100")
        .formParam("layout[ColumnProperties][16][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][16][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][16][FieldName]", "trx_code")
        .formParam("layout[ColumnProperties][16][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][16][FieldCaption]", "trx_code")
        .formParam("layout[ColumnProperties][16][FieldType]", "R")
        .formParam("layout[ColumnProperties][17][Visible]", "false")
        .formParam("layout[ColumnProperties][17][Width]", "100")
        .formParam("layout[ColumnProperties][17][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][17][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][17][FieldName]", "order_index")
        .formParam("layout[ColumnProperties][17][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][17][FieldCaption]", "order_index")
        .formParam("layout[ColumnProperties][17][FieldType]", "R")
        .formParam("layout[ColumnProperties][18][Visible]", "false")
        .formParam("layout[ColumnProperties][18][Width]", "100")
        .formParam("layout[ColumnProperties][18][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][18][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][18][FieldName]", "trans_order_index")
        .formParam("layout[ColumnProperties][18][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][18][FieldCaption]", "trans_order_index")
        .formParam("layout[ColumnProperties][18][FieldType]", "R")
        .formParam("layout[ColumnProperties][19][Visible]", "false")
        .formParam("layout[ColumnProperties][19][Width]", "100")
        .formParam("layout[ColumnProperties][19][VisibleIndex]", "-1")
        .formParam("layout[ColumnProperties][19][GroupIndex]", "-1")
        .formParam("layout[ColumnProperties][19][FieldName]", "trx_flag")
        .formParam("layout[ColumnProperties][19][AllowCellMerge]", "false")
        .formParam("layout[ColumnProperties][19][FieldCaption]", "trx_flag")
        .formParam("layout[ColumnProperties][19][FieldType]", "R")
        .formParam("layout[GridViewCellStyle][FontSize]", "9")
        .formParam("layout[GridViewExportCellStyle][FontSize]", "9")
        .formParam("layout[ShowGroupSummary]", "False")
        .formParam("layout[ShowTotalSummary]", "False")
        .formParam("layout[GroupSummaryTitleFormat]", "{0}:{1}")
        .formParam("layout[GroupHeaderColumnCount]", "0")
        .formParam("layout[RepeatReportHeader]", "False")
        .formParam("layout[ReportHeaderPageBreak]", "")
        .formParam("layout[ColumnGropingLevelCount]", "0")
        .formParam("layout[RepeatColumnHeader]", "False")
        .formParam("layout[HideDetails]", "False")
        .formParam("TemplateId", "42")
        .formParam("ReportId", "32"))
      .pause(169.milliseconds)
      .exec(http("request_93")
        .get("/DXR.axd?r=24_367-N3Vxm")
      )
      .pause(120.milliseconds)
      .exec(http("request_94")
        .post("/CustomReport/ReportViewerDisplay/DXXRDV.axd")

        .formParam("actionKey", "startBuild")
        .formParam("arg", "%7B%22reportId%22%3A%22678961af7039419eaba7f7d3425cacbb%22%2C%22reportUrl%22%3A%22%22%2C%22drillDownKeys%22%3A%5B%5D%2C%22sortingState%22%3A%5B%5D%2C%22timeZoneOffset%22%3A480%2C%22parameters%22%3A%5B%5D%7D"))
      .pause(431.milliseconds)
      .exec(http("request_95")
        .post("/CustomReport/ReportViewerDisplay/DXXRDV.axd")

        .formParam("actionKey", "getBuildStatus")
        .formParam("arg", "%7B%22documentId%22%3A%22840af7e0c4d04d34adc1eefefcda1dd4%22%2C%22timeOut%22%3A120000%7D"))
      .exec(http("request_96")
        .post("/CustomReport/ReportViewerDisplay/DXXRDV.axd")

        .formParam("actionKey", "getDocumentData")
        .formParam("arg", "840af7e0c4d04d34adc1eefefcda1dd4"))
      /*		.exec(http("request_97")
            .get("/CustomReport/ReportViewerDisplay/DXXRDV.axd?actionKey=getPage&unifier=30278d80-9214-2558-e936-2c0b2bc0cb88&arg=%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%22840af7e0c4d04d34adc1eefefcda1dd4%22%2C%22resolution%22%3A96%7D")
            )*/
      .exec(http("request_98")
        .post("/CustomReport/ReportViewerDisplay/DXXRDV.axd")

        .formParam("actionKey", "getBrickMap")
        .formParam("arg", "%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%22840af7e0c4d04d34adc1eefefcda1dd4%22%7D"))
  }

  def logout = {
    exec(http("Logout Submission")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/jquery-ui.css,/Content/PayrollProcess.css")
      .check(status.is(302)))
      .exec(http("Login After Logout")
        .get("/Account/Login")
      )
      .exec(http("request_102")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1")
      )
      .exec(http("request_103")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_104")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
      )
      .exec(http("request_105")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm")
      )
      .exec(http("request_106")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm")
      )
      .exec(http("request_107")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_108")
        .get("/Content/Images/bg-login.jpg?V=03")
      )
  }




}