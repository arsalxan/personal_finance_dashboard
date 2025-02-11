package personal_finance_dashboard;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class LimitedDocument extends PlainDocument {
    private int maxLength;

    public LimitedDocument(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str != null && getLength() + str.length() <= maxLength) {
            super.insertString(offset, str, attr);
        }
    }
}
