package duke.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TodoTest {
    @Test
    public void toString_testStringConverstion_correctResult() {
        assertEquals("| T |   | study cs2103",
                new Todo("study cs2103").toString());
        assertEquals("| T |   | play computer games",
                new Todo("play computer games").toString());
    }
}
