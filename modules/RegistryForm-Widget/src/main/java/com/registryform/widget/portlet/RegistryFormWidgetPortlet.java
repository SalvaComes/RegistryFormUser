package com.registryform.widget.portlet;

import com.registryform.widget.constants.RegistryFormWidgetPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.process.ProcessLog.Level;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.portlet.Portlet;
import javax.mail.internet.*;
import org.osgi.service.component.annotations.Component;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import org.salvacomes.model.RegistryUsers;
import org.salvacomes.service.RegistryUsersLocalServiceUtil;

/**
 * @author scomes
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=SalvadorComes",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RegistryFormWidget",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RegistryFormWidgetPortletKeys.REGISTRYFORMWIDGET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RegistryFormWidgetPortlet extends MVCPortlet {
	private static final Logger LOGGER = Logger.getLogger(RegistryFormWidgetPortlet.class.getName());
	public void sendMail(String toEmail) {
		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;
		try {
	    		fromAddress = new InternetAddress("noreplysalvacomes@gmail.com");
	    		toAddress = new InternetAddress(toEmail);
	    		MailMessage mailMessage = new MailMessage();
	    		mailMessage.setTo(toAddress);
	    		mailMessage.setFrom(fromAddress);
	    		mailMessage.setSubject("Mail de registro en Formulario");
	    		mailMessage.setBody("Se ha registrado en el formulario creado por Salvador Comes\n Si ha recibido este correo es porque ha cumplimentado los datos del formulario creado por Salvador Comes para la prueba de Consultor en Liferay");
	    		MailServiceUtil.sendEmail(mailMessage);
	    		LOGGER.info("Enviando Mail...");
		} catch (AddressException e) {
		    	e.printStackTrace();
		}
	}
	
	public void addUser(ActionRequest actionRequest,ActionResponse response){
		
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			
			String name = ParamUtil.getString(actionRequest, "name");
			String lastname = ParamUtil.getString(actionRequest, "lastname");
			Date birthday = ParamUtil.getDate(actionRequest, "birthday", df);
			String email = ParamUtil.getString(actionRequest, "email");
			Date registryDate = new Date();   
			RegistryUsers ru = RegistryUsersLocalServiceUtil.createRegistryUsers((int) CounterLocalServiceUtil.increment());
			 try {
		            CaptchaUtil.check(actionRequest);
					ru.setName(name);
					ru.setLastName(lastname);
					ru.setBirthday(birthday);
					ru.setEmail(email);
					ru.setRegistryDate(registryDate);
					ru = RegistryUsersLocalServiceUtil.addRegistryUsers(ru);
			
					sendMail(email);
		        } catch (CaptchaException e) {
		 
		            SessionErrors.add(actionRequest, "errorMessage");
		        }   


		 
		 }
}