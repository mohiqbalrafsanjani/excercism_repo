import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription,fmt);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() < 18 && appointmentDate.getHour() >= 12;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + appointmentDate.getDayOfWeek().toString().substring(0,1) + appointmentDate.getDayOfWeek().toString().substring(1).toLowerCase() + ", " + appointmentDate.getMonth().toString().substring(0,1) + appointmentDate.getMonth().toString().substring(1).toLowerCase() + " " + appointmentDate.getDayOfMonth() + ", " + appointmentDate.getYear() + ", at " +  appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a")) + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
