package duke.commands;

import duke.Storage;
import duke.Ui;
import duke.task.TaskList;

/**
 * Represent a command to find a list of tasks with a particular keyword
 */
public class FindCommand extends Command {
    private String keyword;

    /**
     * Constructor of the FindCommand object
     */
    public FindCommand(String keyword) {
        super();
        this.keyword = keyword;
    }

    /**
     * Execute the FindCommand and returns a string
     * {@inheritDoc}
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        String output = "";
        output += ui.findTask(keyword, tasks);
        return output;
    }
}
