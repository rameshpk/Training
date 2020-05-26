package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.time.Calendar;
import org.quartz.impl.calendar.WeeklyCalendar;

import com.sample.model.Car;
import com.sample.model.EmailService;
import com.sample.model.Person;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
        	
        	WeeklyCalendar weekDayCal = new WeeklyCalendar();
            weekDayCal.setDaysExcluded(new boolean[] { false, false, false, false, false, false, false, false, false });
            weekDayCal.setDayExcluded(java.util.Calendar.SUNDAY, true);
            Calendar calendar = new CalendarWrapper(weekDayCal);
        	
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
           /* Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            message.setText("Hello");
            kSession.insert(message);*/
            
            
            /*Person person = new Person();
            person.setAge(35);
            person.setName("RAM");         
          
            
            kSession.insert(person);
            
            Car car = new Car();
            car.setPerson(person);
            car.setDiscount(20);*/
            
            List<Person> list = new ArrayList<>();
            Person p = new Person();
            p.setAge(18);
            list.add(p);
            Person p1 = new Person();
            p1.setAge(20);
            list.add(p1);
            
            kSession.insert(list);
            
           // kSession.insert(car);
            
           // EmailService emailService = new EmailService();
           // kSession.setGlobal("emailService",emailService);
            
            //kSession.getCalendars().set("calendar", calendar);
            //kSession.getAgenda().getAgendaGroup("agenda-group-3").setFocus();
            kSession.fireAllRules();
            kSession.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    


    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String text;
        private String message;
        private int status;
        

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}		     
        

    }

}
