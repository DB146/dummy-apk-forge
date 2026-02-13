package okhttp3.internal;

import Eb.n;
import Eb.v;
import ac.AbstractC0796a;
import ac.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
import rc.H;
import rc.InterfaceC1966j;

/* loaded from: classes2.dex */
public final class _UtilJvmKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f22497a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f22498b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        l.b(timeZone);
        f22497a = timeZone;
        f22498b = g.o0(g.n0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        l.e(httpUrl, "<this>");
        l.e(other, "other");
        return l.a(httpUrl.f22338d, other.f22338d) && httpUrl.f22339e == other.f22339e && l.a(httpUrl.f22335a, other.f22335a);
    }

    public static final int b(long j, TimeUnit unit) {
        l.e(unit, "unit");
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = unit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        l.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e10) {
            if (!l.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean d(H h10, TimeUnit timeUnit) {
        l.e(timeUnit, "timeUnit");
        try {
            return h(h10, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String e(String format, Object... objArr) {
        l.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long f(Response response) {
        String b2 = response.f22444f.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.f22495a;
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset g(InterfaceC1966j interfaceC1966j, Charset charset) {
        Charset charset2;
        l.e(interfaceC1966j, "<this>");
        l.e(charset, "default");
        int t5 = interfaceC1966j.t(_UtilCommonKt.f22496b);
        if (t5 == -1) {
            return charset;
        }
        if (t5 == 0) {
            return AbstractC0796a.f12815a;
        }
        if (t5 == 1) {
            return AbstractC0796a.f12816b;
        }
        if (t5 == 2) {
            Charset charset3 = AbstractC0796a.f12815a;
            charset2 = AbstractC0796a.f12819e;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32LE");
                l.d(charset2, "forName(...)");
                AbstractC0796a.f12819e = charset2;
            }
        } else {
            if (t5 == 3) {
                return AbstractC0796a.f12817c;
            }
            if (t5 != 4) {
                throw new AssertionError();
            }
            Charset charset4 = AbstractC0796a.f12815a;
            charset2 = AbstractC0796a.f12820f;
            if (charset2 == null) {
                charset2 = Charset.forName("UTF-32BE");
                l.d(charset2, "forName(...)");
                AbstractC0796a.f12820f = charset2;
            }
        }
        return charset2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, rc.h] */
    public static final boolean h(H h10, int i7, TimeUnit timeUnit) {
        l.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c10 = h10.e().e() ? h10.e().c() - nanoTime : Long.MAX_VALUE;
        h10.e().d(Math.min(c10, timeUnit.toNanos(i7)) + nanoTime);
        try {
            ?? obj = new Object();
            while (h10.O(8192L, obj) != -1) {
                obj.l();
            }
            if (c10 == Long.MAX_VALUE) {
                h10.e().a();
            } else {
                h10.e().d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == Long.MAX_VALUE) {
                h10.e().a();
            } else {
                h10.e().d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            if (c10 == Long.MAX_VALUE) {
                h10.e().a();
            } else {
                h10.e().d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static final Headers i(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            _HeadersCommonKt.a(builder, header.f22736a.E(), header.f22737b.E());
        }
        return builder.a();
    }

    public static final String j(HttpUrl httpUrl, boolean z8) {
        l.e(httpUrl, "<this>");
        String str = httpUrl.f22338d;
        if (g.b0(str, ":")) {
            str = "[" + str + ']';
        }
        int i7 = httpUrl.f22339e;
        if (!z8) {
            HttpUrl.j.getClass();
            if (i7 == HttpUrl.Companion.a(httpUrl.f22335a)) {
                return str;
            }
        }
        return str + ':' + i7;
    }

    public static final List k(List list) {
        l.e(list, "<this>");
        if (list.isEmpty()) {
            return v.f3891a;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            l.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        l.d(array, "toArray(...)");
        List unmodifiableList = Collections.unmodifiableList(n.J(array));
        l.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final List l(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return v.f3891a;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            l.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(n.J((Object[]) objArr.clone()));
        l.d(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
