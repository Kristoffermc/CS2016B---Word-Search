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
public abstract class AbstractCompareStrategy 
        implements CompareStrategy
{
    protected final String query;
    protected final boolean isCaseSensitive;

    public AbstractCompareStrategy(String query, boolean isCaseSensitive)
    {
        this.query = query;
        this.isCaseSensitive = isCaseSensitive;
    }
    
    
}
