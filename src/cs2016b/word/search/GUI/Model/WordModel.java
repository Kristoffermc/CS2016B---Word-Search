/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016b.word.search.GUI.Model;

import java.util.List;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jeppjleemoritzled
 */
public class WordModel
{
    private final ObservableList<String> wordList;
    private final SimpleIntegerProperty count;

    public WordModel()
    {
        this.wordList = FXCollections.observableArrayList();
        count = new SimpleIntegerProperty(0);
    }

    public ObservableList<String> getWordList()
    {
        return wordList;
    }

    public SimpleIntegerProperty getCount()
    {
        return count;
    }
    
    public void setWords(List<String> words)
    {
        wordList.clear();
        wordList.addAll(words);
        count.set(words.size());
    }
}
