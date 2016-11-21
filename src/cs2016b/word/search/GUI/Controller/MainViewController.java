/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016b.word.search.GUI.Controller;

import cs2016b.word.search.BLL.WordManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainViewController implements Initializable
{
    @FXML
    private Label lblCount;
    @FXML
    private TextField textQuery;
    @FXML
    private ListView<String> listWords;
    @FXML
    private RadioButton rbBegins;
    @FXML
    private RadioButton rbEnds;
    @FXML
    private RadioButton rbContains;
    @FXML
    private RadioButton rbExact;
    @FXML
    private CheckBox chkCaseSensitive;
    @FXML
    private ComboBox<String> comboLimit;
    
    private ObservableList<String> allWords =
                FXCollections.observableArrayList();
    
    private WordManager wordManager = new WordManager();
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        loadAllWordsFromFile();
        setToggleGroupForRadioButtons();
        fillComboBox();
    }    
    
    private void fillComboBox()
    {
        ObservableList<String> comboItems =
                FXCollections.observableArrayList(
                        "None","10","20","50","100");
        comboLimit.setItems(comboItems);
        comboLimit.getSelectionModel().selectFirst();
    }
    
    private void loadAllWordsFromFile()
    {
        allWords = FXCollections.observableArrayList(
                wordManager.getAllWords());
        
        listWords.setItems(allWords);
    }
    
    private void setToggleGroupForRadioButtons()
    {
        ToggleGroup toggleGroup = new ToggleGroup();
        rbBegins.setToggleGroup(toggleGroup);
        rbContains.setToggleGroup(toggleGroup);
        rbEnds.setToggleGroup(toggleGroup);
        rbExact.setToggleGroup(toggleGroup);
        rbBegins.setSelected(true);
    }
    
    @FXML
    private void searchClick(ActionEvent event)
    {
        ObservableList<String> filteredList =
                FXCollections.observableArrayList(
                    wordManager.filterWords(textQuery.getText()));
        
        listWords.setItems(filteredList);
    }

    @FXML
    private void clearClick(ActionEvent event)
    {
        textQuery.clear();
        loadAllWordsFromFile();
    }

    @FXML
    private void closeClick(ActionEvent event)
    {
        System.exit(0);
    }
    
}
