package okhttp3;

import a.AbstractC0672a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.l;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import rc.C1967k;
import rc.InterfaceC1966j;

/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f22462b;

    /* renamed from: a, reason: collision with root package name */
    public BomAwareReader f22463a;

    /* loaded from: classes2.dex */
    public static final class BomAwareReader extends Reader {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1966j f22464a;

        /* renamed from: b, reason: collision with root package name */
        public final Charset f22465b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22466c;

        /* renamed from: d, reason: collision with root package name */
        public InputStreamReader f22467d;

        public BomAwareReader(InterfaceC1966j source, Charset charset) {
            l.e(source, "source");
            l.e(charset, "charset");
            this.f22464a = source;
            this.f22465b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f22466c = true;
            InputStreamReader inputStreamReader = this.f22467d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f22464a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i7, int i10) {
            l.e(cbuf, "cbuf");
            if (this.f22466c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f22467d;
            if (inputStreamReader == null) {
                InterfaceC1966j interfaceC1966j = this.f22464a;
                inputStreamReader = new InputStreamReader(interfaceC1966j.S(), _UtilJvmKt.g(interfaceC1966j, this.f22465b));
                this.f22467d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i7, i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.ResponseBody$Companion$asResponseBody$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, rc.h] */
    static {
        new Companion(0);
        C1967k c1967k = C1967k.f23967d;
        l.e(c1967k, "<this>");
        final ?? obj = new Object();
        obj.i0(c1967k);
        final long length = c1967k.f23968a.length;
        f22462b = new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
            @Override // okhttp3.ResponseBody
            public final InterfaceC1966j F() {
                return obj;
            }

            @Override // okhttp3.ResponseBody
            public final long l() {
                return length;
            }

            @Override // okhttp3.ResponseBody
            public final MediaType n() {
                return null;
            }
        };
    }

    public abstract InterfaceC1966j F();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final String K() {
        InterfaceC1966j F10 = F();
        String th = null;
        try {
            String Q3 = F10.Q(_UtilJvmKt.g(F10, Internal.a(n())));
            try {
                F10.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = Q3;
        } catch (Throwable th3) {
            th = th3;
            if (F10 != null) {
                try {
                    F10.close();
                } catch (Throwable th4) {
                    AbstractC0672a.c(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.a(F());
    }

    public abstract long l();

    public abstract MediaType n();
}
