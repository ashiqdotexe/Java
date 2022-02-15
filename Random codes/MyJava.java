/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavadoc;

/**
 *
 * @author ashiq
 */
class MyJava
{
    /**
     * @value 10 is default value
     */
    static int x=10;
    /**
     * Parameterized constructor
     * @param s Book Name
     */
    MyJava(String s)
    {
        
    }
    /**
     * Check whether the roll number is available or not
     * @param roll Take the Roll number
     * @throws Exception If the roll number is not available it throws exception
     */
    public void availableBook(int roll)throws Exception
    {
       
    }
    /**
     * Check whether the book is available or not
     * @param s Check book name
     * @return If book is available it returns a true value
     */
    public boolean isAvailable(int s)
    {
        return true;
    }
}
