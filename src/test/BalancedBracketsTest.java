package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void openBracketFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void strValueTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void intValueTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[42]"));
    }
    @Test
    public void oppositeBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketThenString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void stringBracketString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]Code"));
    }
    @Test
    public void openBracketStringCloseBracketStringOpenBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode, Launch]Code["));
    }
    @Test
    public void stringThenStringWithinBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void closeBracketFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void specialCharactersTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[****,$$$$]"));
    }
}
