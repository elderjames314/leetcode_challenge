package challenge;

public class Trie2 {
    private Trie2[] children;
    private boolean isEndOfWord;

    public Trie2() {
        children = new Trie2[26];
        isEndOfWord = false;
    }

    public void insert(String word) {
        Trie2 curr = this;
        for (char c : word.toCharArray()) {
            if(curr.children[c - 'a']==null)
                curr.children[c - 'a'] = new Trie2();
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }
    public boolean search(String word) {
        Trie2 curr = this;
        for (char c : word.toCharArray()) {
            curr = curr.children[c - 'a'];
            if (curr == null)
                return false;
        }
        if (curr.isEndOfWord)
            return true;
        return false;
    }
    public boolean startWith(String prefix) {
        Trie2 curr = this;
        for (char c : prefix.toCharArray()) {
            curr = curr.children[c - 'a'];
            if (curr == null)
                return false;
        }
        return true;

    }
}
