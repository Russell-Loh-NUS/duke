package duke.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EventTest {

    @Test
    void getDate() {
        Event event = new Event("A description", "20/12/2019 0000");
        assertEquals("20/12/2019 0000", event.getDateString());
    }

    @Test
    void testToString() {
        Event event = new Event("A description", "20/12/2019 0000");
        assertEquals("[E][\u2718] A description (at: December 20, 2019 at 0000)", event.toString());
    }

}