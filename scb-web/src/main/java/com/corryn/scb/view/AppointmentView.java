/*     */package com.corryn.scb.view;

/*     */
/*     *//*     */import java.io.Serializable;
/*     */
import java.util.List;



/*     */
import javax.annotation.PostConstruct;
/*     */
import javax.ejb.EJB;
/*     */
import javax.faces.bean.ManagedBean;
/*     */
import javax.faces.bean.ViewScoped;

import com.corryn.scb.business.domain.AppointmentBean;
import com.corryn.scb.data.persistence.model.AppointmentEntity;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */@ManagedBean
/*     */@ViewScoped
/*     */public class AppointmentView
/*     */implements Serializable
/*     */
{
	/*     */private static final long serialVersionUID = 1L;
	/* 29 */private List<AppointmentEntity> appointments = null;
	/* 30 */private AppointmentEntity selectedAppointment = null;
	/*     */
	/* 32 */private boolean displayOnlyCurrent = true;
	/*     */
	/*     */
	/*     */@EJB
	/*     */AppointmentBean appointmentManager;

	/*     */
	/*     */
	/*     */
	/*     */@PostConstruct
	/*     */public void init()
	/*     */
	{
		/* 43 */doLoadAppointments();
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void doLoadAppointments()
	/*     */
	{
		/* 51 */if(this.displayOnlyCurrent)
		/*     */
		{
			/* 53 */this.appointments = this.appointmentManager.getCurrentAppointments();
			/*     */}
		/*     */else
		/*     */{
			/* 57 */this.appointments = this.appointmentManager.getAppointments();
			/*     */}
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void doCreate()
	/*     */
	{
		/* 66 */setSelectedAppointment(new AppointmentEntity());
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void doSave()
	/*     */
	{
		/* 74 */this.appointmentManager.saveAppointment(getSelectedAppointment());
		/* 75 */doLoadAppointments();
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void doDelete(AppointmentEntity dto)
	/*     */
	{
		/* 84 */this.appointmentManager.deleteAppointment(dto);
		/* 85 */this.appointments.remove(dto);
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public List<AppointmentEntity> getAppointments()
	/*     */
	{
		/* 94 */return this.appointments;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void setSelectedAppointment(AppointmentEntity dto)
	/*     */
	{
		/* 102 */this.selectedAppointment = dto;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public AppointmentEntity getSelectedAppointment()
	/*     */
	{
		/* 110 */return this.selectedAppointment;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public boolean isDisplayOnlyCurrent()
	/*     */
	{
		/* 118 */return this.displayOnlyCurrent;
		/*     */}

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */public void setDisplayOnlyCurrent(boolean displayOnlyCurrent)
	/*     */
	{
		/* 126 */this.displayOnlyCurrent = displayOnlyCurrent;
		/*     */}
	/*     */
}