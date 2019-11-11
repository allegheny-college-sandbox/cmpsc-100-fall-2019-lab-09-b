package wordgames;

/** Tests if two terms are anagrams.
 *
 * @author Douglas Luman
 */
public class AnagramTest {
 
  private char[] wordA;
  private char[] wordB;
  
  /** Constructor.
   *
   * @param nameA The first name to compare
   * @param nameB The second name to compare
   */
  public AnagramTest (String wordA, String wordB) {
    wordA = wordA.toLowerCase().replace(" ","");
    wordB = wordB.toLowerCase().replace(" ","");
    this.wordA = wordA.toCharArray();
    this.wordB = wordB.toCharArray();
    sortCharacters();
  }
  
  /** Calls the sort method.
   *
   */
  private void sortCharacters() {
    this.wordA = sort(this.wordA, this.wordA.length);
    this.wordB = sort(this.wordB, this.wordB.length);
  }
  
  /** Sorts arrays representing names.
   *
   * @param array The array to sort
   */
  private char[] sort(char[] array, int index) {
    if(index <= 0) {
      return array;
    }
    for (int i = 0; i < array.length - 1; i++){
      if (array[i] < array[i + 1]) {
        char temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
      }
    }
    index--;
    return sort(array, index);
  }
  
    
  /** Returns result of various anagram tests.
   *
   */
  public boolean testWords() {
    if (this.wordA.length != this.wordB.length) {
      return false;
    }
    for (int i = 0; i < this.wordA.length; i++) {
      if (this.wordA[i] != this.wordB[i]) {
        return false;
      }
    }
    return true;
  }
}