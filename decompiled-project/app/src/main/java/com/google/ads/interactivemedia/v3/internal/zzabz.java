package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import y.S;

/* loaded from: classes.dex */
public final class zzabz {
    private static final TimeZone zza = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date zza(String str, ParsePosition parsePosition) {
        String message;
        int i7;
        int i10;
        int i11;
        int i12;
        int length;
        TimeZone timeZone;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i13 = index + 4;
            int zzb = zzb(str, index, i13);
            if (zzc(str, i13, '-')) {
                i13 = index + 5;
            }
            int i14 = i13 + 2;
            int zzb2 = zzb(str, i13, i14);
            if (zzc(str, i14, '-')) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int zzb3 = zzb(str, i14, i15);
            boolean zzc = zzc(str, i15, 'T');
            if (!zzc && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(zzb, zzb2 - 1, zzb3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (zzc) {
                int i16 = i14 + 5;
                int zzb4 = zzb(str, i14 + 3, i16);
                if (zzc(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                int zzb5 = zzb(str, i16, i17);
                if (zzc(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() <= i17 || (charAt = str.charAt(i17)) == 'Z' || charAt == '+' || charAt == '-') {
                    i10 = zzb5;
                    i11 = 0;
                    i12 = 0;
                    i15 = i17;
                    i7 = zzb4;
                } else {
                    int i18 = i17 + 2;
                    i12 = zzb(str, i17, i18);
                    if (i12 > 59 && i12 < 63) {
                        i12 = 59;
                    }
                    if (zzc(str, i18, '.')) {
                        int i19 = i17 + 3;
                        for (int i20 = i17 + 4; i20 < str.length(); i20++) {
                            char charAt2 = str.charAt(i20);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i20;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i17 + 6);
                        i11 = zzb(str, i19, min);
                        int i21 = min - i19;
                        if (i21 == 1) {
                            i11 *= 100;
                        } else if (i21 == 2) {
                            i11 *= 10;
                        }
                        i7 = zzb4;
                        i15 = length2;
                        i10 = zzb5;
                    } else {
                        i7 = zzb4;
                        i15 = i18;
                        i10 = zzb5;
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
            if (charAt3 == 'Z') {
                timeZone = zza;
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
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String str2 = "GMT" + substring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                    String id = timeZone2.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
                timeZone = zza;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, zzb);
            gregorianCalendar2.set(2, zzb2 - 1);
            gregorianCalendar2.set(5, zzb3);
            gregorianCalendar2.set(11, i7);
            gregorianCalendar2.set(12, i10);
            gregorianCalendar2.set(13, i12);
            gregorianCalendar2.set(14, i11);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            String b2 = str == null ? null : S.b("\"", str, "\"");
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = S.b("(", e.getClass().getName(), ")");
            }
            ParseException parseException = new ParseException(c.j("Failed to parse date [", b2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e10) {
            e = e10;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = S.b("(", e.getClass().getName(), ")");
            ParseException parseException2 = new ParseException(c.j("Failed to parse date [", b2, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e11) {
            e = e11;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = S.b("(", e.getClass().getName(), ")");
            ParseException parseException22 = new ParseException(c.j("Failed to parse date [", b2, "]: ", message), parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    private static int zzb(String str, int i7, int i10) {
        int i11;
        int i12;
        if (i7 < 0 || i10 > str.length() || i7 > i10) {
            throw new NumberFormatException(str);
        }
        if (i7 < i10) {
            i12 = i7 + 1;
            int digit = Character.digit(str.charAt(i7), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i7, i10))));
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
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i7, i10))));
            }
            i11 = (i11 * 10) - digit2;
            i12 = i13;
        }
        return -i11;
    }

    private static boolean zzc(String str, int i7, char c10) {
        return i7 < str.length() && str.charAt(i7) == c10;
    }
}
