package computerdatabase.Module.Workflow
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object ESSEMPMyWorkflowWithdrawCancelledLeave {
  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/fonts/fontawesome-webfont.woff2"
  val uri4 = "https://fonts.googleapis.com/css"

  def loadApplication = {
    exec(http("Load My Workflow Page")
      .get("/works/request_lst.aspx")
      .check(bodyString.saveAs("WorkflowPage"))
      .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(|.+?)" />""").saveAs("viewStateWorkflowLS1"))
    )
      .exec(http("request_53")
        .get(uri4 + "?family=Open+Sans:300,400,600,700")
      )
      .exec(http("request_54")
        .get(uri4 + "?family=Roboto:400,300,500,700")
      )
      .exec(http("request_55")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984")
      )
      .exec(http("request_56")
        .post("/verify_access.ashx")
      )
      .exec(http("request_57")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521")
      )
      .exec(http("request_58")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521")
      )
      .exec(http("request_59")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521")
      )
      .exec(http("request_60")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521")
      )
      .exec(http("request_61")
        .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False")
      )
      .exec(http("request_62")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_63")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_64")
        .get("/Account/VerifyAccess")
      )
      .exec(http("request_65")
        .get("/Notifications/ViewNotifications?type=O9CI3dVXyghQ0Aa6XtCz9Kq1VQE+m6hdUW+aMLtgPTcG5Ox3DwNcLXCT124axVqgzw2AeRonccoKEQoNdx+OdgXZthcDbjswhRKJVe2G7fyekfC6HFl/Y0xGHPIY7EZSoSkWjNB+sq30hSrmGp0wku+YCqHEW49ypIm5hoiHtgY=")
      )
      .exec(http("request_66")
        .get(uri3 + "?v=4.7.0")
      )
      .exec(http("request_67")
        .get("/Account/VerifyAccess")
      )
      .exec(http("request_68")
        .get("/Notifications/GetNotificationsList?row=8")
      )
      .pause(16)
  }
  def searchCritLCPend = {
    exec(http("Search Request Form Based on Criteria")
      .post("/works/request_lst.aspx")

      .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$btnSearch")
      .formParam("__EVENTARGUMENT", "")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewStateWorkflowLS1}")
      .formParam("__VIEWSTATEGENERATOR", "197FAB68")
      .formParam("ctl00$ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$ctl00$selCountry", "1")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfMode", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfStatus", "[P]")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestID", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selActionType", "R")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestorName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selRequestType", "leavecancellation")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateFrom", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateTo", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtStatus", "Pending")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$cbStatus$0", "P")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl15$gpCustomPager$txtPageSize", "50")
      .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(|.+?)" />""").saveAs("viewStateWorkflowSearch"))
    )
      .exec(http("request_68")
        .post("/verify_access.ashx")
      )
      .exec(http("request_69")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_70")
        .get(uri3 + "?v=4.7.0")
      )
      .exec(http("request_71")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984")
      )
      .exec(http("request_72")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521")
      )
      .exec(http("request_73")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521")
      )
      .exec(http("request_74")
        .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False")
      )
      .exec(http("request_75")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521")
      )
      .exec(http("request_76")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521")
      )
      .exec(http("request_77")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_78")
        .get("/Notifications/ViewNotifications?type=jZB4S9x/d985XfjHpBJmdfpKZFBaLz+mzOu1pKLxh7W6vfXSUfVJs2VbiQKMpXTy6rtO8PuuhthTD9gmYheoLKls/WHcBHicY5cxDII1B3lhOSaRT1qvlhTbyHYbLTmAWHgqbVBrodKuJUG4foiRXtbiIWe+x6Ly24PbAKLjYBA=")
      )
      .exec(http("request_79")
        .get("/Notifications/GetNotificationsList?row=8")
      )
      .pause(8)
      .exec(http("Display the list of Request Based on Search")
        .post("/works/request_lst.aspx")
        .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl02$ctl00")
        .formParam("__EVENTARGUMENT", "")
        .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
        .formParam("__VIEWSTATE", "${viewStateWorkflowSearch}")
        .formParam("__VIEWSTATEGENERATOR", "197FAB68")
        .formParam("ctl00$ctl00$ctl00$selCultureName", "")
        .formParam("ctl00$ctl00$ctl00$selCountry", "1")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfMode", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfStatus", "[P]")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selActionType", "R")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestorName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selRequestType", "leavecancellation")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateFrom", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateTo", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtStatus", "Pending")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$cbStatus$0", "P")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl37$gpCustomPager$txtPageSize", "50")
        .check(status.is(302))
        .check(header("Location").saveAs("url"))
      )
      .pause(1)
      .exec(http("request_81")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317-O3Vxm")
      )
      .exec(http("request_82")
        .get(uri4 + "?family=Open+Sans:300,400,600,700")
      )
      .exec(http("request_83")
        .get(uri4 + "?family=Roboto:400,300,500,700")
      )
  }
  def withdrawLC = {
    exec(http("Load Request Form Based on ID Clicked")
      .get("${url}")
      .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(|.+?)" />""").saveAs("viewStateWorkflowLS2"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfInfoID']", "value").saveAs("finfoID"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfMonitorID']", "value").saveAs("fmonitorID"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfAgentID']", "value").saveAs("fagentID"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfBalance']", "value").saveAs("fBalance"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfDataSet']", "value").saveAs("fDataSet"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEmploymentID']", "value").saveAs("fEmployID"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfStartDate']", "value").saveAs("fStartDate"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEndDate']", "value").saveAs("fEndDate"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfFrom0']", "value").saveAs("fFrom0"))
      .check(css("input[name='ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfTo0']", "value").saveAs("fTo0"))

    )
      .exec(http("request_35")
        .post("/verify_access.ashx")
      )
      .exec(http("request_36")
        .get("/WebResource.axd?d=G7AEkw1asyYfSFk2Li5D0JhwAppflyxkpGSQDQbA3YX7Us59q1SeSvJlGoBadgH42WWogzokgjSTil628NjzJ-ho-6akTSnjNL_1W4rKMdV6J4E7SFdllL-EXlbUGTEk-wfRgTKBSFluXwws9OgQSz64mOsqxEoa9Z9MfmluHcdALHev8eL9dk6DjmuJdzHl0&t=637529727625595181")
      )
      .exec(http("request_37")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984")
      )
      .exec(http("request_38")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521")
      )
      .exec(http("request_39")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521")
      )
      .exec(http("request_40")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521")
      )
      .exec(http("request_41")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521")
      )
      .exec(http("request_42")
        .get("/ScriptResource.axd?d=nv7asgRUU0tRmHNR2D6t1HncJC0uSlzSoOMFzQL9KDgdtj1yUByaaYlMWCLR1tfb0zRr2KS8GU92MXS6P0lOX_vkDPQOiW6UvV384GibJ__q8DVUhGPtg7X0IEAXecIS6jMaZIGfhYY2bHennMwScvTacu4aYi7pwkjCfDx4XDhghn49oiHENcEjRtCYLFUt0&t=fffffffff6474071")
      )
      .exec(http("request_43")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_44")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_45")
        .get(uri3 + "?v=4.7.0")
      )
      .exec(http("request_46")
        .get("/DXR.axd?r=1_303,1_184,1_297,1_210,1_220,1_187,1_181,1_289,1_287-N3Vxm")
      )
      .exec(http("request_47")
        .get("/request/leave_form.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False")
      )
      .pause(172.milliseconds)
      .exec(http("request_48")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_49")
        .post("/request/get_leave_reason.ashx")

        .formParam("LeaveType", "A")
        .formParam("EmployeeID", "")
        .formParam("EmploymentID", "9126")
        .formParam("EmployeeNo", "")
        .formParam("StartDate", "undefined 00:00")
        .formParam("EndDate", "undefined 00:00")
        .formParam("LocationID", "9"))
      .exec(http("request_50")
        .get("/Notifications/ViewNotifications?type=RplbRINqXtukt1U/Gf9szlY3lmU1icb3GbghUKR6IsjtoBwwUKV7lQh69fZsDyhy1OXngWHJ7mDvfaRO4++BDZ6n9rGSdBrre4dfw/auMs/9T1EH4UyexL4c/luueP1BfaRnnzPv9cp+zLmBp3Hqqr5i3rT9TsEo1paAsFyYpTA=")
      )
      .exec(http("request_51")
        .get("/Notifications/GetNotificationsList?row=8")
      )
      .pause(7)
      .exec(http("request_52")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317-O3Vxm")
      )
      .exec(http("request_53")
        .get(uri4 + "?family=Open+Sans:300,400,600,700")
      )
      .exec(http("request_54")
        .get(uri4 + "?family=Roboto:400,300,500,700")
      )
      .exec(http("request_55")
        .post("${url}")
        .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$btnWithdraw")
        .formParam("__EVENTARGUMENT", "")
        .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
        .formParam("__VIEWSTATE", "${viewStateWorkflowLS2}")
        .formParam("__VIEWSTATEGENERATOR", "DD360C3C")
        .formParam("ctl00$ctl00$ctl00$selCultureName", "")
        .formParam("ctl00$ctl00$ctl00$selCountry", "1")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfAttachID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfFileName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfFileType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfAttachSrc", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfMode", "P")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfView", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfInfoID", "${finfoID}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfMonitorID", "${fmonitorID}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfAgentID", "${fagentID}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfNewAttach", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfOldAttach", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfBalance", "${fBalance}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfAdvanceBalance", "0")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfTotalApplied", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfSkipExceed", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfLeaveCode", "KMANL")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReason", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfDataSet", "${fDataSet}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfActualLeaveDate", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfTotalAttached", "0")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfUPLSplitFlag", "N")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfUPLDateSplit", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfUPLLeaveCode", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfUPLReferAgentID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfUPLReferMonitorID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfUPLReferWFStatus", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfUPLReferRedirectURL", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfCancelAction", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfFinYear", "2021")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfFinStartDate", "01/01/2021")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfSkipConfAllow", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReplacementDate", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReplLeavePeriodFlag", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReplCreditLeaveType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReplReplacedQty", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfAdvanceFlag", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfSickLeaveEnable", "true")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfWorkflowApproverEnable", "false")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfWorkflowApproverPopup", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfWorkflowFormLeaveRelieverEnable", "true")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRequestorID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRequestorNo", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEmploymentID", "${fEmployID}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfLocationID", "9")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEmpCountryCode", "MY")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEmpBirthDate", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$rfvRequestorEx_ClientState", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfLeaveType", "A")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfLeaveUnit", "N")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfHoursPerDay", "8.00")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfAttachmentFlag", "0")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfApplicationStartDate", "J")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfLeavePeriod", "7")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfApplicationMethod", "B")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRequiredApproverRemarks", "N")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReasonFlag", "0")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfNoticePeriod", "0.00")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfBlockType", "N")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEventType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEventEntitlementUnit", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfValidatePeriodType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfLeaveCancelType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfLeavePolicyMsg", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEmergencyQty", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEmergencyFlag", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEmergencyControlFlag", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfBalanceMethod", "R")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$rfvLeaveTypeEx_ClientState", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$rfvPeriodEx_ClientState", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$cusvPeriodEx_ClientState", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReplaceVisible", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRelation", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRelationNoticePeriod", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRelationEventEntitlementUnit", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRelationValidityPeriodType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfStartDate", "${fStartDate}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$rfvStartDateEx_ClientState", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfEndDate", "${fEndDate}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$rfvEndDateEx_ClientState", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$cusvReasonEx_ClientState", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfReliever", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfRelieverNo", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfWFApprover", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfWFApproverNo", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfTSProjectCode", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$txtRmks", "Test33")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfFrom0", "${fFrom0}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfTo0", "${fTo0}")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$popupControlState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("DXScript", "1_303,1_184,1_297,1_210,1_220,1_187,1_181,1_289,1_287")
        .formParam("DXCss", "0_2312,1_50,1_53,1_51,0_2317,../Content/jquery.jscrollpane.css,../Content/ESS/bootstrap.css,../Content/ESS/NewUIStyle.css,../Content/ESS/ResponsiveSite.css,../Content/generic.light.custom.css,../Content/ESS/font-style.css,https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css,../Content/jquery.orgchart.css,../Content/ESS/style.css,../Content/ESS/component.css,../Content/ESS/alert.css,../Content/ESS/custom/jquery-ui-1.10.3.custom.min.css,../Content/jquery.mmenu.css,../Content/notifications.css,https://orisoftst.orisoftsaas.com/Content/ESS/jquery.ui.timepicker.css,/WebResource.axd?d=G7AEkw1asyYfSFk2Li5D0JhwAppflyxkpGSQDQbA3YX7Us59q1SeSvJlGoBadgH42WWogzokgjSTil628NjzJ-ho-6akTSnjNL_1W4rKMdV6J4E7SFdllL-EXlbUGTEk-wfRgTKBSFluXwws9OgQSz64mOsqxEoa9Z9MfmluHcdALHev8eL9dk6DjmuJdzHl0&t=637529727625595181"))
      .exec(http("request_56")
        .post("/verify_access.ashx")
      )
      .exec(http("request_57")
        .get("/WebResource.axd?d=G7AEkw1asyYfSFk2Li5D0JhwAppflyxkpGSQDQbA3YX7Us59q1SeSvJlGoBadgH42WWogzokgjSTil628NjzJ-ho-6akTSnjNL_1W4rKMdV6J4E7SFdllL-EXlbUGTEk-wfRgTKBSFluXwws9OgQSz64mOsqxEoa9Z9MfmluHcdALHev8eL9dk6DjmuJdzHl0&t=637529727625595181")
      )
      .exec(http("request_58")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984")
      )
      .exec(http("request_59")
        .get("/ScriptResource.axd?d=nv7asgRUU0tRmHNR2D6t1HncJC0uSlzSoOMFzQL9KDgdtj1yUByaaYlMWCLR1tfb0zRr2KS8GU92MXS6P0lOX_vkDPQOiW6UvV384GibJ__q8DVUhGPtg7X0IEAXecIS6jMaZIGfhYY2bHennMwScvTacu4aYi7pwkjCfDx4XDhghn49oiHENcEjRtCYLFUt0&t=fffffffff6474071")
      )
      .exec(http("request_60")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521")
      )
      .exec(http("request_61")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521")
      )
      .exec(http("request_62")
        .get("/request/leave_form.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False")
      )
      .exec(http("request_63")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521")
      )
      .exec(http("request_64")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521")
      )
      .exec(http("request_65")
        .get("/DXR.axd?r=1_303,1_184,1_297,1_210,1_220,1_187,1_181,1_289,1_287-N3Vxm")
      )
      .exec(http("request_66")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_67")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_68")
        .get(uri3 + "?v=4.7.0")
      )
      .pause(153.milliseconds)
      .exec(http("request_69")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_70")
        .post("/request/get_leave_reason.ashx")

        .formParam("LeaveType", "A")
        .formParam("EmployeeID", "")
        .formParam("EmploymentID", "9126")
        .formParam("EmployeeNo", "")
        .formParam("StartDate", "undefined 00:00")
        .formParam("EndDate", "undefined 00:00")
        .formParam("LocationID", "9"))
      .exec(http("request_71")
        .get("/Notifications/ViewNotifications?type=pK31Nx8RiDklh+Nzy/wha9/8u97VvKFO4g6sNixk36geuos1GK6cPSo3cd2CjIHZbSsj7imooARTFUjpCi2GFpIjiVkxp2pzTBIZE/Hu5124r7D0kWfyfELg27ezyp3gBofAkvZpAUNwcBbbqloj3W9ern5wLZX/Y8JG5I/1Cgk=")
      )
      .exec(http("request_72")
        .get("/Notifications/GetNotificationsList?row=8")
      )
      .pause(2)
      .exec(http("request_73")
        .get(uri4 + "?family=Open+Sans:300,400,600,700")
      )
      .exec(http("request_74")
        .get(uri4 + "?family=Roboto:400,300,500,700")
      )


      .exec(http("Load My Workflow Page Part 2")
        .get("/works/request_lst.aspx")

        .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(|.+?)" />""").saveAs("viewStateWorkflowLS3"))

      )
      .exec(http("request_76")
        .post("/verify_access.ashx")
      )
      .exec(http("request_77")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_78")
        .get(uri3 + "?v=4.7.0")
      )
      .exec(http("request_79")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984")
      )
      .exec(http("request_80")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521")
      )
      .exec(http("request_81")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521")
      )
      .exec(http("request_82")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521")
      )
      .exec(http("request_83")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521")
      )
      .exec(http("request_84")
        .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False")
      )
      .exec(http("request_85")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_86")
        .get("/Notifications/ViewNotifications?type=BkWA71BX8LHzP5HR2tCiL5FzxlBrEGJyDnR/pg+wjvlmC8Z2mwJK0ZIxPu7lK/z78cfuCTos4bCOrVyAI4dHM09IJ2VYaMSK6ilI3QdZhJQS5j2+C9TgEr2E6lPwLeR58QUooHUhCN7xHOq3KpgYdpFFiU4LtKZXCvri8D4mcJo=")
      )
      .exec(http("request_87")
        .get("/Notifications/GetNotificationsList?row=8")
      )
      .pause(1)
  }
  def logout = {
    exec(http("Submit Logout")
      .post("/works/request_lst.aspx")

      .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$lbLogout")
      .formParam("__EVENTARGUMENT", "")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewStateWorkflowLS3}")
      .formParam("__VIEWSTATEGENERATOR", "197FAB68")
      .formParam("ctl00$ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$ctl00$selCountry", "1")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfMode", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfStatus", "[P]")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestID", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selActionType", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestorName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selRequestType", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateFrom", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateTo", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtStatus", "Pending")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$cbStatus$0", "P")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl09$gpCustomPager$txtPageSize", "50")
      .check(status.is(302)))
      .exec(http("Load Login Page Part 2")
        .get("/Account/Login")
      )
      .exec(http("request_71")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
      )
      .exec(http("request_72")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-4WXkk")
      )
      .exec(http("request_73")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-lUXkk")
      )
      .exec(http("request_74")
        .get("/DXR.axd?r=1_58-lUXkk")
      )
      .exec(http("request_75")
        .get("/bundles/jquery?v=w1vknpWt6KqlZcHeJQvaK6VbvvXt1Go8HcGH_DqKzzo1")
      )
      .pause(108.milliseconds)
      .exec(http("request_76")
        .get("/Content/Images/bg-login.jpg?V=03")
      )
      .exec(http("request_77")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
  }
}
