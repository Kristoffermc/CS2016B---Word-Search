/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016b.word.search.BLL.strategies;

/**
 *
 * @author jeppjleemoritzled
 */
public class Exact extends AbstractCompareStrategy
{
    public Exact(String query, boolean isCaseSensitive)
    {
        super(query, isCaseSensitive);
    }

    @Override
    public boolean compare(String word)
    {
        if (isCaseSensitive)
        {
            return word.equals(query);
        }
        else
        {
            return word.toLowerCase().equals(
                    query.toLowerCase());
        }
    }
    
}
