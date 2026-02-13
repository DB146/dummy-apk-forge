package K8;

import A3.c;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f6211a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i7, char c10) {
        return i7 < str.length() && str.charAt(i7) == c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) {
        String message;
        int i7;
        int i10;
        int i11;
        int i12;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i13 = index + 4;
            int c10 = c(index, i13, str);
            if (a(str, i13, '-')) {
                i13 = index + 5;
            }
            int i14 = i13 + 2;
            int c11 = c(i13, i14, str);
            if (a(str, i14, '-')) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int c12 = c(i14, i15, str);
            boolean a9 = a(str, i15, 'T');
            if (!a9 && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c10, c11 - 1, c12);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (a9) {
                int i16 = i14 + 5;
                int c13 = c(i14 + 3, i16, str);
                if (a(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                int c14 = c(i16, i17, str);
                if (a(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() <= i17 || (charAt = str.charAt(i17)) == 'Z' || charAt == '+' || charAt == '-') {
                    i10 = c14;
                    i11 = 0;
                    i12 = 0;
                    i15 = i17;
                    i7 = c13;
                } else {
                    int i18 = i17 + 2;
                    i12 = c(i17, i18, str);
                    if (i12 > 59 && i12 < 63) {
                        i12 = 59;
                    }
                    if (a(str, i18, '.')) {
                        int i19 = i17 + 3;
                        for (int i20 = i17 + 4; i20 < str.length(); i20++) {
                            char charAt2 = str.charAt(i20);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i20;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i17 + 6);
                        i11 = c(i19, min, str);
                        int i21 = min - i19;
                        if (i21 == 1) {
                            i11 *= 100;
                        } else if (i21 == 2) {
                            i11 *= 10;
                        }
                        i7 = c13;
                        i15 = length2;
                        i10 = c14;
                    } else {
                        i7 = c13;
                        i15 = i18;
                        i10 = c14;
                        i11 = 0;
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            }
            if (str.length() <= i15) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt3 = str.charAt(i15);
            TimeZone timeZone = f6211a;
            if (charAt3 == 'Z') {
                length = i15 + 1;
            } else {
                if (charAt3 != '+' && charAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                }
                String substring = str.substring(i15);
                if (substring.length() < 5) {
                    substring = substring + "00";
                }
                length = i15 + substring.length();
                if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                    String str2 = "GMT" + substring;
                    timeZone = TimeZone.getTimeZone(str2);
                    String id = timeZone.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, c10);
            gregorianCalendar2.set(2, c11 - 1);
            gregorianCalendar2.set(5, c12);
            gregorianCalendar2.set(11, i7);
            gregorianCalendar2.set(12, i10);
            gregorianCalendar2.set(13, i12);
            gregorianCalendar2.set(14, i11);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e2) {
            e = e2;
            String str3 = str != null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(c.j("Failed to parse date [", str3, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException(c.j("Failed to parse date [", str3, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    public static int c(int i7, int i10, String str) {
        int i11;
        int i12;
        if (i7 < 0 || i10 > str.length() || i7 > i10) {
            throw new NumberFormatException(str);
        }
        if (i7 < i10) {
            i12 = i7 + 1;
            int digit = Character.digit(str.charAt(i7), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i10));
            }
            i11 = -digit;
        } else {
            i11 = 0;
            i12 = i7;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i10));
            }
            i11 = (i11 * 10) - digit2;
            i12 = i13;
        }
        return -i11;
    }
}
