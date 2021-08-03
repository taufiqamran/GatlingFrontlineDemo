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
import profileObject.ProfileDelete

import scala.concurrent.duration._

class NewMonthlyTransaction extends Simulation{

  val domain = "https://orisoftst.orisoftsaas.com"
  val httpProtocol = http
    .baseUrl(domain)
    .disableFollowRedirect

  //val loginHrFeeder = csv("data/hr_Credential.csv").random
  var searchFeeder = csv("data/userKM.csv").random
  val randomCode = csv("data/randomCode.csv").random


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
  val loginHrTestFeeder = csv("data/hrClaim.csv").random


  //No of Users
  val EMPNo = 161
  val SUPNo = 161
  val EMPNoClaim = 161
  val HRNo = 161

  //Duration
  val scriptDuration = 67
  val scriptDuration2 = 108
  val scriptDuration3 = 93
  val scriptDuration4 = 212
  val maxDurationTime = 495

  val delDuration = 60

  //val loginHr = feed(loginHrFeeder)exec(Login.loginProcess).exec(Login.loadDashboard)
  val profileHrFeeder = csv("data/profileTest.csv").readRecords.take(EMPNo)
  val profileUsed = profileHrFeeder.toArray

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
  val loginHrTest = feed(loginHrTestFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginHrClaim = feed(loginHrClaimFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginHrPayroll = feed(loginPayrollFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)


  //Claim
  val loadClaimGenerateClaimEntitlement = exec(ClaimGenerateClaimEntitlement.loadApplication, ClaimGenerateClaimEntitlement.GenerateClaimEntitle, ClaimGenerateClaimEntitlement.checkStatusMonito, ClaimGenerateClaimEntitlement.logout)
  val loadClaimKeyInClaim = exec(ClaimKeyInClaim.loadApplication,ClaimKeyInClaim.filterByEmp,ClaimKeyInClaim.submitUpdateApp,ClaimKeyInClaim.listingTab,ClaimKeyInClaim.filterByPend, ClaimKeyInClaim.logout)

  //Leave
  val loadLeaveRunCheckLeaveEntitlement = exec(LeaveRunCheckLeaveEntitlement.loadApplication, LeaveRunCheckLeaveEntitlement.logout)
  val loadLeaveKeyInLeave = feed(searchFeeder).exec(LeaveKeyInLeave.loadApplication, LeaveKeyInLeave.search, LeaveKeyInLeave.logout)
  val loadLeaveEntitlementAdjustment = exec(LeaveEntitlementAdjustment.loadApplication, LeaveEntitlementAdjustment.logout)
  val loadLeavePosting = exec(LeavePosting.loadApplication, LeavePosting.logout)
  val loadLeavePostedListing = exec(LeavePostedListing.loadApplication, LeavePostedListing.logout)
  val loadLeaveBringForward = exec(LeaveBringForward.loadLeaveEntitlment, LeaveBringForward.selectValue, LeaveBringForward.submitCarryForward, LeaveBringForward.processMonitoring, LeaveBringForward.submitForward, LeaveBringForward.logout)
  val loadLeaveForfeit = exec(LeaveForfeit.loadGenerateForfeit,LeaveForfeit.selectValue, LeaveForfeit.submitForfeit, LeaveForfeit.loadLeavePayback, LeaveForfeit.selectValuePayback,LeaveForfeit.SubmitLeaveForfeit, LeaveForfeit.exportForfeit, LeaveForfeit.processMonitoring, LeaveForfeit.logout)


  //Payroll
  val loadPayrollGeneratePayment = exec(PayrollGeneratePayment.loadApplication, PayrollGeneratePayment.submitPayment, PayrollGeneratePayment.checkStatusMonitor, PayrollGeneratePayment.logout)
  val loadPayrollBankDownload = exec(PayrollBankDownload.BankDownloadSalary, PayrollBankDownload.BankDownloadEPF, PayrollBankDownload.BankDownloadSOCSO, PayrollBankDownload.BankDownloadTAXPCB, PayrollBankDownload.logout)
  val loadPayrollStatutoryDownload = exec(PayrollStatutoryDownload.EPFStatutoryDownload, PayrollStatutoryDownload.SOCSOStatutoryDownload, PayrollStatutoryDownload.EISStatutoryDownload, PayrollStatutoryDownload.TaxStatutoryDownload, PayrollStatutoryDownload.logout)
  val loadPayrollGeneratePayslipPublishOnly = exec(PayrollGeneratePayslipPublishOnly.loadApplication, PayrollGeneratePayslipPublishOnly.generatePayslip, PayrollGeneratePayslipPublishOnly.logout)
  val loadPayrollGeneratePublishPayslip = exec(PayrollGeneratePublishPayslip.loadApplication, PayrollGeneratePublishPayslip.generatePublishedPayslip, PayrollGeneratePublishPayslip.logout)

  val loadPayrollDownloadUploadCheckADOL = exec(PayrollUpload.loadPayrollUpload, PayrollUpload.uploadExcelFile,PayrollUpload.submitPayroll,PayrollUpload.logout)
  val loadPayrollKeyinAdol = exec(PayrollKeyInADOL.loadApplication,PayrollKeyInADOL.openPayrollId,PayrollKeyInADOL.updatePayrollAdol,PayrollKeyInADOL.logout)
  val loadPayrollDeleteAndMovePayroll = exec(PayrollDeleteAndMovePayroll.loadPayrollDelete, PayrollDeleteAndMovePayroll.filterPayroll, PayrollDeleteAndMovePayroll.deletePayroll, PayrollDeleteAndMovePayroll.logout)


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
  val loadPayrollEFormBorangE = exec(PayrollEFormBorangE.loadApplication, PayrollEFormBorangE.logout)
  val loadPayrollEpfSocsoPayReport = exec(PayrollEpfSocsoPayReport.loadApplication, PayrollEpfSocsoPayReport.logout)
  val loadPayrollIncomeTaxCalculationReport = exec(PayrollIncomeTaxCalculationReport.loadApplication, PayrollIncomeTaxCalculationReport.logout)
  val loadPayrollPaymentAdviceReport = exec(PayrollPaymentAdviceReport.loadApplication, PayrollPaymentAdviceReport.logout)
  val loadPayrollCostReportByCategory = exec(PayrollCostReportByCategory.loadApplication, PayrollCostReportByCategory.logout)
  val loadPayrollCostReportByDepartment = exec(PayrollCostReportByDepartment.loadApplication, PayrollCostReportByDepartment.logout)
  val loadPayrollDetailListingReport = exec(PayrollDetailListingReport.loadApplication, PayrollDetailListingReport.logout)
  val loadPayrollReconciliationReport = exec(PayrollReconciliationReport.loadApplication, PayrollReconciliationReport.logout)
  val loadPayrollSummaryReport = exec(PayrollSummaryReport.loadApplication, PayrollSummaryReport.logout)
  val loadPayrollYTDAnalysisReport = exec(PayrollYTDAnalysisReport.loadApplication, PayrollYTDAnalysisReport.logout)
  val loadPayrollSalaryPayoutReport = exec(PayrollSalaryPayoutReport.loadApplication, PayrollSalaryPayoutReport.logout)
  val loadPayrollSpecificTransactionListingReport = exec(PayrollSpecificTransactionListingReport.loadApplication, PayrollSpecificTransactionListingReport.logout)
  val loadPayrollTransactionAnalysisReport = exec(PayrollTransactionAnalysisReport.loadApplication, PayrollTransactionAnalysisReport.logout)
  val loadPayrollTransactionEntryListingReport = exec(PayrollTransactionEntryListingReport.loadApplication, PayrollTransactionEntryListingReport.logout)
  val loadPayrollBorang2 = exec(PayrollBorang2.loadApplication, PayrollBorang2.logout)
  val loadPayrollBorang3 = exec(PayrollBorang3.loadApplication, PayrollBorang3.logout)
  val loadPayrollBorang8A = exec(PayrollBorang8A.loadApplication, PayrollBorang8A.logout)
  val loadPayrollBorang8B = exec(PayrollBorang8B.loadApplication, PayrollBorang8B.logout)
  val loadPayrollBorangA = exec(PayrollBorangA.loadApplication, PayrollBorangA.logout)
  val loadPayrollBorangCP21 = exec(PayrollBorangCP21.loadApplication, PayrollBorangCP21.logout)
  val loadPayrollBorangCP22 = exec(PayrollBorangCP22.loadApplication, PayrollBorangCP22.logout)
  val loadPayrollBorangCP22A = exec(PayrollBorangCP22A.loadApplication, PayrollBorangCP22A.logout)
  val loadPayrollBorangCP39 = exec(PayrollBorangCP39.loadApplication, PayrollBorangCP39.logout)
  val loadPayrollBorangPendaftaranPekerjaAsing = exec(PayrollBorangPendaftaranPekerjaAsing.loadApplication, PayrollBorangPendaftaranPekerjaAsing.logout)
  val loadPayrollBorangPTPTN = exec(PayrollBorangPTPTN.loadApplication, PayrollBorangPTPTN.logout)
  val loadPayrollBorangSIP2 = exec(PayrollBorangSIP2.loadApplication, PayrollBorangSIP2.logout)
  val loadPayrollBorangSIP2A = exec(PayrollBorangSIP2A.loadApplication, PayrollBorangSIP2A.logout)
  val loadPayrollBorangTabungHaji = exec(PayrollBorangTabungHaji.loadApplication, PayrollBorangTabungHaji.logout)
  val loadPayrollBorangZakatSelangor = exec(PayrollBorangZakatSelangor.loadApplication, PayrollBorangZakatSelangor.logout)
  val loadPayrollBorangZakatWP = exec(PayrollBorangZakatWP.loadApplication, PayrollBorangZakatWP.logout)
  val loadPayrollHRDFundReport = exec(PayrollHRDFundReport.loadApplication, PayrollHRDFundReport.logout)
  val loadPayrollBorangButiranGajiDanCaruman = exec(PayrollBorangButiranGajiDanCaruman.loadApplication, PayrollBorangButiranGajiDanCaruman.logout)
  val loadPayrollBorangLampiran1Arrears = exec(PayrollBorangLampiran1Arrears.loadApplication, PayrollBorangLampiran1Arrears.logout)
  val loadPayrollBorangLampiran1 = exec(PayrollBorangLampiran1.loadApplication, PayrollBorangLampiran1.logout)
  val loadPayrollFundTransferReport = exec(PayrollFundTransferReport.loadApplication, PayrollFundTransferReport.logout)
  val loadPayrollTransactionDetailMatrix = exec(PayrollTransactionDetailMatrix.loadApplication, PayrollTransactionDetailMatrix.logout)
  val loadPayrollTransactionDetailSummary = exec(PayrollTransactionDetailSummary.loadApplication, PayrollTransactionDetailSummary.logout)
  val loadPayrollTransactionListing = exec(PayrollTransactionListing.loadApplication, PayrollTransactionListing.logout)



  //Profile
  val loadProfileCreate = feed(profileUsed)exec(ProfileCreate.loadApplication, ProfileCreate.submitEmpPDetails, ProfileCreate.submitEmployDetails, ProfileCreate.logout)
  val loadProfileAmendment = feed(profileUsed)exec(ProfileAmendment.loadEmployeePage, ProfileAmendment.searchFilterAndGetUser, ProfileAmendment.loadEmployeeDetailsPersonalTab, ProfileAmendment.openStatutoryTab, ProfileAmendment.changeEpfNo, ProfileAmendment.changeEpfRate, ProfileAmendment.loadEmploymentTab, ProfileAmendment.changeSuperiorLeaveGroup, ProfileAmendment.changePaymentMethod, ProfileAmendment.logout)
  val loadProfileKeyInPromotionMovementService = feed(profileUsed)exec(ProfileKeyInPromotionMovementService.loadApplication, ProfileKeyInPromotionMovementService.EmploymentTabPromo, ProfileKeyInPromotionMovementService.saveEmploymentChange, ProfileKeyInPromotionMovementService.checkLogService, ProfileKeyInPromotionMovementService.logout)
  val loadProfileKeyInIncrementMovementService =  feed(profileUsed)exec(ProfileKeyInincrementMovementService.loadApplication,ProfileKeyInincrementMovementService.incrementApplication,ProfileKeyInincrementMovementService.logout)
  val loadProfileKeyInTransferMovementService =  feed(profileUsed)exec(ProfileKeyinTransferMovementService.loadApplication,ProfileKeyinTransferMovementService.transfer,ProfileKeyinTransferMovementService.logout)
  val loadProfileKeyInResignationMovementService = feed(profileUsed)exec(ProfileKeyInResignationMovementService.loadApplication, ProfileKeyInResignationMovementService.changePaymentMode, ProfileKeyInResignationMovementService.keyInResign, ProfileKeyInResignationMovementService.checkLogService, ProfileKeyInResignationMovementService.logout)
  val loadProfileKeyInRehiringMovementService = feed(profileUsed)exec(ProfileKeyInRehiringMovementService.loadApplication,ProfileKeyInRehiringMovementService.EmploymentTabRehire,ProfileKeyInRehiringMovementService.fillRehireInfo,ProfileKeyInRehiringMovementService.saveRehireInfo,ProfileKeyInRehiringMovementService.checkLogService,ProfileKeyInRehiringMovementService.checkLogService,ProfileKeyInRehiringMovementService.logout) //7

  val loadProfileDelete = feed(profileUsed)exec(ProfileDelete.loadApplication, ProfileDelete.deleteProfile, ProfileDelete.logout)

  //HR profile
  val profileAmendmentPayment = exec(ProfileAmendment.loadEmployeePage,ProfileAmendment.searchFilterAndGetUser,ProfileAmendment.loadEmployeeDetailsPersonalTab,ProfileAmendment.loadEmploymentTab,ProfileAmendment.changePaymentMethod,ProfileAmendment.loadEmploymentTab,ProfileAmendment.logout)
  val profileAmendmentEPFNo = exec(ProfileAmendment.loadEmployeePage,ProfileAmendment.searchFilterAndGetUser,ProfileAmendment.loadEmployeeDetailsPersonalTab,ProfileAmendment.openStatutoryTab,ProfileAmendment.changeEpfNo,ProfileAmendment.loadEmploymentTab,ProfileAmendment.changeSuperiorLeaveGroup,ProfileAmendment.logout)
  val profileAmendmentEPFRate = exec(ProfileAmendment.loadEmployeePage,ProfileAmendment.searchFilterAndGetUser,ProfileAmendment.loadEmployeeDetailsPersonalTab,ProfileAmendment.openStatutoryTab,ProfileAmendment.changeEpfRate,ProfileAmendment.logout) //3

  //Apply Leave
  val applyLeaveSaveDraft = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.saveLeaveDraft,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveDeleteDraft = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.getSavedDraft,ESSEMPApplyLeave.deleteSavedDraft,ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveSubmit = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.submitLeave,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveReset = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.leaveLogout)
  val applyLeaveAttachDraft = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.saveLeaveDraft,ESSEMPApplyLeave.leaveLogout) //5

  //Apply Claim
  val empApplyClaimSaveDraft = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.chooseOpt,ESSEMPApplyClaim.uploadProcess,ESSEMPApplyClaim.submitDraftClaim,ESSEMPApplyClaim.logout1)
  val empApplyClaimDeleteDraft = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.delDraft,ESSEMPApplyClaim.logout1)
  val empApplyClaimSubmit = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.submitClaimLeave,ESSEMPApplyClaim.logout2)
  val empApplyClaimReset = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.chooseOpt ,ESSEMPApplyClaim.uploadProcess,ESSEMPApplyClaim.resetClaim,ESSEMPApplyClaim.logout1)
  val empApplyClaimAttach = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.chooseOpt,ESSEMPApplyClaim.uploadProcess,ESSEMPApplyClaim.submitClaim,ESSEMPApplyClaim.logout2) //5

  //Sup Leave
  val supMyWorkflowLeaveSave = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.saveLeave,ESSSUPMyWorkflowLeave.logout)
  val supMyWorkflowLeaveReset = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.resetLeave,ESSSUPMyWorkflowLeave.logout)
  val supMyWorkflowLeaveReject = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.rejectLeave,ESSSUPMyWorkflowLeave.logout)
  val supMyWorkflowLeaveApprove = exec(ESSSUPMyWorkflowLeave.loadApplication,ESSSUPMyWorkflowLeave.searchCrit,ESSSUPMyWorkflowLeave.approveLeave,ESSSUPMyWorkflowLeave.logout) //4

  //Sup Claim
  val supMyWorkflowClaimSave = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.claimSaveForm,ESSSUPMyWorkflowClaim.logout)
  val supMyWorkflowClaimReset = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.logout)
  val supMyWorkflowClaimApprove = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.claimApproveForm,ESSSUPMyWorkflowClaim.logout)
  val supMyWorkflowClaimReject = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.searchClaimApplication,ESSSUPMyWorkflowClaim.clickFirstClaimRow,ESSSUPMyWorkflowClaim.claimRejectForm,ESSSUPMyWorkflowClaim.logout) //4

  val hrEmployeeLeaveApproverListing = exec(EmployeeLeaveApproverListingReport.loadLeaveApproverListing,EmployeeLeaveApproverListingReport.searchFilter,EmployeeLeaveApproverListingReport.clickSearch,EmployeeLeaveApproverListingReport.logout)
  val hrLeaveApplicationReport = exec(LeaveApplicationReport.loadApplicationReport,LeaveApplicationReport.SearchFilterApplication,LeaveApplicationReport.generateReport,LeaveApplicationReport.logout)
  val hrLeaveEntitlementReport = exec(LeaveEntitlementReport.loadLeaveEntitlementReport,LeaveEntitlementReport.searchProcess,LeaveEntitlementReport.submitSearch,LeaveEntitlementReport.logout)
  val hrClaimApplicationReport = exec(ClaimApplicationReport.LoadClaimApplicationView,ClaimApplicationReport.clickSubmit,ClaimApplicationReport.logout)
  val hrExpensesDetailsforFinance = exec(ExpensesDetailsforFinance.loadExpensesDetails,ExpensesDetailsforFinance.submitForm,ExpensesDetailsforFinance.logout)
  val hrExpensesDetailsforClaim = exec(ExpensesDetailsforClaim.loadExpensesDetails,ExpensesDetailsforClaim.submitForm,ExpensesDetailsforClaim.logout)
  val hrEmployeeLeaveBalanceReport = exec(EmployeeLeaveBalanceReport.loadLeaveBalanceReport,EmployeeLeaveBalanceReport.searchFilter,EmployeeLeaveBalanceReport.generateReport,EmployeeLeaveBalanceReport.logout)
  val hrClaimEntitlementReport = exec(ClaimEntitlementReport.loadClaimEntitlementReport,ClaimEntitlementReport.generateReport,ClaimEntitlementReport.logout) //8



  /////////////////////DAILY SCENARIO (29 scn)/////////////////
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
  val supWorkflowLeaveApproveScenario = scenario("Workflow Approve Reject").exec(loginSup,supMyWorkflowLeaveApprove)  //4

  //sup workflow Claim
  val supWorkflowClaimSaveScenario = scenario("Workflow Claim Save").exec(loginSup,supMyWorkflowClaimSave)
  val supWorkflowClaimResetScenario = scenario("Workflow Claim Reset").exec(loginSup,supMyWorkflowClaimReset)
  val supWorkflowClaimApproveScenario = scenario("Workflow Claim Approve").exec(loginSup,supMyWorkflowClaimApprove)
  val supWorkflowClaimRejectScenario = scenario("Workflow Claim Reject").exec(loginSup,supMyWorkflowClaimReject)  //4

  //HR
  val profileAmendmentPaymentScenario = scenario("Amend Payment Method").exec(loginHrPayroll,profileAmendmentPayment)
  val profileAmendmentEPFRateScenario = scenario("Amend EPF Rate").exec(loginHrPayroll,profileAmendmentEPFRate)
  val profileAmendmentEPFNoScenario = scenario("Amend EPF NO ").exec(loginHrPayroll,profileAmendmentEPFNo) //3

  //HR Profile
  val LeaveEmployeeApproverListingS = scenario("Leave Employee Approver Listing Report").exec(loginHrClaim,hrEmployeeLeaveApproverListing)
  val LeaveApplicationReportListingS = scenario("Leave Leave Application Report").exec(loginHrClaim,hrLeaveApplicationReport)
  val LeaveEntitlementReportListingS = scenario("Leave Leave Entitlement Report").exec(loginHrClaim,hrLeaveEntitlementReport)
  val ClaimApplicationReportListingS = scenario("Claim Application Report").exec(loginHrClaim,hrClaimApplicationReport)
  val ExpensesDetailsforFinanceListingS = scenario("Expenses Details For Finance").exec(loginHrClaim,hrExpensesDetailsforFinance)
  val ExpensesDetailsforClaimListingS = scenario("Expenses Details For Claim").exec(loginHrClaim,hrExpensesDetailsforClaim)
  val EmployeeLeaveBalanceReportS = scenario("Employee Leave Balance Report").exec(loginHrClaim,hrEmployeeLeaveBalanceReport)
  val ClaimEntitlementReportS = scenario("Claim entitlement Report").exec(loginHrClaim,hrClaimEntitlementReport)  //8

  /////////////////////////////////////////////MONTHLY SCENARIO (64 scn)/////////////////////////////////////////////////////
  //Claim Scenario
  val scnClaimGenerateClaimEntitlement = scenario("ClaimGenerateClaimEntitlement").exec(loginHrClaim, loadClaimGenerateClaimEntitlement)
  val scnClaimKeyInClaim = scenario("ClaimKeyInClaim").exec(loginHrTest,loadClaimKeyInClaim) //2
  //Leave Scenario
  val scnLeaveRunCheckLeaveEntitlement = scenario("LeaveRunCheckLeaveEntitlement").exec(loginHrClaim, loadLeaveRunCheckLeaveEntitlement)
  val scnLeaveKeyInLeave = scenario("KeyInLeave").exec(loginHrClaim, loadLeaveKeyInLeave)
  val scnLeaveEntitlementAdjustment = scenario("LeaveEntitlementAdjustment").exec(loginHrClaim, loadLeaveEntitlementAdjustment)
  val scnLeavePosting = scenario("LeavePosting").exec(loginHrClaim, loadLeavePosting)
  val scnLeavePostedListing = scenario("LeavePostedListing").exec(loginHrClaim, loadLeavePostedListing)
  val scnLeaveBringForward = scenario("LeaveBringForward").exec(loginHrClaim,loadLeaveBringForward)
  val scnLeaveForfeit = scenario("LeaveForfeit").exec(loginHrClaim,loadLeaveForfeit) //7


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

  val scnPayrollUploard = scenario("Upload Adol").exec(loginHrPayroll,loadPayrollDownloadUploadCheckADOL)
  val scnKeyInPayroll = scenario("Key In Adol").exec(loginHrPayroll,loadPayrollKeyinAdol)
  val scnPayrollDeleteAndMovePayroll = scenario("PayrollDeleteAndMovePayroll").exec(loginHrPayroll, loadPayrollDeleteAndMovePayroll) //7

  //Payroll - 12. Create New Transaction Code Scenario
  val scnPayrollCreateTransactionCode = scenario("Create Transaction Code").exec(loginHrPayroll,objectCreateAllowanceCode,objectCreateSalaryCode,objCreateBonusCode,objectCreateNoPayLeaveCode,objectCreateOvertimeCode,objCreateServiceChargeCode,objCreateDeductionCode) // 1



  //Payroll Scenario(Report)
  val scnPayrollEpfSocsoPayReport = scenario("PayrollEpfSocsoPayReport").exec(loginHrPayroll, loadPayrollEpfSocsoPayReport)
  val scnPayrollIncomeTaxCalculationReport = scenario("PayrollIncomeTaxCalculationReport").exec(loginHrPayroll, loadPayrollIncomeTaxCalculationReport)
  val scnPayrollPaymentAdviceReport = scenario("PayrollPaymentAdviceReport").exec(loginHrPayroll, loadPayrollPaymentAdviceReport)
  val scnPayrollCostReportByCategory = scenario("PayrollCostReportByCategory").exec(loginHrPayroll, loadPayrollCostReportByCategory)
  val scnPayrollCostReportByDepartment = scenario("PayrollCostReportByDepartment").exec(loginHrPayroll, loadPayrollCostReportByDepartment)
  val scnPayrollDetailListingReport = scenario("PayrollDetailListingReport ").exec(loginHrPayroll, loadPayrollDetailListingReport )
  val scnPayrollReconciliationReport = scenario("PayrollReconciliationReport").exec(loginHrPayroll, loadPayrollReconciliationReport)
  val scnPayrollSummaryReport = scenario("PayrollSummaryReport").exec(loginHrPayroll, loadPayrollSummaryReport)
  val scnPayrollYTDAnalysisReport = scenario("PayrollYTDAnalysisReport").exec(loginHrPayroll, loadPayrollYTDAnalysisReport)
  val scnPayrollSalaryPayoutReport = scenario("PayrollSalaryPayoutReport").exec(loginHrPayroll, loadPayrollSalaryPayoutReport)
  val scnPayrollSpecificTransactionListingReport = scenario("PayrollSpecificTransactionListingReport").exec(loginHrPayroll, loadPayrollSpecificTransactionListingReport)
  val scnPayrollTransactionAnalysisReport = scenario("PayrollTransactionAnalysisReport").exec(loginHrPayroll, loadPayrollTransactionAnalysisReport)
  val scnPayrollTransactionEntryListingReport = scenario("PayrollTransactionEntryListingReport").exec(loginHrPayroll, loadPayrollTransactionEntryListingReport)
  val scnPayrollBorang2 = scenario("PayrollBorang2").exec(loginHrPayroll, loadPayrollBorang2)
  val scnPayrollBorang3 = scenario("PayrollBorang3").exec(loginHrPayroll, loadPayrollBorang3)
  val scnPayrollBorang8A = scenario("PayrollBorang8A ").exec(loginHrPayroll, loadPayrollBorang8A )
  val scnPayrollBorang8B = scenario("PayrollBorang8B").exec(loginHrPayroll, loadPayrollBorang8B)
  val scnPayrollBorangA = scenario("PayrollBorangA").exec(loginHrPayroll, loadPayrollBorangA)
  val scnPayrollBorangCP21 = scenario("PayrollBorangCP21").exec(loginHrPayroll, loadPayrollBorangCP21)
  val scnPayrollBorangCP22 = scenario("PayrollBorangCP22").exec(loginHrPayroll, loadPayrollBorangCP22)
  val scnPayrollBorangCP22A = scenario("PayrollBorangCP22A").exec(loginHrPayroll, loadPayrollBorangCP22A)
  val scnPayrollBorangCP39 = scenario("PayrollBorangCP39").exec(loginHrPayroll, loadPayrollBorangCP39)
  val scnPayrollBorangPendaftaranPekerjaAsing = scenario("PayrollBorangPendaftaranPekerjaAsing").exec(loginHrPayroll, loadPayrollBorangPendaftaranPekerjaAsing)
  val scnPayrollBorangPTPTN = scenario("PayrollBorangPTPTN").exec(loginHrPayroll, loadPayrollBorangPTPTN)
  val scnPayrollBorangSIP2 = scenario("PayrollBorangSIP2").exec(loginHrPayroll, loadPayrollBorangSIP2)
  val scnPayrollBorangSIP2A = scenario("PayrollBorangSIP2A").exec(loginHrPayroll, loadPayrollBorangSIP2A)
  val scnPayrollBorangTabungHaji = scenario("PayrollBorangTabungHaji").exec(loginHrPayroll, loadPayrollBorangTabungHaji)
  val scnPayrollBorangZakatSelangor = scenario("PayrollBorangZakatSelangor").exec(loginHrPayroll, loadPayrollBorangZakatSelangor)
  val scnPayrollBorangZakatWP = scenario("PayrollBorangZakatWP").exec(loginHrPayroll, loadPayrollBorangZakatWP)
  val scnPayrollHRDFundReport = scenario("PayrollHRDFundReport").exec(loginHrPayroll, loadPayrollHRDFundReport)
  val scnPayrollBorangButiranGajiDanCaruman = scenario("PayrollBorangButiranGajiDanCaruman").exec(loginHrPayroll, loadPayrollBorangButiranGajiDanCaruman)
  val scnPayrollBorangLampiran1Arrears = scenario("PayrollBorangLampiran1Arrears").exec(loginHrPayroll, loadPayrollBorangLampiran1Arrears)
  val scnPayrollBorangLampiran1 = scenario("PayrollBorangLampiran1").exec(loginHrPayroll, loadPayrollBorangLampiran1)
  val scnPayrollFundTransferReport = scenario("PayrollFundTransferReport").exec(loginHrPayroll, loadPayrollFundTransferReport)
  val scnPayrollTransactionDetailMatrix = scenario("PayrollTransactionDetailMatrix").exec(loginHrPayroll, loadPayrollTransactionDetailMatrix)
  val scnPayrollTransactionDetailSummary = scenario("PayrollTransactionDetailSummary").exec(loginHrPayroll, loadPayrollTransactionDetailSummary)
  val scnPayrollTransactionListing = scenario("PayrollTransactionListing").exec(loginHrPayroll, loadPayrollTransactionListing)
  val scnPayrollGeneratePayslipPublishOnly = scenario("PayrollGeneratePayslipPublishOnly").exec(loginHrPayroll, loadPayrollGeneratePayslipPublishOnly)
  val scnPayrollEFormBorangE = scenario("PayrollEFormBorangE").exec(loginHrPayroll, loadPayrollEFormBorangE)
  val scnPayrollRunTransactionListingChecking = scenario("PayrollRunTransactionListingChecking").exec(loginHrPayroll, loadPayrollRunTransactionListingChecking) //40


  //Profile Scenario
  val scnProfileCreate = scenario("ProfileCreate").exec(loginHrPayroll, loadProfileCreate)
  val scnProfileAmendment = scenario("ProfileAmendment").exec(loginHrPayroll, loadProfileAmendment)
  val scnProfileKeyInPromotionMovementService = scenario("ProfileKeyInPromotionMovementService").exec(loginHrPayroll, loadProfileKeyInPromotionMovementService)
  val scnProfileKeyInIncrementMovementService = scenario("ProfileKeyInIncrementMovementService").exec(loginHrPayroll, loadProfileKeyInIncrementMovementService)
  val scnProfileKeyInTransferMovementService = scenario("ProfileKeyInTransferMovementService").exec(loginHrPayroll, loadProfileKeyInTransferMovementService)
  val scnProfileKeyInResignationMovementService = scenario("ProfileKeyInResignationMovementService").exec(loginHrPayroll, loadProfileKeyInResignationMovementService)
  val scnProfileKeyInRehiringMovementService = scenario("ProfileKeyInRehiringMovementService").exec(loginHrPayroll, loadProfileKeyInRehiringMovementService) //7

  val scnProfileDelete = scenario("ProfileDelete").exec(loginHrPayroll, loadProfileDelete)

  println(s"Profile: ${profileUsed.readRecords}")

  setUp(
    applyLeaveSaveDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    applyLeaveSubmitScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    applyLeaveAttachDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    applyLeaveResetScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimSaveDraftScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimSubmitScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimResetScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    empApplyClaimAttachScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    profileAmendmentPaymentScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    profileAmendmentEPFRateScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    profileAmendmentEPFNoScenario.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    LeaveEmployeeApproverListingS.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    scnProfileCreate.inject(rampUsers(EMPNo).during(scriptDuration.minutes))//13
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
        ClaimEntitlementReportS.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        scnProfileAmendment.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        scnProfileKeyInPromotionMovementService.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        scnProfileKeyInIncrementMovementService.inject(rampUsers(EMPNo).during(scriptDuration2.minutes)),
        scnProfileKeyInTransferMovementService.inject(rampUsers(EMPNo).during(scriptDuration2.minutes))//21
          .andThen(
            scnClaimGenerateClaimEntitlement.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnClaimKeyInClaim.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveRunCheckLeaveEntitlement.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveKeyInLeave.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveEntitlementAdjustment.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeavePosting.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeavePostedListing.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveBringForward.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnLeaveForfeit.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollGeneratePayment.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollBankDownload.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollStatutoryDownload.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollGeneratePublishPayslip.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollUploard.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnKeyInPayroll.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollDeleteAndMovePayroll.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnPayrollCreateTransactionCode.inject(rampUsers(EMPNo).during(scriptDuration3.minutes)),
            scnProfileKeyInResignationMovementService.inject(rampUsers(EMPNo).during(scriptDuration3.minutes))//18
              .andThen(
                scnPayrollEpfSocsoPayReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollIncomeTaxCalculationReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollPaymentAdviceReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollCostReportByCategory.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollCostReportByDepartment.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollDetailListingReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollReconciliationReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollSummaryReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollYTDAnalysisReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollSalaryPayoutReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollSpecificTransactionListingReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionAnalysisReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionEntryListingReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorang2.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorang3.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorang8A.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorang8B.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangA.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangCP21.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangCP22.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangCP22A.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangCP39.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangPendaftaranPekerjaAsing.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangPTPTN.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangSIP2.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangSIP2A.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangTabungHaji.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangZakatSelangor.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangZakatWP.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollHRDFundReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangButiranGajiDanCaruman.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangLampiran1Arrears.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollBorangLampiran1.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollFundTransferReport.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionDetailMatrix.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionDetailSummary.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollTransactionListing.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollGeneratePayslipPublishOnly.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollEFormBorangE.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnPayrollRunTransactionListingChecking.inject(rampUsers(EMPNo).during(scriptDuration4.minutes)),
                scnProfileKeyInRehiringMovementService.inject(rampUsers(EMPNo).during(scriptDuration4.minutes))//41
              )
          )
      )
  ).maxDuration(maxDurationTime.minutes).protocols(httpProtocol)

  //RUN THIS IF YOU WANT TO DELETE ALL THE DUMMY PROFILES
  //setUp(scnProfileDelete.inject(rampUsers(EMPNo).during(delDuration.minutes))).protocols(httpProtocol)
}
