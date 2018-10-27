package rs550;

public class AStringUtils {

	public static final String[] splitString(final String string, final char c) {
		final int charCount = AStringUtils.getCharCount(string, c);
		final String[] results = new String[charCount + 1];
		int resultsPos = 0;
		int beginIndex = 0;
		for (int charIndex = 0; charIndex < charCount; charIndex++) {
			int endIndex;
			for (endIndex = beginIndex; c != string.charAt(endIndex); endIndex++) {
				/* empty */
			}
			results[resultsPos++] = string.substring(beginIndex, endIndex);
			beginIndex = endIndex + 1;
		}
		results[charCount] = string.substring(beginIndex);
		return results;
	}

	static final int getCharCount(final String string, final char wantedChar) {
		int count = 0;
		for (int id = 0; id < string.length(); id++) {
			if (string.charAt(id) == wantedChar) {
				count++;
			}
		}
		return count;
	}

	public static final boolean isValidStringBase10(final String string) {
		return AStringUtils.isValidStringRadix(string, 10, true);
	}

	public static final int stringToBase10(final String string) {
		return AStringUtils.stringToIntRadix(string, 10, true);
	}

	static final boolean isValidStringRadix(final String string, final int radix, final boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException("Invalid radix:" + radix);
		}
		boolean bool_2_ = false;
		boolean bool_3_ = false;
		final int i_4_ = string.length();
		int i_5_ = 0;
		for (int i_6_ = 0; i_4_ > i_6_; i_6_++) {
			int i_7_ = string.charAt(i_6_);
			if (i_6_ == 0) {
				if (i_7_ == 45) {
					bool_2_ = true;
					continue;
				}
				if (i_7_ == 43 && bool) {
					continue;
				}
			}
			if (i_7_ >= 48 && i_7_ <= 57) {
				i_7_ -= 48;
			} else if (i_7_ >= 65 && i_7_ <= 90) {
				i_7_ -= 55;
			} else if (i_7_ >= 97 && i_7_ <= 122) {
				i_7_ -= 87;
			} else {
				return false;
			}
			if (i_7_ >= radix) {
				return false;
			}
			if (bool_2_) {
				i_7_ = -i_7_;
			}
			final int i_8_ = i_7_ + radix * i_5_;
			if (i_8_ / radix != i_5_) {
				return false;
			}
			bool_3_ = true;
			i_5_ = i_8_;
		}
		return bool_3_;
	}

	static final int stringToIntRadix(final String text, final int radix) {
		return AStringUtils.stringToIntRadix(text, radix, true);
	}

	static final int stringToIntRadix(final String string, final int radix, final boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException("Invalid radix:" + radix);
		}
		boolean negative = false;
		boolean resultSet = false;
		int result = 0;
		for (int index = 0; index < string.length(); index++) {
			int charValue = string.charAt(index);
			if (index == 0) {
				if (charValue == 45) {//-
					negative = true;
					continue;
				}
				if (charValue == 43 && bool) {//+
					continue;
				}
			}
			if (charValue < 48 || charValue > 57) {//1-9
				if (charValue < 65 || charValue > 90) {//A-Z
					if (charValue >= 97 && charValue <= 122) {//a-z
						charValue -= 87;
					} else {
						throw new NumberFormatException();
					}
				} else {
					charValue -= 55;
				}
			} else {
				charValue -= 48;
			}
			if (radix <= charValue) {
				throw new NumberFormatException();
			}
			if (negative) {
				charValue = -charValue;
			}
			final int nextResult = charValue + radix * result;
			if (nextResult / radix != result) {
				throw new NumberFormatException();
			}
			resultSet = true;
			result = nextResult;
		}
		if (!resultSet) {
			throw new NumberFormatException();
		}
		return result;
	}

}
