package ch.alissa.checklist;

import ch.alissa.checklist.event.Event;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class Controller {

    @FXML
    private Button addButton;
    
    @FXML
    private TextField taskField;
    
    @FXML
    private DatePicker dateSelect;
    
    @FXML
    private ListView<Event> eventListView;
    
    @FXML
    private void addEventHandler(ActionEvent event)
    {

        if(taskField.getText().isEmpty() || dateSelect.getValue() == null) return;

        Event newEvent = new Event(dateSelect.getValue(), taskField.getText());
        
        eventListView.getItems().add(newEvent);
        dateSelect.setValue(LocalDate.now());
        taskField.setText("");
    }
    
    public Object[] getEvents()
    {
        return eventListView.getItems().toArray();
    }

}
