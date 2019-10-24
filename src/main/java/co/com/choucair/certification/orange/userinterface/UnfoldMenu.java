package co.com.choucair.certification.orange.userinterface;

import co.com.choucair.certification.orange.util.Variables;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UnfoldMenu extends PageObject {
    public static final Target PIM = Target.the("desplegar menu")
            .located(By.xpath("//span[contains(text(),'PIM')]"));
    public static final Target ADD_EMPLOYEE = Target.the("seleccionar agregar empleado")
            .located(By.xpath("//a[@id='menu_pim_addEmployee']"));
    public static final Target FIRST_NAME = Target.the("primer nombre")
            .located(By.xpath("//input[@id='firstName']"));
    public static final Target MIDLE_NAME = Target.the("segundo nombre")
            .located(By.xpath("//input[@id='middleName']"));
    public static final Target LAST_NAME = Target.the("apellidos")
            .located(By.xpath("//input[@id='lastName']"));
    public static final Target ID_USER = Target.the("id")
            .located(By.xpath("//input[@id='employeeId']"));
    public static final Target LOCATION = Target.the("click en ubicacion")
            .located(By.xpath("//*[@id='location_inputfileddiv']/div/input"));
    public static final Target SELECT_LOCATION = Target.the("ciudad")
            .located(By.xpath("//div[@id='addEmployeeModal']//li"));
    public static final Target NEXT = Target.the("boton siguiente")
            .located(By.xpath("//a[@id='systemUserSaveBtn']"));
    public static final Target OTHER_ID = Target.the("other id")
            .located(By.xpath("//input[@id='otherId']"));
    public static final Target DATE_BIRTH = Target.the("fecha de nacimiento")
            .located(By.xpath("//input[@id='emp_birthday']"));
    public static final Target MARITAL_STATUS = Target.the("marital estatus")
            .located(By.xpath("//div[@id='emp_marital_status_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target STATUS = Target.the("eleccion estatus")
            .located(By.xpath("//div[@id='emp_marital_status_inputfileddiv']//li"));
    public static final Target GENDER_MALE = Target.the("genero femenino")
            .located(By.xpath("//label[contains(text(),'Male')]"));
    public static final Target GENDER_FEMALE = Target.the("genero masculino")
            .located(By.xpath("//label[contains(text(),'Female')]"));
    public static final Target NATIONALITY = Target.the("nacionalidad")
            .located(By.xpath("//div[@id='nation_code_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target SELECT_NATIONALITY = Target.the("seleccionar nacionalidad")
            .located(By.xpath("//div[@id='nation_code_inputfileddiv']//li"));
    public static final Target DRIVER_ID = Target.the("numero de licencia")
            .located(By.xpath("//input[@id='licenseNo']"));
    public static final Target EXPIRY_DATE = Target.the("fecha de expiracion")
            .located(By.xpath("//input[@id='emp_dri_lice_exp_date']"));
    public static final Target NICK_NAME = Target.the("apodo")
            .located(By.xpath("//input[@id='nickName']"));
    public static final Target MILITAR_SERVICE = Target.the("servicio militar")
            .located(By.xpath("//input[@id='militaryService']"));
    public static final Target SMOKER = Target.the("fumador")
            .located(By.xpath("//label[contains(text(),'Smoker')]"));
    public static final Target SELECT_BLOOD_GROUP = Target.the("grupo sanguineo")
            .located(By.xpath("//div[@class='select-wrapper initialized']//input[@class='select-dropdown']"));
    public static final Target BLOOD_GROUP = Target.the("grupo sanguineo")
            .located(By.xpath("//body//custom-fields-panel//li"));
    public static final Target HOBBIES = Target.the("pasatiempos")
            .located(By.xpath("//input[@id='5']"));
    public static final Target NEXT_WINDOW = Target.the("siguiente")
            .located(By.xpath("//button[@class='btn waves-effect waves-light right']"));
    public static final Target SCROLL_PAGE = Target.the("region")
            .located(By.xpath("//input[@id='contract_start_date']"));
    public static final Target REGION =Target.the("region")
            .located(By.xpath("//div[@id='9_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target REGION_SELECTION = Target.the("seleccionar region")
            .located(By.xpath("//div[@id='9_inputfileddiv']//li/*"));
    public static final Target FTE = Target.the("fte")
            .located(By.xpath("//div[@id='10_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target FTE_SELECTION = Target.the("selecctionar fte")
            .located(By.xpath("//div[@id='10_inputfileddiv']//li"));
    public static final Target DEPARTMENT = Target.the("departamento")
            .located(By.xpath("//div[@id='11_inputfileddiv']//input[@class='select-dropdown']"));
    public static final Target DEPARTMENT_SELECTION = Target.the("seleccionar departamento")
            .located(By.xpath("//div[@id='11_inputfileddiv']//li"));
    public static final Target SAVE = Target.the("guardar")
            .located(By.xpath("//button[@class='btn waves-effect waves-light right']"));

    public static final Target EMPLOYEE_LIST = Target.the("lista de empleados")
            .located(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
    public static final Target SEEK = Target.the("buscar empleado registrado")
            .located(By.xpath("//input[@id='employee_name_quick_filter_employee_list_value']"));
    public static final Target SEARCH = Target.the("boton buscar")
            .located(By.xpath("//i[@id='quick_search_icon']"));
    public static final Target EMPLOYEE_ID_PAGE = Target.the("id empleado")
            .located(By.xpath("//td[contains(text(),'"+ Variables.id +"')]"));


}
