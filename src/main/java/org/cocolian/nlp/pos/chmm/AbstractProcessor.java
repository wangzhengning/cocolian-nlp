/**
 * 
 */
package org.cocolian.nlp.pos.chmm;

import org.cocolian.nlp.Nature;

/**
 * @author lixf
 * 
 */
public class AbstractProcessor {
	
	private static final int BLANK_LENATH = 0;

	public AbstractProcessor() {
	}

	public TermNatures createTermNatures(final String natureName) {
		final TermNatures natures = new BasicTermNatures();
		natures.addNature(Nature.valueOf(natureName));
		return natures;
	}

	public TermNatures createTermNatures(final String natureName, final int freq) {
		final TermNatures natures = new BasicTermNatures();
		natures.addNature(Nature.valueOf(natureName), freq);
		return natures;
	}
	

  /**
   * 判断字符串是否为空
   *
   * @param target
   * @return
   */
  public boolean isBlank(final CharSequence target) {
	  if(target == null)
		  return true;
      final int strLen = target.length();
      if (BLANK_LENATH == strLen) {
          return true;
      }
      for (int i = 0; i < strLen; i++) {
          if (!Character.isWhitespace(target.charAt(i))) {
              return false;
          }
      }
      return true;
  }		
}
