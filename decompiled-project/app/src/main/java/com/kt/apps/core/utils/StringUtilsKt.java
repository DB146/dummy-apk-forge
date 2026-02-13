package com.kt.apps.core.utils;

import ac.AbstractC0796a;
import ac.n;
import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import y7.u0;

/* loaded from: classes2.dex */
public final class StringUtilsKt {
    public static final String DATE_TIME_FORMAT = "yyyyMMddHHmmss";
    public static final String DATE_TIME_FORMAT_0700 = "yyyyMMddHHmmss +0700";
    private static final Db.g listShortLink$delegate = android.support.v4.media.session.b.z(new l(0));

    public static /* synthetic */ CharSequence a(byte b2) {
        return sha256Hash$lambda$4$lambda$3(b2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b8, code lost:
    
        r11 = r1.getURL();
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String expandUrl(String str, Map<String, String> map) {
        String headerField;
        String str2;
        String str3;
        kotlin.jvm.internal.l.e(str, "<this>");
        HttpURLConnection httpURLConnection = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str).openConnection();
            if (httpURLConnection3 != null) {
                if (map != null) {
                    try {
                        str3 = map.get("user-agent");
                        if (str3 == null) {
                        }
                        httpURLConnection3.addRequestProperty("User-Agent", str3);
                    } catch (Exception unused) {
                        httpURLConnection2 = httpURLConnection3;
                        if (httpURLConnection2 != null) {
                        }
                        return str;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection3;
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                }
                str3 = map != null ? map.get("http-user-agent") : null;
                if (str3 == null) {
                    str3 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36";
                }
                httpURLConnection3.addRequestProperty("User-Agent", str3);
            }
            if (httpURLConnection3 != null) {
                httpURLConnection3.addRequestProperty("Host", Uri.parse(str).getHost());
            }
            if (httpURLConnection3 != null) {
                httpURLConnection3.setRequestMethod("HEAD");
            }
            if (httpURLConnection3 != null) {
                httpURLConnection3.setInstanceFollowRedirects(false);
            }
            int responseCode = httpURLConnection3 != null ? httpURLConnection3.getResponseCode() : 0;
            int i7 = 20;
            while (responseCode / 100 == 3 && httpURLConnection3 != null && (headerField = httpURLConnection3.getHeaderField("Location")) != null && i7 - 1 >= 0) {
                HttpURLConnection httpURLConnection4 = (HttpURLConnection) new URL(headerField).openConnection();
                if (httpURLConnection4 != null) {
                    try {
                        httpURLConnection4.setInstanceFollowRedirects(false);
                    } catch (Exception unused2) {
                        httpURLConnection2 = httpURLConnection4;
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                            } catch (Exception unused3) {
                            }
                        }
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = httpURLConnection4;
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused4) {
                            }
                        }
                        throw th;
                    }
                }
                if (httpURLConnection4 != null) {
                    if (map == null || (str2 = map.get("user-agent")) == null) {
                        str2 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36";
                    }
                    httpURLConnection4.addRequestProperty("User-Agent", str2);
                }
                if (httpURLConnection4 != null) {
                    httpURLConnection4.addRequestProperty("Host", Uri.parse(headerField).getHost());
                }
                responseCode = httpURLConnection4 != null ? httpURLConnection4.getResponseCode() : 0;
                httpURLConnection3 = httpURLConnection4;
            }
            URL url = null;
            String message = "Original URL: " + url;
            kotlin.jvm.internal.l.e(message, "message");
            String valueOf = String.valueOf(httpURLConnection3 != null ? httpURLConnection3.getURL() : null);
            if (httpURLConnection3 != null) {
                try {
                    httpURLConnection3.disconnect();
                } catch (Exception unused5) {
                }
            }
            return valueOf;
        } catch (Exception unused6) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static /* synthetic */ String expandUrl$default(String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            map = null;
        }
        return expandUrl(str, map);
    }

    public static final String findFirstNumber(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static final String formatDateTime(String str, String pattern, String newPattern, Locale locale) {
        String format;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(pattern, "pattern");
        kotlin.jvm.internal.l.e(newPattern, "newPattern");
        kotlin.jvm.internal.l.e(locale, "locale");
        Date parse = new SimpleDateFormat(pattern, locale).parse(str);
        return (parse == null || (format = new SimpleDateFormat(newPattern, locale).format(parse)) == null) ? str : format;
    }

    public static final String formatDateTime(Date date, String pattern, Locale locale) {
        kotlin.jvm.internal.l.e(date, "<this>");
        kotlin.jvm.internal.l.e(pattern, "pattern");
        kotlin.jvm.internal.l.e(locale, "locale");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
        simpleDateFormat.setTimeZone(Calendar.getInstance(locale).getTimeZone());
        String format = simpleDateFormat.format(date);
        kotlin.jvm.internal.l.d(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String formatDateTime$default(String str, String str2, String str3, Locale locale, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            locale = Locale.getDefault();
        }
        return formatDateTime(str, str2, str3, locale);
    }

    public static /* synthetic */ String formatDateTime$default(Date date, String str, Locale locale, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            locale = Locale.getDefault();
        }
        return formatDateTime(date, str, locale);
    }

    public static final String getKeyForLocalLogo(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        return n.W(ac.g.o0(UtilsKt.removeAllSpecialChars(ac.g.o0(ac.g.v0(ac.g.o0(ac.g.o0(ac.g.o0(ac.g.o0(n.W(n.W(ac.g.v0(lowerCase).toString(), "•", ""), " ", ""), "vietteltv"), "fpt"), "vieon"), "tv360")).toString(), "4k")), "hd"), ".", "");
    }

    public static final List<String> getLatinWords(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        List r02 = ac.g.r0(replaceVNCharsToLatinChars(lowerCase), new String[]{" "});
        ArrayList arrayList = new ArrayList();
        for (Object obj : r02) {
            String str2 = (String) obj;
            if (!ac.g.h0(str2) && str2.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<String> getListShortLink() {
        return (List) listShortLink$delegate.getValue();
    }

    public static final boolean isShortLink(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        try {
            HttpUrl.j.getClass();
            return getListShortLink().contains(HttpUrl.Companion.b(str).f22338d);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final List listShortLink_delegate$lambda$0() {
        return u0.y("gg.gg", "urlis.net", "bitly.com", "ow.ly", "tinyurl.com", "tiny.cc", "bit.do", "cocc.me", "hqth.me");
    }

    public static final String replaceVNCharsToLatinChars(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        Pattern compile = Pattern.compile("[áàảãạắằẳẵặấầẩẫậăâa]");
        kotlin.jvm.internal.l.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("a");
        kotlin.jvm.internal.l.d(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("[Đđ]");
        kotlin.jvm.internal.l.d(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("d");
        kotlin.jvm.internal.l.d(replaceAll2, "replaceAll(...)");
        Pattern compile3 = Pattern.compile("[éèẻẽẹếềểễệêe]");
        kotlin.jvm.internal.l.d(compile3, "compile(...)");
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("e");
        kotlin.jvm.internal.l.d(replaceAll3, "replaceAll(...)");
        Pattern compile4 = Pattern.compile("[íìỉĩị]");
        kotlin.jvm.internal.l.d(compile4, "compile(...)");
        String replaceAll4 = compile4.matcher(replaceAll3).replaceAll("i");
        kotlin.jvm.internal.l.d(replaceAll4, "replaceAll(...)");
        Pattern compile5 = Pattern.compile("[óòỏõọốồổỗộớờởỡợơôo]");
        kotlin.jvm.internal.l.d(compile5, "compile(...)");
        String replaceAll5 = compile5.matcher(replaceAll4).replaceAll("o");
        kotlin.jvm.internal.l.d(replaceAll5, "replaceAll(...)");
        Pattern compile6 = Pattern.compile("[úùủũụưứừửữựu]");
        kotlin.jvm.internal.l.d(compile6, "compile(...)");
        String replaceAll6 = compile6.matcher(replaceAll5).replaceAll("u");
        kotlin.jvm.internal.l.d(replaceAll6, "replaceAll(...)");
        return replaceAll6;
    }

    public static final String sha256Hash(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        try {
            byte[] bytes = str.getBytes(AbstractC0796a.f12815a);
            kotlin.jvm.internal.l.d(bytes, "getBytes(...)");
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
            kotlin.jvm.internal.l.b(digest);
            return Eb.n.c0(digest, "", new Ba.i(10), 30);
        } catch (Throwable th) {
            com.bumptech.glide.c.n(th);
            return "";
        }
    }

    public static final CharSequence sha256Hash$lambda$4$lambda$3(byte b2) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
    }

    public static final Date toDate(String str, String pattern, Locale locale, boolean z8) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(pattern, "pattern");
        kotlin.jvm.internal.l.e(locale, "locale");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
        if (z8) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        try {
            return simpleDateFormat.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Date toDate$default(String str, String str2, Locale locale, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            locale = Locale.getDefault();
        }
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        return toDate(str, str2, locale, z8);
    }

    public static final Date toDateTime(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        Date parse = new SimpleDateFormat(DATE_TIME_FORMAT_0700).parse(str);
        kotlin.jvm.internal.l.d(parse, "parse(...)");
        return parse;
    }

    public static final String toDateTimeFormat(String str, String format) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(format, "format");
        return formatDateTime$default(toDateTime(str), format, null, 2, null);
    }
}
