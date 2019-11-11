package wordgames;

/** Tests if two terms are anagrams.
 *
 * @author Douglas Luman
 */
public class AnagramTest {
 
  private char[] nameA;
  private char[] nameB;
  
  /** Constructor.
   *
   * @param nameA The first name to compare
   * @param nameB The second name to compare
   */
  public AnagramTest(String nameA, String nameB) {
    nameA = nameA.toLowerCase().replace(" ","");
    nameB = nameB.toLowerCase().replace(" ","");
    this.nameA = nameA.toCharArray();
    this.nameB = nameB.toCharArray();
    sortCharacters();
  }
  
  /** Calls the sort method.
   *
   */
  private void sortCharacters() {
    this.nameA = sort(this.nameA, this.nameA.length);
    this.nameB = sort(this.nameB, this.nameB.length);
  }
  
  /** Sorts arrays representing names.
   *
   * @param array The array to sort
   */
  private char[] sort(char[] array, int index) {
    if (index <= 0) {
      return array;
    }
    for (int i = 0; i < array.length - 1; i++) {
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
    if (this.nameA.length != this.nameB.length) {
      return false;
    }
    for (int i = 0; i < this.nameA.length; i++) {
      if (this.nameA[i] != this.nameB[i]) {
        return false;
      }
    }
    return true;
  }
}