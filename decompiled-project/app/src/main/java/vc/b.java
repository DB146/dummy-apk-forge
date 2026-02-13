package vc;

import h3.H;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l2.X;
import xc.l;
import xc.q;
import xc.y;
import yc.E;
import yc.m1;
import yc.n1;
import zc.p;
import zc.v;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f25445a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f25446b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f25447c;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f25448d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f25449e;

    static {
        Charset forName = Charset.forName("UTF-8");
        f25446b = forName;
        f25447c = forName.name();
        f25448d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        f25449e = v.X("meta[http-equiv=content-type], meta[charset]");
    }

    public static X a(wc.a aVar, String str, String str2, E e2) {
        String str3;
        y yVar;
        byte[] bArr = new byte[4];
        aVar.mark(4);
        aVar.read(bArr, 0, 4);
        aVar.reset();
        byte b2 = bArr[0];
        xc.g gVar = null;
        if ((b2 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b2 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            str3 = "UTF-32";
        } else if ((b2 == -2 && bArr[1] == -1) || (b2 == -1 && bArr[1] == -2)) {
            str3 = "UTF-16";
        } else if (b2 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            aVar.read(bArr, 0, 3);
            str3 = "UTF-8";
        } else {
            str3 = null;
        }
        if (str3 != null) {
            str = str3;
        }
        Charset charset = f25446b;
        String str4 = f25447c;
        if (str == null) {
            int i7 = aVar.f25861b;
            aVar.f25864e = (5120 - i7) + aVar.f25864e;
            aVar.f25861b = 5120;
            aVar.mark(5120);
            aVar.f25867v = false;
            try {
                try {
                    wc.f fVar = new wc.f(aVar, charset);
                    try {
                        xc.g a9 = e2.a(fVar, str2);
                        aVar.reset();
                        aVar.f25864e = (i7 - aVar.f25861b) + aVar.f25864e;
                        aVar.f25861b = i7;
                        fVar.close();
                        aVar.f25867v = true;
                        a9.getClass();
                        p pVar = f25449e;
                        i.D(pVar);
                        Iterator<E> it = H.m(pVar, a9).iterator();
                        String str5 = null;
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            if (lVar.I("http-equiv")) {
                                str5 = b(lVar.o("content"));
                            }
                            if (str5 == null && lVar.I("charset")) {
                                str5 = lVar.o("charset");
                            }
                            if (str5 != null) {
                                break;
                            }
                        }
                        if (str5 == null && a9.f26350e.size() > 0) {
                            q qVar = (q) ((ArrayList) a9.G()).get(0);
                            if (qVar instanceof y) {
                                yVar = (y) qVar;
                            } else {
                                if (qVar instanceof xc.d) {
                                    xc.d dVar = (xc.d) qVar;
                                    String Z7 = dVar.Z();
                                    if (Z7.length() > 1 && (Z7.startsWith("!") || Z7.startsWith("?"))) {
                                        String str6 = "<" + dVar.Z() + ">";
                                        E e10 = new E(new n1());
                                        StringReader stringReader = new StringReader(str6);
                                        ReentrantLock reentrantLock = e10.f27655e;
                                        try {
                                            reentrantLock.lock();
                                            m1 m1Var = e10.f27651a;
                                            m1Var.g(stringReader, "", e10);
                                            m1Var.h();
                                            m1Var.n();
                                            List a10 = m1Var.a();
                                            reentrantLock.unlock();
                                            if (!a10.isEmpty() && (a10.get(0) instanceof y)) {
                                                yVar = (y) a10.get(0);
                                            }
                                        } catch (Throwable th) {
                                            reentrantLock.unlock();
                                            throw th;
                                        }
                                    }
                                }
                                yVar = null;
                            }
                            if (yVar != null && yVar.Z().equalsIgnoreCase("xml")) {
                                str5 = yVar.o("encoding");
                            }
                        }
                        String d10 = d(str5);
                        if (d10 != null && !d10.equalsIgnoreCase(str4)) {
                            str = d10.trim().replaceAll("[\"']", "");
                        } else if (aVar.f25860a.f25881e) {
                            aVar.close();
                            gVar = a9;
                        }
                    } catch (Throwable th2) {
                        try {
                            fVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (UncheckedIOException e11) {
                    throw e11.getCause();
                }
            } catch (Throwable th4) {
                aVar.f25867v = true;
                throw th4;
            }
        } else {
            i.B(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (str == null) {
            str = str4;
        }
        if (!str.equals(str4)) {
            charset = Charset.forName(str);
        }
        X x2 = new X(13);
        x2.f19194b = charset;
        x2.f19195c = aVar;
        x2.f19196d = gVar;
        return x2;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f25445a.matcher(str);
        if (matcher.find()) {
            return d(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    public static xc.g c(X x2, String str, E e2) {
        xc.g gVar = (xc.g) x2.f19196d;
        if (gVar != null) {
            return gVar;
        }
        wc.a aVar = (wc.a) x2.f19195c;
        Charset charset = (Charset) x2.f19194b;
        wc.f fVar = new wc.f(aVar, charset);
        try {
            try {
                xc.g a9 = e2.a(fVar, str);
                a9.f26341x.f26336b = charset;
                if (!charset.canEncode()) {
                    a9.q0(f25446b);
                }
                fVar.close();
                return a9;
            } catch (UncheckedIOException e10) {
                throw e10.getCause();
            }
        } catch (Throwable th) {
            try {
                fVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String d(String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
