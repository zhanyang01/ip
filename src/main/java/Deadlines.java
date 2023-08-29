import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadlines extends Task {
    protected String end;
    protected LocalDate date;

    /**
     * @param description
     * @param oriEnd
     */
    public Deadlines(String description, String originalEnd) {
        super(description);
        this.end = originalEnd;
        this.date = Task.convertDatePlease(originalEnd);
        if (date != null) {
            DateTimeFormatter stringFormatter = FormatterDate.basicOutput.formatter;
            this.end = date.format(stringFormatter);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "| D |%s (by: %s)", super.toString(), end);
    }
}
