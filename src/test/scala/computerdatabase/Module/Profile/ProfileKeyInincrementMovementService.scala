package computerdatabase.Module.Profile

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

object ProfileKeyInincrementMovementService {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"


  def loadApplication = {
    exec(http("Load Employee Profile Page")
      .get("/Employee/Employee")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
    )
      .exec(http("request_67")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(822.milliseconds)
      .exec(http("request_68")
        .get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41")
      )
      .exec(http("request_69")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_70")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_71")
        .get("/signalr/hubs")
      )
      .exec(http("request_72")
        .get("/Content/font-awesome/fonts/fontawesome-webfont.woff2?v=4.4.0")
      )
      .exec(http("request_73")
        .get("/fonts/fontawesome-webfont.woff2?v=4.7.0")
      )
      .exec(http("request_74")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_75")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_76")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624954129803")
      )
      .pause(1)
      .exec(http("request_77")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=HJdMMCmkR3Ov39lD%2BN%2F%2BvX%2BBIKJiDzwim%2FTOBBj6loPI9NUEQDEs3pdd%2F7LaC%2FR4XZVZdVWt7Bnqbp0AfE7ZJCBZP83SIEZhOZgpk9Uv%2F6ENcCHraXHzKFs5OrFqT9XtW4OH3oNQDLgcZY61KuWQdQpiGl4yDs2Injvy5Wr1Gsk%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624954129804")
      )
      .pause(2)
      .exec(http("request_78")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FEmployee%2FEmployee&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._frlttz&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=90690")
      )
      .pause(1)
      .exec(http("request_79")
        .get("/DXR.axd?r=0_2303-O3Vxm")
      )
      .exec(http("request_80")
        .post("/Employee/SearchList")

        .formParam("DXCallbackName", "EmpListDD")
        .formParam("__DXCallbackArgument", "c0:LECC|0;;LBCRI|5;0:199;")
        .formParam("EmpListDD$State", "{&quot;rawValue&quot;:&quot;&quot;}")
        .formParam("EmpListDD_VI", "")
        .formParam("EmpListDD", "No Records found")
        .formParam("DXMVCEditorsValues", """{"SearchStatus_DDD_L":["A"],"SearchStatus":"A","SearchByDD_DDD_L":["EMPLOYEE_NO"],"SearchByDD":"EMPLOYEE_NO","FilterExp_DDD_L":["contains"],"FilterExp":"contains","SearchByText":"${EmpNoTest}","EmpListDD_DDD_L":[],"EmpListDD":null}""")
        .formParam("status", "A")
        .formParam("filter", "EMPLOYEE_NO")
        .formParam("cond", "contains")
        .formParam("filterText", "${EmpNoTest}")

        .check(regex("'cp_lastValue':\\'(.+?)'").saveAs("empID"))
        .check(regex("'cp_EffectiveDate':\\'(.+?)'").saveAs("effDate"))
      )

      .exec(session =>{

        //val bodyRedirect = session("massBody").as[String]
        val key = session("empID").as[String]
        val effDate = session("effDate").as[String]
        val effectivedateValue = effDate.replace(" 00:00:00", "").split("/")
        val day = effectivedateValue(0)
        val month = effectivedateValue(1)
        val year = effectivedateValue(2)
        val encoded = "" + day + "%2F" + month + "%2F" + year
        val encodedTime = "" + day + "%2F" + month + "%2F" + year + "%2000%3A00%3A00"
        println(s"Key : $key")
        println(s"EffDateSec : $effDate")
        println(s"Encoded : $encoded")
        println(s"EncodedTime : $encodedTime")

        session.set("encodedTime", encodedTime).set("encoded", encoded).set("day", day).set("month", month).set("year", year)

      })


/*      .exec(http("request_81")
        .get("/DXB.axd?DXCache=c883af6e-99fb-4af2-b193-4436c88fa99e")
      )*/
      .exec(http("request_82")
        .post("/Employee/CallbackEmpDetailsPartial")

        .formParam("DXCallbackName", "EmpPanel")
        .formParam("__DXCallbackArgument", "c0:[object Object]")
        .formParam("EmpId", "${empID}")
        .formParam("EmpNo", "${EmpNoTest}")
        .formParam("LocId", "6")
        .formParam("EffDate", "${encodedTime}")
        .formParam("DXMVCEditorsValues", "{}"))
      .exec(http("request_83")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .exec(http("request_84")
        .get("/Account/VerifyAccess")
      )
/*      .exec(http("request_85")
        .get("/DXB.axd?DXCache=9fccd719-56f1-4adb-a98c-dacba6d0bbb1")
      )*/
  }




  def incrementApplication = {

    exec(http("Employee Profile")
      .get("/Employee/PersonalDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1")
    )
      .exec(http("request_87")
        .get("/DXR.axd?r=0_2321-O3Vxm")
      )
      .exec(http("request_88")
        .get("/DXR.axd?r=0_2216-O3Vxm")
      )
      .exec(http("request_89")
        .post("/Employee/CallbackNavPartial")

        .formParam("DXCallbackName", "NavPanel")
        .formParam("__DXCallbackArgument", "c0:")
        .formParam("DXMVCEditorsValues", "{}"))

      .exec(http("request_90")
        .get("/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1")
        .check(css("input[name='ID']", "value").saveAs("referID"))
        .check(css("input[name='ROWVERSION']", "value").saveAs("rowVers"))
      )
      .exec(session =>{

        val refer = session("referID").as[String]
        println(s"ReferID : $refer")

        session
      })
      .exec(http("request_91")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_92")
        .post("/Employee/GetConfigForeignValidation")

        .formParam("employeeId", "${empID}"))
      .exec(http("request_93")
        .post("/Employee/MailStatePartial")

        .formParam("DXCallbackName", "MAIL_STATE_CODE")
        .formParam("__DXCallbackArgument", "c0:LECC|0;;LBCRI|4;0:19;")
        .formParam("MAIL_STATE_CODE$State", "")
        .formParam("MAIL_STATE_CODE_VI", "")
        .formParam("DXMVCEditorsValues", """{"EMPLOYEE_TITLE_DDD_L":["MDM"],"EMPLOYEE_TITLE":"MDM","EMPLOYEE_FIRST_NAME":"Mallory","EMPLOYEE_MIDDLE_NAME":"Saint","EMPLOYEE_LAST_NAME":"Bailey","EMPLOYEE_NAME":"Mallory Saint Bailey","EMPLOYEE_LOCAL_NAME":null,"EMPLOYEE_NICKNAME":null,"GENDER_DDD_L":["F"],"GENDER":"F","BIRTH_DATE":new Date(1995,5,7),"NATIONALITY_CODE_DDD_L":["MY"],"NATIONALITY_CODE":"MY","NATIONAL_ID1":"67812631267","NATIONAL_ID2":null,"PASSPORT_NO":"1256316","PASSPORT_ISSUE_DATE":new Date(2014,5,11),"PASSPORT_EXPIRY_DATE":new Date(2026,6,11),"MEDIA_CONTACT1":null,"MEDIA_CONTACT2":null,"MEDIA_CONTACT3":null,"EMERGENCY_CONTACT_NAME":null,"EMERGENCY_CONTACT_RELATION_DDD_L":[],"EMERGENCY_CONTACT_RELATION":null,"EMERGENCY_CONTACT_NO":null,"PERMANENT_ADDRESS1":"3381 Glenview Drive Corpus Christi, TX 78476","PERMANENT_ADDRESS2":null,"PERMANENT_ADDRESS3":null,"PERMANENT_COUNTRY_CODE_DDD_L":["MY"],"PERMANENT_COUNTRY_CODE":"MY","PERMANENT_STATE_CODE_DDD_L":[],"PERMANENT_STATE_CODE":null,"PERMANENT_AREA_CODE_DDD_L":[],"PERMANENT_AREA_CODE":null,"PERMANENT_POST_CODE":null,"MAIL_SAMEAS_PERMANENT":"1","MAIL_ADDRESS1":null,"MAIL_ADDRESS2":null,"MAIL_ADDRESS3":null,"MAIL_COUNTRY_CODE_DDD_L":["MY"],"MAIL_COUNTRY_CODE":null,"MAIL_STATE_CODE_DDD_L":[],"MAIL_STATE_CODE":null,"MAIL_AREA_CODE_DDD_L":[],"MAIL_AREA_CODE":null,"MAIL_POST_CODE":null,"MARITAL_STATUS_DDD_L":["S"],"MARITAL_STATUS":"S","MARRIAGE_DATE":null,"RACE_CODE_DDD_L":[],"RACE_CODE":null,"RELIGION_CODE_DDD_L":[],"RELIGION_CODE":null,"BIRTH_COUNTRY_CODE_DDD_L":["MY"],"BIRTH_COUNTRY_CODE":"MY","BIRTH_PLACE":null,"BLOOD_GROUP_DDD_L":[],"BLOOD_GROUP":null,"HEIGHT":null,"WEIGHT":null,"HANDICAPPED_DDD_L":[],"HANDICAPPED":null}""")
        .formParam("Country", "MY"))
      .exec(http("request_94")
        .post("/Employee/MailAreaPartial")

        .formParam("DXCallbackName", "MAIL_AREA_CODE")
        .formParam("__DXCallbackArgument", "c0:LECC|0;;LBCRI|4;0:99;")
        .formParam("MAIL_AREA_CODE$State", "")
        .formParam("MAIL_AREA_CODE_VI", "")
        .formParam("DXMVCEditorsValues", """{"EMPLOYEE_TITLE_DDD_L":["MDM"],"EMPLOYEE_TITLE":"MDM","EMPLOYEE_FIRST_NAME":"Mallory","EMPLOYEE_MIDDLE_NAME":"Saint","EMPLOYEE_LAST_NAME":"Bailey","EMPLOYEE_NAME":"Mallory Saint Bailey","EMPLOYEE_LOCAL_NAME":null,"EMPLOYEE_NICKNAME":null,"GENDER_DDD_L":["F"],"GENDER":"F","BIRTH_DATE":new Date(1995,5,7),"NATIONALITY_CODE_DDD_L":["MY"],"NATIONALITY_CODE":"MY","NATIONAL_ID1":"67812631267","NATIONAL_ID2":null,"PASSPORT_NO":"1256316","PASSPORT_ISSUE_DATE":new Date(2014,5,11),"PASSPORT_EXPIRY_DATE":new Date(2026,6,11),"MEDIA_CONTACT1":null,"MEDIA_CONTACT2":null,"MEDIA_CONTACT3":null,"EMERGENCY_CONTACT_NAME":null,"EMERGENCY_CONTACT_RELATION_DDD_L":[],"EMERGENCY_CONTACT_RELATION":null,"EMERGENCY_CONTACT_NO":null,"PERMANENT_ADDRESS1":"3381 Glenview Drive Corpus Christi, TX 78476","PERMANENT_ADDRESS2":null,"PERMANENT_ADDRESS3":null,"PERMANENT_COUNTRY_CODE_DDD_L":["MY"],"PERMANENT_COUNTRY_CODE":"MY","PERMANENT_STATE_CODE_DDD_L":[],"PERMANENT_STATE_CODE":null,"PERMANENT_AREA_CODE_DDD_L":[],"PERMANENT_AREA_CODE":null,"PERMANENT_POST_CODE":null,"MAIL_SAMEAS_PERMANENT":"1","MAIL_ADDRESS1":null,"MAIL_ADDRESS2":null,"MAIL_ADDRESS3":null,"MAIL_COUNTRY_CODE_DDD_L":["MY"],"MAIL_COUNTRY_CODE":null,"MAIL_STATE_CODE_DDD_L":[],"MAIL_STATE_CODE":null,"MAIL_AREA_CODE_DDD_L":[],"MAIL_AREA_CODE":null,"MAIL_POST_CODE":null,"MARITAL_STATUS_DDD_L":["S"],"MARITAL_STATUS":"S","MARRIAGE_DATE":null,"RACE_CODE_DDD_L":[],"RACE_CODE":null,"RELIGION_CODE_DDD_L":[],"RELIGION_CODE":null,"BIRTH_COUNTRY_CODE_DDD_L":["MY"],"BIRTH_COUNTRY_CODE":"MY","BIRTH_PLACE":null,"BLOOD_GROUP_DDD_L":[],"BLOOD_GROUP":null,"HEIGHT":null,"WEIGHT":null,"HANDICAPPED_DDD_L":[],"HANDICAPPED":null}""")
        .formParam("State", ""))
      .exec(http("request_95")
        .post("/Employee/CallbackButtonPartial")

        .formParam("DXCallbackName", "BtnPanel")
        .formParam("__DXCallbackArgument", "c0:")
        .formParam("menu", "PersonalDetails")
        .formParam("DXMVCEditorsValues", "{}"))
      .pause(10)
      .exec(http("request_96")
        .get("/Account/VerifyAccess")
      )
      .exec(http("request_97")
        .get("/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1")
      )
      .pause(577.milliseconds)
      .exec(http("request_98")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_99")
        .post("/Employee/GetEditionBylocationId")

        .formParam("locationId", "6"))
      .exec(http("request_100")
        .post("/Employee/PrimarySuperiorPartial")

        .formParam("DXCallbackName", "cmbPRIMARY_SUPERIOR_NO")
        .formParam("__DXCallbackArgument", "c0:LECC|15;[object Object];LBCRI|4;0:29;")
        .formParam("cmbPRIMARY_SUPERIOR_NO$State", "{&quot;rawValue&quot;:&quot;&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("cmbPRIMARY_SUPERIOR_NO_VI", "")
        .formParam("cmbPRIMARY_SUPERIOR_NO", "Please Select")
        .formParam("DXMVCEditorsValues", """{"SERVICE_EVENT_DDD_L":[],"SERVICE_EVENT":null,"ddLocation":null,"EMPLOYEE_NO":"${EmpNoTest}","EMPLOYEE_STATUS_DDD_L":["A"],"EMPLOYEE_STATUS":"A","DATE_JOINED":new Date(2021,5,16),"GROUP_DATE_JOINED":new Date(2021,5,16),"BADGE_NO":"${EmpNoTest}","EMPLOYEE_SUB_STATUS_DDD_L":["P"],"EMPLOYEE_SUB_STATUS":"P","PROBATION_PERIOD":7,"PROBATION_PERIOD_TYPE_DDD_L":["D"],"PROBATION_PERIOD_TYPE":"D","PROBATION_PERIOD_EXT":null,"PROBATION_PERIOD_EXT_TYPE_DDD_L":[],"PROBATION_PERIOD_EXT_TYPE":null,"DATE_CONFIRMED":null,"WORKSPACE":null,"WORK_LOCATION_CODE_DDD_L":[],"WORK_LOCATION_CODE":null,"CATEGORY_CODE_DDD_L":["ADMN"],"CATEGORY_CODE":"ADMN","CATEGORY_SUB_CODE_DDD_L":["EXEC"],"CATEGORY_SUB_CODE":"EXEC","GRADE_CODE_DDD_L":["1"],"GRADE_CODE":"1","EMPLOYEE_LEVEL_DDD_L":[1],"EMPLOYEE_LEVEL":1,"COST_CENTER_CODE_DDD_L":[],"COST_CENTER_CODE":null,"WORK_GROUP_CODE_DDD_L":[],"WORK_GROUP_CODE":null,"EMPLOYMENT_TYPE_DDD_L":["P"],"EMPLOYMENT_TYPE":"P","EMPLOYMENT_AGENCY_CODE_DDD_L":[],"EMPLOYMENT_AGENCY_CODE":null,"JOBCLASS_CODE_DDD_L":[],"JOBCLASS_CODE":null,"POSITION_CODE_DDD_L":["SF14"],"POSITION_CODE":"SF14","JOBLEVEL_CODE_DDD_L":[],"JOBLEVEL_CODE":null,"cmbPRIMARY_SUPERIOR_NO_DDD_L":[],"cmbPRIMARY_SUPERIOR_NO":null,"cmbSECONDARY_SUPERIOR_NO_DDD_L":[],"cmbSECONDARY_SUPERIOR_NO":null,"OFFICE_MEDIA_CONTACT1":null,"OFFICE_MEDIA_EXTNO":null,"OFFICE_MEDIA_CONTACT2":null,"OFFICE_MEDIA_CONTACT3":null,"CONTRACT_START_DATE":null,"CONTRACT_END_DATE":null,"CONTRACT_REFNO":null,"CONTRACT_TYPE":null,"COMPUTE_PAYROLL_FLAG":1,"PAY_BY_DDD_L":["B"],"PAY_BY":"B","PAY_GROUP_DDD_L":["PAY"],"PAY_GROUP":"PAY","PAY_RATE_DDD_L":["M"],"PAY_RATE":"M","PAY_CURRENCY_CODE_DDD_L":["MYR"],"PAY_CURRENCY_CODE":"MYR","BASIC_SALARY":"1400.00","AGREED_CURRENCY_RATE":null,"PRORATE_BASIC_METHOD_DDD_L":["W"],"PRORATE_BASIC_METHOD":"W","MONTH_WORKING_DAYS":0,"chkBasicSalaryFormulaProrate":false,"FORMULA_CODE_BASIC_PRORATE_DDD_L":[],"FORMULA_CODE_BASIC_PRORATE":null,"lsLevel":[],"ServicePointLevel":null,"SERVICE_POINT":null,"FORMULA_CODE_LEAVE_DDD_L":["FPL1"],"FORMULA_CODE_LEAVE":"FPL1","FORMULA_CODE_OVERTIME_DDD_L":["FOT1"],"FORMULA_CODE_OVERTIME":"FOT1","FORMULA_CODE_BONUS_DDD_L":[],"FORMULA_CODE_BONUS":null,"FORMULA_CODE_ALLOWANCE_DDD_L":[],"FORMULA_CODE_ALLOWANCE":null,"FORMULA_CODE_DEDUCTION_DDD_L":[],"FORMULA_CODE_DEDUCTION":null,"FORMULA_CODE_SERVICEPOINT_DDD_L":[],"FORMULA_CODE_SERVICEPOINT":null,"FORMULA_CODE_SERVICECHARGE_DDD_L":[],"FORMULA_CODE_SERVICECHARGE":null,"OT_BASED_ON_DDD_L":[],"OT_BASED_ON":null,"GLOBAL_GROUP_CODE_DDD_L":[],"GLOBAL_GROUP_CODE":null,"FORMULA_CODE_BASIC_DDD_L":[],"FORMULA_CODE_BASIC":null,"WorkingDay1":"2","DAY_WORKING_HOURS1":0,"WorkingDay2":"2","DAY_WORKING_HOURS2":0,"WorkingDay3":"2","DAY_WORKING_HOURS3":0,"WorkingDay4":"2","DAY_WORKING_HOURS4":0,"WorkingDay5":"2","DAY_WORKING_HOURS5":0,"WorkingDay6":"2","DAY_WORKING_HOURS6":0,"WorkingDay7":"2","DAY_WORKING_HOURS7":0,"HOLIDAY_GROUP_DDD_L":["ASCB"],"HOLIDAY_GROUP":"ASCB","LEAVE_GROUP_DDD_L":["NOLG"],"LEAVE_GROUP":"NOLG","YOS_DATE":new Date(2021,5,16),"EMPLOYEE_TYPE_DDD_L":["L"],"EMPLOYEE_TYPE":"L","PR_NO":null,"PR_ISSUE_DATE":null,"PR_EXPIRY_DATE":null,"PR_CANCEL_DATE":null,"WORK_PERMIT_NO":null,"WORK_PERMIT_TYPE_DDD_L":[],"WORK_PERMIT_TYPE":null,"WORK_PERMIT_SUB_TYPE_DDD_L":[],"WORK_PERMIT_SUB_TYPE":null,"WORK_PERMIT_ISSUE_DATE":null,"WORK_PERMIT_EXPIRY_DATE":null,"WORK_PERMIT_CANCEL_DATE":null,"UD_TEXT01_DDD_L":[],"UD_TEXT01":null,"UD_TEXT02":null,"UD_TEXT03":null,"UD_TEXT04":null,"UD_TEXT05":null,"UD_TEXT06":null,"UD_TEXT07":null,"UD_TEXT08":null,"UD_TEXT09":null,"UD_TEXT10":null,"UD_NUM01":"0.000000","UD_NUM02":"0.000000","UD_NUM03":"0.000000","UD_NUM04":"0.000000","UD_NUM05":"0.000000","UD_DATETIME01":null,"UD_DATETIME02":null,"UD_DATETIME03":null,"UD_DATETIME04":null,"UD_DATETIME05":null}""")
        .formParam("PrimarySuperiorNo", "")
        .formParam("EmpId", "${empID}"))
      .exec(http("request_101")
        .post("/Employee/CallbackButtonPartial")

        .formParam("DXCallbackName", "BtnPanel")
        .formParam("__DXCallbackArgument", "c0:")
        .formParam("menu", "EmploymentDetails")
        .formParam("DXMVCEditorsValues", "{}"))
      .exec(http("request_102")
        .post("/Employee/SecondarySuperiorPartial")

        .formParam("DXCallbackName", "cmbSECONDARY_SUPERIOR_NO")
        .formParam("__DXCallbackArgument", "c0:LECC|15;[object Object];LBCRI|4;0:29;")
        .formParam("cmbSECONDARY_SUPERIOR_NO$State", "{&quot;rawValue&quot;:&quot;&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("cmbSECONDARY_SUPERIOR_NO_VI", "")
        .formParam("cmbSECONDARY_SUPERIOR_NO", "Please Select")
        .formParam("DXMVCEditorsValues", """{"SERVICE_EVENT_DDD_L":[],"SERVICE_EVENT":null,"ddLocation":null,"EMPLOYEE_NO":"${EmpNoTest}","EMPLOYEE_STATUS_DDD_L":["A"],"EMPLOYEE_STATUS":"A","DATE_JOINED":new Date(2021,5,16),"GROUP_DATE_JOINED":new Date(2021,5,16),"BADGE_NO":"${EmpNoTest}","EMPLOYEE_SUB_STATUS_DDD_L":["P"],"EMPLOYEE_SUB_STATUS":"P","PROBATION_PERIOD":7,"PROBATION_PERIOD_TYPE_DDD_L":["D"],"PROBATION_PERIOD_TYPE":"D","PROBATION_PERIOD_EXT":null,"PROBATION_PERIOD_EXT_TYPE_DDD_L":[],"PROBATION_PERIOD_EXT_TYPE":null,"DATE_CONFIRMED":null,"WORKSPACE":null,"WORK_LOCATION_CODE_DDD_L":[],"WORK_LOCATION_CODE":null,"CATEGORY_CODE_DDD_L":["ADMN"],"CATEGORY_CODE":"ADMN","CATEGORY_SUB_CODE_DDD_L":["EXEC"],"CATEGORY_SUB_CODE":"EXEC","GRADE_CODE_DDD_L":["1"],"GRADE_CODE":"1","EMPLOYEE_LEVEL_DDD_L":[1],"EMPLOYEE_LEVEL":1,"COST_CENTER_CODE_DDD_L":[],"COST_CENTER_CODE":null,"WORK_GROUP_CODE_DDD_L":[],"WORK_GROUP_CODE":null,"EMPLOYMENT_TYPE_DDD_L":["P"],"EMPLOYMENT_TYPE":"P","EMPLOYMENT_AGENCY_CODE_DDD_L":[],"EMPLOYMENT_AGENCY_CODE":null,"JOBCLASS_CODE_DDD_L":[],"JOBCLASS_CODE":null,"POSITION_CODE_DDD_L":["SF14"],"POSITION_CODE":"SF14","JOBLEVEL_CODE_DDD_L":[],"JOBLEVEL_CODE":null,"cmbPRIMARY_SUPERIOR_NO_DDD_L":[],"cmbPRIMARY_SUPERIOR_NO":null,"cmbSECONDARY_SUPERIOR_NO_DDD_L":[],"cmbSECONDARY_SUPERIOR_NO":null,"OFFICE_MEDIA_CONTACT1":null,"OFFICE_MEDIA_EXTNO":null,"OFFICE_MEDIA_CONTACT2":null,"OFFICE_MEDIA_CONTACT3":null,"CONTRACT_START_DATE":null,"CONTRACT_END_DATE":null,"CONTRACT_REFNO":null,"CONTRACT_TYPE":null,"COMPUTE_PAYROLL_FLAG":1,"PAY_BY_DDD_L":["B"],"PAY_BY":"B","PAY_GROUP_DDD_L":["PAY"],"PAY_GROUP":"PAY","PAY_RATE_DDD_L":["M"],"PAY_RATE":"M","PAY_CURRENCY_CODE_DDD_L":["MYR"],"PAY_CURRENCY_CODE":"MYR","BASIC_SALARY":"1400.00","AGREED_CURRENCY_RATE":null,"PRORATE_BASIC_METHOD_DDD_L":["W"],"PRORATE_BASIC_METHOD":"W","MONTH_WORKING_DAYS":0,"chkBasicSalaryFormulaProrate":false,"FORMULA_CODE_BASIC_PRORATE_DDD_L":[],"FORMULA_CODE_BASIC_PRORATE":null,"lsLevel":[],"ServicePointLevel":null,"SERVICE_POINT":null,"FORMULA_CODE_LEAVE_DDD_L":["FPL1"],"FORMULA_CODE_LEAVE":"FPL1","FORMULA_CODE_OVERTIME_DDD_L":["FOT1"],"FORMULA_CODE_OVERTIME":"FOT1","FORMULA_CODE_BONUS_DDD_L":[],"FORMULA_CODE_BONUS":null,"FORMULA_CODE_ALLOWANCE_DDD_L":[],"FORMULA_CODE_ALLOWANCE":null,"FORMULA_CODE_DEDUCTION_DDD_L":[],"FORMULA_CODE_DEDUCTION":null,"FORMULA_CODE_SERVICEPOINT_DDD_L":[],"FORMULA_CODE_SERVICEPOINT":null,"FORMULA_CODE_SERVICECHARGE_DDD_L":[],"FORMULA_CODE_SERVICECHARGE":null,"OT_BASED_ON_DDD_L":[],"OT_BASED_ON":null,"GLOBAL_GROUP_CODE_DDD_L":[],"GLOBAL_GROUP_CODE":null,"FORMULA_CODE_BASIC_DDD_L":[],"FORMULA_CODE_BASIC":null,"WorkingDay1":"2","DAY_WORKING_HOURS1":0,"WorkingDay2":"2","DAY_WORKING_HOURS2":0,"WorkingDay3":"2","DAY_WORKING_HOURS3":0,"WorkingDay4":"2","DAY_WORKING_HOURS4":0,"WorkingDay5":"2","DAY_WORKING_HOURS5":0,"WorkingDay6":"2","DAY_WORKING_HOURS6":0,"WorkingDay7":"2","DAY_WORKING_HOURS7":0,"HOLIDAY_GROUP_DDD_L":["ASCB"],"HOLIDAY_GROUP":"ASCB","LEAVE_GROUP_DDD_L":["NOLG"],"LEAVE_GROUP":"NOLG","YOS_DATE":new Date(2021,5,16),"EMPLOYEE_TYPE_DDD_L":["L"],"EMPLOYEE_TYPE":"L","PR_NO":null,"PR_ISSUE_DATE":null,"PR_EXPIRY_DATE":null,"PR_CANCEL_DATE":null,"WORK_PERMIT_NO":null,"WORK_PERMIT_TYPE_DDD_L":[],"WORK_PERMIT_TYPE":null,"WORK_PERMIT_SUB_TYPE_DDD_L":[],"WORK_PERMIT_SUB_TYPE":null,"WORK_PERMIT_ISSUE_DATE":null,"WORK_PERMIT_EXPIRY_DATE":null,"WORK_PERMIT_CANCEL_DATE":null,"UD_TEXT01_DDD_L":[],"UD_TEXT01":null,"UD_TEXT02":null,"UD_TEXT03":null,"UD_TEXT04":null,"UD_TEXT05":null,"UD_TEXT06":null,"UD_TEXT07":null,"UD_TEXT08":null,"UD_TEXT09":null,"UD_TEXT10":null,"UD_NUM01":"0.000000","UD_NUM02":"0.000000","UD_NUM03":"0.000000","UD_NUM04":"0.000000","UD_NUM05":"0.000000","UD_DATETIME01":null,"UD_DATETIME02":null,"UD_DATETIME03":null,"UD_DATETIME04":null,"UD_DATETIME05":null}""")
        .formParam("SecondarySuperiorNo", "")
        .formParam("EmpId", "${empID}"))
      .pause(2)
      .exec(http("request_103")
        .get("/Account/VerifyAccess")
      )
      .exec(http("Remuneration Page")
        .get("/Employee/Remuneration?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1&Id=${referID}")
        .check(css("input[name='BASIC_SALARY']", "value").saveAs("basic"))
        .check(css("input[name='EFFECTIVE_DATE_FROM']", "value").saveAs("todayDate"))
        .check(bodyString.saveAs("RemPage"))
      )
      .exec(session =>{
        val page = session("RemPage").as[String]
        println(s"Rem Page : $page")

        val basic = session("basic").as[String]
        println(s"Basic Salary : $basic")

        val today = session("todayDate").as[String]
        val effectivedateValue2 = today.replace(" 00:00:00", "").split("/")
        val day2 = effectivedateValue2(0)
        val month2 = effectivedateValue2(1)
        val year2 = effectivedateValue2(2)
        val encoded2 = "" + day2 + "%2F" + month2 + "%2F" + year2
        val encodedTime2 = "" + day2 + "%2F" + month2 + "%2F" + year2 + "%2000%3A00%3A00"


        println(s"Encoded : $encoded2") // eg: 01%2F07%2F2021
        println(s"EncodedTime : $encodedTime2") // eg: 01%2F07%2F2021%2000%3A00%3A00
        println(s"Chosen Date : $today") // eg: 01/07/2021 00:00:00

        session.set("encodedTime2", encodedTime2).set("encoded2", encoded2).set("day2",day2).set("month2", month2).set("year2", year2)

      })


      .pause(116.milliseconds)
      .exec(http("request_105")
        .post("/Employee/CallbackButtonPartial")

        .formParam("DXCallbackName", "BtnPanel")
        .formParam("__DXCallbackArgument", "c0:")
        .formParam("menu", "Remuneration")
        .formParam("DXMVCEditorsValues", "{}"))
      .pause(11)
      .exec(http("request_106")
        .post("/Account/VerifyAccess")
      )

      // from here

      .exec(http("Remuneration Page")
        .post("/Employee/Remuneration")

        .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
        .formParam("Refer_Id", "${referID}") // change to new (1:56pm)
        .formParam("ID", "0")
        .formParam("ROWVERSION", "${rowVers}")
        .formParam("CUSTOMER_CODE", "PNT")
        .formParam("EMPLOYEE_ID", "${empID}")
        .formParam("EMPLOYEE_NO$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("EMPLOYEE_NO", "${EmpNoTest}")
        .formParam("EFFECTIVE_DATE_FROM$State", "{&quot;rawValue&quot;:&quot;1624924800000&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("EFFECTIVE_DATE_FROM", "29/06/2021 00:00:00")
        .formParam("EFFECTIVE_DATE_TO", "31/12/9999 00:00:00")
        .formParam("IsEdit", "True")
        .formParam("IsView", "False")
        .formParam("LOCATION_ID", "6")
        .formParam("PAY_GROUP$State", "{&quot;rawValue&quot;:&quot;Month End Salary&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("PAY_GROUP", "PAY")
        .formParam("EFFECTIVE_DATE_FROM", "${todayDate}") //changed here
        .formParam("EFFECTIVE_DATE_FROM$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("EFFECTIVE_DATE_FROM$DDD$C", "{&quot;visibleDate&quot;:&quot;06/29/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/29/2021&quot;,&quot;selectedDates&quot;:[&quot;06/29/2021&quot;]}")
        .formParam("EFFECTIVE_DATE_FROM$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("SERVICE_CODE$State", "{&quot;rawValue&quot;:&quot;&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("SERVICE_CODE_VI", "INCR")
        .formParam("SERVICE_CODE", "Increment")
        .formParam("SERVICE_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("SERVICE_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("SERVICE_CODE$DDD$L", "INCR")
        .formParam("REASON_CODE$State", "{&quot;rawValue&quot;:&quot;&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("REASON_CODE_VI", "")
        .formParam("REASON_CODE", "Please Select")
        .formParam("REASON_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("REASON_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("REASON_CODE$DDD$L", "")
        .formParam("REMARKS$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("REMARKS", "")
        .formParam("PAY_CURRENCY_CODE", "MYR")
        .formParam("BASIC_SALARY$State", "{&quot;rawValue&quot;:&quot;1400.00&quot;}")
        .formParam("BASIC_SALARY", "${basic}") // <---------------------- old
        .formParam("NEW_PAY_CURRENCY_CODE$State", "{&quot;rawValue&quot;:&quot;MYR&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("NEW_PAY_CURRENCY_CODE_VI", "MYR")
        .formParam("NEW_PAY_CURRENCY_CODE", "MYR")
        .formParam("NEW_PAY_CURRENCY_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("NEW_PAY_CURRENCY_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("NEW_PAY_CURRENCY_CODE$DDD$L", "MYR")
        .formParam("NEW_BASIC_SALARY$State", "{&quot;rawValue&quot;:&quot;0&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("NEW_BASIC_SALARY", "1,100.00") // <---------------------- new
        .formParam("DXMVCEditorsValues", """{"ID":"0","EFFECTIVE_DATE_FROM":new Date(2021,6,2),"SERVICE_CODE_DDD_L":["INCR"],"SERVICE_CODE":"INCR","REASON_CODE_DDD_L":[],"REASON_CODE":null,"REMARKS":null,"PAY_CURRENCY_CODE":"MYR","BASIC_SALARY":"${basic}","NEW_PAY_CURRENCY_CODE_DDD_L":["MYR"],"NEW_PAY_CURRENCY_CODE":"MYR","NEW_BASIC_SALARY":"1100"}""")
        .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
        .formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/layout.css,/Content/blue.css,/Content/custom.css,/Content/font-awesome/css/font-awesome.css,/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime2}&customerCode=PNT&countryCode=1"))
      .exec(http("request_108")
        .post("/Employee/SearchList")

        .formParam("DXCallbackName", "EmpListDD")
        .formParam("__DXCallbackArgument", "c0:LECC|15;[object Object];LBCRI|5;0:199;")
        .formParam("EmpListDD$State", "{&quot;rawValue&quot;:&quot;&quot;}")
        .formParam("EmpListDD_VI", "")
        .formParam("EmpListDD", "No Records found")
        .formParam("DXMVCEditorsValues", """{"SearchStatus_DDD_L":["B"],"SearchStatus":"B","SearchByDD_DDD_L":["EMPLOYEE_NO"],"SearchByDD":"EMPLOYEE_NO","FilterExp_DDD_L":["contains"],"FilterExp":"contains","SearchByText":"${EmpNoTest}","EmpListDD_DDD_L":[],"EmpListDD":null}""")
        .formParam("EmpId", "${empID}")
        .formParam("status", "B")
        .formParam("filter", "EMPLOYEE_NO")
        .formParam("cond", "contains")
        .formParam("filterText", "${EmpNoTest}"))
/*      .exec(http("request_109")
        .get("/DXB.axd?DXCache=95eabd12-a75a-424c-b6d7-fea51b04f8e7")
      )*/



      .exec(http("CallbackEmpDetailsPartial")
        .post("/Employee/CallbackEmpDetailsPartial")

        .formParam("DXCallbackName", "EmpPanel")
        .formParam("__DXCallbackArgument", "c0:[object Object]")
        .formParam("EmpId", "${empID}")
        .formParam("EmpNo", "${EmpNoTest}")
        .formParam("LocId", "6")
        .formParam("EffDate", "${todayDate}") // i changed here
        .formParam("BasicDetailPanel", "{&quot;collapsed&quot;:false}")
        .formParam("imgProfile$State", "{&quot;uploadedFileName&quot;:&quot;&quot;}")
        .formParam("uploadProfilePic", "{&quot;inputCount&quot;:1}")
        .formParam("uploadProfilePic_TextBoxT_Input", "")
        .formParam("uploadProfilePic_TextBox0_Input", "")
        .formParam("uploadProfilePic_DXMVCUploadControl", "")
        .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
        .formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/layout.css,/Content/blue.css,/Content/custom.css,/Content/font-awesome/css/font-awesome.css,/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime2}&customerCode=PNT&countryCode=1")
        .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
        .formParam("Refer_Id", "${referID}")
        .formParam("ID", "0")
        .formParam("ROWVERSION", "${rowVers}")
        .formParam("CUSTOMER_CODE", "PNT")
        .formParam("EMPLOYEE_ID", "${empID}")
        .formParam("EMPLOYEE_NO$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("EMPLOYEE_NO", "${EmpNoTest}")
        .formParam("EFFECTIVE_DATE_FROM$State", "{&quot;rawValue&quot;:&quot;1625184000000&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("EFFECTIVE_DATE_FROM", "29/06/2021 00:00:00")
        .formParam("EFFECTIVE_DATE_TO", "31/12/9999 00:00:00")
        .formParam("IsEdit", "True")
        .formParam("IsView", "False")
        .formParam("LOCATION_ID", "6")
        .formParam("PAY_GROUP$State", "{&quot;rawValue&quot;:&quot;Month End Salary&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("PAY_GROUP", "PAY")
        .formParam("EFFECTIVE_DATE_FROM$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:1:::1:0:0:0&quot;}")
        .formParam("EFFECTIVE_DATE_FROM$DDD$C", "{&quot;visibleDate&quot;:&quot;07/29/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/29/2021&quot;,&quot;selectedDates&quot;:[&quot;${month2}/${day2}/${year2}&quot;]}")
        .formParam("EFFECTIVE_DATE_FROM$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("SERVICE_CODE$State", "{&quot;rawValue&quot;:&quot;Increment&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("SERVICE_CODE_VI", "INCR")
        .formParam("SERVICE_CODE", "Increment")
        .formParam("SERVICE_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:802:446:1:451:77.66666000000001:1:0:0:0&quot;}")
        .formParam("SERVICE_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("SERVICE_CODE$DDD$L", "INCR")
        .formParam("REASON_CODE$State", "{&quot;rawValue&quot;:&quot;&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("REASON_CODE_VI", "")
        .formParam("REASON_CODE", "Please Select")
        .formParam("REASON_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("REASON_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("REASON_CODE$DDD$L", "")
        .formParam("REMARKS$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("REMARKS", "")
        .formParam("PAY_CURRENCY_CODE", "MYR")
        .formParam("BASIC_SALARY$State", "{&quot;rawValue&quot;:&quot;1400.00&quot;}")
        .formParam("BASIC_SALARY", "${basic}") // <---------------------- old
        .formParam("NEW_PAY_CURRENCY_CODE$State", "{&quot;rawValue&quot;:&quot;MYR&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("NEW_PAY_CURRENCY_CODE_VI", "MYR")
        .formParam("NEW_PAY_CURRENCY_CODE", "MYR")
        .formParam("NEW_PAY_CURRENCY_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("NEW_PAY_CURRENCY_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("NEW_PAY_CURRENCY_CODE$DDD$L", "MYR")
        .formParam("NEW_BASIC_SALARY$State", "{&quot;rawValue&quot;:&quot;1500&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("NEW_BASIC_SALARY", "1,100.00") // <---------------------- new
        .formParam("DXMVCEditorsValues", """{"ID":"0","EMPLOYEE_NO":null,"EFFECTIVE_DATE_FROM":new Date(2021,6,2),"PAY_GROUP":"PAY","SERVICE_CODE":"INCR","REASON_CODE":null,"REMARKS":null,"PAY_CURRENCY_CODE":"MYR","BASIC_SALARY":"${basic}","NEW_PAY_CURRENCY_CODE":"MYR","NEW_BASIC_SALARY":"1100"}"""))
      .exec(http("request_111")
        .post("/Employee/CallbackNavPartial")

        .formParam("DXCallbackName", "NavPanel")
        .formParam("__DXCallbackArgument", "c0:")
        .formParam("DXMVCEditorsValues", "{}"))
      .exec(http("request_112")
        .get("/Account/VerifyAccess")
      )

      // till here


/*      .exec(http("request_113")
        .get("/DXB.axd?DXCache=2976e2fa-32d4-4966-bca2-1a5eda51316c")
      )*/
      .exec(http("request_114")
        .get("/Employee/PersonalDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1")
      )
      .exec(http("request_115")
        .get("/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1")
      )
      .exec(http("request_116")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_117")
        .post("/Employee/GetConfigForeignValidation")

        .formParam("employeeId", "${empID}"))
      .exec(http("request_118")
        .post("/Employee/CallbackButtonPartial")

        .formParam("DXCallbackName", "BtnPanel")
        .formParam("__DXCallbackArgument", "c0:")
        .formParam("menu", "PersonalDetails")
        .formParam("DXMVCEditorsValues", "{}"))
      .exec(http("request_119")
        .post("/Employee/MailAreaPartial")

        .formParam("DXCallbackName", "MAIL_AREA_CODE")
        .formParam("__DXCallbackArgument", "c0:LECC|0;;LBCRI|4;0:99;")
        .formParam("MAIL_AREA_CODE$State", "")
        .formParam("MAIL_AREA_CODE_VI", "")
        .formParam("DXMVCEditorsValues", """{"EMPLOYEE_TITLE_DDD_L":["MDM"],"EMPLOYEE_TITLE":"MDM","EMPLOYEE_FIRST_NAME":"Mallory","EMPLOYEE_MIDDLE_NAME":"Saint","EMPLOYEE_LAST_NAME":"Bailey","EMPLOYEE_NAME":"Mallory Saint Bailey","EMPLOYEE_LOCAL_NAME":null,"EMPLOYEE_NICKNAME":null,"GENDER_DDD_L":["F"],"GENDER":"F","BIRTH_DATE":new Date(1995,5,7),"NATIONALITY_CODE_DDD_L":["MY"],"NATIONALITY_CODE":"MY","NATIONAL_ID1":"67812631267","NATIONAL_ID2":null,"PASSPORT_NO":"1256316","PASSPORT_ISSUE_DATE":new Date(2014,5,11),"PASSPORT_EXPIRY_DATE":new Date(2026,6,11),"MEDIA_CONTACT1":null,"MEDIA_CONTACT2":null,"MEDIA_CONTACT3":null,"EMERGENCY_CONTACT_NAME":null,"EMERGENCY_CONTACT_RELATION_DDD_L":[],"EMERGENCY_CONTACT_RELATION":null,"EMERGENCY_CONTACT_NO":null,"PERMANENT_ADDRESS1":"3381 Glenview Drive Corpus Christi, TX 78476","PERMANENT_ADDRESS2":null,"PERMANENT_ADDRESS3":null,"PERMANENT_COUNTRY_CODE_DDD_L":["MY"],"PERMANENT_COUNTRY_CODE":"MY","PERMANENT_STATE_CODE_DDD_L":[],"PERMANENT_STATE_CODE":null,"PERMANENT_AREA_CODE_DDD_L":[],"PERMANENT_AREA_CODE":null,"PERMANENT_POST_CODE":null,"MAIL_SAMEAS_PERMANENT":"1","MAIL_ADDRESS1":null,"MAIL_ADDRESS2":null,"MAIL_ADDRESS3":null,"MAIL_COUNTRY_CODE_DDD_L":["MY"],"MAIL_COUNTRY_CODE":null,"MAIL_STATE_CODE_DDD_L":[],"MAIL_STATE_CODE":null,"MAIL_AREA_CODE_DDD_L":[],"MAIL_AREA_CODE":null,"MAIL_POST_CODE":null,"MARITAL_STATUS_DDD_L":["S"],"MARITAL_STATUS":"S","MARRIAGE_DATE":null,"RACE_CODE_DDD_L":[],"RACE_CODE":null,"RELIGION_CODE_DDD_L":[],"RELIGION_CODE":null,"BIRTH_COUNTRY_CODE_DDD_L":["MY"],"BIRTH_COUNTRY_CODE":"MY","BIRTH_PLACE":null,"BLOOD_GROUP_DDD_L":[],"BLOOD_GROUP":null,"HEIGHT":null,"WEIGHT":null,"HANDICAPPED_DDD_L":[],"HANDICAPPED":null}""")
        .formParam("State", ""))
      .exec(http("request_120")
        .get("/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1")
      )
      .exec(http("request_121")
        .post("/Employee/MailStatePartial")

        .formParam("DXCallbackName", "MAIL_STATE_CODE")
        .formParam("__DXCallbackArgument", "c0:LECC|0;;LBCRI|4;0:19;")
        .formParam("MAIL_STATE_CODE$State", "")
        .formParam("MAIL_STATE_CODE_VI", "")
        .formParam("DXMVCEditorsValues", """{"EMPLOYEE_TITLE_DDD_L":["MDM"],"EMPLOYEE_TITLE":"MDM","EMPLOYEE_FIRST_NAME":"Mallory","EMPLOYEE_MIDDLE_NAME":"Saint","EMPLOYEE_LAST_NAME":"Bailey","EMPLOYEE_NAME":"Mallory Saint Bailey","EMPLOYEE_LOCAL_NAME":null,"EMPLOYEE_NICKNAME":null,"GENDER_DDD_L":["F"],"GENDER":"F","BIRTH_DATE":new Date(1995,5,7),"NATIONALITY_CODE_DDD_L":["MY"],"NATIONALITY_CODE":"MY","NATIONAL_ID1":"67812631267","NATIONAL_ID2":null,"PASSPORT_NO":"1256316","PASSPORT_ISSUE_DATE":new Date(2014,5,11),"PASSPORT_EXPIRY_DATE":new Date(2026,6,11),"MEDIA_CONTACT1":null,"MEDIA_CONTACT2":null,"MEDIA_CONTACT3":null,"EMERGENCY_CONTACT_NAME":null,"EMERGENCY_CONTACT_RELATION_DDD_L":[],"EMERGENCY_CONTACT_RELATION":null,"EMERGENCY_CONTACT_NO":null,"PERMANENT_ADDRESS1":"3381 Glenview Drive Corpus Christi, TX 78476","PERMANENT_ADDRESS2":null,"PERMANENT_ADDRESS3":null,"PERMANENT_COUNTRY_CODE_DDD_L":["MY"],"PERMANENT_COUNTRY_CODE":"MY","PERMANENT_STATE_CODE_DDD_L":[],"PERMANENT_STATE_CODE":null,"PERMANENT_AREA_CODE_DDD_L":[],"PERMANENT_AREA_CODE":null,"PERMANENT_POST_CODE":null,"MAIL_SAMEAS_PERMANENT":"1","MAIL_ADDRESS1":null,"MAIL_ADDRESS2":null,"MAIL_ADDRESS3":null,"MAIL_COUNTRY_CODE_DDD_L":["MY"],"MAIL_COUNTRY_CODE":null,"MAIL_STATE_CODE_DDD_L":[],"MAIL_STATE_CODE":null,"MAIL_AREA_CODE_DDD_L":[],"MAIL_AREA_CODE":null,"MAIL_POST_CODE":null,"MARITAL_STATUS_DDD_L":["S"],"MARITAL_STATUS":"S","MARRIAGE_DATE":null,"RACE_CODE_DDD_L":[],"RACE_CODE":null,"RELIGION_CODE_DDD_L":[],"RELIGION_CODE":null,"BIRTH_COUNTRY_CODE_DDD_L":["MY"],"BIRTH_COUNTRY_CODE":"MY","BIRTH_PLACE":null,"BLOOD_GROUP_DDD_L":[],"BLOOD_GROUP":null,"HEIGHT":null,"WEIGHT":null,"HANDICAPPED_DDD_L":[],"HANDICAPPED":null}""")
        .formParam("Country", "MY"))
      .pause(4)
      .exec(http("request_122")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_123")
        .post("/Employee/PopupPersonalHistory")

        .formParam("EmpId", "${empID}"))
      .exec(http("request_124")
        .post("/Employee/PopupPersonalHistory")

        .formParam("DXCallbackName", "popupPersonal")
        .formParam("__DXCallbackArgument", "c0:-1;")
        .formParam("windowIndex", "-1")
        .formParam("EmpId", "${empID}"))
      .exec(http("request_125")
        .get("/DXR.axd?r=0_2223-O3Vxm")
      )
      .pause(7)

  }

  def logout = {

    exec(http("Logout SUbmission")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/layout.css,/Content/blue.css,/Content/custom.css,/Content/font-awesome/css/font-awesome.css,/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=01%2F07%2F2021%2000%3A00%3A00&customerCode=PNT&countryCode=1,/Employee/EmploymentDetails?EmpId=${empID}&LocId=6&EmpNo=${EmpNoTest}&EffDate=${encodedTime}&customerCode=PNT&countryCode=1")
      .check(status.is(302)))
      .exec(http("Login After Logout")
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
