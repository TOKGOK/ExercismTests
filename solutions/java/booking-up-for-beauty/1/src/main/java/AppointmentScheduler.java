import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        int[] time = splitTime(appointmentDateDescription);
        return LocalDateTime.of(time[2],time[0],time[1],time[3],time[4],time[5]);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime time = appointmentDate.toLocalTime();
    return time.isAfter(LocalTime.of(11, 59, 59)) && time.isBefore(LocalTime.of(18, 0, 0));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        String formattedDateTime = appointmentDate.format(formatter);
        return "You have an appointment on " + formattedDateTime + ".";
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }

    private int[] splitTime(String timeStr){
        int[] ret = new int[6];
        String[] splitFirst = timeStr.split(" ");
        int index = 0;
        for(String str : splitFirst[0].split("/")){
            ret[index++] = Integer.parseInt(str);
        }
        for(String str : splitFirst[1].split(":")){
            ret[index++] = Integer.parseInt(str);
        }
       return ret;
    }
}
