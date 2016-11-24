/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016b.word.search.BLL;

import cs2016b.word.search.BLL.strategies.CompareStrategy;
import cs2016b.word.search.DAL.WordFileHandler;
import cs2016b.word.search.WordSearchException;
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
    
    public List<String> filterWords(CompareStrategy strategy) throws WordSearchException
    {
        List<String> filteredList = new ArrayList();
        List<String> words = fileHandler.getAllWords();
        
        for (String word : words)
        {
            if(strategy.compare(word))
            {
                filteredList.add(word);
            }
        }
        return filteredList;
    }
    
    public List<String> getAllWords() throws WordSearchException
    {
        return fileHandler.getAllWords();
    }
}
