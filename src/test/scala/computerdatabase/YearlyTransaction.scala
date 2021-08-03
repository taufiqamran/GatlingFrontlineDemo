package computerdatabase
import computerdatabase.Module.payrollObject
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import computerdatabase.Module.Login._
import computerdatabase.Module.Leave._
import computerdatabase.Module.Claim._
import computerdatabase.Module.Profile._
import computerdatabase.Module.Workflow._
import computerdatabase.Module.Profile.Report._
import computerdatabase.Module.Leave.Report._
import computerdatabase.Module.Claim.Report._
import computerdatabase.Module.Document._
import computerdatabase.Module.Service._
import computerdatabase.Module.payrollObject._
import scala.concurrent.duration._

class YearlyTransaction extends Simulation{

  val domain = "https://orisoftst.orisoftsaas.com"
  val httpProtocol = http
    .baseUrl(domain)
    .disableFollowRedirect

  //val loginHrFeeder = csv("data/hr_Credential.csv").random
  var searchFeeder = csv("data/userKM.csv").random
  val randomCode = csv("data/randomCode.csv").random
  val profileHrFeeder = csv("data/profileTest.csv").queue

  val loginFeeder8000 = csv("data/EMPLogin1500.csv").random
  //var loginFeeder = csv("data/ESSEMPLogin1000.csv").queue
  var loginFeeder1 = csv("data/ESSEMPLogin1001-2000.csv").queue
  var loginFeeder2 = csv("data/ESSEMPLogin2001-3000.csv").queue
  var loginFeeder3 = csv("data/ESSEMPLogin3001-4000.csv").queue
  var loginFeeder4 = csv("data/ESSEMPLogin4001-5000.csv").queue
  var loginFeeder5 = csv("data/ESSEMPLogin5001-6000.csv").queue
  var loginFeeder6 = csv("data/ESSEMPLogin6001-7000.csv").queue
  var loginFeeder7 = csv("data/ESSEMPLogin7001-7500.csv").queue

  var loginClaimFeeder1 = csv("data/ESSEMPLogin-Claim1-255.csv").random
  var loginClaimFeeder2 = csv("data/ESSEMPLogin-Claim200.csv").queue

  val loginSupFeeder1 = csv("data/superior_Credential.csv").random
  val loginSupFeeder2 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder3 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder4 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder5 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder6 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder7 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder8 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder9 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder10 = csv("data/superior_Credential.csv").queue

  //val loginHrFeeder = csv("data/ESSEMPLogin1000.csv").random
  val loginHrClaimFeeder = csv("data/hrClaim.csv").random
  val loginPayrollFeeder = csv("data/hrPayroll.csv").random


  //No of Users
  val EMPNo = 319
  val SUPNo = 319
  val EMPNoClaim = 319
  val HRNo = 319

  //Duration
  val scriptDuration = 92
  val scriptDuration2 = 173
  val scriptDuration3 = 112
  val scriptDuration4 = 103
  val maxDurationTime = 495

  //val loginHr = feed(loginHrFeeder)exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Employee
  val login = feed(loginFeeder8000).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login1 = feed(loginFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login2 = feed(loginFeeder2).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login3 = feed(loginFeeder3).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login4 = feed(loginFeeder4).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login5 = feed(loginFeeder5).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login6 = feed(loginFeeder6).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login7 = feed(loginFeeder7).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Employee Claim
  val loginClaim = feed(loginClaimFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginClaim2 = feed(loginClaimFeeder2).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Superior
  val loginSup = feed(loginSupFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup1 = feed(loginSupFeeder2).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup2 = feed(loginSupFeeder3).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup3 = feed(loginSupFeeder4).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup4 = feed(loginSupFeeder5).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup5 = feed(loginSupFeeder6).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup6 = feed(loginSupFeeder7).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup7 = feed(loginSupFeeder8).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup8 = feed(loginSupFeeder9).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup9 = feed(loginSupFeeder10).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login HR
  //val loginHr = feed(loginHrFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginHrClaim = feed(loginHrClaimFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginHrPayroll = feed(loginPayrollFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)


  //Claim
  val loadClaimGenerateClaimEntitlement = exec(ClaimGenerateClaimEntitlement.loadApplication, ClaimGenerateClaimEntitlement.GenerateClaimEntitle, ClaimGenerateClaimEntitlement.checkStatusMonito, ClaimGenerateClaimEntitlement.logout)

  //Leave
  val loadLeaveRunCheckLeaveEntitlement = exec(LeaveRunCheckLeaveEntitlement.loadApplication, LeaveRunCheckLeaveEntitlement.logout)
  val loadLeaveKeyInLeave = feed(searchFeeder).exec(LeaveKeyInLeave.loadApplication, LeaveKeyInLeave.search, LeaveKeyInLeave.logout)
  val loadLeaveEntitlementAdjustment = exec(LeaveEntitlementAdjustment.loadApplication, LeaveEntitlementAdjustment.logout)
  val loadLeaveBringForward = exec(LeaveBringForward.loadLeaveEntitlment, LeaveBringForward.selectValue, LeaveBringForward.submitCarryForward, LeaveBringForward.processMonitoring, LeaveBringForward.submitForward, LeaveBringForward.logout)
  val loadLeaveForfeit = exec(LeaveForfeit.loadGenerateForfeit,LeaveForfeit.selectValue, LeaveForfeit.submitForfeit, LeaveForfeit.loadLeavePayback, LeaveForfeit.selectValuePayback,LeaveForfeit.SubmitLeaveForfeit, LeaveForfeit.exportForfeit, LeaveForfeit.processMonitoring, LeaveForfeit.logout)


  //Payroll
  val loadPayrollGeneratePayment = exec(PayrollGeneratePayment.loadApplication, PayrollGeneratePayment.submitPayment, PayrollGeneratePayment.checkStatusMonitor, PayrollGeneratePayment.logout)
  val loadPayrollBankDownload = exec(PayrollBankDownload.BankDownloadSalary, PayrollBankDownload.BankDownloadEPF, PayrollBankDownload.BankDownloadSOCSO, PayrollBankDownload.BankDownloadTAXPCB, PayrollBankDownload.logout)
  val loadPayrollStatutoryDownload = exec(PayrollStatutoryDownload.EPFStatutoryDownload, PayrollStatutoryDownload.SOCSOStatutoryDownload, PayrollStatutoryDownload.EISStatutoryDownload, PayrollStatutoryDownload.TaxStatutoryDownload, PayrollStatutoryDownload.logout)
  val loadPayrollGeneratePayslipPublishOnly = exec(PayrollGeneratePayslipPublishOnly.loadApplication, PayrollGeneratePayslipPublishOnly.generatePayslip, PayrollGeneratePayslipPublishOnly.logout)
  val loadPayrollGeneratePublishPayslip = exec(PayrollGeneratePublishPayslip.loadApplication, PayrollGeneratePublishPayslip.generatePublishedPayslip, PayrollGeneratePublishPayslip.logout)

  //Payroll - 12. Create New Transaction Code
  val objectCreateAllowanceCode = feed(randomCode).exec(PayrollAllowanceCode.openPayrollItem,PayrollAllowanceCode.openAllowance,PayrollAllowanceCode.createAllowance)
  val objectCreateSalaryCode = feed(randomCode).exec(PayrollAllowanceCode.openBasicSalary,PayrollAllowanceCode.openCreateSalary,PayrollAllowanceCode.createSalary)
  val objCreateServiceChargeCode = feed(randomCode).exec(PayrollServiceChargeCode.openServiceChargeTab,PayrollServiceChargeCode.openCreateServiceCharge,PayrollServiceChargeCode.createServiceChargeCode)
  val objectCreateOvertimeCode = feed(randomCode).exec(PayrollOvertimeCode.openOverTimeTab,PayrollOvertimeCode.openCreateOverTime,PayrollOvertimeCode.createOvertimeCode)
  val objectCreateNoPayLeaveCode = feed(randomCode).exec(PayrollNoPayLeave.openCreateNopay,PayrollNoPayLeave.createNoPayLeaveCode)
  val objCreateBonusCode = feed(randomCode).exec(PayrollBonusCode.openBonusTab,PayrollBonusCode.openCreateBonus,PayrollBonusCode.createBonusCode)
  val objCreateDeductionCode = feed(randomCode).exec(PayrollDeductionCode.openDeductionTab,PayrollDeductionCode.openCreateDeduction,PayrollDeductionCode.createDeductionCode)


  //Payroll (Report)
  val loadPayrollRunTransactionListingChecking = exec(PayrollRunTransactionListingChecking.loadApplication, PayrollRunTransactionListingChecking.logout)
  val loadPayrollYearlySlipJawapan = exec(PayrollYearlySlipJawapan.loadApplication,PayrollYearlySlipJawapan.logout)
  val loadPayrollYearlyGenerateEAForm = exec(PayrollYearlyGenerateEAForm.loadApplication, PayrollYearlyGenerateEAForm.logout)
  val loadPayrollYearlyBorangE = exec(PayrollYearlyBorangE.loadApplication, PayrollYearlyBorangE.logout)
  val loadPayrollYearlyBorangCP8D = exec(PayrollYearlyBorangCP8D.loadApplication, PayrollYearlyBorangCP8D.logout)
  val loadPayrollFundTransferReport = exec(PayrollFundTransferReport.loadApplication, PayrollFundTransferReport.logout)
  val loadPayrollTransactionDetailMatrix = exec(PayrollTransactionDetailMatrix.loadApplication, PayrollTransactionDetailMatrix.logout)
  val loadPayrollTransactionDetailSummary = exec(PayrollTransactionDetailSummary.loadApplication, PayrollTransactionDetailSummary.logout)
  val loadPayrollTransactionListing = exec(PayrollTransactionListing.loadApplication, PayrollTransactionListing.logout)



  //Apply Leave
  val applyLeaveSaveDraft = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.saveLeaveDraft,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveDeleteDraft = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.getSavedDraft,ESSEMPApplyLeave.deleteSavedDraft,ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveSubmit = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.submitLeave,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveReset = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveAttachDraft = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.saveLeaveDraft,ESSEMPApplyLeave.leaveLogout)

  //Apply Claim
  val empApplyClaimSaveDraft = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.chooseOpt,ESSEMPApplyClaim.uploadProcess,ESSEMPApplyClaim.submitDraftClaim,ESSEMPApplyClaim.logout1)
  val empApplyClaimDeleteDraft = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.delDraft,ESSEMPApplyClaim.logout1)
  val empApplyClaimSubmit = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.submitClaimLeave,ESSEMPApplyClaim.logout2)
  val empApplyClaimReset = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.chooseOpt ,ESSEMPApplyClaim.uploadProcess,ESSEMPApplyClaim.resetClaim,ESSEMPApplyClaim.logout1)
  val empApplyClaimAttach = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.chooseOpt,ESSEMPApplyClaim.uploadProcess,ESSEMPApplyClaim.submitClaim,ESSEMPApplyClaim.logout2)

  //Sup Leave
  val supMyWorkflowLeaveSave = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.saveLeave,ESSSUPMyWorkflowLeave.logout)
  val supMyWorkflowLeaveReset = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.resetLeave,ESSSUPMyWorkflowLeave.logout)
  val supMyWorkflowLeaveReject = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.rejectLeave,ESSSUPMyWorkflowLeave.logout)
  val supMyWorkflowLeaveApprove = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.approveLeave,ESSSUPMyWorkflowLeave.logout)

  //Sup Claim
  val supMyWorkflowClaimSave = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.claimSaveForm,ESSSUPMyWorkflowClaim.logout)
  val supMyWorkflowClaimReset = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.logout)
  val supMyWorkflowClaimApprove = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.claimApproveForm,ESSSUPMyWorkflowClaim.logout)
  val supMyWorkflowClaimReject = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.claimRejectForm,ESSSUPMyWorkflowClaim.logout)

  val hrEmployeeLeaveApproverListing = exec(EmployeeLeaveApproverListingReport.loadLeaveApproverListing,EmployeeLeaveApproverListingReport.searchFilter,EmployeeLeaveApproverListingReport.clickSearch,EmployeeLeaveApproverListingReport.logout)
  val hrLeaveApplicationReport = exec(LeaveApplicationReport.loadApplicationReport,LeaveApplicationReport.SearchFilterApplication,LeaveApplicationReport.generateReport,LeaveApplicationReport.logout)
  val hrLeaveEntitlementReport = exec(LeaveEntitlementReport.loadLeaveEntitlementReport,LeaveEntitlementReport.searchProcess,LeaveEntitlementReport.submitSearch,LeaveEntitlementReport.logout)
  val hrClaimApplicationReport = exec(ClaimApplicationReport.LoadClaimApplicationView,ClaimApplicationReport.clickSubmit,ClaimApplicationReport.logout)
  val hrExpensesDetailsforFinance = exec(ExpensesDetailsforFinance.loadExpensesDetails,ExpensesDetailsforFinance.submitForm,ExpensesDetailsforFinance.logout)
  val hrExpensesDetailsforClaim = exec(ExpensesDetailsforClaim.loadExpensesDetails,ExpensesDetailsforClaim.submitForm,ExpensesDetailsforClaim.logout)
  val hrEmployeeLeaveBalanceReport = exec(EmployeeLeaveBalanceReport.loadLeaveBalanceReport,EmployeeLeaveBalanceReport.searchFilter,EmployeeLeaveBalanceReport.generateReport,EmployeeLeaveBalanceReport.logout)
  val hrClaimEntitlementReport = exec(ClaimEntitlementReport.loadClaimEntitlementReport,ClaimEntitlementReport.generateReport,ClaimEntitlementReport.logout)


  /////////////////////////////////////////////Daily SCENARIO  (26 scn)/////////////////////////////////////////////////////
  //Apply Leave Execution
  val applyLeaveSaveDraftScenario = scenario("Apply Leave Save Draft").exec(login,applyLeaveSaveDraft)
  val applyLeaveDeleteDraftScenario = scenario("Apply Leave Delete Draft").exec(login,applyLeaveDeleteDraft)
  val applyLeaveSubmitScenario = scenario("Apply Leave Submit").exec(login,applyLeaveSubmit)
  val applyLeaveResetScenario = scenario("Apply Leave Reset").exec(login,applyLeaveReset)
  val applyLeaveAttachDraftScenario = scenario("Apply Leave Attach Draft").exec(login,applyLeaveAttachDraft) //5

  //ESS EMP Claim
  val empApplyClaimSaveDraftScenario = scenario("Apply Claim Save Draft").exec(loginClaim,empApplyClaimSaveDraft)
  val empApplyClaimDeleteDraftScenario = scenario("Apply Claim Delete Draft").exec(loginClaim,empApplyClaimDeleteDraft)
  val empApplyClaimSubmitScenario = scenario("Apply Claim Submit Draft").exec(loginClaim,empApplyClaimSubmit)
  val empApplyClaimResetScenario = scenario("Apply Claim Reset Draft").exec(loginClaim,empApplyClaimReset)
  val empApplyClaimAttachScenario = scenario("Apply Claim Attach Draft").exec(loginClaim,empApplyClaimAttach) //5

  //sup WorkFlow Leave
  val supWorkflowLeaveSaveScenario = scenario("Workflow Leave Save").exec(loginSup,supMyWorkflowLeaveSave)
  val supWorkflowLeaveResetScenario = scenario("Workflow Leave Reset").exec(loginSup,supMyWorkflowLeaveReset)
  val supWorkflowLeaveRejectScenario = scenario("Workflow Leave Reject").exec(loginSup,supMyWorkflowLeaveReject)
  val supWorkflowLeaveApproveScenario = scenario("Workflow Approve Reject").exec(loginSup,supMyWorkflowLeaveApprove) //4

  //sup workflow Claim
  val supWorkflowClaimSaveScenario = scenario("Workflow Claim Save").exec(loginSup,supMyWorkflowClaimSave)
  val supWorkflowClaimResetScenario = scenario("Workflow Claim Reset").exec(loginSup,supMyWorkflowClaimReset)
  val supWorkflowClaimApproveScenario = scenario("Workflow Claim Approve").exec(loginSup,supMyWorkflowClaimApprove)
  val supWorkflowClaimRejectScenario = scenario("Workflow Claim Reject").exec(loginSup,supMyWorkflowClaimReject)  //4

  //HR Profile
  val LeaveEmployeeApproverListingS = scenario("Leave Employee Approver Listing Report").exec(loginHrClaim,hrEmployeeLeaveApproverListing)
  val LeaveApplicationReportListingS = scenario("Leave Leave Application Report").exec(loginHrClaim,hrLeaveApplicationReport)
  val LeaveEntitlementReportListingS = scenario("Leave Leave Entitlement Report").exec(loginHrClaim,hrLeaveEntitlementReport)
  val ClaimApplicationReportListingS = scenario("Claim Application Report").exec(loginHrClaim,hrClaimApplicationReport)
  val ExpensesDetailsforFinanceListingS = scenario("Expenses Details For Finance").exec(loginHrClaim,hrExpensesDetailsforFinance)
  val ExpensesDetailsforClaimListingS = scenario("Expenses Details For Claim").exec(loginHrClaim,hrExpensesDetailsforClaim)
  val EmployeeLeaveBalanceReportS = scenario("Employee Leave Balance Report").exec(loginHrClaim,hrEmployeeLeaveBalanceReport)
  val ClaimEntitlementReportS = scenario("Claim entitlement Report").exec(loginHrClaim,hrClaimEntitlementReport)  //8


  /////////////////////////////////////////////Monthly SCENARIO  (21 scn)/////////////////////////////////////////////////////
  //Claim Scenario
  val scnClaimGenerateClaimEntitlement = scenario("ClaimGenerateClaimEntitlement").exec(loginHrClaim, loadClaimGenerateClaimEntitlement) //1

  //Leave Scenario
  val scnLeaveRunCheckLeaveEntitlement = scenario("LeaveRunCheckLeaveEntitlement").exec(loginHrClaim, loadLeaveRunCheckLeaveEntitlement)
  val scnLeaveKeyInLeave = scenario("KeyInLeave").exec(loginHrClaim, loadLeaveKeyInLeave)
  val scnLeaveEntitlementAdjustment = scenario("LeaveEntitlementAdjustment").exec(loginHrClaim, loadLeaveEntitlementAdjustment)
  val scnLeaveBringForward = scenario("LeaveBringForward").exec(loginHrClaim,loadLeaveBringForward)
  val scnLeaveForfeit = scenario("LeaveForfeit").exec(loginHrClaim,loadLeaveForfeit)  //5

  //Payroll Scenario
  val scnPayrollGeneratePayment =scenario("PayrollGeneratePayment").exec(loginHrPayroll, loadPayrollGeneratePayment)
  val scnPayrollBankDownload =scenario("PayrollBankDownload").exec(loginHrPayroll, loadPayrollBankDownload)
  val scnPayrollStatutoryDownload =scenario("PayrollStatutoryDownload").exec(loginHrPayroll, loadPayrollStatutoryDownload)
  val scnPayrollGeneratePublishPayslip =scenario("PayrollGeneratePublishPayslip").exec(loginHrPayroll, loadPayrollGeneratePublishPayslip)
  /*val payrollDeductionCode = scenario("Craete Deduction Code").exec(loginHrPayroll,objCreateDeductionCode)
  val payrollCreateServiceCode = scenario("Create SErvice Code").exec(loginHrPayroll,objCreateServiceChargeCode)
  val payrollCreateOvertimeCode = scenario("Create Overtime Code").exec(loginHrPayroll,objectCreateOvertimeCode)
  val payrollCreateNopayLeaveCode = scenario("Create No pay Leave Code").exec(loginHrPayroll,objectCreateNoPayLeaveCode)
  val payrollCreateBonusCode = scenario("Create Bonus Code").exec(loginHrPayroll,objCreateBonusCode)
  val payrollCraeteSalaryCode = scenario("Create Salary Code").exec(loginHrPayroll,objectCreateSalaryCode)
  val payrollCreateAllowanceCode = scenario("Create Allowance Code").exec(loginHrPayroll,objectCreateAllowanceCode)*/
  val scnPayrollCreateTransactionCode = scenario("Create Transaction Code").exec(loginHrPayroll,objectCreateAllowanceCode,objectCreateSalaryCode,objCreateBonusCode,objectCreateNoPayLeaveCode,objectCreateOvertimeCode,objCreateServiceChargeCode,objCreateDeductionCode) //5


  //Payroll Scenario(Report)
  val scnPayrollFundTransferReport = scenario("PayrollFundTransferReport").exec(loginHrPayroll, loadPayrollFundTransferReport)
  val scnPayrollTransactionDetailMatrix = scenario("PayrollTransactionDetailMatrix").exec(loginHrPayroll, loadPayrollTransactionDetailMatrix)
  val scnPayrollTransactionDetailSummary = scenario("PayrollTransactionDetailSummary").exec(loginHrPayroll, loadPayrollTransactionDetailSummary)
  val scnPayrollTransactionListing = scenario("PayrollTransactionListing").exec(loginHrPayroll, loadPayrollTransactionListing)
  val scnPayrollGeneratePayslipPublishOnly = scenario("PayrollGeneratePayslipPublishOnly").exec(loginHrPayroll, loadPayrollGeneratePayslipPublishOnly)
  val scnPayrollRunTransactionListingChecking = scenario("PayrollRunTransactionListingChecking").exec(loginHrPayroll, loadPayrollRunTransactionListingChecking)
  val scnPayrollYearlySlipJawapan = scenario("PayrollYearlySlipJawapan").exec(loginHrPayroll, loadPayrollYearlySlipJawapan)
  val scnPayrollYearlyGenerateEAForm = scenario("PayrollYearlyGenerateEAForm").exec(loginHrPayroll, loadPayrollYearlyGenerateEAForm)
  val scnPayrollYearlyBorangE = scenario("PayrollYearlyBorangE").exec(loginHrPayroll, loadPayrollYearlyBorangE)
  val scnPayrollYearlyBorangCP8D = scenario("PayrollYearlyBorangCP8D").exec(loginHrPayroll, loadPayrollYearlyBorangCP8D) //10

  setUp(
    applyLeaveSaveDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    applyLeaveSubmitScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    applyLeaveAttachDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    applyLeaveResetScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimSaveDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimResetScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimAttachScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimSubmitScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    LeaveEmployeeApproverListingS.inject(rampUsers(HRNo).during(scriptDuration.minutes))   //9
      .andThen(
        supWorkflowLeaveSaveScenario.inject(rampUsers(HRNo).during(scriptDuration2.minutes)),
        supWorkflowLeaveResetScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        supWorkflowLeaveRejectScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        supWorkflowLeaveApproveScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        supWorkflowClaimSaveScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        supWorkflowClaimResetScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        supWorkflowClaimRejectScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        supWorkflowClaimApproveScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        applyLeaveDeleteDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        empApplyClaimDeleteDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        LeaveApplicationReportListingS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        LeaveEntitlementReportListingS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        ClaimApplicationReportListingS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        ExpensesDetailsforFinanceListingS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        ExpensesDetailsforClaimListingS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        EmployeeLeaveBalanceReportS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        ClaimEntitlementReportS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)) //17
          .andThen(
            scnClaimGenerateClaimEntitlement.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveRunCheckLeaveEntitlement.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveKeyInLeave.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveEntitlementAdjustment.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveBringForward.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveForfeit.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollGeneratePayment.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollBankDownload.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollStatutoryDownload.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollGeneratePublishPayslip.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollCreateTransactionCode.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)) //11
              .andThen(
                scnPayrollFundTransferReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionDetailMatrix.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionDetailSummary.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionListing.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollGeneratePayslipPublishOnly.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollYearlyBorangE.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollYearlyGenerateEAForm.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollYearlyBorangCP8D.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollYearlySlipJawapan.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollRunTransactionListingChecking.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)) //10
              )
          )
      )
  ).maxDuration(maxDurationTime.minutes).protocols(httpProtocol)

  //setUp(scnProfileAmendment.inject(rampUsers(EMPNo).during(scriptDuration.minutes))).maxDuration(maxDurationTime.minutes).protocols(httpProtocol)
}
