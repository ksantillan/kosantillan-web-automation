package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsPage {
	
	@FindBy(xpath="//a[@id='REPORTS']")
	public static WebElement tbReport;
	
	public static class FavoritesTab {
		
		@FindBy(xpath="//a[text()='Favorites']")
		public static WebElement tbFavorites;	
		
		@FindBy(xpath="//*[contains(@class,'rt-tr-group')]")
		public static List<WebElement> objFavoriteReports;	
		
		@FindBy(xpath="//button[text()='Yes']")
		public static WebElement btnYes;	
		
		@FindBy(xpath="//div[text()='Summary Trip Report']")
		public static WebElement objSummaryTripReportFavorite;	
		
		@FindBy(xpath="//button/*[local-name()='svg'][@data-icon='cogs']/parent::button[@type='button']")
		public static WebElement btnCogWheels;
		
		
		
	}

	public static class InformationTab {
		
		@FindBy(xpath="//*[text()='Information']")
		public static WebElement tbInformation;	
		
		@FindBy(xpath="//*[contains(.,'Upcoming Scheduled Reports')]/ancestor::*[contains(@class,'Modal')]/descendant::button[text()='Yes']")
		public static WebElement btnYes;	
		
		@FindBy(xpath="//*[contains(@class,'rt-tr-group')]")
		public static List<WebElement> lstReportSubmitted;
		
		@FindBy(xpath="//div[@class='Toast Toast--success']")
		public static WebElement objToasterSuccessMessage;
		
		@FindBy(xpath="//li[@data-target='Report Status']")
		public static WebElement tbReportStatus;
		
		@FindBy(xpath="//*[text()='Report Status']/ancestor::*[contains(@class,'SectionHeader')]/following-sibling::div[1]/descendant::*[contains(@class,'select-wrap -pageSizeOptions')]/select[1]")
		public static WebElement objReportStatusPagesizeOption;
		
		@FindBy(xpath="//div[contains(@class,'UpcomingReport-scheduled')]/descendant::*[local-name()='svg'][@data-icon='cogs']/parent::button[@type='button']")
		public static WebElement btnCogWheelsUpcomingReport;
		
		@FindBy(xpath="//span[@class='select-wrap -pageSizeOptions']//select")
		public static WebElement drpdwnPageSizeOption;
		
		@FindBy(xpath="//div[text()='No data available']")
		public static WebElement objNoDataAvailable;
		
	
		
	}

	public static class SetupTab {
	
		@FindBy(xpath="//*[contains(@href,'setup')]")
		public static WebElement tbSetUp;	
		
		@FindBy(xpath="//div[text()='Start of Work Hours']/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxStartofWorkHours;	
		
		@FindBy(xpath="//div[contains(.,'Godzina rozpo')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxGodzinarozpo;	
		
		@FindBy(xpath="//div[contains(.,'Comece a Trabalhar Horas')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxComeceaTrabalharHoras;
		
		@FindBy(xpath="//div[contains(.,'Inicio de horas de trabajo')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxIniciodehorasdetrabajo;
		
		@FindBy(xpath="//div[contains(.,'Heure de début du travail')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxHeurededébutduravail;
		
		@FindBy(xpath="//div[contains(.,'End of Work Hours')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxEndofWorkHours;	
		
		@FindBy(xpath="//div[contains(.,'Godzina zako')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxGodzinazako;	
		
		@FindBy(xpath="//div[contains(.,'Fim Horas de Trabalho')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxFimHorasdeTrabalho;
		
		@FindBy(xpath="//div[contains(.,'Fin de horas de trabajo')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxFindehorasdetrabajo;
		
		@FindBy(xpath="//div[contains(.,'Heure de fin de travail')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxHeuredefindetravail;
		
		@FindBy(xpath="//div[contains(.,'Horas de trabalho Início')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxHorasdetrabalhoIn;
		
		@FindBy(xpath="//div[contains(.,'Horas de trabalho Fim')]/parent::div[contains(@class,'TextInput')]/following::div[1]")
		public static WebElement txtbxHorasdetrabalhoFim;
		
		@FindBy(xpath="//input[@id='email_address1']")
		public static WebElement txtbxEmailAddress;	
		
		@FindBy(xpath="//h1[contains(@class,'Reports-name')]")
		public static WebElement objReportName;	
		
		@FindBy(xpath="//*[contains(.,'Download Report')]/ancestor::button[contains(@type,'button')]")
		public static WebElement btnDownloadReport;
		
		@FindBy(xpath="//*[contains(.,'Generating Report...')]/ancestor::button[contains(@type,'button')]")
		public static WebElement btnGeneratingReport;
		
		@FindBy(xpath="//div[contains(@class,'toast--success')]")
		public static WebElement objToasterSuccessMessage;
		
		@FindBy(xpath="//button[contains(@type,'submit')]")
		public static WebElement btnSubmit;
		
		@FindBy(xpath="//label[@for='schedule']")
		public static WebElement chkbxSchedule;
		
		@FindBy(xpath="//input[@id='every']")
		public static WebElement txtbxEvery;
		
		@FindBy(xpath="//*[contains(.,'Repeat Interval')]/ancestor::button[contains(@class,'InputDropdown-button is-withValue')]")
		public static WebElement drpdwnRepeatInterval;
		
		@FindBy(xpath="//*[contains(.,'Report Duration')]/ancestor::button[contains(@class,'InputDropdown-button is-withValue')]")
		public static WebElement drpdwnReportDuration;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Day(s)']")
		public static WebElement drpdwnRepeatIntervalOptionDays;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Month(s)']")
		public static WebElement drpdwnRepeatIntervalOptionMonths;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Week Day']")
		public static WebElement drpdwnRepeatIntervalOptionWeekDay;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Week(s)']")
		public static WebElement drpdwnRepeatIntervalOptionWeeks;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Weekend (Only Sunday)']")
		public static WebElement drpdwnRepeatIntervalOptionWeekendOnlySunday;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Weekend(s)']")
		public static WebElement drpdwnRepeatIntervalOptionWeekends;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='1 Month']")
		public static WebElement drpdwnReportDurationOption1Month;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='1 Week']")
		public static WebElement drpdwnReportDurationOption1Week;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Selected']")
		public static WebElement drpdwnReportDurationOptionSelected;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='To Date']")
		public static WebElement drpdwnReportDurationOptionToDate;
		
		@FindBy(xpath="//*[text()='Search']/ancestor::div[contains(@class,'TextInput')]/input[contains(@class,'TextInput')]")
		public static WebElement txtbxSearch;
	
		@FindBy(xpath="//div[contains(@class,'ReportsLeftPanel-item')]")
		public static WebElement objReportLeftPanel;
		
		@FindBy(xpath="//button[contains(@class,'ScheduledReport')]")
		public static WebElement btnFavorites;
		
		@FindBy(xpath="//button[contains(@class,'action')][contains(@class,'ScheduledReport')]")
		public static WebElement btnSelectedFavorites;
		
		@FindBy(xpath="//*[text()='Document Format']/ancestor::div[@class='InputDropdown-container']")
		public static WebElement drpdwnDocumentFormat;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Microsoft Excel (xls)']")
		public static WebElement drpdwnDocumentFormatOptionExcelXLS;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Microsoft Excel']")
		public static WebElement drpdwnDocumentFormatOptionExcel;
		
		@FindBy(xpath="//div[contains(@id,'item')][contains(text(),'Adobe Acrobat Reader')]")
		public static WebElement drpdwnDocumentFormatOptionPDF;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Microsoft Excel (csv)']")
		public static WebElement drpdwnDocumentFormatOptionExcelCSV;
		
		@FindBy(xpath="//span[text()='Password Protected']/preceding::label[@for='zipped']")
		public static WebElement chckbxPasswordProtected;
		
		@FindBy(xpath="//input[@id='password']")
		public static WebElement txtbxPassword;
		
		@FindBy(xpath="//*[text()='Quick Select']/ancestor::div[@class='InputDropdown-container']")
		public static WebElement drpdwnQuickSelect;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Custom']")
		public static WebElement drpdwnQuickSelectOptionCustom;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Yesterday']")
		public static WebElement drpdwnQuickSelectOptionYesterday;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Last 7']")
		public static WebElement drpdwnQuickSelectOptionLast7;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Last 30']")
		public static WebElement drpdwnQuickSelectOptionLast30;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Last 90']")
		public static WebElement drpdwnQuickSelectOptionLast90;
		
	}
	
	public static class CutomiseTab {
		
		@FindBy(xpath="//*[text()='Customise']")
		public static WebElement tbCustomise;
		
		@FindBy(xpath="//*[text()='Customize']")
		public static WebElement tbCustomize;
		
		@FindBy(xpath="//*[text()='Filter by category']/ancestor::*[contains(@role,'combobox')]")
		public static WebElement drpdwnFilterByCategory;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Positions']")
		public static WebElement drpdwnFilterByCategoryOptionPositions;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Custom']")
		public static WebElement drpdwnFilterByCategoryOptionCustom;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Trips']")
		public static WebElement drpdwnFilterByCategoryOptionTrips;
		
		@FindBy(xpath="//*[text()='Filter by category']/preceding::input[1]")
		public static WebElement txtbxFilterByCategory;
		
		@FindBy(xpath="//button[text()='Next']")
		public static WebElement btnNext;
		
		@FindBy(xpath="//*[contains(@class,'CustomReportRightPanel-dnd-card')][text()='Driver']")
		public static WebElement objAvailableFieldsDriver;
		
		@FindBy(xpath="//*[contains(@class,'CustomReportRightPanel-dnd-card')][text()='Trip Type']")
		public static WebElement objAvailableFieldsTripType;
		
		@FindBy(xpath="//*[contains(@class,'CustomReportRightPanel-dnd-card')][text()='Event Type']")
		public static WebElement objAvailableFieldsEventType;
		
		@FindBy(xpath="//*[contains(@class,'CustomReportRightPanel-dnd-card')][text()='Fuel Level']")
		public static WebElement objAvailableFieldsFuelLevel;
		
		@FindBy(xpath="//div[contains(@class,'CustomReportRightPanel-dnd-target-placeholder')]")
		public static WebElement objDragandDropFieldHere;
		
		@FindBy(xpath="//input[@id='email_address1']")
		public static WebElement txtbxEmailAddress;	
		
		@FindBy(xpath="//button[contains(@type,'submit')]")
		public static WebElement btnSubmit;
		
		@FindBy(xpath="//label[contains(@for,'suppressHeader')]")
		public static WebElement chckbxSuppressHeader;
		
		@FindBy(xpath="//label[contains(@for,'suppressFooter')]")
		public static WebElement chckbxSuppressFooter;
		
		@FindBy(xpath="//span[text()='Report Name']/ancestor::div[contains(@class,'TextInput')]/input[@type='text']")
		public static WebElement txtbxReportName;
		
		@FindBy(xpath="//div[@class='CustomReportRightPanel-dnd-target']/div[@class='CustomReportRightPanel-dnd-card']")
		public static List<WebElement> objSelectedFields;
		
		@FindBy(xpath="//input[@class='TextInput-input is-withValue']")
		public static List<WebElement> drpdownFilterBy;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Contains:']")
		public static WebElement drpdownFilterByOptionContains;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='Equals']")
		public static WebElement drpdownFilterByOptionEquals;
		
		@FindBy(xpath="//div[contains(@id,'item')][text()='None']")
		public static WebElement drpdownFilterByOptionNone;
		
		@FindBy(xpath="//span[text()='Write the rule here']")
		public static List<WebElement> txtbxWriteTheRuleHere;
		
		
	}
	
	
}
