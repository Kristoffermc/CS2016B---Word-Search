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
public class BeginsWith extends AbstractCompareStrategy
{

    public BeginsWith(String query, boolean isCaseSensitive)
    {
        super(query, isCaseSensitive);
    }

    @Override
    public boolean compare(String word)
    {
        if (isCaseSensitive)
        {
            return word.startsWith(query);
        }
        else
        {
            return word.toLowerCase().startsWith(
                    query.toLowerCase());
        }
    }

}
