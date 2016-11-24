/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016b.word.search.DAL;

import cs2016b.word.search.WordSearchException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeppjleemoritzled
 */
public class WordFileHandler
{
    public List<String> getAllWords() throws WordSearchException
    {
        List<String> allWords = new ArrayList();
        
        File wordFile = new File("brit-a-z.txt");
        try(BufferedReader br = 
                new BufferedReader(new FileReader(wordFile)))
        {
            Scanner scan = new Scanner(br);
            while(scan.hasNextLine())
            {
                String word = scan.nextLine();
                allWords.add(word);
            }
        }
        catch (IOException ex)
        {
            throw new WordSearchException();
            //return null;
        }
        return allWords;
    }
}
