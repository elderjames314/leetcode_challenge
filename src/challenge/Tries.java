package challenge;

import java.util.Arrays;

public class Tries {
    private Tries[] children;
    private boolean isEndOfWord;

    public Tries() {
        children = new Tries[26];
        isEndOfWord = false;
    }

    public void insert(String word) {
        Tries curr = this;
        for(char c : word.toCharArray()) {
            if(curr.children[c - 'a']==null)
                curr.children[c - 'a'] = new Tries();
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        Tries curr = this;
        for(char c : word.toCharArray()) {
           curr = curr.children[c - 'a'];
           if(curr == null)
               return false;
        }
        if(curr.isEndOfWord)
            return true;

        return false;
    }

    public boolean startWith(String prefix) {
        Tries curr = this;
        for(char c : prefix.toCharArray()) {
            curr = curr.children[c - 'a'];
            if(curr == null)
                return false;
        }
        return true;
    }
}