/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016b.word.search.BLL;

import cs2016b.word.search.DAL.WordFileHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class WordManager
{
    private WordFileHandler fileHandler =
            new WordFileHandler();
    
    public List<String> filterWords(String query)
    {
        List<String> filteredList = new ArrayList();
        List<String> words = fileHandler.getAllWords();
        
        for (String word : words)
        {
            if(word.startsWith(query))
            {
                filteredList.add(word);
            }
        }
        return filteredList;
    }
    
    public List<String> getAllWords()
    {
        return fileHandler.getAllWords();
    }
}
